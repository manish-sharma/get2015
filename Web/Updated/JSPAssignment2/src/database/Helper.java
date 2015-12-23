package database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
		{   System.out.println(connection);
			preparedStatement = connection.prepareStatement(sql);
		    rs = preparedStatement.executeQuery(); 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		   
		   return rs;
	}
	
	public int executeUpdate(String sql)
	{
		PreparedStatement preparedStatement;
		int rs = 0;
		try  
		{  if(connection == null){System.out.println("Connection is null");}
			Statement statement = connection.createStatement();
		    rs = statement.executeUpdate(sql); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		   
		   return rs;
	}
}