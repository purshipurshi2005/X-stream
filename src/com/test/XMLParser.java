package com.test;


import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

public class XMLParser {

public static void main(String[] args) {
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    DocumentBuilder loader=null;
try {
loader = factory.newDocumentBuilder();
} catch (ParserConfigurationException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

    Document document = loader.newDocument();

    Element order = document.createElement("order");
    order.setAttribute("recipientID", "Purushottam&yahoo.com");
    order.setTextContent("<?xml version=\"1.0\"?><order>pursht&lt;&amp;<purshi</order");

    document.appendChild(order);

    XMLSerializer serializer = new XMLSerializer();
    try {
    	
   serializer.setOutputCharStream(new java.io.FileWriter("C:\\var\\order.xml"));
    	
    serializer.serialize(document);
   
    } catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

// TODO Auto-generated method stub

}



}
