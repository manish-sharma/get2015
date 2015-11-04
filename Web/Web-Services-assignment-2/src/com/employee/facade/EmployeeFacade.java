package com.employee.facade;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import com.employee.db.EmployeeDao;
import com.employee.exception.EmployeeSystemException;
import com.employee.model.Employee;
/**
 * EmployeeFacade
 * @author Ankur
 * Since: 2 November,2015
 * Facade to connect to the Database
 **/
public class EmployeeFacade 
{
	/**
	 * Name:create Employee
	 * @param name
	 * @param email
	 * @param connection
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 * Description: calls the Method to create the Employee
	 **/
	public void createEmployee(String name,String email,Connection connection) throws EmployeeSystemException, SQLException
	{
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.createEmployee(name, email, connection);
	}
	/**
	 * retriveEmployeeById
	 * @param id
	 * @param connection
	 * @return
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 **/
	public Employee retrieveEmployeeById(int id,Connection connection) throws EmployeeSystemException, SQLException
	{
		EmployeeDao employeeDao=new EmployeeDao();
		Employee employee=employeeDao.retrieveEmployeeById(id, connection);
		return employee;
	}
	/**
	 * retriveAllEmployeesByName
	 * @param name
	 * @param connection
	 * @return
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 * It  Retrives All Employee By Name
	 **/
	public List<Employee> retrieveAllEmployeesByName(String name,Connection connection) throws EmployeeSystemException, SQLException 
	{
		EmployeeDao employeeDao=new EmployeeDao();
		List<Employee> employees=employeeDao.retrieveAllEmployeesByName(name, connection);
		return employees;
	}
	/**
	 * retriveAllEmployees
	 * @param connection
	 * @return
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 * It retrieve All The Employee from thr Result set
	 */
	public List<Employee> retrieveAllEmployees(Connection connection) throws EmployeeSystemException, SQLException 
	{
		EmployeeDao employeeDao=new EmployeeDao();
		List<Employee> employees=employeeDao.retrieveAllEmployees(connection);
		return employees;
	}
	/**
	 * deleteAnEmployeeById
	 * @param id
	 * @param connection
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 * It Deletes An employee by providing the Error
	 */
	public void deleteAnEmployeeById(int id,Connection connection) throws EmployeeSystemException, SQLException
	{
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.deleteAnEmployeeById(id, connection);
	}
}
