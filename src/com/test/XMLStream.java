package com.test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XMLStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//XStream xstream = new XStream();
		
		XStream xstream = new XStream(new DomDriver()); // does not require XPP3 library
		
		xstream.alias("person", Person.class);
		xstream.alias("phonenumber", PhoneNumber.class);
		
		Person joe = new Person("Joe", "<?xml version=\"1.0\"?><order>pursht&lt;&amp;purshi</order>");
		
		joe.setPhone(new PhoneNumber(123, "1234-456"));
		joe.setFax(new PhoneNumber(123, "9999-999"));
		String xml = xstream.toXML(joe);
		System.out.println(xml);
	}

}
