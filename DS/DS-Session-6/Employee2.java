
/*
 *DS-Session-6 Assignment for Perform sorting by name
 *@author Banwari kevat
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 //This class implements Comparable interface
  class Employee2 implements Comparable{
	  private String employeeId;
	  private String name;
	

	private String address;
	  
	  /*
	   * parameterized constructor 
	   * @param employeeId 
	   * @param name
	   * @param address
	   */
	  Employee2(String employeeId, String name, String address)
	  {
		  this.employeeId = employeeId;
		  this.name = name;
		  this.address = address;
	  }
	  
	  //set employeeId
	  public void setEmployeeId(String employeeId)
	  {
		  this.employeeId = employeeId;
	  }
	  //return employeeId
	  public String getEmployeeId()
	  {
		  return this.employeeId;
	  }
	  
	 //set name
	  public void setName(String name)
	  {
		  this.name = name;
	  }
	  //return name
	  public String getName()
	  {
		  return this.name;
	  }
	  
	 //set address
	  public void setAddress(String address)
	  {
		  this.address = address;
	  }
	  //return employeeId
	  public String getAddress()
	  {
		  return this.address;
	  }	 
	  
	  @Override //This is the method of Comparable interface
		public int compareTo(Object o) {
			  return getName().compareTo(((Employee2)o).getName());
			
		}
	  
	  //Display employee method
	  public void show()
	  {
		  System.out.println(getEmployeeId()+"         "+getName()+"       "+getAddress());
	  }
	  
	  public static void main(String [] arg) {
		  try 
		  {
		  List<Employee2> employeeList = new ArrayList<Employee2>();
		  
		  employeeList.add( new Employee2("CS11012","Banwari","Guna") );
		  employeeList.add( new Employee2("CS11060","Bhanu","Morena") );
		  employeeList.add( new Employee2("CS11021","Shivam","Morena") );
		  employeeList.add( new Employee2("CS11009","Raju","Shivpuri") );
		  employeeList.add( new Employee2("CS11019","Nirmal","Gwalior") );
		  
		  System.out.println("Employee Id      Name       Adress  ");
		  for(Employee2 e: employeeList)
		  {
			  e.show();
		  }
		  
		  Collections.sort(employeeList);
		  
		  System.out.println("\nEmployee Id      Name       Adress  ");
		  for(Employee2 e: employeeList)
		  {
			  e.show();
		  }
		  
		  }
		  catch (Exception e) {
			  System.out.println(e.getMessage());
		  }
 		  
	  }
	  
  }