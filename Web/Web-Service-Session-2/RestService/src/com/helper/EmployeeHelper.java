package com.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Helper;
import com.model.Employee;
import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class EmployeeHelper {

	
	public static String createEmployee(Employee employee)
	{
		Helper helper = new Helper();
		String sql = "SELECT * FROM employee where id='"+employee.getId()+"'";
		ResultSet rs = helper.executeQuery(sql);
		try {
			if (rs.next() )
			{
				return "Employee Already Exists"; 
			}	
			else 
			{
				    sql = "INSERT INTO employee values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getDateOfBirth()+"','"+employee.getAddress()+"')"; 
					int res = 0;
					res = helper.executeUpdate(sql);
					if (res==1)
					{
						return "Employee Created Successfully";
					}
			
						return "Employee Not Created(Technical Problem)";
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee Not Created(Technical Problem)";
	}

	public static Employee getEmployeeById(String id) {
		Employee employee = null;
		Helper helper = new Helper();
		String sql = "SELECT * FROM employee WHERE id='"+id+"'";
		ResultSet rs = helper.executeQuery(sql);
		try {
			if (rs.next() )
			{   
				employee = new Employee(id, rs.getString(2), rs.getString(3), rs.getString(4));
				return employee; 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return employee;
	}
	
	public static List<Employee> getEmployeesByName(String name) 
	{
		List<Employee> employeesList = new ArrayList<Employee>();
		Helper helper = new Helper();
		String sql = "SELECT * FROM employee WHERE name='"+name+"'";
		ResultSet rs = helper.executeQuery(sql);
		try {
			while (rs.next() )
			{   
				Employee employee = new Employee(rs.getString(1), name , rs.getString(3), rs.getString(4));
				employeesList.add(employee); 
			}
			return employeesList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return employeesList;
	}
	
	
	public static List<Employee> getEmployees() 
	{
		List<Employee> employeesList = new ArrayList<Employee>();
		Helper helper = new Helper();
		String sql = "SELECT * FROM employee";
		ResultSet rs = helper.executeQuery(sql);
		try {
			while (rs.next() )
			{   
				Employee employee = new Employee(rs.getString(1),rs.getString(2) , rs.getString(3), rs.getString(4));
				employeesList.add(employee); 
			}
			return employeesList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return employeesList;
	}
	
	
  public static String deleteEmployeeById(String id){
	  
	    Helper helper = new Helper();
		String sql = "DELETE FROM employee WHERE id='"+id+"'";					int res = 0;
		res = helper.executeUpdate(sql);
		if (res==1)
		{
			return "Employee Deleted Successfully";
		}
		return "Employee Not Found of this id";
	  
  }
	
	
/*	public static void main(String[] args) {
		Employee employee = getEmployeesByListName("babalu");
		System.out.println(employee.getName());
	}
	*/
		

}
