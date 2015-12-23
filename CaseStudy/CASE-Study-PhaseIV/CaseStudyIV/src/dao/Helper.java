package dao;
import java.sql.*;

/*
 * this class helps to execute of query
 */
public class Helper {
	//create connection object using CreateConnection Class object
   private Connection connection;
	public Helper ()
	{
		ConnectionUtil createConnection = new ConnectionUtil();
	    connection = createConnection.getDbConnection();
	}   
	
	
	public ResultSet executeQuery(String sql)
	{   
		PreparedStatement preparedStatement;
		ResultSet rs = null;
		try  
		{
			preparedStatement = connection.prepareStatement(sql);
		    rs = preparedStatement.executeQuery(); 
		} catch (SQLException e) {
			
			System.out.println("Error in query"+connection);;
		}
		   System.out.println(rs);
		   return rs;
	}
	
	public int executeUpdate(String sql)
	{
		int rs = 0;
		try  
		{
			Statement statement = connection.createStatement();
		    rs = statement.executeUpdate(sql); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		   
		   return rs;
	}
}