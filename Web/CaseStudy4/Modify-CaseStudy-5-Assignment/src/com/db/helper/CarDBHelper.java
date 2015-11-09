package com.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.MetaHRMSystemException;
import com.model.Car;

public class CarDBHelper extends VehicleDBHelper {

	private static String INSERT_CAR_QUERY = "INSERT INTO car(has_ac, power_steering, has_accessory_kit ,vehicle_id ) VALUES(?,?,?,?)";
	
	private static String SELECT_ID_FROM_MODEL_QUERY = "SELECT VEHICLE_ID FROM VEHICLE WHERE MODEL=?";
	
	private static String SELECT_ALL_CAR_QUERY =" SELECT v.vehicle_id  AS VEHICLEID ,"+ 
		    "v.make AS  MAKE ,"+ 
		    "v.model AS MODEL ,"+
		    "v.engine_in_cc AS ENGINEINCC ,"+
		    "v.fuel_capacity AS  FUELCAPACITY ,"+ 
		    "v.milage AS MILAGE ,"+ 
		    "v.price AS PRICE ,"+ 
		    "v.road_tax AS ROADTAX ,"+ 
		    "v.created_by AS CREATEDBY ,"+
		    "v.created_time AS CREATEDTIME ,"+
		    "c.has_ac AS HASAC,"+
		    "c.power_steering AS POWERSTEERING ,"+
		    "c.has_accessory_kit AS HASACCESSORYKIT  FROM vehicle v INNER JOIN car c ON  v.vehicle_id = c.vehicle_id ";
	
	private static String SELECT_CAR_FROM_MODEL_QUERY = SELECT_ALL_CAR_QUERY + "AND v.model=?";
	
	private static String UPDATE_CAR_QUERY ="UPDATE CAR SET has_ac =? ,power_steering =? ,has_accessory_kit =? WHERE vehicle_id= ?";
	
	private String getData(boolean input) {
		if(input)
			return "Yes" ;
		return "No";
	}
	private String getPowerSteering (boolean input) {
		if(input)
			return "Power";
		return "Normal";
	}
	
	
	
	public boolean createCar(Connection connection ,Car car) throws MetaHRMSystemException {
		boolean created = false;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				super.createVehicle(connection, car);
				int vehicleId = getVehicleIdByModel(connection ,car.getModel());
				 if(vehicleId > 0) {
				preparedStatement = connection.prepareStatement(INSERT_CAR_QUERY);
				
				preparedStatement.setString(1, getData(car.isHasAC()));
				preparedStatement.setString(2, getPowerSteering(car.isPowerSteering()));
				preparedStatement.setString(3, getData(car.isHasaccessoryKit()));
				
				preparedStatement.setInt(4, vehicleId );
				int inserted = preparedStatement.executeUpdate();
				connection.commit();
				System.out.println("Int is " + inserted);
				if (inserted > 0)
					created = true;
				 }
			} catch (MetaHRMSystemException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw e;
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw new MetaHRMSystemException(
						"Could not create car, [" + e.getMessage()
								+ "]");
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out.println("Could not close prepared statement, ["+ e.getMessage() + "]");
					}
				}
			}
		}

		return created;
	}
	
	
	
	public boolean updateCar(Connection connection ,Car car) throws MetaHRMSystemException {
		boolean created = false;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				super.updateVehicle(connection, car);
				preparedStatement = connection.prepareStatement(UPDATE_CAR_QUERY);
			
				preparedStatement.setString(1, getData (car.isHasAC()));
		
				preparedStatement.setString(2, getPowerSteering(car.isPowerSteering()));
			
				preparedStatement.setString(3, getData(car.isHasaccessoryKit()));
				preparedStatement.setInt(4, car.getId());
				int inserted = preparedStatement.executeUpdate();
				connection.commit();
				System.out.println("Int is " + inserted);
				if (inserted > 0)
					created = true;
				System.out.println("Created is ");
				}
				catch (MetaHRMSystemException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw e;
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw new MetaHRMSystemException(
						"Could not create car, [" + e.getMessage()
								+ "]");
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out.println("Could not close prepared statement, ["+ e.getMessage() + "]");
					}
				}
			}
		}

		return created;
	}

	private int getVehicleIdByModel(Connection connection,
			String model) {
		int returnValue = -1; 
		if(connection !=null && model != null) {
			PreparedStatement preparedStatement = null;
			try {
				preparedStatement = connection.prepareStatement(SELECT_ID_FROM_MODEL_QUERY);
				preparedStatement.setString(1, model);
				ResultSet resultSet =preparedStatement.executeQuery();
			
				while(resultSet.next()) {
					returnValue=resultSet.getInt("VEHICLE_ID");
					break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}
			}
		}
			return returnValue;
	}
		
	
	

	public Car getCarByModel(Connection connection, Car car) throws MetaHRMSystemException {

		Car returnValue = null;

		if (connection != null && car != null && car.getModel() != null) {
			PreparedStatement preparedStatement = null;
			try {
				preparedStatement = connection.prepareStatement(SELECT_CAR_FROM_MODEL_QUERY);
				preparedStatement.setString(1, car.getModel());
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					returnValue = new Car();
					returnValue.setModel(resultSet.getString("MODEL"));
					returnValue.setMake(resultSet.getString("MAKE"));
					returnValue.setEngineInCC(resultSet.getDouble("ENGINEINCC"));
					returnValue.setFuelCapacity(resultSet.getDouble("FUELCAPACITY"));
					returnValue.setMilage(resultSet.getDouble("MILAGE"));
					returnValue.setPrice(resultSet.getDouble("PRICE"));
					returnValue.setRoadTax(resultSet.getDouble("ROADTAX"));
					returnValue.setCreatedBy(resultSet.getString("CREATEDBY"));
					returnValue.setCreatedTime(resultSet.getTimestamp("CREATEDTIME"));
					boolean output = false;
					if (resultSet.getString("HASAC").equalsIgnoreCase("YES"))
						output = true;

					returnValue.setHasAC(output);

					output = false;
					if (resultSet.getString("POWERSTEERING").equalsIgnoreCase("POWER"))
						output = true;

					returnValue.setPowerSteering(output);

					output = false;
					if (resultSet.getString("HASACCESSORYKIT").equalsIgnoreCase("YES"))
						output = true;

					returnValue.setHasaccessoryKit(output);
					
					
					break;
				}
			} catch (SQLException e) {
				System.out.println("Error while getting car by model "+ car.getModel());
				throw new MetaHRMSystemException(
						"Error while getting car by model"
								+ car.getModel() + ", [" + e.getMessage()
								+ "]", e);
			}

		}
		return returnValue;
	}
	
	
	public List<Car> getAllCar(Connection connection) throws MetaHRMSystemException {

		List <Car> listOfCar = null;
		Car car =null;
		Statement statement = null;
		if (connection != null) {
		
			try {
				statement = connection.createStatement();
				ResultSet resultSet =statement.executeQuery(SELECT_ALL_CAR_QUERY);
				if(resultSet.next())
					listOfCar = new ArrayList<Car>();
				while (resultSet.next()) {
					car = new Car();
					car.setModel(resultSet.getString("MODEL"));
					car.setMake(resultSet.getString("MAKE"));
					car.setEngineInCC(resultSet.getDouble("ENGINEINCC"));
					car.setFuelCapacity(resultSet.getDouble("FUELCAPACITY"));
					car.setMilage(resultSet.getDouble("MILAGE"));
					car.setPrice(resultSet.getDouble("PRICE"));
					car.setRoadTax(resultSet.getDouble("ROADTAX"));
					car.setCreatedBy(resultSet.getString("CREATEDBY"));
					car.setCreatedTime(resultSet.getTimestamp("CREATEDTIME"));
					
					boolean output = false;
					if (resultSet.getString("HASAC").equalsIgnoreCase("YES"))
						output = true;

					car.setHasAC(output);

					output = false;
					if (resultSet.getString("POWERSTEERING").equalsIgnoreCase("POWER"))
						output = true;

					car.setPowerSteering(output);

					output = false;
					if (resultSet.getString("HASACCESSORYKIT").equalsIgnoreCase("YES"))
						output = true;

					car.setHasaccessoryKit(output);
					
				
					listOfCar.add(car);
				}
			} catch (SQLException e) {
				System.out.println("Error while getting all car ");
				throw new MetaHRMSystemException(
						"Error while getting all car "
								+" [" + e.getMessage()
								+ "]", e);
			}

		}
		return listOfCar;
	}

}
