package com.metacampus.vehiclemanagement.xml;

public class WriteConnectionMain {
	
	public static void main(String[] args) {
		WriteConnectionXml connectionFile = new WriteConnectionXml();
		connectionFile.setFile("Connection.xml");
		try {
			connectionFile.saveConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}