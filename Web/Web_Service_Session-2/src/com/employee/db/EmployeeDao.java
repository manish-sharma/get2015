/**
 * @author Ravika Jain
 * @since 02/11/2015
* it will execute all the queries related to database
 */
package com.employee.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.employee.exception.EmployeeSystemException;
import com.employee.model.Employee;

public class EmployeeDao {
	/**
	 *  it will create a new employee
	 * @param name
	 * @param email
	 * @param connection
	 * @return
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 */
	public void createEmployee(String name, String email, Connection connection)
			throws EmployeeSystemException, SQLException {
		String query = "insert into employee (name,email) values (?,?)";
		PreparedStatement preparedStatement = null;
		try {
			/* creating prepared statement to execute the query */
			preparedStatement = connection.prepareStatement(query);

			/* setting the parameters in prepared statement for insert query */
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.executeUpdate();
		} finally {
			try {
				/* close prepared statement */
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
	}

	/**

	 *  it will fetch the employee from Employee Database by its id
	 * @param id
	 * @param connection
	 * @return employee
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public Employee retrieveEmployeeById(int id, Connection connection)
			throws SQLException, EmployeeSystemException {
		String query = "select * from employee where id=?";
		Employee employee = new Employee();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			/* creating statement to execute the query */
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			/* executing select query & getting data from table in result set */
			resultSet = statement.executeQuery();

			/* getting data fron result set */
			if (resultSet.next()) {
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");

				employee.setId(id);
				employee.setName(name);
				employee.setEmail(email);
			}
		} finally {
			try {
				/* close result set */
				if (resultSet != null) {
					resultSet.close();
				}
				/* close stetement */
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
		return employee;
	}

	/**
	
	 *  it will fetch all the employees from Employee Database by
	 *              name
	 * @param name
	 * @param connection
	 * @return employees(list of all employees)
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public List<Employee> retrieveAllEmployeesByName(String name,
			Connection connection) throws SQLException, EmployeeSystemException {
		String query = "select * from employee where name=?";
		List<Employee> employees = new ArrayList<Employee>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			/* creating statement to execute the query */
			statement = connection.prepareStatement(query);
			statement.setString(1, name);
			/* executing select query & getting data from table in result set */
			resultSet = statement.executeQuery();

			/* getting data fron result set */
			while (resultSet.next()) {
				String empName = resultSet.getString("name");
				String email = resultSet.getString("email");
				int id = resultSet.getInt("id");
				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(empName);
				employee.setEmail(email);
				employees.add(employee);
			}
		} finally {
			try {
				/* close result set */
				if (resultSet != null) {
					resultSet.close();
				}
				/* close stetement */
				if (statement != null) {
					statement.close();
				}

			} catch (SQLException e) {
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
		return employees;
	}

	/**
	 * it will fetch all the employees from Employee Database
	 * @param connection
	 * @return employees(list of all employees)
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public List<Employee> retrieveAllEmployees(Connection connection)
			throws SQLException, EmployeeSystemException {
		String query = "select * from employee";
		List<Employee> employees = new ArrayList<Employee>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			/* creating statement to execute the query */
			statement = connection.prepareStatement(query);

			/* executing select query & getting data from table in result set */
			resultSet = statement.executeQuery();

			/* getting data fron result set */
			while (resultSet.next()) {
				String empName = resultSet.getString("name");
				String email = resultSet.getString("email");
				int id = resultSet.getInt("id");
				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(empName);
				employee.setEmail(email);
				employees.add(employee);
			}
		} finally {
			try {
				/* close result set */
				if (resultSet != null) {
					resultSet.close();
				}
				/* close stetement */
				if (statement != null) {
					statement.close();
				}

			} catch (SQLException e) {
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
		return employees;
	}

	/**
	 * it will delete an employee from Employee Database by its id
	 * @param id
	 * @param connection
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public void deleteAnEmployeeById(int id, Connection connection)
			throws SQLException, EmployeeSystemException {
		String query = "delete from employee where id=?";
		List<Employee> employees = new ArrayList<Employee>();
		PreparedStatement statement = null;

		try {
			/* creating statement to execute the query */
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			/* executing select query & getting data from table in result set */
			statement.executeUpdate();
		} finally {
			try {
				/* close stetement */
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				System.out.println("[" + e.getMessage() + "]");
				throw new EmployeeSystemException("[" + e.getMessage() + "]", e);
			}
		}
	}
}
