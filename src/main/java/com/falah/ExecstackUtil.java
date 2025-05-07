package com.falah;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * Utility class to attempt clearing the executable stack flag on a native library
 * using the external 'execstack' command.
 */
public class ExecstackUtil {

    // Timeout for the external process in seconds
    private static final long PROCESS_TIMEOUT_SECONDS = 10;
    // Name of the command-line utility
    private static final String EXECSTACK_COMMAND = "execstack";

    /**
     * Attempts to clear the executable stack flag on the specified library file
     * by executing "execstack -c <libraryPath>".
     *
     * IMPORTANT:
     * 1. Requires the 'execstack' utility to be installed and in the system PATH.
     * 2. Requires appropriate permissions to execute 'execstack' and modify the library file.
     * 3. This is primarily for Linux/Unix-like systems.
     *
     * @param libraryPath The absolute path to the native library file (.so).
     * @return true if the command executed successfully (exit code 0), false otherwise.
     * @throws IOException If an I/O error occurs during process execution.
     * @throws InterruptedException If the current thread is interrupted while waiting for the process.
     * @throws SecurityException If a security manager exists and prevents process creation.
     * @throws RuntimeException If 'execstack' command is likely not found or execution times out.
     */
    public static boolean clearExecutableStack(String libraryPath)
            throws IOException, InterruptedException, SecurityException {

        File libraryFile = new File(libraryPath);
        if (!libraryFile.exists()) {
            System.err.println("Error: Library file not found: " + libraryPath);
            return false;
        }
        if (!libraryFile.isFile()) {
            System.err.println("Error: Path is not a file: " + libraryPath);
            return false;
        }

        // Construct the command: execstack -c /path/to/library
        String[] command = { EXECSTACK_COMMAND, "-c", libraryPath };
        System.out.println("Attempting to execute: " + String.join(" ", command));

        ProcessBuilder processBuilder = new ProcessBuilder(command);
        // Redirect error stream to standard output stream for easier capture
        processBuilder.redirectErrorStream(true);

        Process process = null;
        int exitCode = -1; // Default to error

        try {
            process = processBuilder.start();

            // Capture the output (stdout and stderr combined)
            StringBuilder output = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append(System.lineSeparator());
                }
            }

            // Wait for the process to complete, with a timeout
            boolean finished = process.waitFor(PROCESS_TIMEOUT_SECONDS, TimeUnit.SECONDS);

            if (finished) {
                exitCode = process.exitValue();
                System.out.println("'" + EXECSTACK_COMMAND + "' finished with exit code: " + exitCode);
                if (!output.toString().trim().isEmpty()) {
                    System.out.println("Output:\n" + output);
                }
            } else {
                // Process timed out
                process.destroyForcibly(); // Forcefully terminate
                throw new RuntimeException("'" + EXECSTACK_COMMAND + "' command timed out after "
                        + PROCESS_TIMEOUT_SECONDS + " seconds.");
            }

        } catch (IOException ioException) {
            // Often indicates the command wasn't found (e.g., execstack not installed or not in PATH)
            if (ioException.getMessage().contains("Cannot run program \"execstack\"")) {
                 throw new RuntimeException("'" + EXECSTACK_COMMAND + "' command not found. " +
                                           "Please ensure it is installed and in the system PATH.", ioException);
            }
             // Rethrow other IOExceptions
            throw ioException;
        } finally {
            // Ensure the process is destroyed if it's still running somehow
            if (process != null && process.isAlive()) {
                process.destroyForcibly();
            }
        }

        // Check if the command was successful (exit code 0 usually means success)
        return exitCode == 0;
    }

    // --- Example Usage ---
    public static void run(String path) {
        // --- IMPORTANT ---
        // Replace this with the actual path to the library file you want to modify.
        // This path MUST exist *before* calling clearExecutableStack.
        // You might need to extract the library from your JAR first.
        String libraryToFix = path; // <-- CHANGE THIS

        // Check if the placeholder path was changed

        // Check if the file exists before attempting
        File checkFile = new File(libraryToFix);
        if (!checkFile.exists() || !checkFile.isFile()) {
             System.err.println("Error: The specified library file does not exist or is not a file: " + libraryToFix);
             System.err.println("You might need to extract it from your JAR file first.");
             return;
        }


        try {
            System.out.println("Attempting to clear executable stack flag for: " + libraryToFix);
            boolean success = clearExecutableStack(libraryToFix);

            if (success) {
                System.out.println("Successfully executed 'execstack -c'. The flag should be cleared (if it was set).");
                // Now you could potentially proceed to load this library via JNA's jna.library.path
            } else {
                System.err.println("Failed to execute 'execstack -c' successfully. Check output/errors above.");
                System.err.println("Possible reasons: 'execstack' not installed, insufficient permissions, file not found, or other errors.");
            }
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("Process execution was interrupted: " + e.getMessage());
            Thread.currentThread().interrupt(); // Restore interrupted status
        } catch (SecurityException e) {
            System.err.println("Security manager prevented process execution: " + e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.err.println("A runtime error occurred: " + e.getMessage());
             // Check if it's the specific "command not found" error
            if (e.getMessage().contains("command not found")) {
                 System.err.println("Please install 'execstack' (e.g., 'sudo apt-get install execstack' or 'sudo dnf install prelink') and ensure it's in your PATH.");
            } else {
                 e.printStackTrace(); // Print stack trace for other runtime errors
            }
        }
    }
}
