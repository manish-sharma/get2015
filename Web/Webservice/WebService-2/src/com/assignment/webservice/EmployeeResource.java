package com.assignment.webservice;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/EmployeeService")
public class EmployeeResource {
			@Path("/insert")
			@POST
			@Produces("application/xml")
			public String createEmployee(@FormParam("id") int id,@FormParam("name") String name,
					@FormParam("age") String age, @FormParam("dateofbirth") String dateOfBirth,
					@FormParam("email") String email, @FormParam("address") String address){
				    
				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(name);
				employee.setAge(age);
				employee.setDateOfBirth(dateOfBirth);
				employee.setEmail(email);
				employee.setAddress(address);
				
				String result;
				boolean status = EmployeeDAO.insert(employee); 
				if(status){
					result = "Success";
				}
				else
					result = "failure";
				return "<employee-result>"+result+"</employee-result>";
			}	
			
			@Path("{id}")
			@GET
			@Produces("application/xml")
			public String getEmployeeById(@PathParam("id") int id){
				Employee employee = new Employee();
				employee.setId(id);
				Employee employee2 = EmployeeDAO.getEmployeeByID(employee);
				if(employee2 != null){
					return "<Employee><name>"+employee2.getName()+"</name><age>"+employee2.getAge()+
							"</age><dateofbirth>"+employee2.getDateOfBirth()+"</dateofbirth><email>"+employee2.getEmail()+
							"</email><address>"+employee2.getAddress() +"</address></Employee>";
				}			
				return "<Employee>null</Employee>";
			}
			
		/*	@Path("/SearchByName")
			@POST
			@Produces("application/xml")
			public String getEmployeeByName(@FormParam("name") String name){
				Employee employee = new Employee();
				employee.setName(name);
				Employee employee2 = EmployeeDAO.getEmployeeByName(employee);
				if(employee2 != null){
					return "<Employee><id>"+employee2.getId()+"</id><age>"+employee2.getAge()+
							"</age><dateofbirth>"+employee2.getDateOfBirth()+"</dateofbirth><email>"+employee2.getEmail()+
							"</email><address>"+employee2.getAddress()+"</address></Employee>";
				}			
				return "<Employee>null</Employee>";
			}*/
			
			@Path("/DeleteByID")
			@DELETE
			@Produces("application/xml")
			public String deleteEmployee(@FormParam("id") int id){
				Employee employee = new Employee();
				employee.setId(id);
				String result;
				boolean status = EmployeeDAO.remove(employee);
				if(status){
					result = "Success";
				}
				else
					result = "failure";
				return "<employee-result>"+result+"</employee-result>";
			}

		
			@Path("/RetrieveAllEmployees")
			@GET
			@Produces("application/xml")
			public String getAllEmployee(){
				List<Employee> list;
				String result = "<Employee-Result>";
				list = EmployeeDAO.getAll();
				if(list != null){
					for (Employee employee2 : list) {
						System.out.println(employee2);
						result += "<Employee><id>"+employee2.getId()+"</id><age>"+employee2.getAge()+
								"</age><dateofbirth>"+employee2.getDateOfBirth()+"</dateofbirth><email>"+employee2.getEmail()+
								"</email><address>"+employee2.getAddress()+"</address></Employee>";
					}
					result += "</Employee-Result>";
				return result;
				}			
				return "<Employee>null</Employee>";
			}
}
