/**
 * clss to create employee details
 * @author Ankur
 *
 */
public class Employee {
	String employeeName;
	int employee_id;
	String email_id;
	String date_Of_Birth ;
	String date_Of_Joining;
	int ctcPerAnnum;
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Employee(String employeeName, int employee_id, String email_id,String date_Of_Joining) {
		super();
		this.employeeName = employeeName;
		this.employee_id = employee_id;
		this.email_id = email_id;
		this.date_Of_Joining = date_Of_Joining;

	}
	public Employee(){
		this.ctcPerAnnum=18000;
		this.date_Of_Birth="";
		this.date_Of_Joining="";

	}

	/**
	 * @return the employee_id
	 */
	public int getEmployee_id() {
		return employee_id;
	}
	/**
	 * @param employee_id the employee_id to set
	 */
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	/**
	 * @return the email_id
	 */
	public String getEmail_id() {
		return email_id;
	}
	/**
	 * @param email_id the email_id to set
	 */
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	/**
	 * @return the date_Of_Birth
	 */
	public String getDate_Of_Birth() {
		return date_Of_Birth;
	}
	/**
	 * @param date_Of_Birth the date_Of_Birth to set
	 */
	public void setDate_Of_Birth(String date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}
	/**
	 * @return the date_Of_Joining
	 */
	public String getDate_Of_Joining() {
		return date_Of_Joining;
	}
	/**
	 * @param date_Of_Joining the date_Of_Joining to set
	 */
	public void setDate_Of_Joining(String date_Of_Joining) {
		this.date_Of_Joining = date_Of_Joining;
	}
	/**
	 * @return the ctcPerAnnum
	 */
	public int getCtcPerAnnum() {
		return ctcPerAnnum;
	}
	/**
	 * @param ctcPerAnnum the ctcPerAnnum to set
	 */
	public void setCtcPerAnnum(int ctcPerAnnum) {
		this.ctcPerAnnum = ctcPerAnnum;
	}

}
