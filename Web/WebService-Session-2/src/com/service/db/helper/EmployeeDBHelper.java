package com.service.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.service.db.ConnectioUtil;
import com.service.model.EmployeeModel;

/**
 * @author Anjita
 * Class EmployeeDBHelper to execute database query.
 */
public class EmployeeDBHelper {
	
	private static String EMPLOYEE_INSERT_QUERY = "insert into EMPLOYEE (ID, NAME, DESIGNATION, EMAIL, ADDRESS, SALARY) VALUES (?, ?, ?, ?, ?, ?)";
	
	private static String EMPLOYEE_SELECT_BY_ID_QUERY = "select NAME, DESIGNATION, EMAIL, ADDRESS, SALARY from EMPLOYEE where id=?";
	
	private static String EMPLOYEE_SELECT_BY_NAME_QUERY = "select ID, DESIGNATION, EMAIL, ADDRESS, SALARY from EMPLOYEE where name=?";
	
	private static String EMPLOYEE_DELETE_QUERY = "delete from EMPLOYEE where id=?";
	
	private static String EMPLOYEE_SELECT_QUERY = "select * from EMPLOYEE";
	
	/**
	 * insert employee details in database
	 * @param employeeModel : instance of EmployeeModel
	 * @return : true on successful insertion in database
	 */
	public static boolean insert(EmployeeModel employeeModel){
		
		try {
			Connection connection =ConnectioUtil.getConnection(); 
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(EMPLOYEE_INSERT_QUERY);
			preparedStatement.setInt(1, employeeModel.getId());
		    preparedStatement.setString(2, employeeModel.getName());
		    preparedStatement.setString(3, employeeModel.getDesignation());
		    preparedStatement.setString(4, employeeModel.getEmail());
		    preparedStatement.setString(5, employeeModel.getAddress());
		    preparedStatement.setInt(6, employeeModel.getSalary());
		    preparedStatement.execute();
		    connection.close();
		} catch (SQLException e) {
			System.out.println("Exception = "+e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * get employee detail by employee ID
	 * @param employeeModel : instance of EmployeeModel
	 * @return : employee detail of particular employee ID
	 */
	public static EmployeeModel getEmployeeById(EmployeeModel employeeModel){
		ResultSet resultSet = null;
		EmployeeModel employeeModel2 =null ;
		try {
			Connection connection =ConnectioUtil.getConnection(); 
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(EMPLOYEE_SELECT_BY_ID_QUERY);
			preparedStatement.setInt(1, employeeModel.getId());
		    resultSet = preparedStatement.executeQuery();
		    while(resultSet.next()){
		    	if(employeeModel2 == null){
		    		employeeModel2 = new EmployeeModel();
		    	}
		    	employeeModel2.setName(resultSet.getString(1));
		    	employeeModel2.setDesignation(resultSet.getString(2));
		    	employeeModel2.setEmail(resultSet.getString(3));
		    	employeeModel2.setAddress(resultSet.getString(4));
		    	employeeModel2.setSalary(resultSet.getInt(5));
		    	 connection.close();
		    }
		} catch (SQLException e) {
			System.out.println("Exception = "+e.getMessage());
			e.printStackTrace();
			
		}
		return employeeModel2;
	}
	
	/**
	 * get employee detail by employee name
	 * @param employeeModel : instance of EmployeeModel
	 * @return : employee detail of particular employee name
	 */
	public static EmployeeModel getEmployeeByName(EmployeeModel employeeModel){
		ResultSet resultSet = null;
		EmployeeModel employeeModel2 =null ;
		try {
			Connection connection =ConnectioUtil.getConnection(); 
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(EMPLOYEE_SELECT_BY_NAME_QUERY);
			preparedStatement.setString(1, employeeModel.getName());
		    resultSet = preparedStatement.executeQuery();
		    while(resultSet.next()){
		    	if(employeeModel2 == null){
		    		employeeModel2 = new EmployeeModel();
		    	}
		    	employeeModel2.setId(resultSet.getInt(1));
		    	employeeModel2.setDesignation(resultSet.getString(2));
		    	employeeModel2.setEmail(resultSet.getString(3));
		    	employeeModel2.setAddress(resultSet.getString(4));
		    	employeeModel2.setSalary(resultSet.getInt(5));
		    	 connection.close();
		    }
		} catch (SQLException e) {
			System.out.println("Exception = "+e.getMessage());
			e.printStackTrace();
			
		}
		return employeeModel2;
	}
	
	/**
	 * delete employee detail by employee ID
	 * @param employeeModel : instance of EmployeeModel
	 * @return : true on successful deletion of employee
	 */
	public static boolean delete(EmployeeModel employeeModel){
		
		try {
			Connection connection =ConnectioUtil.getConnection(); 
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(EMPLOYEE_DELETE_QUERY);
			preparedStatement.setInt(1, employeeModel.getId());
		    preparedStatement.execute();
		    connection.close();
		} catch (SQLException e) {
			System.out.println("Exception = "+e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * get list of all employees
	 * @return : list of employees
	 */
	public static List<EmployeeModel> getAllEmployee() {
		List<EmployeeModel> list = null;
		try {
			Connection connection =ConnectioUtil.getConnection(); 
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(EMPLOYEE_SELECT_QUERY);
			ResultSet resultSet = preparedStatement.executeQuery();
			EmployeeModel employeeModel2 = null;
			while(resultSet.next()){
				if(employeeModel2 == null){
					employeeModel2 = new EmployeeModel();
				}
				employeeModel2.setId(resultSet.getInt(1));
				employeeModel2.setName(resultSet.getString(2));
				employeeModel2.setDesignation(resultSet.getString(3));
				employeeModel2.setEmail(resultSet.getString(4));
				employeeModel2.setAddress(resultSet.getString(5));
				employeeModel2.setSalary(resultSet.getInt(6));
				if(list == null){
					list = new LinkedList<EmployeeModel>();
				}
				list.add(employeeModel2);
				employeeModel2 = null;
				 connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
}
