package vehicles;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryForVehicle {
	
	public boolean insert() {
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query;
		try {
			stmt = con.createStatement();
			query = "insert into vehicles values ";
			
			rs = stmt.executeQuery(query);		
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

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		return true;
	}

}
