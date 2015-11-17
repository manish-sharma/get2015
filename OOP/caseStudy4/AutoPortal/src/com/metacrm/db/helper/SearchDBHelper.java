package com.metacrm.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.metacrm.db.ConnectionFactory;
import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.Car;

import org.json.simple.JSONObject;
public class SearchDBHelper {

	private final static String SEARCH_CAR_QUERY="SELECT make, model FROM vehicle GROUP BY model"; 
	private final static String SEARCH_CAR_DETAILS_QUERY_2 = "SELECT * FROM vehicle,car WHERE make = ? AND model = ? AND vehicle.vehicle_id=car.vehicle_id";
	private final static String SEARCH_CAR_DETAILS_QUERY_1 = "SELECT * FROM vehicle,car WHERE vehicle.vehicle_id=car.vehicle_id";
	private final static String SEARCH_CAR_DETAILS_QUERY_3 = "SELECT * FROM vehicle,car WHERE vehicle.vehicle_id=car.vehicle_id AND price BETWEEN ? AND ?";
	private static JSONObject json = null;
	private static ArrayList<String> modelList = null;
	private static Map<String, ArrayList<String>> optionMap = new HashMap<String, ArrayList<String>>(); 

	public static JSONObject getMap() throws MetaCRMSystemException
	{
		Connection connection = ConnectionFactory.getConnection();
		ResultSet rs=null;		
		if (connection != null) {
			Statement statement = null;
			try {
				statement=connection.createStatement();
				rs=statement.executeQuery(SEARCH_CAR_QUERY);

				while(rs.next()){
					if(optionMap.containsKey(rs.getString(1))){
						optionMap.get(rs.getString(1)).add(rs.getString(2));
						
					}
					else
					{
						modelList = new ArrayList<String>();
						modelList.add(rs.getString(2));
						optionMap.put(rs.getString(1), modelList);
					}
				}
				json = new JSONObject(optionMap);
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw new MetaCRMSystemException(
						"Could not fetch data, [" + e.getMessage()
								+ "]");
			} finally {
				if (statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						System.out
								.println("Could not close statement, ["
										+ e.getMessage() + "]");
					}
				}
				ConnectionFactory.closeConnection(connection);
			}
		}
		return json;
	}
	
	
	public static ArrayList<Car> getDetailsByBrand( String make, String model ) throws MetaCRMSystemException
	{
		ArrayList<Car> carList = new ArrayList<Car>();
		Connection connection = ConnectionFactory.getConnection();
		ResultSet rs = null;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				if(make== null && model == null){
					preparedStatement= connection.prepareStatement(SEARCH_CAR_DETAILS_QUERY_1);
				}else{
					preparedStatement= connection.prepareStatement(SEARCH_CAR_DETAILS_QUERY_2);
					preparedStatement.setString(1, make);	
					preparedStatement.setString(2, model);
				}
				rs = preparedStatement.executeQuery();

				while(rs.next()){
					Car objCar = new Car();
					objCar.setId(VehicleDBHelper.getVehicleIdByMakeModel(connection, rs.getString("make"), rs.getString("model")));
					objCar.setMake(rs.getString("make"));
					objCar.setModel(rs.getString("model"));
					objCar.setAC(rs.getBoolean("ac"));
					objCar.setPowerSteering(rs.getBoolean("power_stering"));
					objCar.setAccessoryKit(rs.getBoolean("accessory_kit"));
					objCar.setEngineInCC(rs.getString("engineIncc"));
					objCar.setFuelCapacity(rs.getDouble("fuelcapacity"));
					objCar.setMilage(rs.getDouble("milage"));
					objCar.setPrice(rs.getDouble("price"));
					objCar.setRoadTax(rs.getDouble("road_tax"));
					objCar.setImagePath(rs.getString("image"));
					objCar.setCreatedBy(rs.getString("created_by"));
					objCar.setCreatedTime(rs.getDate("created_time"));
					carList.add(objCar);
				}
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw new MetaCRMSystemException(
						"Could not fetch data, [" + e.getMessage()
								+ "]");
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out
								.println("Could not close prepared statement, ["
										+ e.getMessage() + "]");
					}
				}
				ConnectionFactory.closeConnection(connection);
			}
		}
		return carList;
	}
	
	
	public static ArrayList<Car> getDetailsByBudget( String minPrice, String maxPrice ) throws MetaCRMSystemException
	{
		ArrayList<Car> carList = new ArrayList<Car>();
		Connection connection = ConnectionFactory.getConnection();
		ResultSet rs = null;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				if(minPrice	== null && maxPrice == null){
					preparedStatement= connection.prepareStatement(SEARCH_CAR_DETAILS_QUERY_1);
				}else{
					preparedStatement= connection.prepareStatement(SEARCH_CAR_DETAILS_QUERY_3);
					preparedStatement.setInt(1, Integer.parseInt(minPrice));	
					preparedStatement.setInt(2, Integer.parseInt(maxPrice));
				}
				rs = preparedStatement.executeQuery();

				while(rs.next()){
					Car objCar = new Car();
					objCar.setId(VehicleDBHelper.getVehicleIdByMakeModel(connection, rs.getString("make"), rs.getString("model")));
					objCar.setMake(rs.getString("make"));
					objCar.setModel(rs.getString("model"));
					objCar.setAC(rs.getBoolean("ac"));
					objCar.setPowerSteering(rs.getBoolean("power_stering"));
					objCar.setAccessoryKit(rs.getBoolean("accessory_kit"));
					objCar.setEngineInCC(rs.getString("engineIncc"));
					objCar.setFuelCapacity(rs.getDouble("fuelcapacity"));
					objCar.setMilage(rs.getDouble("milage"));
					objCar.setPrice(rs.getDouble("price"));
					objCar.setRoadTax(rs.getDouble("road_tax"));
					objCar.setImagePath(rs.getString("image"));
					objCar.setCreatedBy(rs.getString("created_by"));
					objCar.setCreatedTime(rs.getDate("created_time"));
					carList.add(objCar);
				}
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw new MetaCRMSystemException(
						"Could not fetch data, [" + e.getMessage()
								+ "]");
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out
								.println("Could not close prepared statement, ["
										+ e.getMessage() + "]");
					}
				}
				ConnectionFactory.closeConnection(connection);
			}
		}
		return carList;
	}

}
