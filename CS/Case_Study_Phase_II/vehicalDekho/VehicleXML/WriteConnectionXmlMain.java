package VehicleXML;
import helper.MyException;

public class WriteConnectionXmlMain {

	  public static void main(String[] args) throws MyException {
	    WriteConnectionXml connectionXml = new WriteConnectionXml(); // make object of WriteConnectionXml
	    connectionXml.setFile("connection.xml"); // call method set file and pass argument as a file name which we want to created
	    try {
	      connectionXml.saveConfig();// call save Config method to put contents in file and save it
	    } catch (Exception e) {
	    	throw new MyException(e);
	    }
	  }
	} 