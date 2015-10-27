package com.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.model.*;

/**
 * @author Sumitra godara
 * @description this class handle and executes all the queries on vehicle database
 */

public class DBHelper {
	
		
		/**
		 * @name getId()
		 * @description this method will find the new id for car or bike
		 * @param
		 * @return id(latest id value in vehicle table)
		 */
		private static int getId() {
			/* select query to be executed to get the id */
			String query = "SELECT vehicleId FROM vehicle ORDER BY vehicleId DESC LIMIT 0,1";

			Connection connection = null;
			ConnectionHelper connectionUtil = new ConnectionHelper();

			/* getting connection with database */
			connection = connectionUtil.getConnection();
			Statement statement = null;
			ResultSet resultSet = null;
			int id = 0;

			try {
				/* creating statement to execute the query */
				statement = connection.createStatement();

				/* executing select query & getting data from table in result set */
				resultSet = statement.executeQuery(query);

				/* getting data fron result set */
				if (resultSet.next()) {
					String id1 = resultSet.getString("vehicleId");
					id = Integer.parseInt(id1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					/* close result set */
					if (resultSet != null) {
						resultSet.close();
					}
					/* close stetement */
					if (statement != null) {
						statement.close();
					}
					/* close connection */
					connectionUtil.closeConnection(connection);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return id;
		}

		/**
		 * @name queryToFetchAllCarDetails()
		 * @description this function will fetch the data from vehicle & car table
		 *              to get the car attributes' values
		 * @param
		 * @return carsList(list of all car objects)
		 */
		public static List<Car> queryToFetchAllCarDetails() {
			/* select query to be executed */
			String query = "SELECT * FROM vehicle V,car C Where V.vehicleId=C.carId";

			Connection connection = null;
			ConnectionHelper connectionUtil = new ConnectionHelper();

			/* getting connection with database */
			connection = connectionUtil.getConnection();
			Statement statement = null;
			ResultSet resultSet = null;
			ResultSetMetaData resultSetMetaData = null;
			List<Car> carsList = new ArrayList<Car>();

			try {
				/* creating statement to execute the query */
				statement = connection.createStatement();

				/*
				 * executing select query & getting data from vehicle & car tables
				 * in result set
				 */
				resultSet = statement.executeQuery(query);

				/* to get column names of a table from result set */
				resultSetMetaData = resultSet.getMetaData();
				System.out.println(resultSetMetaData.getColumnName(1)
						+ "          " + resultSetMetaData.getColumnName(2)
						+ "             " + resultSetMetaData.getColumnName(3)
						+ "          " + resultSetMetaData.getColumnName(4)
						+ "          " + resultSetMetaData.getColumnName(5)
						+ "          " + resultSetMetaData.getColumnName(6)
						+ "          " + resultSetMetaData.getColumnName(7)
						+ "          " + resultSetMetaData.getColumnName(8)
						+ "          " + resultSetMetaData.getColumnName(9)
						+ "          " + resultSetMetaData.getColumnName(10)
						+ "          " + resultSetMetaData.getColumnName(11)
						+ "          " + resultSetMetaData.getColumnName(12)
						+ "          " + resultSetMetaData.getColumnName(13)
						+ "          " + resultSetMetaData.getColumnName(14));
				System.out.println();

				/* getting data fron result set */
				while (resultSet.next()) {
					Car car = new Car();
					car.setVehicleId(resultSet.getInt("vehicleId"));
					car.setMake(resultSet.getString("make"));
					car.setCreateDTime(resultSet.getTimestamp("created_time"));
					car.setModel(resultSet.getString("model"));
					car.setEngineInCC(resultSet.getInt("engineInCC"));
					car.setFuelCapacity(resultSet.getInt("fuelCapacity"));
					car.setMilage(resultSet.getInt("milage"));
					car.setPrice(resultSet.getLong("price"));
					car.setRoadTax(resultSet.getInt("roadTax"));
					car.setOnRoadPrice(resultSet.getLong("onRoadPrice"));

					car.setCarId(resultSet.getInt("carId"));
					car.setAC(resultSet.getBoolean("AC"));
					car.setPowerSteering(resultSet.getBoolean("powerSteering"));
					car.setAccessoryKit(resultSet.getString("accessoryKit"));
					carsList.add(car);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					/* close result set */
					if (resultSet != null) {
						resultSet.close();
					}
					/* close statement */
					if (statement != null) {
						statement.close();
					}
					/* close connection */
					connectionUtil.closeConnection(connection);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return carsList;
		}

		public static boolean isLogInCorrect(String userName,String password) {
			Connection con = null;
			PreparedStatement ps = null;
			con = ConnectionHelper.getConnection();
			String query = "Select * from log_in";
			ResultSet rs = null;
			boolean isLogInCorrect = false;
			try {
           
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					if(rs.getString(1).equalsIgnoreCase(userName) && rs.getString(2).equalsIgnoreCase(password)) {
						isLogInCorrect = true;
						break;
					}
				}
			}catch (SQLException e) {
				
				e.printStackTrace();
				}
			finally {
				/* close connection */
				try {
					if (con != null) {
						con.close();
					}
					if (ps != null) {
						ps.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return isLogInCorrect;
		}

		public static int addInformation(Vehicle vehicle,Car car) {
			int flag = 0;
			String query = "INSERT INTO vehicle"
					+ "(vehicleId,make,created_time,model,engineInCC,fuelCapacity,milage, price,roadTax, onRoadPrice) VALUES"
					+ " (?,?,?,?,?,?,?,?,?,?)";
			Random randomGenerator = new Random();
			Connection connection = null;
			ConnectionHelper connectionHelper = new ConnectionHelper();

			/* getting connection with database */
			connection = connectionHelper.getConnection();
			PreparedStatement preparedStatement = null;
			int vehicleId = randomGenerator.nextInt(1000);
			String make = vehicle.getMake();
			Timestamp createDTime = vehicle.getCreateDTime();
			String model = vehicle.getModel();
			int engineInCC = vehicle.getEngineInCC();
			int fuelCapacity = vehicle.getFuelCapacity();
			int milage = vehicle.getMilage();
			long price = vehicle.getPrice();
			int roadTax = vehicle.getRoadTax();
			long onRoadPrice = vehicle.getOnRoadPrice();

			try {
				/* creating prepared statement to execute the query */
				preparedStatement = connection.prepareStatement(query);

				/* setting the parameters in prepared statement for insert query */
				preparedStatement.setInt(1, vehicleId);
				preparedStatement.setString(2, make);
				preparedStatement.setTimestamp(3, createDTime);
				preparedStatement.setString(4, model);
				preparedStatement.setInt(5, engineInCC);
				preparedStatement.setInt(6, fuelCapacity);
				preparedStatement.setInt(7, milage);
				preparedStatement.setLong(8, price);
				preparedStatement.setInt(9, roadTax);
				preparedStatement.setLong(10, onRoadPrice);
				 flag =preparedStatement.executeUpdate();
				 if(flag != 0){
					 flag = addInformationCar( car);
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					/* close prepared statement */
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					/* close connection */
					connectionHelper.closeConnection(connection);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return flag;
		}
		public static int addInformationCar(Car car) {
			int flag = 0;
			/* insert query that has to be executed */
			String query = "INSERT INTO car"
					+ " (carId,AC, powerSteering,accessoryKit) VALUES"
					+ "(?,?,?,?)";

			Connection connection = null;
			ConnectionHelper connectionUtil = new ConnectionHelper();

			/* getting connection with database */
			connection = ConnectionHelper.getConnection();
			PreparedStatement preparedStatement = null;
			int id = getId();
			boolean AC = car.isAC();
			boolean powerSteering = car.isPowerSteering();
			String accessoryKit = car.getAccessoryKit();

			try {
				/* creating prepared statement to execute the query */
				preparedStatement = connection.prepareStatement(query);

				/* setting the parameters in prepared statement for insert query */
				preparedStatement.setInt(1, id);
				preparedStatement.setBoolean(2, AC);
				preparedStatement.setBoolean(3, powerSteering);
				preparedStatement.setString(4, accessoryKit);
				flag = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					/* close prepared statement */
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					/* close connection */
					connectionUtil.closeConnection(connection);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return flag;
		
		
		}
		public static boolean addUser(String id, String password) {
			Connection con = null;
			PreparedStatement ps = null;
			con = ConnectionHelper.getConnection();
			boolean isInserted = false;
			try {
				
				String query =	"Insert into log_in(userid,password)values(?,?)";
				ps = con.prepareStatement(query);
				ps.setString(1, id);
				ps.setString(2, password);
				
				//set value of POJO class variable
				isInserted = ps.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
				}
			finally {
				/* close connection */
				try {
					if (con != null) {
						con.close();
					}
					if (ps != null) {
						ps.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return isInserted;
		}
		
	
		public static List<Vehicle> searchByMakeAndModel(String make, String model) {
			Car car = new Car();
			String query = "SELECT * FROM vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
			Statement stmt = null, stmt2 = null;
			ResultSet rsVehicle = null;
			ResultSet rsSpecific = null;
			int engineInCC;
			int fuelCapacity;
			int mileage;
			boolean ac;
			boolean powerSteering;
			String accessoryKit;
			long price;
			int roadTax;
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
					 rsSpecific.first();
						ac = rsSpecific.getBoolean("AC");
						powerSteering = rsSpecific.getBoolean("powerSteering");
						accessoryKit = rsSpecific.getString("accessoryKit");
						
						vehicles.add(VehicleHelper.createCar(car,vehicle_id,make,createdTime,model, engineInCC, fuelCapacity, mileage, price, roadTax, ac, powerSteering, accessoryKit));
						
					}
					
				}
			 catch(Exception e) {
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

		public static List<Car> searchById(int id) {
			
			Car car = new Car();
			String query = "SELECT * FROM vehicle WHERE vehicleId= '"+id+"'";
			Statement stmt = null, stmt2 = null;
			ResultSet rsVehicle = null;
			ResultSet rsSpecific = null;
			String make;
			String model;
			int engineInCC;
			int fuelCapacity;
			int mileage;
			boolean ac;
			boolean powerSteering;
			String accessoryKit;
			long price;
			int roadTax;
			ConnectionHelper connectionHelper = new ConnectionHelper();
			Connection con = connectionHelper.getConnection();
			List<Car> vehicles = null;
			try {
				stmt = con.createStatement();
				stmt2 = con.createStatement();
				rsVehicle = stmt.executeQuery(query);
				vehicles = new ArrayList<Car>();
				while(rsVehicle.next()) {
					make = rsVehicle.getString("make");
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
					 rsSpecific.first();
						ac = rsSpecific.getBoolean("AC");
						powerSteering = rsSpecific.getBoolean("powerSteering");
						accessoryKit = rsSpecific.getString("accessoryKit");
						
						vehicles.add(VehicleHelper.createCar(car,vehicle_id,make,createdTime,model, engineInCC, fuelCapacity, mileage, price, roadTax, ac, powerSteering, accessoryKit));
						
					}
					
				}
			 catch(Exception e) {
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
			return  vehicles;
		}

		public static int updateByModel(Vehicle vehicle,Car car, int id) {
			int isUpdate =0;
			String query = "UPDATE  vehicle SET "
					+ "make=?,created_time =?,model=?, engineInCC=?, fuelCapacity=?, milage=?, price=?, roadTax=?, onRoadPrice=?"
					+ " WHERE vehicleId =?";
			Connection connection = null;
			ConnectionHelper connectionHelper = new ConnectionHelper();

			/* getting connection with database */
			connection = connectionHelper.getConnection();
			PreparedStatement preparedStatement = null;
			String make = vehicle.getMake();
			Timestamp createDTime = vehicle.getCreateDTime();
			String model = vehicle.getModel();
			int engineInCC = vehicle.getEngineInCC();
			int fuelCapacity = vehicle.getFuelCapacity();
			int milage = vehicle.getMilage();
			long price = vehicle.getPrice();
			int roadTax = vehicle.getRoadTax();
			long onRoadPrice = vehicle.getOnRoadPrice();

			try {
				/* creating prepared statement to execute the query */
				preparedStatement = connection.prepareStatement(query);

				/* setting the parameters in prepared statement for insert query */
				preparedStatement.setString(1, make);
				preparedStatement.setTimestamp(2, createDTime);
				preparedStatement.setString(3, model);
				preparedStatement.setInt(4, engineInCC);
				preparedStatement.setInt(5, fuelCapacity);
				preparedStatement.setInt(6, milage);
				preparedStatement.setLong(7, price);
				preparedStatement.setInt(8, roadTax);
				preparedStatement.setLong(9, onRoadPrice);
				preparedStatement.setInt(10, id);
				 isUpdate =preparedStatement.executeUpdate();
				 if(isUpdate != 0){
					 isUpdate = updateCar( car,id);
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					/* close prepared statement */
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					/* close connection */
					connectionHelper.closeConnection(connection);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return isUpdate;
			
		}

		private static int updateCar(Car car,int id) {
			int isUpdate =0;
			String query = "UPDATE  car SET "
					+ "AC=?,powerSteering =?,accessoryKit=?"
					+ " WHERE carId =?";
			Connection connection = null;
			ConnectionHelper connectionHelper = new ConnectionHelper();

			/* getting connection with database */
			connection = connectionHelper.getConnection();
			PreparedStatement preparedStatement = null;
			boolean ac = car.isAC();
			boolean powerSteering = car.isPowerSteering();
			String accessoryKit = car.getAccessoryKit();
			
			try {
				/* creating prepared statement to execute the query */
				preparedStatement = connection.prepareStatement(query);

				/* setting the parameters in prepared statement for insert query */
				preparedStatement.setBoolean(1, ac);
				preparedStatement.setBoolean(2, powerSteering);
				preparedStatement.setString(3, accessoryKit);
				preparedStatement.setInt(4, id);
				 isUpdate =preparedStatement.executeUpdate();
				 
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					/* close prepared statement */
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					/* close connection */
					connectionHelper.closeConnection(connection);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return isUpdate;
		}
		}
	


