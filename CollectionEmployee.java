package com;

import java.util.Comparator;
/**
 * this class CollectionEmployee is a collection of employee and their attributes
 * @author Sumitra
 * name id and address of employee using constructor
 */
public class CollectionEmployee implements Comparable<Object>{
	                   private String employeeName;
	                   private Integer employeeID;
	                   private String address;
	
	
	/**
	 * 
	 * @param employeeName name of new employee
	 * @param employeeID  id of that employee which should be unique
	 * @param address Address of employee
	 */
	public CollectionEmployee(String employeeName,  Integer   employeeID , String address) {
		              this.address = address;
	             	  this.employeeID = employeeID;
		              this.employeeName = employeeName;
		
	}
	/**
	 * getter method for employee Name
	 * @return Employee name string
	 */
	public String getEmployeeName() {
		              return employeeName;
	}
	/**
	 * setter method for employee name
	 * @param employeeName take name and set with that object
	 */
	public void setEmployeeName(String employeeName) {
		               this.employeeName = employeeName;
	}
	/**
	 * getter method for employee ID
	 * @return Employee id integer
	 */
	public  Integer  getEmployeeID() {
		              return employeeID;
	}
	/**
	 * setter method for employee ID
	 * @param employeeID take ID and set with that object
	 */
	
	public void setEmployeeID( Integer employeeID) {
		              this.employeeID = employeeID;
	}
	/**
	 * getter method for employee Address
	 * @return Employee Address string
	 */
	public String getAddress() {
		              return address;
	}
	/**
	 * setter method for employee Address
	 * @param employeeAddress take address string and set with that object
	 */
	public void setAddress(String address) {
		              this.address = address;
	}
	/**
	 * this method override from {@link Comparable}
	 * this compareTO method compare to object according to specific attribute
	 */
	@Override
	public int compareTo(Object obj) {
		
		               return ((Integer)this.getEmployeeID().compareTo(((CollectionEmployee) obj).getEmployeeID()));
	}
	/**
	 * this method override from {@link Comparable}
	 * this method convert in to string
	 * @return String 
	 */
	@Override
	public String toString() {
		            return  employeeName+"\t\t"+employeeID+"\t\t"+address ;
	}
	
	@Override
	/**
	 * this method override from {@link Comparable}
	 * this method use to create uniqueness in set rather then object according to attributes
	 *@return integer  result calculate a unique no
	 */
	public int hashCode() {
		              final int prime = 31;
		              int result = 1;
	               	  result = prime * result + employeeID;
		              return result;
	}
	@Override
	/**
	 * this method override from {@link Comparable}
	 * this method use to compare to strings as well as objects
	 * @return boolean value either equals or not
	 */
	public boolean equals(Object obj) {
		   if (this == obj)
			         return true;
		   if (obj == null)
			         return false;
		   if (getClass() != obj.getClass())
			          return false;
		              CollectionEmployee other = (CollectionEmployee) obj;
		   if (employeeID != other.employeeID)
		              return false;
		               return true;
	          }
	   }

/**
 * This class is use to compare to string according given order
 * @author Sumitra
 * this implements {@link Comparator}
 */
	
@SuppressWarnings("rawtypes")
class NameComparator implements Comparator{

@Override
/*
* (non-Javadoc)
* @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
* compare according to name of employee
*/
	public int compare(Object o1, Object o2) {
		             CollectionEmployee e1=(CollectionEmployee)o1;
		             CollectionEmployee e2=(CollectionEmployee)o2;
		                 return e1.getEmployeeName().compareTo(e2.getEmployeeName());
		
	         }
   }

