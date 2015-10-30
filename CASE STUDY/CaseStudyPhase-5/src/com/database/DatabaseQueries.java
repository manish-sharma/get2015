package com.database;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.connections.*;
import com.model.Admin;
import com.model.vehicle;
public class DatabaseQueries {
	public static boolean matchAdmin(Connection connectionObject, Admin admin){
		boolean returnVal =false;					
		String query = "SELECT username,password FROM login";
		try {
			//connectionObject.setAutoCommit(false); 
			Statement statement = connectionObject.createStatement(); // Creating a statement.
			ResultSet result = statement.executeQuery(query);
			while(result.next()) {
				String userName = result.getString("username");
				
				String password = result.getString("password");
				String inputUserName = admin.getUserName();
				
				String inputPassword = admin.getPassword();
				if(userName.equalsIgnoreCase(inputUserName) && password.equals(inputPassword)) {
					returnVal = true;
					break;
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return returnVal;
	}
	
	public boolean insertUserIntoDatabase(Connection connectionObject, vehicle vehicle) {
						// Creating connection pool object.
		int count;
		boolean status = false;
		String query = "INSERT INTO vehicle (make,model,engine_cc,fuel_capacity,mileage,price,road_tax,emi) VALUES (?,?,?,?,?,?,?,?)";
		try {
			
			PreparedStatement statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setString(1, vehicle.getMake());
			statement.setString(2, vehicle.getModel());
			statement.setInt(3, vehicle.getEngine_cc());
			statement.setInt(4, vehicle.getFuel_capacity());
			statement.setInt(5,vehicle.getMileage());
			statement.setInt(6,vehicle.getPrice());
			statement.setInt(7,vehicle.getRoad_tax());
			statement.setInt(8, vehicle.getEmi());
			count = statement.executeUpdate();
			if(count > 0 ) {
				status = true;
			}
			connectionObject.commit();
		}
		catch(SQLException e) {
			try {
				connectionObject.rollback();
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return status;
	}
	

	public static List<String> searchMakes(Connection connectionObject) {
		String query = "SELECT DISTINCT make FROM vehicle ";
		Statement stmt = null;
		ResultSet rsMakes = null;	
		List<String> makes = new ArrayList<String>();
		try {
			stmt = connectionObject.createStatement();
			rsMakes = stmt.executeQuery(query);
			while (rsMakes.next()) {
				makes.add(rsMakes.getString("make"));
			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return makes;
	}
	
	
	
	public static vehicle searchCarByMakeAndModel(String make, String model, Connection connectionObject) {
		String query = "SELECT id,make,model,engine_cc,fuel_capacity,mileage,price,road_tax,emi FROM vehicle where make='" + make + "' AND model = '" + model+"'" ;
		Statement stmt = null;
		
		ResultSet rsMakes = null;	
		vehicle newcar =null;
		try {
			stmt = connectionObject.createStatement();
			rsMakes = stmt.executeQuery(query);
			if (rsMakes.next()) {
				newcar = new vehicle();
				newcar.setId(rsMakes.getInt("id"));
				newcar.setMake(rsMakes.getString("make"));
				newcar.setModel(rsMakes.getString("model"));
				newcar.setEngine_cc(rsMakes.getInt("engine_cc"));
				newcar.setFuel_capacity(rsMakes.getInt("fuel_capacity"));
				newcar.setMileage(rsMakes.getInt("mileage"));
				newcar.setPrice(rsMakes.getInt("price"));
				newcar.setRoad_tax(rsMakes.getInt("road_tax"));
				newcar.setEmi(rsMakes.getInt("emi"));
			}
		} catch(Exception e) {
			return newcar;
		}
		return newcar;
	}

	public static int findMinPrice(Connection connectionObject) {
		String query = "select min(price) as price from vehicle";
		Statement stmt = null;
		ResultSet rsMakes = null;	
		int minPrice  = 0;
		try {
			stmt = connectionObject.createStatement();
			rsMakes = stmt.executeQuery(query);
			if (rsMakes.next()) {
				minPrice = rsMakes.getInt("price");			
			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return minPrice;
	}
	
	
	public static int findMaxPrice(Connection connectionObject) {
		String query = "select max(price) as price from vehicle";
		Statement stmt = null;
		ResultSet rsMakes = null;	
		int maxPrice  = 0;
		try {
			stmt = connectionObject.createStatement();
			rsMakes = stmt.executeQuery(query);
			while (rsMakes.next()) {
				maxPrice = rsMakes.getInt("price");
			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return maxPrice;
	}

	public static List<vehicle> findCarsByBudget(Connection connectionObject, String start, String end) {
		String query = "select make,model,price from vehicle.vehicle where price between " +start + " and " +end  ;
		Statement stmt = null;
		ResultSet rsMakes = null;	
		List<vehicle> listOfCars = new ArrayList<vehicle>();
		int minPrice  = 0;
		try {
			stmt = connectionObject.createStatement();
			rsMakes = stmt.executeQuery(query);
			while (rsMakes.next()) {
				vehicle budgetCar = new vehicle();
				budgetCar.setMake(rsMakes.getString("make"));
				budgetCar.setModel(rsMakes.getString("model"));
				budgetCar.setPrice(rsMakes.getInt("price"));
				listOfCars.add(budgetCar);
			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return listOfCars;
	}

	public static boolean updateCar(vehicle newVehicle, String id, Connection connectionObject) {
							
		int count;
		boolean status = false;
		String query = "UPDATE `vehicle` SET `make`=?, `model`=?, `engine_cc`=?, `fuel_capacity`=?, `mileage`=?, `price`=?, `road_tax`=?, `emi`=? WHERE `id`='"+id+"'";
		try {
			PreparedStatement statement = connectionObject.prepareStatement(query); 
			statement.setString(1, newVehicle.getMake());
			statement.setString(2, newVehicle.getModel());
			statement.setInt(3, newVehicle.getEngine_cc());
			statement.setInt(4, newVehicle.getFuel_capacity());
			statement.setInt(5,newVehicle.getMileage());
			statement.setInt(6,newVehicle.getPrice());
			statement.setInt(7,newVehicle.getRoad_tax());
			statement.setInt(8, newVehicle.getEmi());
			System.out.println("sdfasdk;fjaskldjfl;kasjdfkl;asdfkl;asdfkl;asdfkl;asdfkljasdf"+statement);
			count = statement.executeUpdate();
			if(count > 0 ) {
				status = true;
			}
			connectionObject.commit();
		}
		catch(SQLException e) {
			try {
				connectionObject.rollback();
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return status;
	}

	public static vehicle searchCarById(String id, Connection connectionObject) {
		String query = "SELECT id,make,model,engine_cc,fuel_capacity,mileage,price,road_tax,emi FROM vehicle where id='" + id +"'" ;
		Statement stmt = null;
		
		ResultSet rsMakes = null;	
		vehicle newcar =null;
		try {
			stmt = connectionObject.createStatement();
			rsMakes = stmt.executeQuery(query);
			if (rsMakes.next()) {
				newcar = new vehicle();
				newcar.setId(rsMakes.getInt("id"));
				newcar.setMake(rsMakes.getString("make"));
				newcar.setModel(rsMakes.getString("model"));
				newcar.setEngine_cc(rsMakes.getInt("engine_cc"));
				newcar.setFuel_capacity(rsMakes.getInt("fuel_capacity"));
				newcar.setMileage(rsMakes.getInt("mileage"));
				newcar.setPrice(rsMakes.getInt("price"));
				newcar.setRoad_tax(rsMakes.getInt("road_tax"));
				newcar.setEmi(rsMakes.getInt("emi"));
			}
		} catch(Exception e) {
			return newcar;
		}
		return newcar;
	}

	public List<String> searchModels(Connection connectionObject) {
		String query = "SELECT DISTINCT model FROM vehicle ";
		Statement stmt = null;
		ResultSet rsMakes = null;	
		List<String> model = new ArrayList<String>();
		try {
			stmt = connectionObject.createStatement();
			rsMakes = stmt.executeQuery(query);
			while (rsMakes.next()) {
				model.add(rsMakes.getString("model"));
			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		
		return model;
	}
		
	
}
