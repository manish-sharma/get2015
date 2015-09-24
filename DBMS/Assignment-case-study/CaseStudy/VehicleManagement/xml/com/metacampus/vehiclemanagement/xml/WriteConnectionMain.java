package com.metacampus.vehiclemanagement.xml;

/**This class is use to test the WriteConnectionXML class.
 * @author Khemanshu
 *
 */
public class WriteConnectionMain {
	public static void main(String[] args) {
	    WriteConnectionXML connectionFile = new WriteConnectionXML();
	    connectionFile.setFile("Connection.xml");
	    try {
	    	connectionFile.saveConfig();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
}
