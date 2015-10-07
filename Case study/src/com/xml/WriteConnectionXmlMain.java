/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name WriteConnectionXmlMain
 * @description this is the class which handles the creation of connection.xml file by calling the saveConfig() method of WriteConnectionXml
 */
package com.xml;

public class WriteConnectionXmlMain {
	public static void main(String[] args) {
		WriteConnectionXml connectionXml = new WriteConnectionXml();
		connectionXml.setFile("connection.xml");
		try {
			connectionXml.saveConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
