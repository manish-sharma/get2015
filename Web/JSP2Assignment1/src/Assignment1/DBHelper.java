package Assignment1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
	public static boolean addInformation(String userName,String id, String password) {
		Connection con = null;
		PreparedStatement ps = null;
		con = ConnectionUtil.getConnection();
		boolean isInserted = false;
		try {
			
			String query =	"Insert into log_in(userName,id,password)values(?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, userName);
			ps.setString(2, id);
			ps.setString(3, password);
			
			//set value of POJO class variable
			isInserted = ps.execute();
			System.out.println(isInserted);
		} catch (SQLException e) {
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
		return isInserted;
	}
	
}
