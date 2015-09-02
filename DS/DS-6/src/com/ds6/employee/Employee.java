package com.ds6.employee;
/**This class implements the Employeee class and implements comparable interface for Object type and 
 * its getter setter method
 * @author Shishir
 *Date 2nd September 2015
 */
public class Employee implements Comparable<Object>{

	String empID;
	String name;
	String address;
	//constructor to initialize the employee id,name,address
	public Employee(String empID,String name,String address)
	{
		this.empID=empID;
		this.name=name;
		this.address=address;
	}
	//getter for employee id
	public String getEmpID() {
		return empID;
	}
	//setter for employee id
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	//getter for name
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	//getter for address
	public String getAddress() {
		return address;
	}
	//setter for address
	public void setAddress(String address) {
		this.address = address;
	}
	//Overridden compare method compare method sort list based on names
	public int compareTo(Object o)
	{
		return getName().compareTo(((Employee) o).getName());
	}
	@Override
	//Overridden method to avoid hash code collision
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empID == null) ? 0 : empID.hashCode());
		return result;
	}
	//Overridden method to compare two objects using employee id 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empID == null) {
			if (other.empID != null)
				return false;
		} else if (!empID.equals(other.empID))
			return false;
		return true;
	}
	
	
}
