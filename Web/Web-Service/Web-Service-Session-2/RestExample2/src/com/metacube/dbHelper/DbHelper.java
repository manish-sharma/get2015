package com.metacube.dbHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.metacube.connectionUtil.ConnectionFactory;
import com.metacube.model.Employee;

public class DbHelper {
	String result = "";
	String SELECT_ALL_EMPLOYEES_QUERY = "select * from employee";
	
	String SELECT_EMPLOYEE_BY_ID_QUERY = "select * from employee where id=?";
	
	String SELECT_EMPLOYEE_BY_NAME_QUERY = "select * from employee where name=?";
	
	String DELETE_EMPLOYEE_BY_ID_QUERY = "delete from employee where id=?";
	
	String CREATE_EMPLOYEE_QUERY = "insert into employee(id,name,email,dob,address,salary) values(?,?,?,?,?,?)";
	public String getEmployees() {
		result="";
		Connection connection = ConnectionFactory.getConnection();
		int i=0;
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEES_QUERY);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					i++;
					result+= i+".)\nId:\t"+resultSet.getInt(1)+"\nName:\t"+resultSet.getString(2)+"\nEmail:\t"+resultSet.getString(3)+"\nDOB:\t"+resultSet.getString(4)+"\nAddress:\t"+resultSet.getString(5)+"\nSalary:\t"+resultSet.getDouble(6)+"\n";
				}
			} catch(SQLException e) {
				System.out.println("Error reading employees");
			}
		}
		System.out.println(result);
		return result;
	}

	public String getEmployeeById(int id) {
		result="";
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID_QUERY);
				preparedStatement.setInt(1, id);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					result+= "Id:\t"+resultSet.getInt(1)+"\nName:\t"+resultSet.getString(2)+"\nEmail:\t"+resultSet.getString(3)+"\nDOB:\t"+resultSet.getString(4)+"\nAddress:\t"+resultSet.getString(5)+"\nSalary:\t"+resultSet.getDouble(6)+"\n";
				}
			} catch(SQLException e) {
				System.out.println("Error reading employee by Id");
			}
		}
		System.out.println(result);
		return result;
	}

	public String getEmployeeByName(String name) {
		int i=0;
		result="";
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_NAME_QUERY);
				preparedStatement.setString(1, name);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					i++;
					result+= i+".)\nId:\t"+resultSet.getInt(1)+"\nName:\t"+resultSet.getString(2)+"\nEmail:\t"+resultSet.getString(3)+"\nDOB:\t"+resultSet.getString(4)+"\nAddress:\t"+resultSet.getString(5)+"\nSalary:\t"+resultSet.getDouble(6)+"\n";
					
				}
			} catch(SQLException e) {
				System.out.println("Error reading employee by Id");
			}
		}
		System.out.println(result);
		return result;
	}

	public String deleteEmployeeById(int id) {
		System.out.println(id);
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_BY_ID_QUERY);
				preparedStatement.setInt(1, id);
				int affected=preparedStatement.executeUpdate();
				System.out.println(affected);
				connection.commit();
				if(affected==0) {
					result="Unable to delete";
				}
				else {
					result = getEmployees();
				}
			} catch(SQLException e) {
				System.out.println("Error deleting employee by Id");
			}
		}
		System.out.println(result);
		return result;
	}

	public String createEmployee(Employee e) {
		result="";
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				preparedStatement = connection.prepareStatement(CREATE_EMPLOYEE_QUERY);
				preparedStatement.setInt(1, e.getId());
				preparedStatement.setString(2, e.getName());
				preparedStatement.setString(3, e.getEmail());
				preparedStatement.setString(4, e.getDob());
				preparedStatement.setString(5, e.getAddress());
				preparedStatement.setDouble(6, e.getSalary());
				int affected=preparedStatement.executeUpdate();
				System.out.println(affected);
				connection.commit();
				if(affected==0) {
					result="Unable to create";
				}
				else {
					result = getEmployees();
				}
			} catch(SQLException se) {
				System.out.println(se.getMessage());
				System.out.println("Error creating employee");
			}
		}
		System.out.println(result);
		return result;
	}

}
