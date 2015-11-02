package com.employee.controller;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.employee.exception.EmployeeSystemException;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Path("/employeeWebController")
public class EmployeeWebController {
	/**
	 * @name createEmployee()
	 * @description it will create an employee by further calling the method
	 *              createEmployee() of EmployeeService class
	 * @param name
	 * @param email
	 * @return
	 */
	@GET
	@Path("/create/{name}/{email}")
	public void createEmployee(@PathParam("name") String name,
			@PathParam("email") String email) {
		// System.out.println("create");
		EmployeeService employeeService = new EmployeeService();
		try {
			employeeService.createEmployee(name, email);
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			System.out.println("[" + e.getMessage() + "]");
		}
	}

	/**
	 * @name retrieveEmployeeById
	 * @description it will retrieve an employee by id by further calling the
	 *              method retrieveEmployeeById() of EmployeeService class
	 * @param id
	 * @return result(XML output-employee datails)
	 */
	@GET
	@Path("/id/{id : \\d+}")
	@Produces("application/xml")
	public String retrieveEmployeeById(@PathParam("id") int id) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = null;
		String result = null;
		try {
			employee = employeeService.retrieveEmployeeById(id);
			result = "<employee><employeeId>" + employee.getId()
					+ "</employeeId>" + "<employeeName>" + employee.getName()
					+ "</employeeName>" + "<employeeEmail>"
					+ employee.getEmail() + "</employeeEmail></employee>";
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			System.out.println("[" + e.getMessage() + "]");
		}
		return result;
	}

	/**
	 * @name retrieveAllEmployeesByName()
	 * @description it will retrieve all employees by name by further calling
	 *              the method retrieveAllEmployeesByName() of EmployeeService
	 *              class
	 * @param name
	 * @return result(XML output-all employees details)
	 */

	@GET
	@Path("/name/{name}")
	@Produces("application/xml")
	public String retrieveAllEmployeesByName(@PathParam("name") String name) {
		System.out.println("name");
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employees = null;
		String result = null;
		try {
			employees = employeeService.retrieveAllEmployeesByName(name);
			result = "<employee List>";
			for (int i = 0; i < employees.size(); i++) {
				Employee employee = new Employee();
				employee = employees.get(i);
				result = result + "<employee><employeeId>" + employee.getId()
						+ "</employeeId>" + "<employeeName>"
						+ employee.getName() + "</employeeName>"
						+ "<employeeEmail>" + employee.getEmail()
						+ "</employeeEmail></employee>";
			}
			result = result + "</employee List>";
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			System.out.println("[" + e.getMessage() + "]");
		}
		return result;
	}

	/**
	 * @name retrieveAllEmployees()
	 * @desciption it will retrieve all employees by further calling the method
	 *             retrieveAllEmployees() of EmployeeService class
	 * @param
	 * @return result(XML output-all employees details)
	 */
	@GET
	@Path("/retrieveAllEmployees")
	@Produces("application/xml")
	public String retrieveAllEmployees() {
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employees = null;
		String result = null;
		try {
			employees = employeeService.retrieveAllEmployees();
			result = "<employee List>";
			for (int i = 0; i < employees.size(); i++) {
				Employee employee = new Employee();
				employee = employees.get(i);
				result = result + "<employee><employeeId>" + employee.getId()
						+ "</employeeId>" + "<employeeName>"
						+ employee.getName() + "</employeeName>"
						+ "<employeeEmail>" + employee.getEmail()
						+ "</employeeEmail></employee>";
			}
			result = result + "</employee List>";
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			System.out.println("[" + e.getMessage() + "]");
		}
		return result;
	}

	/**
	 * @name deleteAnEmployeeById()
	 * @description it will delete an employee by id by further calling the
	 *              method deleteAnEmployeeById() of EmployeeService class
	 * @param id
	 * @return
	 */
	@GET
	@Path("/deleteAnEmployeeById/{id}")
	public void deleteAnEmployeeById(@PathParam("id") int id) {
		System.out.println("delete");
		EmployeeService employeeService = new EmployeeService();
		try {
			employeeService.deleteAnEmployeeById(id);
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			System.out.println("[" + e.getMessage() + "]");
		}
	}
}
