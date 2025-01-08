package com.falah;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class PrintingService {

    public void initPrinter(String imageUrl) {
        initPrinter(imageUrl, null);
    }

    public void initPrinter(String imageUrl, String text) {
        try {
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);

            if (text != null) {
                Graphics2D g = image.createGraphics();
                g.setFont(new Font("Arial", Font.BOLD, 20));
                g.setColor(Color.BLACK);
                int centerX = image.getWidth() / 2;
                int centerY = image.getHeight() - 10;

                g.drawString(text, centerX - (g.getFontMetrics().stringWidth(text) / 2), centerY);
                g.dispose();
            }
            File outputfile = new File("image.png");
            ImageIO.write(image, "png", outputfile);
            Runtime.getRuntime().exec("lp -o fit-to-page " + outputfile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
