package com.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.model.Employee;

public class EmployeeCache {
   private static boolean flag = true;
   private static Map<Integer , Employee> employeeCache = new ConcurrentHashMap<Integer , Employee>();
   public EmployeeCache() {
	   if(flag) 
	   {   Employee employee1 = new Employee(101,"Vijay Kumar","vk95@gg.com",40,"19-09-2015");
	       Employee employee2 = new Employee(102,"Ram Lodhi","ram@gg.com",30,"12-12-2015");
	       Employee employee3 = new Employee(103,"Krishna Agrawal","agrawal.krishna@gg.com",19,"12-02-2013");
	       Employee employee4 = new Employee(104,"Anurag Sharma","anushrma123@gg.com",42,"23-07-2015");
	       Employee employee5 = new Employee(105,"Kamal Kishore","kaml.345m@gg.com",25,"12-02-2014");
	       employeeCache.put(101, employee1);
	       employeeCache.put(102, employee2);
	       employeeCache.put(103, employee3);
	       employeeCache.put(104, employee4);
	       employeeCache.put(105, employee5);
	       flag = false;
     }
   }   
   public void setEmployee(Employee employee) {
	   employeeCache.put(employee.getId(), employee);
   }
   
   public Employee getEmployee(Integer id) {
	   return employeeCache.get(id);
   }
   
   public Map<Integer , Employee> getEmployeeCache()
   {
	   return employeeCache;
   }
   
   public void updateEmployee(Integer id, String name, String email, Integer age) 
   {  
	   String dt = (employeeCache.get(id)).getDateOfRegistration();
	   Employee employee = new Employee(id,name,email,age,dt);
	   employeeCache.remove(id);
	   employeeCache.put(employee.getId(), employee);
   }
  
}
