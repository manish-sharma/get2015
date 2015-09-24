package Com.HelperClasses;

/**
 * @author Ankur
 * @description this class handle and executes all the queries on vehicle database
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import Com.Vehicle.*;

public class DatabaseHelper {
	/**
	 * @name createVehicleTable()
	 * @description this function will execute create query on vehicle database
	 *              to create vehicle table in vehicle database
	 * @param
	 * @return
	 */
	public static void createVehicleTable() {
		/* create query that has to be executed */
		String query ="CREATE TABLE vehicle ("
				+ "vehicleId INT AUTO_INCREMENT," + "make VARCHAR(100),"
				+ "created_time TIMESTAMP," + "model VARCHAR(100),"
				+ "engineInCC INT," + "fuelCapacity INT," + " milage INT,"
				+ "price LONG," + "roadTax INT," + "onRoadPrice LONG,"
				+ "PRIMARY KEY(vehicleId)) ";

		Connection connection = null;
		ConnectionHelper connectionUtil = new ConnectionHelper();

		/* getting connection with database */
		connection = connectionUtil.getConnection();
		Statement statement = null;

		try {
			/* creating statement to execute the query */
			statement = connection.createStatement();
			/* executing query */
			statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
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
	}

	/**
	 * @name createBikeTable()
	 * @description this function will execute create query on vehicle database
	 *              to create bike table in vehicle database
	 * @param
	 * @return
	 */
	public static void createBikeTable() {
		/* create query that has to be executed */
		String query = "CREATE TABLE bike ("
				+ "bikeId INT NOT NULL,"
				+ "selfStart TINYINT,"
				+ "helmetPrice LONG,"
				+ "PRIMARY KEY(bikeId),"
				+ "FOREIGN KEY(bikeId) REFERENCES vehicle(vehicleId)ON UPDATE CASCADE ON DELETE CASCADE) ";

		Connection connection = null;
		ConnectionHelper connectionUtil = new ConnectionHelper();

		/* getting connection with database */
		connection = connectionUtil.getConnection();
		Statement statement = null;

		try {
			/* creating statement to execute the query */
			statement = connection.createStatement();
			/* executing query */
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
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
	}

	/**
	 * @name createCarTable()
	 * @description this function will execute create query on vehicle database
	 *              to create car table in vehicle database
	 * @param
	 * @return
	 */
	public static void createCarTable() {
		/* create query that has to be executed */
		String query = "CREATE TABLE car ("
				+ "carId INT NOT NULL,"
				+ "AC TINYINT,"
				+ "powerSteering TINYINT,"
				+ "accessoryKit VARCHAR(100),"
				+ "PRIMARY KEY(carId),"
				+ "FOREIGN KEY(carId) REFERENCES vehicle(vehicleId)ON UPDATE CASCADE ON DELETE CASCADE)";

		Connection connection = null;
		ConnectionHelper connectionUtil = new ConnectionHelper();

		/* getting connection with database */
		connection = connectionUtil.getConnection();
		Statement statement = null;

		try {
			/* creating statement to execute the query */
			statement = connection.createStatement();
			/* executing query */
			statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
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
	}

	/**
	 * @name queryToInsertDataIntoVehicleTable()
	 * @description this function will execute insert query to insert data into
	 *              vehicle table of vehicle database
	 * @param vehicle
	 *            (may be either instance of car or instance of bike)
	 * @return
	 */
	public static void queryToInsertDataIntoVehicleTable(Vehicle vehicle) {
		/* insert query that has to be executed */
		String query = "INSERT INTO vehicle"
				+ "(make,created_time,model,engineInCC,fuelCapacity, milage, price,roadTax, onRoadPrice) VALUES"
				+ " (?,?,?,?,?,?,?,?,?)";

		Connection connection = null;
		ConnectionHelper connectionHelper = new ConnectionHelper();

		/* getting connection with database */
		connection = connectionHelper.getConnection();
		PreparedStatement preparedStatement = null;
		String make = vehicle.getMake();
		Timestamp createDTime = vehicle.getCreatedTime();
		String model = vehicle.getModel();
		long engineInCC = vehicle.getEngineInCC();
		int fuelCapacity = vehicle.getFuelCapacity();
		int milage = vehicle.getMilage();
		long price = vehicle.getPrice();
		int roadTax = vehicle.getRoadTax();
		long onRoadPrice = ( vehicle).getPrice();

		try {
			/* creating prepared statement to execute the query */
			preparedStatement = connection.prepareStatement(query);

			/* setting the parameters in prepared statement for insert query */
			preparedStatement.setString(1, make);
			preparedStatement.setTimestamp(2, createDTime);
			preparedStatement.setString(3, model);
			preparedStatement.setLong(4, engineInCC);
			preparedStatement.setInt(5, fuelCapacity);
			preparedStatement.setInt(6, milage);
			preparedStatement.setLong(7, price);
			preparedStatement.setInt(8, roadTax);
			preparedStatement.setLong(9, onRoadPrice);
			preparedStatement.executeUpdate();
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
	}

	/**
	 * @name queryToInsertDataIntoCarTable()
	 * @description this function will execute insert query to insert data into
	 *              car table of vehicle database
	 * @param car
	 *            (instance of car)
	 * @return
	 */
	public static void queryToInsertDataIntoCarTable(Car car) {
		/* insert query that has to be executed */
		String query = "INSERT INTO car"
				+ " (carId,AC, powerSteering,accessoryKit) VALUES"
				+ "(?,?,?,?)";

		Connection connection = null;
		ConnectionHelper connectionUtil = new ConnectionHelper();

		/* getting connection with database */
		connection = connectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		int id = getId();
		boolean AC = car.isAc();
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
			preparedStatement.executeUpdate();
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
	}

	/**
	 * @name queryToInsertDataIntoBikeTable()
	 * @description this function will execute insert query to insert data into
	 *              bike table of vehicle database
	 * @param bike
	 *            (instance of bike)
	 * @return
	 */
	public static void queryToInsertDataIntoBikeTable(Bike bike) {
		/* insert query that has to be executed */
		String query = "INSERT INTO bike "
				+ "(bikeId,selfStart, helmetPrice) VALUES" + "(?,?,?)";

		Connection connection = null;
		ConnectionHelper connectionUtil = new ConnectionHelper();

		/* getting connection with database */
		connection = connectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		int id = getId();

		try {
			/* creating prepared statement to execute the query */
			preparedStatement = connection.prepareStatement(query);

			/* setting the parameters in prepared statement for insert query */
			preparedStatement.setInt(1, id);
			preparedStatement.setBoolean(2, bike.isSelfStart());
			preparedStatement.setLong(3, bike.getHelmetPrice());
			preparedStatement.executeUpdate();
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
	}

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
	public List<Car> queryToFetchAllCarDetails() {
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
				car.setCreatedTime(resultSet.getTimestamp("created_time"));
				car.setModel(resultSet.getString("model"));
				car.setEngineInCC(resultSet.getInt("engineInCC"));
				car.setFuelCapacity(resultSet.getInt("fuelCapacity"));
				car.setMilage(resultSet.getInt("milage"));
				car.setPrice(resultSet.getLong("price"));
				car.setRoadTax(resultSet.getInt("roadTax"));
				car.calculateOnRoadPrice(resultSet.getLong("onRoadPrice"));

				car.setCarId(resultSet.getInt("carId"));
				car.setAc(resultSet.getBoolean("AC"));
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

	/**
	 * @name queryToFetchAllBikeDetails()
	 * @description this function will fetch the data from vehicle & bike table
	 *              to get the bike attributes' values
	 * @param
	 * @return bikesList(list of all bike objects)
	 */
	public static List<Bike> queryToFetchAllBikeDetails() {
		/* select query to be executed */
		String query = "SELECT * FROM vehicle V,bike B Where V.vehicleId=B.bikeId";

		Connection connection = null;
		ConnectionHelper connectionUtil = new ConnectionHelper();

		/* getting connection with database */
		connection = connectionUtil.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		ResultSetMetaData resultSetMetaData = null;
		List<Bike> bikesList = new ArrayList<Bike>();

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
					+ "               " + resultSetMetaData.getColumnName(3)
					+ "             " + resultSetMetaData.getColumnName(4)
					+ "          " + resultSetMetaData.getColumnName(5)
					+ "          " + resultSetMetaData.getColumnName(6)
					+ "          " + resultSetMetaData.getColumnName(7)
					+ "          " + resultSetMetaData.getColumnName(8)
					+ "          " + resultSetMetaData.getColumnName(9)
					+ "          " + resultSetMetaData.getColumnName(10)
					+ "          " + resultSetMetaData.getColumnName(11)
					+ "          " + resultSetMetaData.getColumnName(12)
					+ "          " + resultSetMetaData.getColumnName(13));
			System.out.println();

			/* getting data fron result set */
			while (resultSet.next()) {
				Bike bike = new Bike();
				bike.setVehicleId(resultSet.getInt("vehicleId"));
				bike.setMake(resultSet.getString("make"));
				bike.setCreatedTime(resultSet.getTimestamp("created_time"));
				bike.setModel(resultSet.getString("model"));
				bike.setEngineInCC(resultSet.getInt("engineInCC"));
				bike.setFuelCapacity(resultSet.getInt("fuelCapacity"));
				bike.setMilage(resultSet.getInt("milage"));
				bike.setPrice(resultSet.getLong("price"));
				bike.setRoadTax(resultSet.getInt("roadTax"));
				bike.calculateOnRoadPrice(resultSet.getLong("onRoadPrice"));

				bike.setBikeId(resultSet.getInt("bikeId"));
				bike.setSelfStart(resultSet.getBoolean("selfStart"));
				bike.setHelmetPrice(resultSet.getLong("helmetPrice"));
				bikesList.add(bike);
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
		return bikesList;
	}

}
