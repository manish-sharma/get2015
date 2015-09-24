package Com.HelperClasses;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import Com.Vehicle.*;

/**
 * class to search the vehicle
 * @author Ankur
 */

public class SearchVehicle {

	Bike bike = new Bike();
	Car car = new Car();
	@SuppressWarnings("resource")
	public List<Vehicle> searchByMakeAndModel(String make, String model) {

		String query = "SELECT * FROM vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		int engineInCC;
		int fuelCapacity;
		int mileage;
		Boolean selfStart =false;
		boolean ac;
		boolean powerSteering;
		String accessoryKit;
		long price;
		int roadTax, helmetPrice= 0;
		ConnectionHelper connectionHelper = new ConnectionHelper();
		Connection con = connectionHelper.getConnection();
		List<Vehicle> vehicles = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			while(rsVehicle.next()) {
				model = rsVehicle.getString("model");
				engineInCC = rsVehicle.getInt("engineInCC");
				fuelCapacity = rsVehicle.getInt("fuelCapacity");
				mileage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("roadTax");
				Timestamp createdTime = rsVehicle.getTimestamp("created_time");

				int vehicle_id = rsVehicle.getInt("vehicleId");

				query = "SELECT * FROM car WHERE carId = "+vehicle_id;

				rsSpecific = stmt2.executeQuery(query);

				if(!rsSpecific.next()) {
					query = "SELECT * FROM bike WHERE bikeId = "+vehicle_id;
					rsSpecific = stmt2.executeQuery(query);
					if(rsSpecific.next()) {
						selfStart = rsSpecific.getBoolean("selfStart");
						helmetPrice = rsSpecific.getInt("helmetPrice");
					}
					vehicles.add(VehicleHelper.createBike(bike,make,createdTime,model, engineInCC,fuelCapacity, mileage, price, roadTax, selfStart, helmetPrice));
				}
				else {
					ac = rsSpecific.getBoolean("AC");
					powerSteering = rsSpecific.getBoolean("powerSteering");
					accessoryKit = rsSpecific.getString("accessoryKit");
					vehicles.add(VehicleHelper.createCar(car,make,createdTime,model, engineInCC, fuelCapacity, mileage, price, roadTax, ac, powerSteering, accessoryKit));
				}

			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt != null)
					stmt.close();
				if(stmt2 != null)
					stmt2.close();
				if(rsSpecific != null)
					rsSpecific.close();
				if(rsVehicle != null)
					rsVehicle.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return vehicles;
	}
}
