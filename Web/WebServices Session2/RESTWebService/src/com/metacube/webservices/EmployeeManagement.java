package com.metacube.webservices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.metacube.EmployeeSystemException;
import com.metacube.db.helper.EmployeeDBHelper;
import com.metacube.model.Employee;

@Path("/employeemanagement")
public class EmployeeManagement {
	
	@Path("create/{c1}/{c2}/{c3}")
	@POST
	@Produces("application/xml")
	public String createEmployee(@PathParam("c1") String name, @PathParam("c2") String email, @PathParam("c3") String address){
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail(email);
		employee.setAddress(address);
		
		EmployeeDBHelper employeeDBHelper = new EmployeeDBHelper();
		int isInsert = 0;
		try {
			isInsert = employeeDBHelper.createEmployee(employee);
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(isInsert == 1){
			String result = "@Produces(\"application/xml\") Output: \nCreate Employee Output \n\n Employee Created successfully";
			return "<employeeservice>" + "<name>" + employee.getName() + "</name>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
		}
		else{
			String result = "@Produces(\"application/xml\") Output: \nCreate Employee Output \n\n Employee can't inserted";
			return "<employeeservice>" + "<name>" + employee.getName() + "</name>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
		}	
	}
	
	@Path("id/{id : \\d+}")
	@GET
	@Produces("application/xml")
	public String getEmployeebyId(@PathParam("id") int id) {
		EmployeeDBHelper employeeDBHelper = new EmployeeDBHelper();
		Employee employee = null;
		try {
			employee = employeeDBHelper.getEmployeeById(id);
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(employee != null) {
			String result = "@Produces(\"application/xml\") Output: \ngetEmployeebyId Output \n\n Employee Found";
			return "<employeeservice>" + "<name>" + employee.getName() + "</name>" + "<email>" + employee.getEmail() + "</email>" + "<address>" + employee.getAddress() + "</address>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
		} else {
			String result = "@Produces(\"application/xml\") Output: \ngetEmployeebyId Output \n\n Employee not found";
			return "<employeeservice>" + "<name> Not Available </name>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
		}
	}
	
	@Path("name/{name}")
	@GET
	@Produces("application/xml")
	public String getEmployeesbyName(@PathParam("name") String name) {
		EmployeeDBHelper employeeDBHelper = new EmployeeDBHelper();
		List<Employee> employees = new ArrayList<Employee>();
		try {
			employees =  employeeDBHelper.getEmployeeByName(name);
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(employees.size() != 0) {
			Iterator<Employee> iterator = employees.iterator();
			Employee employee;
			String result1 = "@Produces(\"application/xml\") Output: \ngetEmployeebyId Output \n\n Employee Found";
			String result = "<employeeservice>";
			while(iterator.hasNext()) {
				employee = iterator.next();
				result += "<id>"+employee.getId()+"</id><name>"+employee.getName()+"</name><email>"+employee.getEmail()+"</email><address>"+employee.getAddress()+"</address><employeeoutput>" + result1 + "</employeeoutput>";
			}
			result += "</employeeservice>";
			return result;
		} else {
			String result = "@Produces(\"application/xml\") Output: \ngetEmployeebyId Output \n\n Employee not found";
			return "<employeeservice>" + "<name> Not Available </name>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
		}
		
	}
	
	@Path("/employees")
	@GET
	@Produces("application/xml")
	public String getAllEmployees() {
		EmployeeDBHelper employeeDBHelper = new EmployeeDBHelper();
		List<Employee> employees = new ArrayList<Employee>();
		try {
			employees = employeeDBHelper.getEmployeeList();
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(employees.size() != 0) {
			Iterator<Employee> iterator = employees.iterator();
			Employee employee;
			String result1 = "@Produces(\"application/xml\") Output: \ngetEmployeebyId Output \n\n Employee Found";
			String result = "<employeeservice>";
			while(iterator.hasNext()) {
				employee = iterator.next();
				result += "<id>"+employee.getId()+"</id><name>"+employee.getName()+"</name><email>"+employee.getEmail()+"</email><address>"+employee.getAddress()+"</address><employeeoutput>" + result1 + "</employeeoutput>";
			}
			result += "</employeeservice>";
			return result;
		} else {
			String result = "@Produces(\"application/xml\") Output: \ngetEmployeebyId Output \n\n Employee not found";
			return "<employeeservice>" + "<name> Not Available </name>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
		}
	}
	
	@Path("delete/{id : \\d+}")
	@DELETE
	@Produces("application/xml")
	public String deleteEmployeebyId(@PathParam("id") int id) {
		EmployeeDBHelper employeeDBHelper = new EmployeeDBHelper();
		int isDelete = 0;
		try {
			isDelete = employeeDBHelper.deleteEmployeeById(id);
		} catch (EmployeeSystemException e) {
			e.printStackTrace();
		}
		if(isDelete == 1){
			String result = "@Produces(\"application/xml\") Output: \nCreate Employee Output \n\n Employee Deleted successfully";
			return "<employeeservice>" + "<id>" + id + "</id>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
		}
		else{
			String result = "@Produces(\"application/xml\") Output: \nCreate Employee Output \n\n Employee can't be deleted";
			return "<employeeservice>" + "<id>" + id + "</id>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
		}
	}

}
