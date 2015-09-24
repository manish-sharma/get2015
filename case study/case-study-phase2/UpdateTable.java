package Com.HelperClasses;

import java.sql.Connection;
import java.sql.Statement;

/**
 * class to update table
 * @author Ankur
 */
public class UpdateTable {


	public int updateByMake(String make) {
		String query = "UPDATE vehicle SET price = price+100000 where make = '"+make+"'";
		ConnectionHelper connectionHelper = new ConnectionHelper();
		Connection con = connectionHelper.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsUpdated;
			numberOfrecordsUpdated = stmt.executeUpdate(query);
			return numberOfrecordsUpdated;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
}
