package vehicle.InsertInDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import vehicle.connection.ConnectionUtil;
import vehicle.pojoClasses.Bike;
import vehicle.pojoClasses.Car;
import vehicle.pojoClasses.Vehicle;

public class InsertInDatabase {

	public static void InsertIntoVehicle(Vehicle vehicle) {
		
		/*Insert query for vehicle table*/
		String query = "INSERT INTO vehicle VALUES('" + vehicle.getID() + "','"
				+ vehicle.getCreatedBy() + "','" + vehicle.getCreatedTime()
				+ "','" + vehicle.getMake() + "','" + vehicle.getModel() + "',"
				+ vehicle.getEngineInCC() + "," + vehicle.getFuelCapacity()
				+ "," + vehicle.getMilage() + "," + vehicle.getPrice() + ","
				+ vehicle.getRoadtax() + ");";
		//System.out.println(query);
		insertIntoDatabase(query);

		if (vehicle instanceof Car) {
			/*Insert query for car table*/
			String queryForCar = "INSERT INTO car (AC,power_steering,ID) VALUES('"
					+ ((Car) vehicle).getAC()
					+ "','"
					+ ((Car) vehicle).getPowerSteering()
					+ "','"
					+ vehicle.getID() + "');";
			//System.out.println(queryForCar);
			insertIntoDatabase(queryForCar);
		} else {
			/*Insert query for bike table*/
			String queryForBike = "INSERT INTO bike (se"
					+ "lf_start,helmet_price,ID) VALUES('"
					+ ((Bike) vehicle).getSelfStart()
					+ "',"
					+ ((Bike) vehicle).getHelmetPrice()
					+ ",'"
					+ vehicle.getID() + "');";
			//System.out.println(queryForBike);
			insertIntoDatabase(queryForBike);
		}
	}

	private static void insertIntoDatabase(String query) {

		System.out.println(query);
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;

		ConnectionUtil connectionUtil = new ConnectionUtil();
		con = connectionUtil.getConnection();
		try {
			/*creating statement*/
			stmt = con.createStatement();
			/*executing query*/
			stmt.execute(query);
			//System.out.println("\nNO OF Records Inserted : " + flag);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
