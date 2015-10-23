package vehicles;

public class WriteConnectionMain {
	public static void main(String[] args) {
	    WriteConnectionXML connectionFile = new WriteConnectionXML();
	    connectionFile.setFile("Web Contant/Connection.xml");
	    try {
	    	connectionFile.saveConfig();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
}

