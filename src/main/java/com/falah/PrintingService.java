package com.falah;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.io.File;
import java.net.URL;

public class PrintingService {

    public void initPrinter(String imageUrl) {
        initPrinter(imageUrl, null);
    }

    public void initPrinter(String imageUrl, String text) {
        try {
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);;
            BufferedImage imageP = ImageIO.read(new File("image.png"));
            File outputfile = new File("image.png");
            ImageIO.write(image, "png", outputfile);
            Runtime.getRuntime().exec("lp -o fit-to-page " + outputfile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
