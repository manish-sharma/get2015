package com.metacampus.vehiclemanagement.xml;

public class ReadConnectionMain {

	public static void main(String args[]) {
		ReadConnectionXml read = new ReadConnectionXml();
		ConnectionItems connectionItems =  read.readConfig("connection.xml");
		System.out.println(connectionItems);
	}
}