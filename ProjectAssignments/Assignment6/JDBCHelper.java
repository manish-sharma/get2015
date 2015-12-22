package Assignment6;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCHelper {

	public void deadlock1() {
		/* Creating connection */
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		Statement stmt = null;
		try {
			//Starting of transaction one
			String query = "start TRANSACTION";
			stmt = con.createStatement();
			stmt.executeQuery(query);
			//update query on Customer Table
			String query1 = "UPDATE Customer SET first_name = 'aSD' WHERE customer_id=1";
			stmt = con.createStatement();
			stmt.executeUpdate(query1);
			//now put transaction one in waiting state
			String query3 = "select SLEEP(2) ";
			stmt = con.createStatement();
			stmt.executeQuery(query3);
			//here this transaction need Order table which is held by transaction two
			String query4 = " UPDATE Orders SET customer_id = 1 WHERE order_id = 1";
			stmt = con.createStatement();
			stmt.executeUpdate(query4);
			//Commit transaction one
			String query5 = "COMMIT";
			stmt = con.createStatement();
			stmt.executeQuery(query5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deadlock2() {
		/* Creating connection */
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		Statement stmt = null;
		try {
			//Starting of transaction two
			String query = "start TRANSACTION";
			stmt = con.createStatement();
			stmt.executeQuery(query);
			//update query on Order Table
			String query2 = "UPDATE Orders SET order_name = 'asfvasdf' WHERE order_id = 1";
			stmt = con.createStatement();
			stmt.executeUpdate(query2);
			//now put transaction two in waiting state
			String query3 = "select SLEEP(2)";
			stmt = con.createStatement();
			stmt.executeQuery(query3);
			//here this transaction need Customer table which is held by transaction one
			String query4 = "UPDATE customer SET first_name = 'Mike' WHERE customer_id=1";
			stmt = con.createStatement();
			stmt.executeUpdate(query4);
			//Commit transaction two
			String query5 = "COMMIT";
			stmt = con.createStatement();
			stmt.executeQuery(query5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
