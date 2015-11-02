package com.employee.facade;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.employee.db.EmployeeDao;
import com.employee.exception.EmployeeSystemException;
import com.employee.model.Employee;

public class EmployeeFacade {
	/**
	 * @name createEmployee()
	 * @description it will create a new employee by further calling a
	 *              createEmployee() method of EmployeeDao class
	 * @param name
	 * @param email
	 * @param connection
	 * @return
	 * @throws EmployeeSystemException
	 * @throws SQLException
	 */
	public void createEmployee(String name, String email, Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.createEmployee(name, email, connection);
	}

	/**
	 * @name retrieveEmployeeById()
	 * @description it will fetch the employee from Employee Database by its id
	 *              by further calling a retrieveEmployeeById() method of
	 *              EmployeeDao class
	 * @param id
	 * @param connection
	 * @return employee
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public Employee retrieveEmployeeById(int id, Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		Employee employee = employeeDao.retrieveEmployeeById(id, connection);
		return employee;
	}

	/**
	 * @name retrieveAllEmployeesByName()
	 * @description it will fetch all the employees from Employee Database by
	 *              name by further calling a retrieveAllEmployeesByName()
	 *              method of EmployeeDao class
	 * @param name
	 * @param connection
	 * @return employees(list of all employees)
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public List<Employee> retrieveAllEmployeesByName(String name,
			Connection connection) throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		List<Employee> employees = employeeDao.retrieveAllEmployeesByName(name,
				connection);
		return employees;
	}

	/**
	 * @name retrieveAllEmployees()
	 * @description it will fetch all the employees from Employee Database by
	 *              further calling a retrieveAllEmployees() method of
	 *              EmployeeDao class
	 * @param connection
	 * @return employees(list of all employees)
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public List<Employee> retrieveAllEmployees(Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		List<Employee> employees = employeeDao.retrieveAllEmployees(connection);
		return employees;
	}

	/**
	 * @name deleteAnEmployeeById()
	 * @description it will delete an employee from Employee Database by its id
	 *              by further calling a deleteAnEmployeeById() method of
	 *              EmployeeDao class
	 * @param id
	 * @param connection
	 * @throws SQLException
	 * @throws EmployeeSystemException
	 */
	public void deleteAnEmployeeById(int id, Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.deleteAnEmployeeById(id, connection);
	}
}
