package ds6;

/** this class holds the data of employee
 * @author Khemanshu
 *
 */
public class Employee implements Comparable{

	//Id of employee.
	private String employeeId;
	//name of employee
	private String employeeName;
	//address of employee
	private String employeeAddress;
	
	public Employee(String employeeId, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	
	public Employee() {
		super();
	}
	
	/** get the id of employee
	 * @return
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	
	/** set the employee id
	 * @param employeeId
	 */
	public void setEmployeeId() {
		System.out.println("enter employee Id");
		this.employeeId = Util.employeeIdInput();
	}
	
	/** get the employee name
	 * @return
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	
	/** set the employee name
	 * @param employeeName
	 */
	public void setEmployeeName() {
		System.out.println("enter name of employee");
		this.employeeName = Util.employeeNameInput();
	}
	
	/**get the employee address
	 * @return
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	
	/**set the employee address
	 * @param employeeAddress
	 */
	public void setEmployeeAddress() {
		System.out.println("enter employee address");
		this.employeeAddress = Util.userInput();
	}

	/** convert the employee object to string
	 */
	public String toString() {
		return "[employeeId = " + employeeId + ", \n   employeeName = "
				+ employeeName + ", \n   employeeAddress = " + employeeAddress
				+ "]\n" ;
	}
	/** override function of comparable interface
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		return getEmployeeId().compareTo(((Employee)o).getEmployeeId());
	}
	
	
}
