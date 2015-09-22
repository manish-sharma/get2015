/**
 * Class to read the xml file
 * @author Sanjay
 */

package com.metacampus.vehiclemanagement.xml;

public class ReadConnectionMain {
   
	public static void main(String args[]) {
	     
		/* Reading Connection XML File */
		ReadConnectionXml read = new ReadConnectionXml();
	    read.readConfig("connection.xml");
	 }
}
