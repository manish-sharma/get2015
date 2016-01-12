package VehicleXML;
import helper.MyException;


public class ReadConnectionMain
{
   
	public static void main(String args[]) throws MyException
	{
	     ReadConnectionXml read = new ReadConnectionXml();
	   
	    ConnectionItems connectionItems =  read.readConfig("connection.xml");
	    
	      System.out.println(connectionItems);
	    
	  }
	}
