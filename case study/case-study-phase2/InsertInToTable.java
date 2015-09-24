package Com.HelperClasses;

import java.util.ArrayList;
import java.util.List;

import Com.Vehicle.*;

import Com.Xml.*;

public class InsertInToTable {
	private static Vehicle vehicle;
	private static Car car;
	private static Bike bike;
	public void insert() {
		InsertData  insertData = new InsertData();
		insertData.insertion();
		ReadVehicleXml read = new ReadVehicleXml();

		List<Vehicle> vehiclesList = new ArrayList<Vehicle>();
		vehiclesList = read.readConfig("vehicle.xml");

		for (int i = 0; i < vehiclesList.size(); i++) {
			vehicle = vehiclesList.get(i);
			if (vehicle instanceof Car) {
				car = (Car) vehicle;
				DatabaseHelper.queryToInsertDataIntoVehicleTable(car);
				DatabaseHelper.queryToInsertDataIntoCarTable(car);

			} else if (vehicle instanceof Bike) {
				bike = (Bike) vehicle;
				DatabaseHelper.queryToInsertDataIntoVehicleTable(bike);
				DatabaseHelper.queryToInsertDataIntoBikeTable(bike);

			}

		}
	}
}
