import java.util.Comparator;
/**
 * Employee class implements comparable to compare the values of the employee class objects
 * @author Ankur
 * @since 01-09-2015
 */

@SuppressWarnings("rawtypes")
public class Employee implements Comparable {
	/**
	 * Initialization of variables
	 */
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	/**
	 * default constructor
	 */
	public Employee(){
		
	}
	/**
	 * Parameterized constructor
	 * @param employeeId.... id of the employee
	 * @param employeeName... name of the employee
	 * @param employeeAddress.. employee address
	 */
	public Employee(int employeeId, String employeeName, String employeeAddress){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
	}
	/**
	 * getter setter for the Employee class variables
	 * @return
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	/**
	 * over ride of the hash code method in the employee class
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
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
		if (employeeId != other.employeeId)
			return false;
		return true;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	/**
	 * compareTo method to compare the values in the list 
	 */
	@Override
	public int compareTo(Object employeeObject) {
		return ((Integer)getEmployeeId()).compareTo(((Employee)employeeObject).getEmployeeId());
	}
	
	static class NameComparator implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			Employee p1 = (Employee)o1;
			Employee p2 = (Employee)o2;
			return p1.getEmployeeName().compareTo(p2.getEmployeeName());
		}
	}
}
