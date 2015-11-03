/**
 * 
 */
package com.metacube.webservices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Riddhi 
 * --class for establishing connection through database
 * 
 */
public class EmployeeDao {
	private static String CREATE_Employee, INSERT_Employee_QUERY,
			CREATE_Employee_DATABASE_QUERY, USE_Employee_DATABASE_QUERY,
			SELECT_Employee_QUERY, SELECT_Employee_By_Id_QUERY,
			SELECT_Employee_By_Name_QUERY, DELETE_Employee_By_Id_QUERY; // Query
																		// Strings

	static {
		CREATE_Employee_DATABASE_QUERY = "CREATE DATABASE IF NOT EXISTS EmployeeDatabase";
		USE_Employee_DATABASE_QUERY = "USE EmployeeDatabase";
		CREATE_Employee = "CREATE TABLE IF NOT EXISTS Employee" + "("
				+ "name VARCHAR(20), " + "id INT," + "salary DOUBLE,"
				+ "department VARCHAR(40)," + "PRIMARY KEY(id) )";
		INSERT_Employee_QUERY = "INSERT INTO Employee(name, id, salary, department) VALUES(?,?,?,?)";
		SELECT_Employee_QUERY = "SELECT * FROM Employee";
		SELECT_Employee_By_Id_QUERY = "SELECT * FROM Employee where id=?";
		SELECT_Employee_By_Name_QUERY = "SELECT * FROM Employee where name=?";
		DELETE_Employee_By_Id_QUERY = "DELETE FROM Employee where id=?";
	}

	/**
	 * Creating and using database and creating employee table here Constructor
	 * connection: Connection of database
	 */
	public EmployeeDao(Connection connection) {

		Statement statement = null;
		try {
			statement = connection.createStatement();

			statement.execute(CREATE_Employee_DATABASE_QUERY);

			useEmployeeDatabase(connection);

			statement.execute(CREATE_Employee);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * 
	 * @param connection
	 *            :connection
	 */
	public static void useEmployeeDatabase(Connection connection) {
		Statement statement = null;
		try {
			statement = connection.createStatement();

			statement.execute(USE_Employee_DATABASE_QUERY);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * To insert employee into database
	 * 
	 * @param employee
	 *            :employee details
	 * @param connection
	 *            :connection of database
	 * @return :if data inserted then 1 else -1
	 */
	public static int insertIntoEmployeeTable(Employee employee,
			Connection connection) {

		PreparedStatement preparedStatement = null;

		try {

			preparedStatement = connection
					.prepareStatement(INSERT_Employee_QUERY);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setInt(2, employee.getId());
			preparedStatement.setDouble(3, employee.getSalary());
			preparedStatement.setString(4, employee.getDepartment());

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			return -1;
		}
	}

	/**
	 * for selecting all employee from database
	 * 
	 * @param connection
	 *            :connection
	 * @return : list of employee
	 */
	public static List<Employee> selectListOfEmployee(Connection connection) {

		List<Employee> employeeList = new ArrayList<Employee>();// List of
																// employee
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection
					.prepareStatement(SELECT_Employee_QUERY);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				employeeList.add(new Employee(resultSet.getInt(2), resultSet
						.getString(1), resultSet.getString(4), resultSet
						.getDouble(3)));
			}
		} catch (SQLException e) {
		}
		return employeeList;
	}

	/**
	 * to return employee by id
	 * 
	 * @param connection
	 * @param id
	 * @return
	 */
	public static Employee selectListOfEmployeeById(Connection connection,
			int id) {

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Employee employee = null;
		try {

			preparedStatement = connection
					.prepareStatement(SELECT_Employee_By_Id_QUERY);

			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				employee = new Employee(resultSet.getInt(2),
						resultSet.getString(1), resultSet.getString(4),
						resultSet.getDouble(3));
			}
		} catch (SQLException e) {
		}
		return employee;
	}

	/**
	 * function to return all employee by name
	 * 
	 * @param connection
	 *            -connection
	 * @param name
	 *            --name of employee
	 * @return--list of employee
	 */
	public static List<Employee> selectListOfEmployeeByName(
			Connection connection, String name) {

		List<Employee> employeeList = new ArrayList<Employee>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			preparedStatement = connection
					.prepareStatement(SELECT_Employee_By_Name_QUERY);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				employeeList.add(new Employee(resultSet.getInt(2), resultSet
						.getString(1), resultSet.getString(4), resultSet
						.getDouble(3)));
			}
		} catch (SQLException e) {
		}
		return employeeList;
	}

	/**
	 * Function to delete employee by id
	 * 
	 * @param connection
	 *            --connection
	 * @param id
	 *            --id of employee
	 * @return--deleted or not
	 */
	public static int deleteEmployeeById(Connection connection, int id) {

		PreparedStatement preparedStatement = null;

		int result = 0;
		try {

			preparedStatement = connection
					.prepareStatement(DELETE_Employee_By_Id_QUERY);

			preparedStatement.setInt(1, id);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
		}
		return result;
	}
}
