package com.jqueryassignment.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jqueryassignment.model.Employee;
import com.mysql.jdbc.ResultSetMetaData;

public class EmployeeDAO {
	static Connection currentCon = null;
	static ResultSet resultSet = null;
	
	static String query = "Select * from employeeDetails";
	static String query2 = "Select * from employeeDetails where id = ? ";

	public static List<Employee> getEmployee() {
		Statement statement = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			ConnectionManagement con1 = new ConnectionManagement();
			currentCon = con1.getConnection();
			statement = currentCon.createStatement();
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setEmailId(resultSet.getString("emailid"));
				employee.setDateOfBirth(resultSet.getString("dob"));
				employee.setAddress(resultSet.getString("address"));
				employeeList.add(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (Exception e) {
				}
				resultSet = null;
			}
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return employeeList;
	}

	public Employee getEmployeeById(int id) {
		Statement statement = null;
		Employee employee = new Employee();
		try {
			ConnectionManagement con1 = new ConnectionManagement();
			currentCon = con1.getConnection();
			statement = currentCon.createStatement();
			resultSet = statement.executeQuery(query2);
			while (resultSet.next()) {
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setEmailId(resultSet.getString("email_id"));
				employee.setDateOfBirth(resultSet.getString("dateOfBirth"));
				employee.setAddress(resultSet.getString("address"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (Exception e) {
				}
				resultSet = null;
			}
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return employee;
	}
}