package com.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.helper.EmployeeHelper;
import com.model.Employee;

@Path("/ems")
public class EmployeeManagement {

 @Path("create/{p1}/{p2}/{p3}/{p4}")
 @GET
 @Produces("application/xml")
 public String createEmployee(@PathParam("p1") String id,@PathParam("p2") String name,@PathParam("p3") String dateOfBirth, @PathParam("p4")String address)
 {
	    Employee employee = new Employee(id, name, dateOfBirth, address);
	    String result = EmployeeHelper.createEmployee(employee);
		System.out.print(result);
	    return "<employeeservice>" + "<name>" + employee.getName() + "</name>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
 }
 
 
 @Path("searchbyid/{p1}")
 @GET
 @Produces("application/xml")
 public String getEmployeeById(@PathParam("p1") String id)
 {
	    Employee employee = EmployeeHelper.getEmployeeById(id);
	    String result = "";
	    if(employee == null){
	    	result="Invalid id";
	    }
	    else 
	    {
	    	result = "<name>"+employee.getName()+"</name><DateOfBirth>"+employee.getDateOfBirth()+"</DateOfBirth><Address>"+employee.getAddress()+"</Address>";
	    }
	    return "<employeeservice>" + "<id>" + employee.getId() + "</id>" + "<employeeoutput>" + result + "</employeeoutput>" + "</employeeservice>";
 }
 
 
 @Path("searchbyname/{p1}")
 @GET
 @Produces("application/xml")
 public String getEmployeesByName(@PathParam("p1") String name)
 {      String result = ""; 
	    List<Employee> employeeList = EmployeeHelper.getEmployeesByName(name);
		if(employeeList.isEmpty()) {
		 result = "Employees of this Name not exist";
		}
		else 
		{      int i =1;
			   for(Employee employee:employeeList)
			   {
			      result += "<employee"+i+"><id>"+employee.getId()+"</id><DateOfBirth>"+employee.getDateOfBirth()+"</DateOfBirth><Address>"+employee.getAddress()+"</Address></employee"+i+">";
		          i++;
			   }
		}		   
			
	  return "<employeeservice><name>"+name+"</name><output>"+result+"</output></employeeservice>"; 
 }
 
 @Path("/allemployees")
 @GET
 @Produces("application/xml")
 public String getEmployees()
 {      String result = ""; 
	    List<Employee> employeeList = EmployeeHelper.getEmployees();
		if(employeeList.isEmpty()) {
		 result = "Employees not exist";
		}
		else 
		{      int i =1;
			   for(Employee employee:employeeList)
			   {
			      result += "<employee"+i+"><id>"+employee.getId()+"</id><name>"+employee.getName()+"</name><DateOfBirth>"+employee.getDateOfBirth()+"</DateOfBirth><Address>"+employee.getAddress()+"</Address></employee"+i+">";
		          i++;
			   }
		}		   
			
	  return "<employeeservice><output>"+result+"</output></employeeservice>"; 
 }
 
 
 @Path("delete/{p1}")
 @GET
 @Produces("application/xml")
 public String deleteEmployeeById(@PathParam("p1") String id)
 {
	    String result = EmployeeHelper.deleteEmployeeById(id);
	    return "<employeeservice>" + "<id>" + id + "</id>" + "<output>" + result + "</output>" + "</employeeservice>";
 }
 
}
