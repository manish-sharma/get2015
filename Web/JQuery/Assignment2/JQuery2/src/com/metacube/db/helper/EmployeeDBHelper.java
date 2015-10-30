package com.metacube.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.metacube.EmployeeSystemException;
import com.metacube.db.ConnectionFactory;
import com.metacube.model.Employee;

public class EmployeeDBHelper {
	
	private static final String GET_EMPLOYEE_LIST_QUERY = "SELECT * FROM Employee";
	private static final String GET_EMPLOYEE_BY_ID_QUERY = "SELECT * FROM Employee where id = ?";
	public List<Employee> getEmployeeList() throws EmployeeSystemException {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			Connection connection  = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(GET_EMPLOYEE_LIST_QUERY);
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setName(resultSet.getString("name"));
				employee.setId(resultSet.getInt("id"));
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
				employee.setEmail(resultSet.getString("email"));
				employee.setDateOfBirth(resultSet.getDate("date_of_birth"));
				employee.setAddress(resultSet.getString("address"));
				}
			} catch (EmployeeSystemException e) {
				throw new EmployeeSystemException("Exception while getting Employee Description "+e.getMessage());
			} catch (SQLException e) {
				throw new EmployeeSystemException("Exception while getting Employee Description "+e.getMessage());
			}
		return employee;
	}

}
