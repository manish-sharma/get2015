package com.cardekho.db.helper;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.model.Car;

public class CarDBHelper extends VehicleDBHelper 
{
	private static String INSERT_CAR_QUERY = "INSERT INTO car (vehicle_id, ac, power_steering, accessory_kit, created_by, created_time, last_modified_time) VALUES (?, ?, ?, ?, ?, ?, ?)";

	private static String CAR_DETAIL_QUERY = "SELECT * FROM car WHERE vehicle_id = ?";

	private static String UPDATE_CAR_QUERY = "UPDATE Car SET ac = ?, power_steering =?, accessory_kit = ?,last_modified_time = ? WHERE vehicle_id = ?";

	private static String GET_VEHICLE_BY_MODEL_QUERY = "SELECT * FROM vehicle where model = ?";

	/** Method to insert car details into database
	 * 
	 * @param car : object of car from which details to be extracted 
	 * @return false if successfully inserted, true otherwise
	 * @throws CarDekhoSystemException
	 */
	public boolean create(Car car) throws CarDekhoSystemException 
	{
		boolean created = false;

		/* Getting Connection object */
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) 
		{
			PreparedStatement preparedStatement = null;
			try {
				/* Checking for model duplication */
				if(getVehicleByModel(car.getModel())) 
				{
					/* set created to true */
					created = true;
				}
				else 
				{
					/* transferring to create method of VehicleDBHelper */
					super.create(connection, car);

					/* Getting vehicleId of recently created car based on Model name */
					int vehicleId = getVehicleIdByModel(connection, car.getModel());

					/* If vehicleId is greater than 0, then this code will be executed */
					if(vehicleId > 0) 
					{
						/* inserting data using prepared statement */
						preparedStatement = connection.prepareStatement(INSERT_CAR_QUERY);
						preparedStatement.setInt(1, vehicleId);
						preparedStatement.setString(2, car.getAC());
						preparedStatement.setString(3, car.getPowerSteering());
						preparedStatement.setString(4, car.getAccessoryKit());
						preparedStatement.setString(5, car.getCreatedBy());
						preparedStatement.setTimestamp(6, new Timestamp(car.getCreatedTime().getTime()));
						preparedStatement.setTimestamp(7, new Timestamp(car.getLastModifiedTime().getTime()));
						created = preparedStatement.execute();
						connection.commit();
					}
				}

			} 
			catch(CarDekhoSystemException e) 
			{
				try 
				{
					connection.rollback();
				}
				catch (SQLException e1) 
				{
					System.out.println("Could not rollback.");
				}

				throw e;
			} 
			catch (SQLException e) 
			{
				try 
				{
					connection.rollback();
				} 
				catch (SQLException e1) 
				{
					System.out.println("Could not rollback.");
				}

				throw new CarDekhoSystemException("Could not create Car, [" + e.getMessage() + "]");
			} 
			finally 
			{
				if(preparedStatement != null) 
				{
					try 
					{
						preparedStatement.close();
					}
					catch (SQLException e) 
					{
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}

				/* closing connection */
				ConnectionFactory.closeConnection(connection);
			}
		}

		return created;
	}

	/** Method to update a car based on model 
	 * 
	 * @param car : Object of Car
	 * @param id : vehicle id 
	 * @return false if updated successfully, true otherwise 
	 * @throws CarDekhoSystemException
	 */
	public boolean updateByModel(Car car, int id) throws CarDekhoSystemException 
	{
		boolean created = true;

		/* Getting connection object */
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) 
		{
			PreparedStatement preparedStatement = null;
			try 
			{
				/* Updating using super class method first */
				super.updateByModel(connection, car, id);
				if(id > 0) 
				{
					/* Updating using prepared statement */
					preparedStatement = connection.prepareStatement(UPDATE_CAR_QUERY);
					preparedStatement.setString(1, car.getAC());
					preparedStatement.setString(2, car.getPowerSteering());
					preparedStatement.setString(3, car.getAccessoryKit());
					preparedStatement.setTimestamp(4, new Timestamp(car.getLastModifiedTime().getTime()));
					preparedStatement.setInt(5, id);
					created = preparedStatement.execute();
					connection.commit();
				} 
			} 
			catch(CarDekhoSystemException e)
			{
				try 
				{
					connection.rollback();
				} 
				catch (SQLException e1) 
				{
					System.out.println("Could not rollback.");
				}

				throw e;
			} 
			catch (SQLException e) 
			{
				try 
				{
					connection.rollback();
				} 
				catch (SQLException e1) 
				{
					System.out.println("Could not rollback.");
				}

				throw new CarDekhoSystemException("Could not update Car, [" + e.getMessage() + "]");
			} 
			finally 
			{
				if(preparedStatement != null) 
				{
					try 
					{
						preparedStatement.close();
					} 
					catch (SQLException e) 
					{
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}

				/* closing connection */
				ConnectionFactory.closeConnection(connection);
			}
		}

		return created;
	}

	/** Method to get Car details based on id 
	 * 
	 * @param id
	 * @return object of car if found, null otherwise 
	 * @throws CarDekhoSystemException
	 */
	public Car getCarDetails(int id) throws CarDekhoSystemException 
	{
		Car car = null;

		/* Getting connection object */
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) 
		{
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try 
			{
				/* Getting car object from super class method */
				car = (Car) super.getVehicleDetails(connection, id);
				int vehicleId = getVehicleIdByModel(connection, car.getModel());
				if(vehicleId > 0) 
				{

					/* executing query */
					preparedStatement = connection.prepareStatement(CAR_DETAIL_QUERY);
					preparedStatement.setInt(1, vehicleId);
					resultSet = preparedStatement.executeQuery();
					if(resultSet.next()) {
						car.setAC(resultSet.getString("ac"));
						car.setPowerSteering(resultSet.getString("power_steering"));
						car.setAccessoryKit(resultSet.getString("accessory_kit"));
					}
				}
			}
			catch(CarDekhoSystemException e) 
			{
				try 
				{
					connection.rollback();
				} 
				catch (SQLException e1) 
				{
					System.out.println("Could not rollback.");
				}

				throw e;
			}
			catch (SQLException e) 
			{
				try 
				{
					connection.rollback();
				} 
				catch (SQLException e1) 
				{
					System.out.println("Could not rollback.");
				}

				throw new CarDekhoSystemException("Could not Show Details, [" + e.getMessage() + "]");
			} 
			finally 
			{
				if(preparedStatement != null) 
				{
					try 
					{
						preparedStatement.close();
					} 
					catch (SQLException e) 
					{
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}

				/* closing connection */
				ConnectionFactory.closeConnection(connection);
			}
		}

		return car;
	}

	/** method to get vehicle based on model 
	 * 
	 * @param model
	 * @return true if vehicle found, false otherwise
	 * @throws CarDekhoSystemException
	 */
	public boolean getVehicleByModel(String model) throws CarDekhoSystemException 
	{
		boolean created = false;
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) 
		{
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try 
			{
				preparedStatement = connection.prepareStatement(GET_VEHICLE_BY_MODEL_QUERY);
				preparedStatement.setString(1, model);
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) 
				{
					created = true;
				}
			} 
			catch (SQLException e) 
			{
				try 
				{
					connection.rollback();
				}
				catch (SQLException e1) 
				{
					System.out.println("Could not rollback.");
				}

				throw new CarDekhoSystemException("Could not Create Car, [" + e.getMessage() + "]");
			} 
			finally 
			{
				if(preparedStatement != null)
				{
					try
					{
						preparedStatement.close();
					} 
					catch (SQLException e) 
					{
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}

				/* closing connection */
				ConnectionFactory.closeConnection(connection);
			}
		}

		return created;
	}
}
