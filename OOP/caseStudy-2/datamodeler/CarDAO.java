package datamodeler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.metacampus.vehiclemanagement.Car;
import com.metacampus.vehiclemanagement.ConnectionUtil;

public class CarDAO {

	public static String createTable() {
		String result="";
		String query = "CREATE TABLE IF NOT EXISTS car (car_id INT PRIMARY KEY AUTO_INCREMENT,vehicle_id INT,ac BOOLEAN ,power_stering BOOLEAN,"
				+ "accessory_kit BOOLEAN ,CONSTRAINT vehicle_id_third FOREIGN KEY(vehicle_id) REFERENCES vehicle(vehicle_id) ON DELETE CASCADE ON UPDATE CASCADE );";

		Connection con = null;
		// statement object
		Statement stmt = null;
		// connectionUtil class object

		con = ConnectionUtil.getConnection();
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			result = "Car Table Created";
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		 return result;
	}

	public static int insertIntotable(Car objOfCar) {
		int count = 0;
		
		int value = VehicleDAO.insert(objOfCar);

		String query = "INSERT INTO Car (vehicle_id, ac, power_stering, accessory_kit) VALUES (?,?,?,?)";
		Connection con = null;
		// statement object
		PreparedStatement ps = null;
		// connectionUtil class object
		con = ConnectionUtil.getConnection();

		try {
			ps = (PreparedStatement) con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setInt(1, value);
			ps.setBoolean(2, objOfCar.isAC());
			ps.setBoolean(3, objOfCar.isPowerStering());
			ps.setBoolean(4, objOfCar.isAccessoryKit());
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			 try {
				 if (ps != null) {
				 ps.close();
				 }
				 if (con != null) {
				 con.close();
				 }
				 } catch (SQLException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
				 }
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
		String query = "DELETE FROM TABLE car where car_id='"+id+"'";
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
