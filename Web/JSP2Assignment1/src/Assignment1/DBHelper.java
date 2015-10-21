package Assignment1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * class to add data in database
 * @author Ankur
 *
 */
public class DBHelper {
	public static boolean addInformation(String userName,String id, String password) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.getConnection();
		boolean isInserted = false;
		try {

			String query =	"Insert into log_in(userName,id,password)values(?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, id);
			preparedStatement.setString(3, password);

			//set value of POJO class variable
			isInserted = preparedStatement.execute();
			System.out.println(isInserted);
		} catch (SQLException e) {
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
		return isInserted;
	}

}
