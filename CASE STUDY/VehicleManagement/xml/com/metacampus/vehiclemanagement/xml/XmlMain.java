/**
 * class to print vehicle data from xml file
 * @author Sanjay
 */

package com.metacampus.vehiclemanagement.xml;
import java.util.List;

import com.metacampus.vehiclemanagement.model.Vehicle;

public class XmlMain {
  public static void main(String args[]) {
    ReadVehicleData read = new ReadVehicleData();
    List<Vehicle> readConfig = read.readData("VehicleData.xml");
    for (Vehicle item : readConfig) {
      System.out.println(item);
    }
  }
}