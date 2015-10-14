package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
/**This is the class which deals with the addding the user details in database and inserting it
 * 
 * @author Shishir
 *Date 14th October 2015
 */
public class RegisterDao {
	/*This class registers the user in the database by inserting user details in database
	 * 
	 */
	public static int register(User u) {
		ConnectionProvider con1=new ConnectionProvider();//connection object for establishing the connection
		int status = 0;
		try {//opening connection
			Connection con = con1.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");//preparing the query
			ps.setString(1,u.getFname());//getting first name 
			ps.setString(2, u.getLname());//getting last name 
			ps.setString(3, u.getUname());//getting user name
			ps.setString(4, u.getUemail());//getting email 
			ps.setString(5, u.getUpass());//getting password
			System.out.println("Hello");
			status = ps.executeUpdate();
		} catch (Exception e) {
		}

		return status;//returning the number of rows affected 
	}
}
