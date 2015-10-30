package com.example.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.example.model.EmployeeBean;

/* stores values of all registered employees */
public class EmployeeCache {

	/* registered employees are stored in map */
	private static ConcurrentHashMap<Integer,EmployeeBean> empMap = new ConcurrentHashMap<Integer, EmployeeBean>();
	
	/* returns employee by id */
	public static EmployeeBean getEmployeeById(int id)
	{
		return empMap.get(id);
	}
	
	/* returns all employees in map */
	public static List<EmployeeBean> getAllEmployees()
	{
		return new ArrayList<EmployeeBean>(empMap.values());	
	}
	
	/* adds new employee */
	public static void addEmployee(EmployeeBean objEmployeeBean)
	{
		objEmployeeBean.setEmployeeId(empMap.size()+1);
		empMap.put(objEmployeeBean.getEmployeeId(),objEmployeeBean);	
	}
	
	/* updates details of registered employees */
	public static boolean updateEmployee(EmployeeBean objEmployeeBean)
	{
		if(empMap.containsKey(objEmployeeBean.getEmployeeId())){
			empMap.replace(objEmployeeBean.getEmployeeId(), objEmployeeBean);
			return true;
		}
		else{
			return false;
		}
	}
	
}
