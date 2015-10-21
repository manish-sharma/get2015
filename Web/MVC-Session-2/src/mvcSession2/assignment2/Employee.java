package mvcSession2.assignment2;

/**
 * Name: Employee
 * @author Gaurav Saini
 * Since: 16-10-2015
 * Description: Employee Details
 **/

public class Employee {

	// To Store Employee Name
	String employeeName;

	// To Store Employee Id
	int employee_id;

	// To Store Employee Email Id
	String email_id;

	// To Store Employee Date Of Birth
	String date_Of_Birth ;

	// To Store Employee Date Of Joining
	String date_Of_Joining;

	// To Store Employee ctc Per Annum
	int ctcPerAnnum;

	// Parametrized Constructor
	public Employee(String employeeName, int employee_id, String email_id,String date_Of_Joining) {
		super();
		this.employeeName = employeeName;
		this.employee_id = employee_id;
		this.email_id = email_id;
		this.date_Of_Joining = date_Of_Joining;
	}

	// Constructor
	public Employee() {
		this.ctcPerAnnum=18000;
		this.date_Of_Birth="";
		this.date_Of_Joining="";
	}

	public String getEmployeeName()	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployee_id()	{
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getDate_Of_Birth() {
		return date_Of_Birth;
	}

	public void setDate_Of_Birth(String date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	public String getDate_Of_Joining() {
		return date_Of_Joining;
	}

	public void setDate_Of_Joining(String date_Of_Joining) {
		this.date_Of_Joining = date_Of_Joining;
	}

	public int getCtcPerAnnum() {
		return ctcPerAnnum;
	}

	public void setCtcPerAnnum(int ctcPerAnnum) {
		this.ctcPerAnnum = ctcPerAnnum;
	}
}