package com.meta.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.meta.EmployeeSystemException;
import com.meta.db.ConnectionFactory;
import com.meta.model.Employee;



/**
 * DB helper class
 * @author Khemanshu
 *
 */
public class EmployeeDBHelper {
	
	private static final String GET_EMPLOYEE_LIST_QUERY = "SELECT * FROM Employee";
	private static final String GET_EMPLOYEE_BY_ID_QUERY = "SELECT * FROM Employee where id = ?";
	private static final String GET_EMPLOYEE_BY_NAME_QUERY = "SELECT * FROM Employee where name = ?";
	private static final String CREATE_EMPLOYEE_QUERY = "insert into Employee(name,email,address) values(?,?,?);";
	private static final String DELETE_EMPLOYEE_BY_ID_QUERY = "delete from Employee where id = ?";
	
	public int createEmployee(Employee employee) throws EmployeeSystemException {
		Connection connection = ConnectionFactory.getConnection();
		int isInsert = 0;
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(CREATE_EMPLOYEE_QUERY);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setString(2, employee.getEmailId());
			preparedStatement.setString(3, employee.getAddress());
			isInsert = preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				
				System.out.println("Conection can not rollback due to : "+e.getMessage());
			}
			throw new EmployeeSystemException("Exception while insert employee: "+e.getMessage());
		}
		return isInsert;
	}
	public List<Employee> getEmployeeList() throws EmployeeSystemException {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			Connection connection  = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(GET_EMPLOYEE_LIST_QUERY);
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setEmailId(resultSet.getString("email"));
				employee.setAddress(resultSet.getString("address"));
				employeeList.add(employee);
			}
		} catch (EmployeeSystemException e) {
			throw new EmployeeSystemException("Exception while getting list of Employees: "+e.getMessage());
		} catch (SQLException e) {
			throw new EmployeeSystemException("Exception while getting list of Employees: "+e.getMessage());
		}	
		return employeeList;
	}
	
	public Employee getEmployeeById(int id) throws EmployeeSystemException {
		Employee employee = null;
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_EMPLOYEE_BY_ID_QUERY);
			preparedStatement.setInt(1,id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				employee = new Employee();
				employee.setName(resultSet.getString("name"));
				employee.setEmailId(resultSet.getString("email"));
				employee.setAddress(resultSet.getString("address"));
				}
			} catch (EmployeeSystemException e) {
				throw new EmployeeSystemException("Exception while getting Employee Description "+e.getMessage());
			} catch (SQLException e) {
				throw new EmployeeSystemException("Exception while getting Employee Description "+e.getMessage());
			}
		return employee;
	}
	
	/**
	 * Employee Details on the basis of name
	 * @param name
	 * @return
	 * @throws EmployeeSystemException
	 */
	public List<Employee> getEmployeeByName(String name) throws EmployeeSystemException {
		Employee employee = null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_EMPLOYEE_BY_NAME_QUERY);
			preparedStatement.setString(1,name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				employee = new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setEmailId(resultSet.getString("email"));
				employee.setAddress(resultSet.getString("address"));
				employees.add(employee);
				}
			} catch (EmployeeSystemException e) {
				throw new EmployeeSystemException("Exception while getting Employee Description "+e.getMessage());
			} catch (SQLException e) {
				throw new EmployeeSystemException("Exception while getting Employee Description "+e.getMessage());
			}
		return employees;
	}
	
	/**
	 * Delete Employee Detail on the basis of id
	 * @param id
	 * @return 
	 * @throws EmployeeSystemException
	 */
	public int deleteEmployeeById(int id) throws EmployeeSystemException {
		int isDelete = 0;
		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_BY_ID_QUERY);
			preparedStatement.setInt(1,id);
			isDelete = preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				
				System.out.println("Conection can not rollback due to : "+e.getMessage());
			}
			throw new EmployeeSystemException("Exception while getting Employee Description "+e.getMessage());
		}
		return isDelete;
	}
}
