/**
 * to store the data of Employee
 * Overrides compare() method so that it can be sorted directly by the sort function of Collections 
 * Overrides hashcode() , equals() methods so that every Object of Employee have unique hashcode on the basis of Employee id
 * Overrides toString() method
 * @author Ravika
 * @since 1/9/2015
 */
@SuppressWarnings("rawtypes")
public class Employee implements Comparable {
	private int empId;
	private String name;
	private String address;
	
	public Employee(int empId, String name, String address) {
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	
	/**
	 * to get the Employee Id
	 * @return = Employee Id
	 */
	public int getEmpId() {
		return empId;
	}
	
	/**
	 * to get Employee's Name
	 * @return Employee's Name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * to get Employee address
	 * @return = Employee's address
	 */
	public String getAddress() {
		return address;
	}
	
	
	public Employee() {
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	/**
	 * Overrides compare() method so that it can be sorted directly by the sort function of Collections on the basis of Employee Id
	 */
	@Override
	public int compareTo(Object employee) {
		return ((Integer)getEmpId()).compareTo(((Employee)employee).getEmpId());
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address="
				+ address + "]";
	}

}
