package com.employee.controller;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.employee.exception.EmployeeSystemException;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;
/**
 * EmployeeWebController in which all the web services are included
 * @author Ankur
 * Since: 2 November,2015
 **/
@Path("/employeeWebController")
public class EmployeeWebController
{
	/**
	 * Name:createEmployee()
	 * @param name
	 * @param email
	 * @return
	 * @description :It will Create the EMPLOYEE informati
	 * on in database 
	 **/
	@GET
	@Path("/create/{name}/{email}")
	public void createEmployee(@PathParam("name") String name,@PathParam("email") String email) 
	{
		// Creating the object of Employee Service
		EmployeeService employeeService = new EmployeeService();
		try
		{
			employeeService.createEmployee(name, email);
		} 
		catch (EmployeeSystemException e) 
		{
			System.out.println("[" + e.getMessage() + "]");
		}
	}
	/**
	 * Name: retriveEmployeeID
	 * @param id
	 * @return
	 * Description: Retrives the Information of the employee By Id
	 **/
	@GET
	@Path("/id/{id : \\d+}")
	@Produces("application/xml")
	public String retrieveEmployeeById(@PathParam("id") int id) 
	{
		EmployeeService employeeService = new EmployeeService();
		Employee employee = null;
		String result = null;
		try
		{
			// Retriving the information of the Employee Id
			employee = employeeService.retrieveEmployeeById(id);
			result = "Employee Id:" + employee.getId()
					+ "Employee Name :" + employee.getName()
				    + " Employee Email "
					+ employee.getEmail() ;
		}
		catch (EmployeeSystemException e) 
		{
			System.out.println("[" + e.getMessage() + "]");
		}
		return result;
	}
	/**
	 * Name: retriveAllEmployeeByName
	 * @param name
	 * @return
	 * Description: Gets The Employee By Name
	 **/
	@GET
	@Path("/name/{name}")
	@Produces("application/xml")
	public String retrieveAllEmployeesByName(@PathParam("name") String name) 
	{
		// Gets the Object of employee
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employees = null;
		String result = null;
		try 
		{
			// Object of employee Retrive All Employee By Name
			employees = employeeService.retrieveAllEmployeesByName(name);
			result = "<employee List>";
			// Adds to the Result
			for (int i = 0; i < employees.size(); i++)
			{
				Employee employee = new Employee();
				employee = employees.get(i);
				result = result + "Employee:" + employee.getId()
						+ "Employee :Name>"+ employee.getName() 
						+ "Employee Email " + employee.getEmail();
			}
			result = result + "</employee List>";
		} 
		catch (EmployeeSystemException e)
		{
			// TODO Auto-generated catch block
			System.out.println("[" + e.getMessage() + "]");
		}
		return result;
	}
	/**
	 * Name: retrieve All Employee
	 * @return
	 * Description: Retrieves all Employee
	 **/
	@GET
	@Path("/retrieveAllEmployees")
	@Produces("application/xml")
	public String retrieveAllEmployees()
	{
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employees = null;
		String result = null;
		try
		{
			employees = employeeService.retrieveAllEmployees();
			result = "<employee List>";
			for (int i = 0; i < employees.size(); i++)
			{
				Employee employee = new Employee();
				employee = employees.get(i);
				result = result + "Employee:" + employee.getId()
						+ "Employee :Name>"+ employee.getName() 
						+ "Employee Email " + employee.getEmail();
			}
			result = result + "</employee List>";
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			System.out.println("[" + e.getMessage() + "]");
		}
		return result;
	}
	/**
	 * Name: deleteAnEmployeeById
	 * @param id
	 * Description: Deletes the employee By Id
	 **/
	@GET
	@Path("/deleteAnEmployeeById/{id}")
	public void deleteAnEmployeeById(@PathParam("id") int id)
	{
		// Deletes the Info from the Database by Id
		EmployeeService employeeService = new EmployeeService();
		try 
		{
			employeeService.deleteAnEmployeeById(id);
		} 
		catch (EmployeeSystemException e)
		{
			System.out.println("[" + e.getMessage() + "]");
		}
	}
}
