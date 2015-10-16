package Assignment2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
	
	public static boolean isLogInCorrect(String userName,String password) {
		Connection con = null;
		PreparedStatement ps = null;
		con = ConnectionUtil.getConnection();
		String query = "Select * from log_in";
		ResultSet rs = null;
		boolean isLogInCorrect = false;
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				if(rs.getString(1).equalsIgnoreCase(userName) && rs.getString(3).equalsIgnoreCase(password)) {
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
}
