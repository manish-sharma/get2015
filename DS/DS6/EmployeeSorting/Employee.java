package EmployeeSorting;

public class Employee implements Comparable {
	private String name;
	private String address;
	private String employeeId;
	
	
	/** this function is  used to get the employee name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**this function is  used to set the employee name
	 * @param employeeName
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** this function is  used to get the employee address
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/** this function is  used to set the employee address
	 * @param employeeAddress
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/** this function is  used to get the id of employee
	 * @return
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/** this function is  used to set the employee id
	 * @param employeeId
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
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
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}
@Override
public String toString() {
	return "[employeeId=" + employeeId + ", employeeName="
			+ name + ", employeeAddress=" + address
			+ "]\n" ;
}
/** override function of comparable interface which is compare the employee id of two employee
 * @see java.lang.Comparable#compareTo(java.lang.Object)
 */
	@Override
	public int compareTo(Object o) {
		return getEmployeeId().compareTo(((Employee) o).getEmployeeId());

	}

}
