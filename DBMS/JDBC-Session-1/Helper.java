import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Connection.CreateConnection;

/*
 * this class helps to execute of query
 */
public class Helper {
	//create connection object using CreateConnection Class object
	private Connection connection;
	Helper ()
	{
	    CreateConnection createConnection = new CreateConnection();
	    connection = createConnection.getConnection();
	}   
	
	public Connection connection()
	{
		return connection;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   return rs;
	}
	
	public int executeUpdate(String sql)
	{
		PreparedStatement preparedStatement;
		int rs = 0;
		try  
		{
			preparedStatement = connection.prepareStatement(sql);
		    rs = preparedStatement.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   return rs;
	}
}
