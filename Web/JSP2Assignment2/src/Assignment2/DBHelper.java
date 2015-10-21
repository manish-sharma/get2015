package Assignment2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * class to get data from database
 * @author Ankur
 *
 */
public class DBHelper {

	public static boolean isLogInCorrect(String userName,String password) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.getConnection();
		String query = "Select * from log_in";
		ResultSet resultSet = null;
		boolean isLogInCorrect = false;
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				if(resultSet.getString(1).equalsIgnoreCase(userName) && resultSet.getString(3).equalsIgnoreCase(password)) {
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
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isLogInCorrect;
	}
}
