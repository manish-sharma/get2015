package com.employee.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.employee.db.ConnectionFactory;
import com.employee.exception.EmployeeSystemException;
import com.employee.facade.EmployeeFacade;
import com.employee.model.Employee;

public class EmployeeService {
	/**
	 * @name createEmployee()
	 * @description it will create a new employee by further calling a
	 *              createEmployee() method of EmployeeFacade class
	 * @param name
	 * @param email
	 * @param connection
	 * @return
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 */
	public void createEmployee(String name, String email)
			throws EmployeeSystemException {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();

		} catch (EmployeeSystemException e) {
			System.out.println("Coult not create connection with database ["
					+ e.getMessage() + "]");
			throw new EmployeeSystemException(
					"Coult not create connection with database ["
							+ e.getMessage() + "]", e);
		}
		EmployeeFacade employeeFacade = new EmployeeFacade();
		// Login login;
		try {
			employeeFacade.createEmployee(name, email, connection);

			try {
				connection.commit();
			} catch (SQLException e) {
				System.out.println("Coult not commit the transaction, ["
						+ e.getMessage() + "]");
				throw new EmployeeSystemException(
						"Coult not commit the transaction, [" + e.getMessage()
								+ "]", e);
			}
		} catch (Exception e) {
			try {
				System.out.println("could not create a new employee,["
						+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException(
						"could not create a new employee,Transaction roll back,["
								+ e.getMessage() + "]", e);
			} catch (SQLException e1) {
				System.out.println("Error in Transaction roll back,["
						+ e1.getMessage() + "]");
				throw new EmployeeSystemException(
						"Error in  Transaction roll back,[" + e1.getMessage()
								+ "]", e);
			}
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

	}

	/**
	 * @name retrieveEmployeeById()
	 * @description it will fetch the employee from Employee Database by its id
	 *              by further calling a retrieveEmployeeById() method of
	 *              EmployeeFacade class
	 * @param id
	 * @param connection
	 * @return employee
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public Employee retrieveEmployeeById(int id) throws EmployeeSystemException {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();

		} catch (EmployeeSystemException e) {
			System.out.println("Coult not create connection with database ["
					+ e.getMessage() + "]");
			throw new EmployeeSystemException(
					"Coult not create connection with database ["
							+ e.getMessage() + "]", e);
		}
		EmployeeFacade employeeFacade = new EmployeeFacade();
		Employee employee = new Employee();
		try {
			employee = employeeFacade.retrieveEmployeeById(id, connection);

			try {
				connection.commit();
			} catch (SQLException e) {
				System.out.println("Coult not commit the transaction, ["
						+ e.getMessage() + "]");
				throw new EmployeeSystemException(
						"Coult not commit the transaction, [" + e.getMessage()
								+ "]", e);
			}
		} catch (Exception e) {
			try {
				System.out.println("could not get employee by name,["
						+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException(
						"could not get employee by name,Transaction roll back,["
								+ e.getMessage() + "]", e);
			} catch (SQLException e1) {
				System.out.println("Error in Transaction roll back,["
						+ e1.getMessage() + "]");
				throw new EmployeeSystemException(
						"Error in  Transaction roll back,[" + e1.getMessage()
								+ "]", e);
			}
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return employee;
	}

	/**
	 * @name retrieveAllEmployeesByName()
	 * @description it will fetch all the employees from Employee Database by
	 *              name by further calling a retrieveAllEmployeesByName()
	 *              method of EmployeeFacade class
	 * @param name
	 * @param connection
	 * @return employees(list of all employees)
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public List<Employee> retrieveAllEmployeesByName(String name)
			throws EmployeeSystemException {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();

		} catch (EmployeeSystemException e) {
			System.out.println("Coult not create connection with database ["
					+ e.getMessage() + "]");
			throw new EmployeeSystemException(
					"Coult not create connection with database ["
							+ e.getMessage() + "]", e);
		}
		EmployeeFacade employeeFacade = new EmployeeFacade();
		List<Employee> employees;
		try {
			employees = employeeFacade.retrieveAllEmployeesByName(name,
					connection);

			try {
				connection.commit();
			} catch (SQLException e) {
				System.out.println("Coult not commit the transaction, ["
						+ e.getMessage() + "]");
				throw new EmployeeSystemException(
						"Coult not commit the transaction, [" + e.getMessage()
								+ "]", e);
			}
		} catch (Exception e) {
			try {
				System.out.println("could not get employee by name,["
						+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException(
						"could not get employee by name,Transaction roll back,["
								+ e.getMessage() + "]", e);
			} catch (SQLException e1) {
				System.out.println("Error in Transaction roll back,["
						+ e1.getMessage() + "]");
				throw new EmployeeSystemException(
						"Error in  Transaction roll back,[" + e1.getMessage()
								+ "]", e);
			}
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return employees;
	}

	/**
	 * @name retrieveAllEmployees()
	 * @description it will fetch all the employees from Employee Database by
	 *              further calling a retrieveAllEmployees() method of
	 *              EmployeeFacade class
	 * @param connection
	 * @return employees(list of all employees)
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public List<Employee> retrieveAllEmployees() throws EmployeeSystemException {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();

		} catch (EmployeeSystemException e) {
			System.out.println("Coult not create connection with database ["
					+ e.getMessage() + "]");
			throw new EmployeeSystemException(
					"Coult not create connection with database ["
							+ e.getMessage() + "]", e);
		}
		EmployeeFacade employeeFacade = new EmployeeFacade();
		List<Employee> employees;
		try {
			employees = employeeFacade.retrieveAllEmployees(connection);

			try {
				connection.commit();
			} catch (SQLException e) {
				System.out.println("Coult not commit the transaction, ["
						+ e.getMessage() + "]");
				throw new EmployeeSystemException(
						"Coult not commit the transaction, [" + e.getMessage()
								+ "]", e);
			}
		} catch (Exception e) {
			try {
				System.out.println("could not get all employees,["
						+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException(
						"could not get all employees,Transaction roll back,["
								+ e.getMessage() + "]", e);
			} catch (SQLException e1) {
				System.out.println("Error in Transaction roll back,["
						+ e1.getMessage() + "]");
				throw new EmployeeSystemException(
						"Error in  Transaction roll back,[" + e1.getMessage()
								+ "]", e);
			}
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return employees;
	}

	/**
	 * @name deleteAnEmployeeById()
	 * @description it will delete an employee from Employee Database by its id
	 *              by further calling a deleteAnEmployeeById() method of
	 *              EmployeeFacade class
	 * @param id
	 * @param connection
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public void deleteAnEmployeeById(int id) throws EmployeeSystemException {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();

		} catch (EmployeeSystemException e) {
			System.out.println("Coult not create connection with database ["
					+ e.getMessage() + "]");
			throw new EmployeeSystemException(
					"Coult not create connection with database ["
							+ e.getMessage() + "]", e);
		}
		EmployeeFacade employeeFacade = new EmployeeFacade();
		// List<Employee> employees;
		try {
			employeeFacade.deleteAnEmployeeById(id, connection);

			try {
				connection.commit();
			} catch (SQLException e) {
				System.out.println("Coult not commit the transaction, ["
						+ e.getMessage() + "]");
				throw new EmployeeSystemException(
						"Coult not commit the transaction, [" + e.getMessage()
								+ "]", e);
			}
		} catch (Exception e) {
			try {
				System.out.println("could not delete an employee by id,["
						+ e.getMessage() + "]");
				connection.rollback();
				System.out.println("Transaction roll back");
				throw new EmployeeSystemException(
						"could not delete an employee by id,Transaction roll back,["
								+ e.getMessage() + "]", e);
			} catch (SQLException e1) {
				System.out.println("Error in Transaction roll back,["
						+ e1.getMessage() + "]");
				throw new EmployeeSystemException(
						"Error in  Transaction roll back,[" + e1.getMessage()
								+ "]", e);
			}
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

	}
}
