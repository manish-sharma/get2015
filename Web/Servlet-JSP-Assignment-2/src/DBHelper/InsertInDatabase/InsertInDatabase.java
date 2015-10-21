package DBHelper.InsertInDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DB.connection.ConnectionUtil;

public class InsertInDatabase {
	public static int insertIntoDatabase(String username, String email,
			String password) {
		String query = "INSERT INTO User (username,email,password) VALUES('"
				+ username + "','" + email + "','" + password + "');";
		
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		int flag = 0;

		ConnectionUtil connectionUtil = new ConnectionUtil();
		con = connectionUtil.getConnection();
		try {
			/* creating statement */
			stmt = con.createStatement();
			/* executing query */
			flag = stmt.executeUpdate(query);

		} catch (SQLException e) {
			return 0;

		} finally {
			/* close connection */
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}

				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}
}
