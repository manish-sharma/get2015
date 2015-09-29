package com.metacampus.vehiclemanagement.xml;

import java.util.List;

import com.metacampus.vehiclemanagement.model.Vehicle;

/**This class is use to test the StaXParser class is working or not.
 * @author Khemanshu
 *
 */
public class TestRead {
	  public static void main(String args[]) {
	    StaXParser read = new StaXParser();
	    List<Vehicle> vehicleList = read.readConfig("C:/Users/Khemanshu/CaseStudy/VehicleManagement/VehicleData.xml");
	    for (Vehicle vehicle : vehicleList) {
	      System.out.println(vehicle);
	    }
	  }
	}

