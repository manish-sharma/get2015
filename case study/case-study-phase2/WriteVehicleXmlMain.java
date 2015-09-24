package Com.Xml;

/**
 * @author Ankur
 * @description this is the class which handles the creation of vehicle.xml file by calling the saveConfig() method of WriteVehicleXml
 */


public class WriteVehicleXmlMain {
	
	
	public static void main(String args[]) {
		
		
		WriteVehicleXml vehicleXml = new WriteVehicleXml();
		vehicleXml.setFile("vehicle.xml");
		try {
		
			vehicleXml.saveConfigCar("Honda","assent","2000","300","60","400000","4000","true","false","CD Player,FM");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
