package com.assignment.webservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDAO {

	private static String EMPLOYEE_INSERT_QUERY = "insert into employeedetails (id, name, age, dateOfBirth, email_id, address) VALUES (?, ?, ?, ?, ?, ?)";

	private static String EMPLOYEE_SELECT_BY_ID_QUERY = "select name ,age, dateofBirth,email_id, address from employeedetails where id=?";

	//private static String EMPLOYEE_SELECT_BY_NAME_QUERY = "select id, DESIGNATION, EMAIL, ADDRESS, SALARY from EMPLOYEE where name=?";

	private static String EMPLOYEE_DELETE_QUERY = "delete from employeedetails where id=?";

	private static String EMPLOYEE_SELECT_QUERY = "select * from employeedetails";

	public static boolean insert(Employee employee){
		try{
			Connection connection = ConnectionManagement.getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(EMPLOYEE_INSERT_QUERY);
			preparedStatement.setInt(1,employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setString(3,employee.getAge());
			preparedStatement.setString(4,employee.getDateOfBirth());
			preparedStatement.setString(5,employee.getEmail());
			preparedStatement.setString(6,employee.getAddress());
			preparedStatement.execute();
			connection.close();
		}catch(Exception e){
			System.out.println("Exception = "+e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static Employee getEmployeeByID(Employee employee){
		ResultSet resultSet = null;
		Employee employee2 =null ;
		try {
			Connection connection =ConnectionManagement.getConnection(); 
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(EMPLOYEE_SELECT_BY_ID_QUERY);
			preparedStatement.setInt(1, employee.getId());
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				if(employee2 == null){
					employee2 = new Employee();
				}
				employee2.setName(resultSet.getString(1));
				employee2.setAge(resultSet.getString(2));
				employee2.setDateOfBirth(resultSet.getString(3));
				employee2.setEmail(resultSet.getString(4));
				employee2.setAddress(resultSet.getString(5));
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println("Exception = "+e.getMessage());
			e.printStackTrace();

		}
		return employee2;
	}


	public static boolean remove(Employee employee) {

		try {
			Connection connection = ConnectionManagement.getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = connection
					.prepareStatement(EMPLOYEE_DELETE_QUERY);
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.execute();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception = " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

	public static List<Employee> getAll() {
		List<Employee> list = null;
		try {
			Connection connection =ConnectionManagement.getConnection(); 
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(EMPLOYEE_SELECT_QUERY);
			ResultSet resultSet = preparedStatement.executeQuery();
			Employee employee2 = null;
			while(resultSet.next()){
				if(employee2 == null){
					employee2 = new Employee();
				}
				employee2.setId(resultSet.getInt(1));
				employee2.setName(resultSet.getString(2));
				employee2.setAge(resultSet.getString(3));
				employee2.setDateOfBirth(resultSet.getString(4));
				employee2.setEmail(resultSet.getString(5));
				employee2.setAddress(resultSet.getString(6));
				if(list == null){
					list = new ArrayList<Employee>();
				}
				list.add(employee2);
				employee2 = null;
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
}
