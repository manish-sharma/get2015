package com.cardekho.db.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;

public class SearchDBHelper {

	private final static String CREATE_LIST_QUERY = "SELECT MAKE, MODEL FROM Vehicle";
	private final static String SEARCH_QUERY = "SELECT * FROM vehicle WHERE make = ? AND model = ?";
	
	/** method to populate list of make and model form database
	 * 
	 * @return list of make-model
	 * @throws CarDekhoSystemException
	 */
	public List<String> populateList() throws CarDekhoSystemException
	{
		/* carlistwill contain lst of make-model */
		List<String> carList = new ArrayList<String>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			/* Getting connection */
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			/* executing query */
			resultSet = statement.executeQuery(CREATE_LIST_QUERY);
			while(resultSet.next()) {
				/* Adding make-model combination to the list */
				carList.add(resultSet.getString("make")+"-"+resultSet.getString("model"));
			}
			/* returning the list */
			return carList;
			
		} catch(CarDekhoSystemException e) {
			try {
				/* rollbacking connection in case if exception */
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw new CarDekhoSystemException("Could not Create List, [" + e.getMessage() + "]");
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println("Could not close Statement, [" + e.getMessage() + "]");
				}
			}
			/* closing connection */
			ConnectionFactory.closeConnection(connection);
		}
	}
	
	/** Method to search car based on make model 
	 * 
	 * @param make
	 * @param model
	 * @return list of cars
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> searchCar(String make, String model) throws CarDekhoSystemException {
		String searchQuery = "SELECT * FROM Vehicle where make='"+make+"' AND model='"+model+"'";
		List<Vehicle> searchList = new ArrayList<Vehicle>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Vehicle vehicle = null;
		try {
			/* Getting connection */
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			/* Executing Query */
			resultSet = statement.executeQuery(searchQuery);
			while(resultSet.next()) {
				/* Creating vehicle object based on search result */
				vehicle = new Car();
				vehicle.setId(resultSet.getInt("id"));
				vehicle.setMake(resultSet.getString("make"));
				vehicle.setModel(resultSet.getString("model"));
				vehicle.setEngineCC(resultSet.getString("engine_cc"));
				vehicle.setFuelCapacity(resultSet.getString("fuel_capacity"));
				vehicle.setMileage(resultSet.getString("mileage"));
				vehicle.setPrice(resultSet.getInt("price"));
				vehicle.setRoadTax(resultSet.getInt("road_tax"));
				vehicle.setCreatedBy(resultSet.getString("created_by"));
				vehicle.setCreatedTime(resultSet.getDate("created_time"));
				vehicle.setLastModifiedTime(resultSet.getDate("last_modified_time"));
				vehicle.setImagePath(resultSet.getString("image_path"));
				/* adding object to list */
				searchList.add(vehicle);
			}
			/* returning the list */
			return searchList;
			
		} catch(CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw new CarDekhoSystemException("Could not Show Result, [" + e.getMessage() + "]");
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println("Could not close Statement, [" + e.getMessage() + "]");
				}
			}
			/* closing connection */
			ConnectionFactory.closeConnection(connection);
		}
	}
}
