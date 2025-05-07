//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class InnerUtils {
    public static long hikAbsTimeToTimestamp(int absTime) {
        int year = (absTime >> 26) + 2000;
        int month = (absTime >> 22 & 15) - 1;
        int day = absTime >> 17 & 31;
        int hour = absTime >> 12 & 31;
        int minute = absTime >> 6 & 63;
        int second = absTime & 63;
        Calendar result = Calendar.getInstance(TimeZone.getDefault());
        result.set(1, year);
        result.set(2, month);
        result.set(5, day);
        result.set(11, hour);
        result.set(12, minute);
        result.set(13, second);
        return result.getTimeInMillis();
    }

    public static boolean makeParentDirExists(File file) {
        File parentDir = file.getParentFile();
        return !parentDir.exists() ? parentDir.mkdirs() : true;
    }

    public static void writeFile(byte[] bytes, String path) {
        File file = new File(path);
        makeParentDirExists(file);

        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            fos.write(bytes);
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static Map<String, String> xmlToFlatMap(String xml, String rootElement) {
        try {
            Map<String, String> map = new HashMap();
            Document doc = parseXmlString(xml);
            NodeList rootNode = doc.getElementsByTagName(rootElement);
            if (rootNode != null && rootNode.getLength() != 0) {
                Node root = rootNode.item(0);
                NodeList nodes = root.getChildNodes();
                if (nodes == null) {
                    return map;
                } else {
                    for(int i = 0; i < nodes.getLength(); ++i) {
                        Node node = nodes.item(i);
                        map.put(node.getNodeName(), node.getTextContent());
                    }

                    return map;
                }
            } else {
                return map;
            }
        } catch (Throwable $ex) {
            try {
                throw $ex;
            } catch (ParserConfigurationException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (SAXException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Document parseXmlString(String xmlStr) throws ParserConfigurationException, IOException, SAXException {
        InputSource is = new InputSource(new StringReader(xmlStr));
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(is);
        return doc;
    }
}
