package datamodeler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.metacampus.vehiclemanagement.Bike;
import com.metacampus.vehiclemanagement.ConnectionUtil;

public class BikeDAO {

	public static String createTable() {
		String result = null;
		Connection con = null;
		// statement object
		Statement stmt = null;
		// connectionUtil class object
		con = ConnectionUtil.getConnection();

		String query = "CREATE TABLE IF NOT EXISTS bike (bike_id INT PRIMARY KEY AUTO_INCREMENT,vehicle_id INT,"
				+ "self_start BOOLEAN,helmet_price INT ,"
				+ "CONSTRAINT vehicle_id_second FOREIGN KEY(vehicle_id) REFERENCES vehicle(vehicle_id) ON DELETE CASCADE ON UPDATE CASCADE);";

		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			result = "Bike Table Created";
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			 
		}
		return result;
	}

	public static int insertIntotable(Bike objOfBike) {
		int count = 0;
		
		String query = "INSERT INTO bike (vehicle_id,self_start,helmet_price) VALUES (?,?,?)";
		int value = VehicleDAO.insert(objOfBike);
		Connection con = null;
		// statement object
		PreparedStatement ps = null;
		// connectionUtil class object
		con = ConnectionUtil.getConnection();

		try {
			ps = (PreparedStatement) con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setInt(1, value);
			ps.setBoolean(2, objOfBike.isSelfStart());
			ps.setInt(3, objOfBike.getHelmetPrice());
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
		String query = "DELETE FROM TABLE bike where bike_id='"+id+"'";
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
