/*
 * DS Session6 Assignment
 * EmployeeSet.java
 * @author Banwari kevat
 *
 */
import java.util.*;
public class EmployeeSet {

	  String employeeId;
	  String name;
	

	private String address;
	  
	  /*
	   * parameterized constructor 
	   * @param employeeId 
	   * @param name
	   * @param address
	   */
	  EmployeeSet(String employeeId, String name, String address)
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
	  
	 // override toString method
	  public String toString()		
	  {
		return employeeId+":"+name+":"+address;
	  }
	  
	  @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((employeeId == null) ? 0 : employeeId.hashCode());
			return result;
		}
	     
		
		//Override equals method
		//This method insert object into set if employeeId are different from stored employeeId
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EmployeeSet other = (EmployeeSet) obj;
			if (employeeId == null) {
				if (other.employeeId != null)
					return false;
			} else if (!employeeId.equals(other.employeeId))
				return false;
			return true;
		}
	  
	  
	public static void main(String[] args) {
		
		try {
		// Create a set of EmployeeSet class type
		Set<EmployeeSet> employeeSet = new HashSet<EmployeeSet>();
	   	  
		  employeeSet.add( new EmployeeSet("CS11012","Banwari","Guna") );
		  employeeSet.add( new EmployeeSet("CS11060","Bhanu","Morena") );
		  employeeSet.add( new EmployeeSet("CS11021","Shivam","Morena") );
		  employeeSet.add( new EmployeeSet("CS11009","Raju","Shivpuri") );
		  employeeSet.add( new EmployeeSet("CS11019","Nirmal","Gwalior") );
		  //Next Entry will be skipped because it is duplicate
		  employeeSet.add( new EmployeeSet("CS11012","Banwari","Guna") );
		  
		  System.out.print("\n Set is : "+employeeSet); // print the set
		  
		 }
		  catch (Exception e) {
			  System.out.println(e.getMessage());
		  }
	}

	
}	