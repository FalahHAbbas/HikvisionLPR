#!/bin/bash

# Launch the Java app in the background
java -jar --enable-native-access=ALL-UNNAMED app.jar &

# Wait for the JNA temp file to appear and patch it
while sleep 0.2; do
    sofile=$(find /tmp -name 'jna*.tmp' 2>/dev/null | head -n 1)
    if [ -n "$sofile" ]; then
        echo "Found $sofile - patching..."
        execstack -c "$sofile"
        break
    fi
done

# Wait for the Java app to finish
wait
