package com.metacube.webservices;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author Riddhi 
 * --class for providing restfull service
 *
 */
@Path("/employeeService")
public class EmployeeService {
	/**
	 * 
	 * function to insert employee
	 * 
	 * @param name
	 *            -name of employee
	 * @param id
	 *            -id of employee
	 * @param salary
	 *            -salary of employee
	 * @param department
	 *            -dept of employee
	 * @return
	 * @throws SQLException
	 */

	@POST
	@Produces("application/xml")
	@Path("{name}/{id}/{salary}/{department}")
	public String insertEmployee(@PathParam("name") String name,
			@PathParam("id") int id, @PathParam("salary") Double salary,
			@PathParam("department") String department) throws SQLException {

		Connection getConnection = ConnectionFactory.getConnection();
		EmployeeDao employeeDao = new EmployeeDao(getConnection);
		EmployeeDao.useEmployeeDatabase(getConnection);
		Employee employee = new Employee(id, name, department, salary);
		int result = EmployeeDao.insertIntoEmployeeTable(employee,
				getConnection);

		if (result == 1)

		{

			String output = "@Produces(\"application/xml\") Output: \n"
					+ "Employee Inserted";
			return "<insertEmployee>" + output + "</insertEmployee>";
		} else {
			String output = "@Produces(\"application/xml\") Output: \n"
					+ "Employee not Inserted";
			return "<insertEmployee>" + output + "</insertEmployee>";
		}

	}

	/**
	 * function to show employee by id
	 * 
	 * @param id
	 *            --id of employee
	 * @return
	 * @throws SQLException
	 */
	@POST
	@Produces("application/xml")
	@Path("{id}")
	public String selectEmployeeById(@PathParam("id") int id)
			throws SQLException {
		System.out.println("id=" + id);

		Connection getConnection = ConnectionFactory.getConnection();

		EmployeeDao.useEmployeeDatabase(getConnection);

		Employee employeeById = EmployeeDao.selectListOfEmployeeById(
				getConnection, id);

		if (employeeById != null) {
			String output = "@Produces(\"application/xml\") Output: \n"
					+ "Employee Found";
			return "<Employee>" + output + "\n" + "<employeeId>"
					+ employeeById.getId() + "</employeeId>" + "\n"
					+ "<employeeName>" + employeeById.getName()
					+ "</employeeName>" + "\n" + "<employeeSalary>"
					+ employeeById.getSalary() + "</employeeSalary>" + "\n"
					+ "<employeeDept>" + employeeById.getDepartment()
					+ "</employeeDept>" + "</Employee>";
		} else {

			String output = "@Produces(\"application/xml\") Output: \n"
					+ "Employee not found";
			return "<EmployeeById>" + output + "</EmployeeById>";
		}
	}

	/**
	 * 
	 * fnction to return list of employee by name
	 * 
	 * @param name
	 *            --name of employee
	 * @return
	 * @throws SQLException
	 */
	@POST
	@Produces("application/xml")
	@Path("name/{name}")
	public String selectEmployeeByName(@PathParam("name") String name)
			throws SQLException {

		List<Employee> employeeList = new ArrayList<Employee>();
		Connection getConnection = ConnectionFactory.getConnection();

		EmployeeDao.useEmployeeDatabase(getConnection);

		employeeList = EmployeeDao.selectListOfEmployeeByName(getConnection,
				name);
		if (!employeeList.isEmpty()) {
			String output = "";
			Iterator<Employee> itr = employeeList.iterator();
			while (itr.hasNext()) {
				Employee employee = itr.next();

				output += "<Employee>" + "\n" + "<employeeId>"
						+ employee.getId() + "</employeeId>" + "\n"
						+ "<employeeName>" + employee.getName()
						+ "</employeeName>" + "\n" + "<employeeSalary>"
						+ employee.getSalary() + "</employeeSalary>" + "\n"
						+ "<employeeDept>" + employee.getDepartment()
						+ "</employeeDept>" + "</Employee>";
			}
			return "<EmployeeById>" + output + "</EmployeeById>";
		} else {

			String output = "@Produces(\"application/xml\") Output: \n"
					+ "Employee not found";
			return "<EmployeeById>" + output + "</EmployeeById>";
		}

	}

	/**
	 * Function to display all employees
	 * 
	 * @return
	 * @throws SQLException
	 */
	@POST
	@Produces("application/xml")
	@Path("all")
	public String selectAllEmployeeList() throws SQLException {

		List<Employee> employeeList = new ArrayList<Employee>();
		Connection getConnection = ConnectionFactory.getConnection();

		EmployeeDao.useEmployeeDatabase(getConnection);

		employeeList = EmployeeDao.selectListOfEmployee(getConnection);
		if (!employeeList.isEmpty()) {
			String output = "";
			Iterator<Employee> itr = employeeList.iterator();
			while (itr.hasNext()) {
				Employee employee = itr.next();

				output += "<Employee>" + "\n" + "<employeeId>"
						+ employee.getId() + "</employeeId>" + "\n"
						+ "<employeeName>" + employee.getName()
						+ "</employeeName>" + "\n" + "<employeeSalary>"
						+ employee.getSalary() + "</employeeSalary>" + "\n"
						+ "<employeeDept>" + employee.getDepartment()
						+ "</employeeDept>" + "</Employee>";
			}
			return "<EmployeeById>" + output + "</EmployeeById>";
		} else {

			String output = "@Produces(\"application/xml\") Output: \n"
					+ "Employee not found";
			return "<EmployeeById>" + output + "</EmployeeById>";
		}

	}

	/**
	 * 
	 * function to delete employees by id
	 * 
	 * @param id
	 *            --id of employee
	 * @return
	 * @throws SQLException
	 */
	@POST
	@Produces("application/xml")
	@Path("id/{id}")
	public String deleteEmployeeById(@PathParam("id") int id)
			throws SQLException {

		Connection getConnection = ConnectionFactory.getConnection();

		EmployeeDao.useEmployeeDatabase(getConnection);

		int result = EmployeeDao.deleteEmployeeById(getConnection, id);

		if (result == 1)

		{

			String output = "@Produces(\"application/xml\") Output: \n"
					+ "Employee deleted";
			return "<deleteEmployee>" + output + "</deleteEmployee>";
		} else {
			String output = "@Produces(\"application/xml\") Output: \n"
					+ "Employee not deleted";
			return "<deleteEmployee>" + output + "</deleteEmployee>";
		}
	}

}
