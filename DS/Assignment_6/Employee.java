/**
 * This program is the Employee Class with fields as empId, name and address.
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-09-3
 * 
**/
package assignmentDS_6;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Employee implements Comparable
{
	Integer employeeId;
	String name;
	String address;
	public Employee(int employeeId, String name, String address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name
				+ ", address=" + address + "]";
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}
	
	/**
	 * below method is used to compare objects of Employee in the basis of their ID
	 */
	@Override
	public int compareTo(Object o) {
		
		return getEmployeeId().compareTo(((Employee)o).getEmployeeId());
	}
	
	
}



 @SuppressWarnings("rawtypes")
class NameComparator implements Comparator
 {

	/**
	 * below method is used to compare objects of Employee in the basis of their name
	 */
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1= (Employee)o1;
		Employee e2= (Employee)o2;
		return e1.getName().compareTo(e2.getName());
		
	}
	 
 }
