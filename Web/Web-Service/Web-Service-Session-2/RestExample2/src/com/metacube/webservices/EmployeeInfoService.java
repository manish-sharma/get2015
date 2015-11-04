package com.metacube.webservices;
 
/**
 */
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.metacube.dbHelper.DbHelper;
import com.metacube.model.Employee;
 
@Path("/employeeInfo")
public class EmployeeInfoService {
	
	DbHelper dbHelper = new DbHelper();
	
	
	
	@GET
	@Produces("text/plain")
	@Path("/employees")
	public String getEmployees() {
		String employees= dbHelper.getEmployees();
		return employees;
	}
	
	
	@GET
	@Produces("text/plain")
	@Path("{c}")
	public String getEmployeeByName(@PathParam("c") String c) {
		String employee;
		try {
			employee= dbHelper.getEmployeeById(Integer.parseInt(c));
		}
		catch(NumberFormatException nfe) {
			employee= dbHelper.getEmployeeByName(c);
		}
		
		return employee;
	}

	@DELETE
	@Produces("text/plain")
	@Path("{c}")
	public String getEmployeeById(@PathParam("c") Integer c) {
		
		String employee="After deleting:\n"+ dbHelper.deleteEmployeeById(c);
		return employee;
	}
	
	
	@POST
	@Produces("text/plain")
	@Path("{c1}/{c2}/{c3}/{c4}/{c5}/{c6}")
	public String createEmployee(@PathParam("c1") Integer c1, @PathParam("c2") String c2, @PathParam("c3") String c3, @PathParam("c4") String c4, @PathParam("c5") String c5, @PathParam("c6") Double c6) {
		String employee;
		Employee e=new Employee();
		e.setId(c1);
		e.setName(c2);
		e.setEmail(c3);
		e.setDob(c4);
		e.setAddress(c5);
		e.setSalary(c6);
		employee= dbHelper.createEmployee(e);
		
		return employee;
	}
}
