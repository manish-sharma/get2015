package dao;
import java.sql.*;

/*
 * this class helps to execute of query
 */
public class Helper {

	public Helper ()
	{
	}   
	
	
	public ResultSet executeQuery(PreparedStatement preparedStatement , Connection connection)
	{   
		
		ResultSet rs = null;
		try  
		{
		    rs = preparedStatement.executeQuery(); 
		} catch (SQLException e) {
			
			System.out.println("Error in query"+connection);;
		}
		   System.out.println(rs);
		   return rs;
	}
	
	public int executeUpdate(PreparedStatement preparedStatement , Connection connection )
	{
		int rs = 0;
		try  
		{
		    rs = preparedStatement.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		   
		   return rs;
	}
}