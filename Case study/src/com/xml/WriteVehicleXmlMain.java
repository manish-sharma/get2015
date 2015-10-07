/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name WriteVehicleXmlMain
 * @description this is the class which handles the creation of vehicle.xml file by calling the saveConfig() method of WriteVehicleXml
 */
package com.xml;

public class WriteVehicleXmlMain {
	public static void main(String[] args) {
		WriteVehicleXml vehicleXml = new WriteVehicleXml();
		vehicleXml.setFile("vehicle.xml");
		try {
			vehicleXml.saveConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
