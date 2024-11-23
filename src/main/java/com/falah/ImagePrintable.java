package com.falah;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class ImagePrintable implements Printable {
    private BufferedImage image;

    public ImagePrintable(BufferedImage image) {
        this.image = image;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex >= 1) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) graphics;
        double imageWidth = image.getWidth();
        double imageHeight = image.getHeight();
        double pageWidth = pageFormat.getImageableWidth();
        double pageHeight = pageFormat.getImageableHeight();

        double scaleFactor = Math.min(pageWidth / imageWidth, pageHeight / imageHeight);
        int scaledWidth = (int) (imageWidth * scaleFactor);
        int scaledHeight = (int) (imageHeight * scaleFactor);

        g2d.translate((int) (pageWidth - scaledWidth) / 2, (int) (pageHeight - scaledHeight) / 2);
        g2d.drawImage(image, 0, 0, scaledWidth, scaledHeight, null);

        return PAGE_EXISTS;
    }
}
