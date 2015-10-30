package com.example.helper;

import java.util.Date;
import java.util.List;

import com.example.model.EmployeeBean;

/* helper class of employee cache */
public class EmployeeModelHelper {

	private static EmployeeModelHelper Instance = new EmployeeModelHelper();
	
	/* private constructor */
	private EmployeeModelHelper()
	{		
		EmployeeCache.addEmployee(new EmployeeBean(1,"Riddhi","ridz1094@gmail.com",21,"2015-10-14"));
		EmployeeCache.addEmployee(new EmployeeBean(2,"Kajal","kajal@gmail.com",21,"2015-10-04"));
		EmployeeCache.addEmployee(new EmployeeBean(3,"parul","parul@gmail.com",22,"2015-10-02"));
		EmployeeCache.addEmployee(new EmployeeBean(4,"Rajat","rajat@gmail.com",22,"2015-10-11"));
		EmployeeCache.addEmployee(new EmployeeBean(5,"Pankhuri","pankh@gmail.com",21,"2015-10-12"));
	}
	
	/* returns instance of this class */
	public static EmployeeModelHelper getInstance()
	{
		return Instance;
	}
	
	/* returns employee by id */
	public static EmployeeBean getEmployeeById(int id)
	{
		return EmployeeCache.getEmployeeById(id);
	}
	
	/* returns all employees in map */
	public static List<EmployeeBean> getAllEmployees()
	{
		return EmployeeCache.getAllEmployees();
		
	}
	
	/* adds new employee */
	public static void addEmployee(EmployeeBean objEmployeeBean)
	{
		EmployeeCache.addEmployee(objEmployeeBean);
	}
	
	/* updates details of registered employees */
	public static boolean updateEmployee(EmployeeBean objEmployeeBean)
	{
		return EmployeeCache.updateEmployee(objEmployeeBean);
	}
}
