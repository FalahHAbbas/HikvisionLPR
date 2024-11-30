package com.falah;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class PrintingService {

    public void initPrinter(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);
            File outputfile = new File("image.png");
            ImageIO.write(image, "png", outputfile);
            Runtime.getRuntime().exec("lp -o  scaling=42 " + outputfile.getAbsolutePath());
//            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
