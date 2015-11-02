package com.service;



import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.service.db.helper.EmployeeDBHelper;
import com.service.model.EmployeeModel;

@Path("/EmployeeServiceUsingRest")
public class Employee {
	
		@Path("/insert")
		@POST
		@Produces("application/xml")
		public String createEmployee(@FormParam("id") int id,@FormParam("name") String name,
				@FormParam("designation") String designation, @FormParam("email") String email,
				@FormParam("address") String address, @FormParam("salary") int salary){
			    
			EmployeeModel employeeModel = new EmployeeModel();
			employeeModel.setId(id);
			employeeModel.setName(name);
			employeeModel.setDesignation(designation);
			employeeModel.setEmail(email);
			employeeModel.setAddress(address);
			employeeModel.setSalary(salary);
			String result;
			boolean status = EmployeeDBHelper.insert(employeeModel); 
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
			EmployeeModel employeeModel = new EmployeeModel();
			employeeModel.setId(id);
			EmployeeModel employeeModel2 = EmployeeDBHelper.getEmployeeById(employeeModel);
			if(employeeModel2 != null){
				return "<Employee><name>"+employeeModel2.getName()+"</name><designation>"+employeeModel2.getDesignation()+
						"</designation><email>"+employeeModel2.getEmail()+"</email><address>"+employeeModel2.getAddress()+
						"</address><salary>"+employeeModel2.getSalary()+"</salary></Employee>";
			}			
			return "<Employee>null</Employee>";
		}
		
		@Path("/SearchByName")
		@POST
		@Produces("application/xml")
		public String getEmployeeByName(@FormParam("name") String name){
			EmployeeModel employeeModel = new EmployeeModel();
			employeeModel.setName(name);
			EmployeeModel employeeModel2 = EmployeeDBHelper.getEmployeeByName(employeeModel);
			if(employeeModel2 != null){
				return "<Employee><id>"+employeeModel2.getId()+"</id><designation>"+employeeModel2.getDesignation()+
						"</designation><email>"+employeeModel2.getEmail()+"</email><address>"+employeeModel2.getAddress()+
						"</address><salary>"+employeeModel2.getSalary()+"</salary></Employee>";
			}			
			return "<Employee>null</Employee>";
		}
		
		@Path("/DeleteByID")
		@DELETE
		@Produces("application/xml")
		public String deleteEmployee(@FormParam("id") int id){
			EmployeeModel employeeModel = new EmployeeModel();
			employeeModel.setId(id);
			String result;
			boolean status = EmployeeDBHelper.delete(employeeModel);
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
			List<EmployeeModel> list;
			String result = "<Employee-Result>";
			list = EmployeeDBHelper.getAllEmployee();
			if(list != null){
				for (EmployeeModel employeeModel2 : list) {
					System.out.println(employeeModel2);
					result +=  "<Employee><name>"+employeeModel2.getName()+"</name><designation>"+employeeModel2.getDesignation()+
							"</designation><email>"+employeeModel2.getEmail()+"</email><address>"+employeeModel2.getAddress()+
							"</address><salary>"+employeeModel2.getSalary()+"</salary></Employee>";
				}
				result += "</Employee-Result>";
			return result;
			}			
			return "<Employee>null</Employee>";
		}
		
}
