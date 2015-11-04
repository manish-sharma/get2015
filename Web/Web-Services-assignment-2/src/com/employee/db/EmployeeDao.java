package com.employee.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import com.employee.exception.EmployeeSystemException;
import com.employee.model.Employee;
/**
 * EmployeeDao is used to DataBase Acess Object
 * @author Ankur
 * @Since: 2 November,2015
 **/
public class EmployeeDao 
{
	/**
	 * createEmployee
	 * @param name
	 * @param email
	 * @param connection
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 */
	public void createEmployee(String name, String email, Connection connection)
			throws EmployeeSystemException, SQLException 
	{
		// Query to insert The Value
		String query = "insert into employee (name,email) values (?,?)";
		PreparedStatement preparedStatement = null;
		try
		{
			// Sets the Query
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			// Executes the Update
			preparedStatement.executeUpdate();
		}
		finally
		{
			try
			{
				if (preparedStatement != null)
				{
					preparedStatement.close();
				}

			} 
			catch (SQLException e) 
			{
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
	}
	/**
	 * retrieveEmployeeById
	 * @param id
	 * @param connection
	 * @return
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 **/
	public Employee retrieveEmployeeById(int id, Connection connection)throws SQLException, EmployeeSystemException 
	{
		// Query to  Fetch the Data
		String query = "select * from employee where id=?";
		Employee employee = new Employee();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try 
		{
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			resultSet = statement.executeQuery();
			// Sets in the Result set
			if (resultSet.next())
			{
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				employee.setId(id);
				employee.setName(name);
				employee.setEmail(email);
			}
		}
		finally
		{
			try 
			{
				// close result set 
				if (resultSet != null)
				{
					resultSet.close();
				}
				if (statement != null)
				{
					statement.close();
				}

			} 
			catch (SQLException e)
			{
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
		return employee;
	}
	/**
	 * retriveAllEmployeesByName By Name from the Database
	 * @param name
	 * @param connection
	 * @return
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 **/
	public List<Employee> retrieveAllEmployeesByName(String name,Connection connection) throws SQLException, EmployeeSystemException 
	{
		// Query
		String query = "select * from employee where name=?";
		// List To store The Employee
		List<Employee> employees = new ArrayList<Employee>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try 
		{
			// Statement to prepare the Data
			statement = connection.prepareStatement(query);
			statement.setString(1, name);
			resultSet = statement.executeQuery();
			// Iterates Over The Data
			while (resultSet.next()) 
			{
				// Gets the Name
				String empName = resultSet.getString("name");
				// Gets The email
				String email = resultSet.getString("email");
				//  Gets the Id
				int id = resultSet.getInt("id");
				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(empName);
				employee.setEmail(email);
				employees.add(employee);
			}
		}
		finally
		{
			try 
			{
				if (resultSet != null) 
				{
					resultSet.close();
				}
				if (statement != null) 
				{
					statement.close();
				}

			} 
			catch (SQLException e)
			{
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
		return employees;
	}
	/**
	 * retriveAllEmployees
	 * @param connection
	 * @return
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public List<Employee> retrieveAllEmployees(Connection connection)throws SQLException, EmployeeSystemException 
	{
		// Query
		String query = "select * from employee";
		// List of the Employees
		List<Employee> employees = new ArrayList<Employee>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try 
		{
			// Statement to get the Query
			statement = connection.prepareStatement(query);
			resultSet = statement.executeQuery();
			// Traversing th Data
			while (resultSet.next()) 
			{
				String empName = resultSet.getString("name");
				String email = resultSet.getString("email");
				int id = resultSet.getInt("id");
				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(empName);
				employee.setEmail(email);
				employees.add(employee);
			}
		}
		finally 
		{
			try
			{
				if (resultSet != null) 
				{
					resultSet.close();
				}
				if (statement != null)
				{
					statement.close();
				}

			} 
			catch (SQLException e) 
			{
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
		return employees;
	}
	/**
	 * deleteAn EmployeeByID
	 * @param id
	 * @param connection
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 **/
	public void deleteAnEmployeeById(int id,Connection connection) throws SQLException, EmployeeSystemException
	{
		String query="delete from employee where id=?";
		List<Employee> employees=new ArrayList<Employee>();
		PreparedStatement statement = null;
		try 
		{
			// Prepare the Statement
			statement = connection.prepareStatement(query);
            statement.setInt(1, id);
			// executing select query 
			statement.executeUpdate();
		}  
		finally 
		{
			try 
			{
				if (statement != null) 
				{
					statement.close();
				}
				
			}
			catch (SQLException e)
			{
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}        
      
	}
}
