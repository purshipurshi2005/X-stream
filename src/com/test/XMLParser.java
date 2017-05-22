package com.citi;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

public class XMLParser {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder loader = null;
		try {
			loader = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Document document1 = loader.newDocument();
		//<?xml version="1.0"?>	<order1> purshi & "" Thimmappa </order1>
		Element order1 = document1.createElement("order1");
		order1.setAttribute("ABC", "\"Hi");
		order1.setTextContent("purshi & \"'Thimmappa");
		document1.appendChild(order1);

	    OutputFormat format = new OutputFormat(document1, "UTF-8", true);
	    format.setIndenting(true);
	    format.setPreserveSpace(false);
	    format.setLineWidth(500);

		String xmlString = new String();
		StringWriter stringOut = new StringWriter();

		XMLSerializer serializer1 = new XMLSerializer(stringOut, format);
		try {

			serializer1.serialize(document1);
			xmlString = stringOut.toString();
			System.out.println(xmlString);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
		Document document = loader.newDocument();
		//<?xml version="1.0"?>	<order> <?xml version="1.0"?>	<order1> purshi & Thimmappa </order1> </order>
		Element order = document.createElement("order");
			order.setTextContent(xmlString);

		document.appendChild(order);

		XMLSerializer serializer = new XMLSerializer();
		try {

			serializer.setOutputCharStream(new java.io.FileWriter(
					"C:\\var\\order.xml"));

			serializer.serialize(document);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

	}

}
