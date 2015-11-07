package com.metacampus.vehiclemanagement.helper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;

/**This class does all the sql work.Objects that are read from the main class are pass to this class and then this class store them to the database.
 * @author Khemanshu
 *
 */
public class VehicleJDBCHelper {
	
	/** Stores the vehicle object to the database by using Prepared Statement.
	 * @param vehicle
	 * @return 
	 */
	@SuppressWarnings("resource")
	public static List<Vehicle> insert(Connection connection, Vehicle vehicle) {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		try {
				String created_by = vehicle.getCreated_by();
				Date created_time = vehicle.getCreated_time();
				String make = vehicle.getMake();
				String model = vehicle.getModel();
				String engineInCC = vehicle.getEngineiInCC();
				String fuelCapacity = ""+vehicle.getFuelCapacity();
				String mileage = vehicle.getMileage();
				float price = vehicle.getPrice();
				double roadTax = vehicle.getRoadTax();
				String ac = "";
				String powerSteering = "";
				String accessoryKit = "";
				String selfStart = "";
				float helmetPrice;
				//query for inserting vehcle object in database.
				String query = "INSERT INTO vehicle(created_by, created_time, make, model, engine_cc, fuel_capacity, mileage, price, road_tax) VALUES(?,?,?,?,?,?,?,?,?)";
				
				PreparedStatement preparedStmt = connection.prepareStatement(query);
				preparedStmt.setString(1, created_by);
				preparedStmt.setDate(2, created_time);
				preparedStmt.setString(3, make);
				preparedStmt.setString(4, model);
				preparedStmt.setString(5, engineInCC);
				preparedStmt.setString(6, fuelCapacity);
				preparedStmt.setString(7, mileage);
				preparedStmt.setFloat(8, price);
				preparedStmt.setDouble(9, roadTax);
				preparedStmt.execute();
				
				Statement stmt = connection.createStatement();
				//query to get the vehicle_id of currently inserting vehicle.
				query = "SELECT MAX(vehicle_id) as 'current vehicle' FROM vehicle";
				
				int vehicle_id = 0;
				ResultSet rs = stmt.executeQuery(query);
				
				if(rs.next()) {
					vehicle_id = rs.getInt("current vehicle");
				}
				//If the instrance of vehicle is car then the additional informnation of car is inserted in car table.
				if(vehicle instanceof Car) {
					query = "INSERT INTO car(ac, power_steering, accessory_kit, vehicle_id) VALUES(?,?,?,?)";
					Car car = (Car)vehicle;
					ac = ac+car.isAC();
					powerSteering = powerSteering + car.isPowerSteering();
					accessoryKit = accessoryKit + car.isAccessoryKit();
					preparedStmt = connection.prepareStatement(query);
					preparedStmt.setString(1, ac);
					preparedStmt.setString(2, powerSteering);
					preparedStmt.setString(3,  accessoryKit);
					preparedStmt.setInt(4, vehicle_id);
					preparedStmt.execute();
				}
				//if the instance of vehicle is bike then the additional information is inserted in Bike table
				else if(vehicle instanceof Bike) {
					Bike bike = (Bike)vehicle;
					selfStart = selfStart + bike.isSelfStart();
					helmetPrice = bike.getHelmetPrice();
					
					query = "INSERT INTO bike(self_start, helmet_price, vehicle_id) VALUES(?,?,?)";
					
					preparedStmt = connection.prepareStatement(query);
					preparedStmt.setString(1, selfStart);
					preparedStmt.setFloat(2, helmetPrice);
					preparedStmt.setInt(3, vehicle_id);
					preparedStmt.execute();
				}
				else {
					System.out.println("Can't create vehicle object. It is not correct type");
				}
				Vehicle vehicle2 = new Vehicle();
				vehicle2.setId(vehicle_id);
				vehicleList = searchCar(connection, vehicle2);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return vehicleList;
	}
	
	public static List<Vehicle> fetchBrandNameFromdb(Connection connection) throws SQLException {
		String query = "SELECT DISTINCT V.make FROM vehicle V INNER JOIN car C WHERE V.vehicle_id = C.vehicle_id;";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		while(rs.next()) {
			Vehicle vehicle = new Car();
			vehicle.setMake(rs.getString("make"));
			vehicleList.add(vehicle);
		}
		return vehicleList;
	}
	
	public static List<Vehicle> searchCar(Connection connection, Vehicle vehicle) throws SQLException {
		String query = "";
		if(vehicle.getId() == 0) {
			query = query + "SELECT * FROM vehicle V INNER JOIN car C WHERE V.vehicle_id = C.vehicle_id";
			System.out.println(vehicle.getMake() + vehicle.getModel());
			if(vehicle.getMake() != "" && vehicle.getMake() != null) {
				query = query + " AND V.make = '"+vehicle.getMake()+"'";
				if(vehicle.getModel() != "" && vehicle.getModel() != null){
					query = query + " AND V.model = '"+vehicle.getModel()+"'";
				}
			}
			query = query + ";";
		}
		else {
			query = query + "SELECT * FROM vehicle V INNER JOIN car C WHERE V.vehicle_id = C.vehicle_id AND V.vehicle_id = '" + vehicle.getId() + "';";
		}
		
		System.out.println(query);
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		while(rs.next()) {
			Car fetchedVehicle = new Car();
			fetchedVehicle.setId(Integer.parseInt(rs.getString("vehicle_id")));
			fetchedVehicle.setMake(rs.getString("make"));
			fetchedVehicle.setModel(rs.getString("model"));
			fetchedVehicle.setEngineInCC(rs.getString("engine_cc"));
			fetchedVehicle.setFuelCapacity(Integer.parseInt(rs.getString("fuel_capacity")));
			fetchedVehicle.setMileage(rs.getString("mileage"));
			fetchedVehicle.setPrice(Float.parseFloat(rs.getString("price")));
			fetchedVehicle.setRoadTax(Float.parseFloat(rs.getString("road_tax")));
			fetchedVehicle.setAC(Boolean.parseBoolean(rs.getString("ac")));
			fetchedVehicle.setAccessoryKit(Boolean.parseBoolean(rs.getString("accessory_Kit")));
			fetchedVehicle.setPowerSteering(Boolean.parseBoolean(rs.getString("power_steering")));
			vehicleList.add(fetchedVehicle);
			System.out.println(vehicleList);
		}
		System.out.println(vehicleList);
		return vehicleList;
	}

	public static List<Vehicle> searchCar(Connection connection,
			String budgetValue) throws SQLException {
		System.out.println(budgetValue);
		String query = "";
		query = query + "SELECT * FROM vehicle V INNER JOIN car C WHERE V.vehicle_id = C.vehicle_id";
		if(budgetValue != null || budgetValue != "") {
			System.out.println(budgetValue);
			query = query + " AND " + budgetValue;
		}

		query = query + ";";
		
		System.out.println(query);
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		while(rs.next()) {
			Car fetchedVehicle = new Car();
			fetchedVehicle.setId(Integer.parseInt(rs.getString("vehicle_id")));
			fetchedVehicle.setMake(rs.getString("make"));
			fetchedVehicle.setModel(rs.getString("model"));
			fetchedVehicle.setEngineInCC(rs.getString("engine_cc"));
			fetchedVehicle.setFuelCapacity(Integer.parseInt(rs.getString("fuel_capacity")));
			fetchedVehicle.setMileage(rs.getString("mileage"));
			fetchedVehicle.setPrice(Float.parseFloat(rs.getString("price")));
			fetchedVehicle.setRoadTax(Float.parseFloat(rs.getString("road_tax")));
			fetchedVehicle.setAC(Boolean.parseBoolean(rs.getString("ac")));
			fetchedVehicle.setAccessoryKit(Boolean.parseBoolean(rs.getString("accessory_Kit")));
			fetchedVehicle.setPowerSteering(Boolean.parseBoolean(rs.getString("power_steering")));
			vehicleList.add(fetchedVehicle);
			System.out.println(vehicleList);
		}
		System.out.println(vehicleList);
		return vehicleList;
	}
	
	@SuppressWarnings("resource")
	public static List<Vehicle> updateVehicle(Connection connection, Vehicle vehicle) {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		try {
			int id = vehicle.getId();
			String created_by = vehicle.getCreated_by();
			Date created_time = vehicle.getCreated_time();
			String make = vehicle.getMake();
			String model = vehicle.getModel();
			String engineInCC = vehicle.getEngineiInCC();
			String fuelCapacity = ""+vehicle.getFuelCapacity();
			String mileage = vehicle.getMileage();
			float price = vehicle.getPrice();
			double roadTax = vehicle.getRoadTax();
			String ac = "";
			String powerSteering = "";
			String accessoryKit = "";
			String selfStart = "";
			float helmetPrice;
			//query for inserting vehcle object in database.
			String query = "UPDATE VEHICLE SET created_by = ?, created_time = ?, make = ?, model = ?, engine_cc = ?, fuel_capacity = ?, mileage = ?, price = ?, road_tax = ?"
			           + " WHERE vehicle_id = ?";
			
			PreparedStatement preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, created_by);
			preparedStmt.setDate(2, created_time);
			preparedStmt.setString(3, make);
			preparedStmt.setString(4, model);
			preparedStmt.setString(5, engineInCC);
			preparedStmt.setString(6, fuelCapacity);
			preparedStmt.setString(7, mileage);
			preparedStmt.setFloat(8, price);
			preparedStmt.setDouble(9, roadTax);
			preparedStmt.setInt(10, id);
			preparedStmt.executeUpdate();
			
			//If the instrance of vehicle is car then the additional informnation of car is inserted in car table.
			if(vehicle instanceof Car) {
				query = "UPDATE car SET  ac = ?, power_steering = ?, accessory_kit = ?"
				           + " WHERE vehicle_id = ?";
				Car car = (Car)vehicle;
				ac = ac+car.isAC();
				powerSteering = powerSteering + car.isPowerSteering();
				accessoryKit = accessoryKit + car.isAccessoryKit();
				preparedStmt = connection.prepareStatement(query);
				preparedStmt.setString(1, ac);
				preparedStmt.setString(2, powerSteering);
				preparedStmt.setString(3,  accessoryKit);
				preparedStmt.setInt(4, id);
				preparedStmt.executeUpdate();
			}
			//if the instance of vehicle is bike then the additional information is inserted in Bike table
			else if(vehicle instanceof Bike) {
				Bike bike = (Bike)vehicle;
				selfStart = selfStart + bike.isSelfStart();
				helmetPrice = bike.getHelmetPrice();
				query = "INSERT INTO bike(self_start, helmet_price, vehicle_id) VALUES(?,?,?)";
				preparedStmt = connection.prepareStatement(query);
				preparedStmt.setString(1, selfStart);
				preparedStmt.setFloat(2, helmetPrice);
				preparedStmt.setInt(3, id);
				preparedStmt.execute();
			}
			else {
				System.out.println("Can't update vehicle object. It is not correct type");
			}
			Vehicle vehicle2 = new Vehicle();
			vehicle2.setId(id);
			vehicleList = searchCar(connection, vehicle2);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return vehicleList;
	}

	
}
