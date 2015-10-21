/**
 * 
 */
package DBHelper.getValuesFromTable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DB.connection.ConnectionUtil;

/**
 * @author Suman
 *
 */
public class getData {
	public static boolean getData(String username, String password) {
		String query = "Select username,password from user where username='"
				+ username + "' and password='" + password + "';";

		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		boolean flag = false;

		ConnectionUtil connectionUtil = new ConnectionUtil();
		con = connectionUtil.getConnection();
		try {
			/* creating statement */
			stmt = con.createStatement();
			/* executing query */
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				flag = true;
			}
			return flag;

		} catch (SQLException e) {
			e.printStackTrace();

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
