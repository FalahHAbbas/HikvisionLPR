package com.falah;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class HikvisionXMLParser {


    public static Plate parseXML(String xmlData) {
        List<Plate> plates = new ArrayList<>();
        try {
            // Parse XML document
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);  // Necessary for handling namespaces
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new ByteArrayInputStream(xmlData.getBytes()));

            // Create XPath expression to find Plate nodes
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xpath = xPathFactory.newXPath();
            xpath.setNamespaceContext(new HikvisionNamespaceContext());  // Handle the namespace

            XPathExpression expression = xpath.compile("//ns:Plate");
            NodeList plateNodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);

            // Loop through each Plate element and extract data
            for (int i = 0; i < plateNodes.getLength(); i++) {
                Element plateElement = (Element) plateNodes.item(i);

                String captureTime = plateElement.getElementsByTagNameNS("*", "captureTime").item(0).getTextContent();
                String plateNumber = plateElement.getElementsByTagNameNS("*", "plateNumber").item(0).getTextContent();
                String picName = plateElement.getElementsByTagNameNS("*", "picName").item(0).getTextContent();
                String country = plateElement.getElementsByTagNameNS("*", "country").item(0).getTextContent();
                String laneNo = plateElement.getElementsByTagNameNS("*", "laneNo").item(0).getTextContent();
                String direction = plateElement.getElementsByTagNameNS("*", "direction").item(0).getTextContent();
                String matchingResult = plateElement.getElementsByTagNameNS("*", "matchingResult").item(0).getTextContent();

                Plate plate = new Plate();
                plate.setCaptureTime(captureTime);
                plate.setPlateNumber(plateNumber);
                plate.setPicName(picName);
                plate.setCountry(country);
                plate.setLaneNo(Integer.parseInt(laneNo));
                plate.setDirection(direction);
                plate.setMatchingResult(matchingResult);

                plates.add(plate);
            }
            if (!plates.isEmpty()) {
//                System.out.println(plates.getLast());
                return plates.get(plates.size() - 1);
            }
            var plate = new Plate();
            plate.setPlateNumber("22F48431");
            return plate;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
