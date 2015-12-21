package employee;

public class Employee implements Comparable<Object> {
	private String employeeId;
	private String employeeName;
	private String employeeAddress;

	public Employee(String employeeId, String employeeName,
			String employeeAddress) {
		//constructor initializing class variables
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
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

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	@Override
	public String toString() {
		//convert to string
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeAddress=" + employeeAddress + "]";
	}

	@Override
	public int compareTo(Object o) {
		//method sorting employee data by Id
		Employee employee = (Employee) o;
		return getEmployeeId().compareTo(employee.getEmployeeId());
	}
}
