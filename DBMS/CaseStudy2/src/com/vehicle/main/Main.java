package com.vehicle.main;

/**This class conatins the main function so all the execution of the program starts from here 
 @author Shishir Pareek
 Date 22nd September 2015
 **/
import java.util.List;

import com.vehicle.core.Vehicle;
import com.vehicle.db.StaxParser;
import com.vehicle.db.VehicleDbHelper;

//main funcion
public class Main {
	public static void main(String[] args) {
		VehicleDbHelper vehicleDaoHealper = new VehicleDbHelper();
		StaxParser st = new StaxParser();// creating object for parsin the xml
											// file
		List<Vehicle> cars = st
				.readConfig("C://Users/Shishir/workspace/CaseStudy2/xmlFiles/Car.xml");// setting
																						// the
																						// objects
																						// into
																						// lists
																						// after
																						// reading
																						// the
																						// details
																						// from
																						// the
																						// xml
																						// file
																						// and
																						// creating
																						// its
																						// objects

		for (Vehicle vehicle : cars) {
			vehicleDaoHealper.insertIntoVehicle(vehicle);// passing the objects
															// stored into the
															// list for
															// inserting into
															// database
		}
		// setting the objects into lists after reading the details from the xml
		// file and creating its objects
		List<Vehicle> bikes = st
				.readConfig("C://Users/Shishir/workspace/CaseStudy2/xmlFiles/Bike.xml");

		// System.out.println(bikes);

		for (Vehicle vehicle : bikes) {
			vehicleDaoHealper.insertIntoVehicle(vehicle);// passing the objects
															// stored into the
															// list for
															// inserting into
															// database
		}
	}
}
