package datamodeler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.metacampus.vehiclemanagement.ConnectionUtil;
import com.metacampus.vehiclemanagement.Vehicle;


public class VehicleDAO {

	public static String createTable() throws SQLException {
		String result = null;
		// boolean flag=false;
		Connection con = null;
		// statement object
		Statement stmt = null;
		// connectionUtil class object
//
//		String query="CREATE DATABASE vehicle_management_system";
//		boolean bool=stmt.execute(query);
//		String query1="USE vehicle_management_system";
//		stmt.execute(query1);
		con = ConnectionUtil.getConnection();
		String query2 = "CREATE TABLE IF NOT EXISTS vehicle (vehicle_id INT PRIMARY KEY AUTO_INCREMENT,make VARCHAR(50),"
				+ "model VARCHAR(50) , engineIncc VARCHAR(50) ,fuelcapacity INT ,"
				+ "milage INT , price DOUBLE , road_tax DOUBLE,created_by VARCHAR(50),created_time TIMESTAMP DEFAULT NOW() );";

		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query2);
			result = "Vehicle Table Created";
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		return result;

	}

	public static int insert(Vehicle objOfVehicle) {
		int count = 0;
		Connection con = null;
		// statement object
		PreparedStatement ps = null;
		// connectionUtil class object
		con = ConnectionUtil.getConnection();

		String query = "INSERT INTO vehicle (vehicle_id,make, model, engineIncc, fuelcapacity, milage, price, road_tax,created_by) VALUES (?,?,?,?,?,?,?,?,?)";
		try {
			ps = (PreparedStatement) con.prepareStatement(query,
					Statement.RETURN_GENERATED_KEYS);
			/* set variable in prepared statement */
			ps.setInt(1, objOfVehicle.getId());
			ps.setString(2, objOfVehicle.getMake());
			ps.setString(3, objOfVehicle.getModel());
			ps.setString(4, objOfVehicle.getEngineInCC());
			ps.setInt(5, objOfVehicle.getFuelCapacity());
			ps.setInt(6, objOfVehicle.getMilage());
			ps.setDouble(7, objOfVehicle.getPrice());
			ps.setDouble(8, objOfVehicle.getRoadTax());
			ps.setString(9, objOfVehicle.getCreatedBy());
			ps.executeUpdate();
			try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					count = generatedKeys.getInt(1);
					System.out.println(count + "Yppooo");
				} else {
					throw new SQLException(
							"Creating user failed, no ID obtained.");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;

	}

	public static void deleteTable(int id) {
		// boolean flag=false;
		Connection con = null;
		// statement object
		Statement stmt = null;
		// connectionUtil class object
		con = ConnectionUtil.getConnection();
		String query = "DELETE FROM TABLE vehicle where vehicle_id='"+id+"'";
		try {
			stmt = con.createStatement();
			stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// return flag;
	}

}
