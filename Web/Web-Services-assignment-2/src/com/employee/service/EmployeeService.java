package com.employee.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import com.employee.db.ConnectionFactory;
import com.employee.exception.EmployeeSystemException;
import com.employee.facade.EmployeeFacade;
import com.employee.model.Employee;
/**
 * EmployeeService
 * @author Ankur
 * @Since: 2 November,2015
 * Service Class to connect between controller aand facade
 **/
public class EmployeeService
{
	/**
	 * createEmployee
	 * @param name
	 * @param email
	 * @throws EmployeeSystemException
	 * It creates the Employee Connection
	 **/
	public void createEmployee(String name, String email)throws EmployeeSystemException 
	{
		// Creates the Connection
		Connection connection = null;
		try
		{
			connection = ConnectionFactory.getConnection();
		}
		catch (EmployeeSystemException e)
		{
			System.out.println("Coult not create connection with database ["
					+ e.getMessage() + "]");
			throw new EmployeeSystemException(
					"Coult not create connection with database ["
							+ e.getMessage() + "]", e);
		}
		// Facade Object is created and function are accessed
		EmployeeFacade employeeFacade = new EmployeeFacade();
		try
		{
			// Employee is Called
			employeeFacade.createEmployee(name, email, connection);
			try 
			{
				connection.commit();
			} 
			catch (SQLException e) 
			{
				System.out.println("Coult not commit the transaction, ["+ e.getMessage() + "]");
				throw new EmployeeSystemException("Coult not commit the transaction, [" + e.getMessage()+ "]", e);
			}
		}
		catch (Exception e)
		{
			try 
			{
				// roll Back is called
				System.out.println("could not create a new employee,["+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException(
						"could not create a new employee,Transaction roll back,["
								+ e.getMessage() + "]", e);
			} 
			catch (SQLException e1) 
			{
				System.out.println("Error in Transaction roll back,["
						+ e1.getMessage() + "]");
				throw new EmployeeSystemException(
						"Error in  Transaction roll back,[" + e1.getMessage()
								+ "]", e);
			}
		}
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}

	}
	/**
	 * retrieveEmployeeById
	 * @param id
	 * @return
	 * @throws EmployeeSystemException
	 * It Retrieves the employee By Id
	 **/
	public Employee retrieveEmployeeById(int id) throws EmployeeSystemException
	{
		Connection connection = null;
		try
		{
			// Connection Factory is Called
			connection = ConnectionFactory.getConnection();

		} 
		catch (EmployeeSystemException e) 
		{
			System.out.println("Coult not create connection with database ["+ e.getMessage() + "]");
			throw new EmployeeSystemException("Coult not create connection with database ["
							+ e.getMessage() + "]", e);
		}
		// Employee Facde is Called
		EmployeeFacade employeeFacade = new EmployeeFacade();
		Employee employee = new Employee();
		try 
		{
			// Retrieve Employee By Id
			employee = employeeFacade.retrieveEmployeeById(id, connection);
			try
			{
				connection.commit();
			} 
			catch (SQLException e) 
			{
				System.out.println("Coult not commit the transaction, ["+ e.getMessage() + "]");
				throw new EmployeeSystemException("Coult not commit the transaction, [" + e.getMessage()+ "]", e);
			}
		}
		// Catches the Exception
		catch (Exception e)
		{
			try
			{
				System.out.println("could not get employee by name,["+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException("could not get employee by name,Transaction roll back,["+ e.getMessage() + "]", e);
			} 
			catch (SQLException e1) 
			{
				System.out.println("Error in Transaction roll back,["+ e1.getMessage() + "]");
				throw new EmployeeSystemException("Error in  Transaction roll back,[" + e1.getMessage()+ "]", e);
			}
		}
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		return employee;
	}
	/**
	 * retrieveAllEmployeesByName
	 * @param name
	 * @return
	 * @throws EmployeeSystemException
	 * It Retrieve All the Employee By id 
	 **/
	public List<Employee> retrieveAllEmployeesByName(String name)throws EmployeeSystemException 
	{
		Connection connection = null;
		try 
		{
			connection = ConnectionFactory.getConnection();
		} 
		catch (EmployeeSystemException e) 
		{
			System.out.println("Coult not create connection with database ["+ e.getMessage() + "]");
			throw new EmployeeSystemException("Coult not create connection with database ["+ e.getMessage() + "]", e);
		}
		EmployeeFacade employeeFacade = new EmployeeFacade();
		// List of employee is Created
		List<Employee> employees;
		try 
		{
			// Facade to retrieve All EmployeeBy Name
			employees = employeeFacade.retrieveAllEmployeesByName(name,connection);
			try 
			{
				// Commit the Coonection
				connection.commit();
			} 
			catch (SQLException e)
			{
				System.out.println("Coult not commit the transaction, ["+ e.getMessage() + "]");
				throw new EmployeeSystemException("Coult not commit the transaction, [" + e.getMessage()+ "]", e);
			}
		}
		catch (Exception e) 
		{
			try 
			{
				System.out.println("could not get employee by name,["+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException(	"could not get employee by name,Transaction roll back,["	+ e.getMessage() + "]", e);
			}
			catch (SQLException e1)
			{
				System.out.println("Error in Transaction roll back,["+ e1.getMessage() + "]");
				throw new EmployeeSystemException(
						"Error in  Transaction roll back,[" + e1.getMessage()
								+ "]", e);
			}
		} 
		finally
		{
			ConnectionFactory.closeConnection(connection);
		}
		return employees;
	}
	/**
	 * retrieveAllEmployees
	 * @return
	 * @throws EmployeeSystemException
	 * It Retrieve All Employees from the Database
	 **/
	public List<Employee> retrieveAllEmployees() throws EmployeeSystemException 
	{
		Connection connection = null;
		try
		{
			// Getting the Connection
			connection = ConnectionFactory.getConnection();

		}
		catch (EmployeeSystemException e) 
		{
			System.out.println("Coult not create connection with database ["+ e.getMessage() + "]");
			throw new EmployeeSystemException("Coult not create connection with database ["
							+ e.getMessage() + "]", e);
		}
		EmployeeFacade employeeFacade = new EmployeeFacade();
		// List for the employees
		List<Employee> employees;
		try
		{
			// Getting the Value for the Employee
			employees = employeeFacade.retrieveAllEmployees(connection);

			try 
			{
				connection.commit();
			}
			catch (SQLException e) {
				System.out.println("Coult not commit the transaction, ["+ e.getMessage() + "]");
				throw new EmployeeSystemException("Coult not commit the transaction, [" + e.getMessage()+ "]", e);
			}
		} 
		catch (Exception e) 
		{
			try
			{
				System.out.println("could not get all employees,["+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException(
						"could not get all employees,Transaction roll back,["
								+ e.getMessage() + "]", e);
			} 
			catch (SQLException e1) 
			{
				System.out.println("Error in Transaction roll back,["+ e1.getMessage() + "]");
				throw new EmployeeSystemException("Error in  Transaction roll back,[" + e1.getMessage()+ "]", e);
			}
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return employees;
	}
	/**
	 * deleteAnEmployeeById
	 * @param id
	 * @throws EmployeeSystemException
	 * It Deletes the Data for employee by Id
	 **/
	public void deleteAnEmployeeById(int id) throws EmployeeSystemException 
	{
		// Getting the Connection
		Connection connection = null;
		try 
		{
			// Getting the Connection
			connection = ConnectionFactory.getConnection();

		}
		catch (EmployeeSystemException e) 
		{
			System.out.println("Coult not create connection with database ["+ e.getMessage() + "]");
			throw new EmployeeSystemException("Coult not create connection with database ["+ e.getMessage() + "]", e);
		}
		EmployeeFacade employeeFacade = new EmployeeFacade();
		try 
		{
			// deletes the Detail of employee
			employeeFacade.deleteAnEmployeeById(id, connection);
			try 
			{
				connection.commit();
			} 
			catch (SQLException e) 
			{
				System.out.println("Coult not commit the transaction, ["+ e.getMessage() + "]");
				throw new EmployeeSystemException("Coult not commit the transaction, [" + e.getMessage()+ "]", e);
			}
		} 
		catch (Exception e) 
		{
			try
			{
				System.out.println("could not delete an employee by id,["+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException("could not delete an employee by id,Transaction roll back,["+ e.getMessage() + "]", e);
			}
			catch (SQLException e1)
			{
				System.out.println("Error in Transaction roll back,["+ e1.getMessage() + "]");
				throw new EmployeeSystemException("Error in  Transaction roll back,[" + e1.getMessage()+ "]", e);
			}
		} 
		finally
		{
			ConnectionFactory.closeConnection(connection);
		}

	}
}
