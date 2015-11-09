package Assignment_2;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class Employee 
{
	private String employeeName;
	private int employeeId;
	
	@JsonIgnore
	private String emailId;
	@JsonIgnore
	private String dateOfBirth;
	private String dateOfJoining;
	@JsonIgnore
	private double ctcPerAnnum;

	/****************************
	 * To get Employee name
	 * @return EmployeeName
	 ***************************/
	public String getEmployeeName() {
		return employeeName;
	}
	
	/****************************
	 * To set Employee name
	 ***************************/
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	/****************************
	 * To get Employee ID
	 * @return EmployeeId
	 ***************************/
	public int getEmployeeId() {
		return employeeId;
	}
	
	/****************************
	 * To set Employee ID
	 ***************************/
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	/****************************
	 * To get Email Id
	 * @return EmailId
	 ***************************/
	@JsonProperty
	public String getEmailId() {
		return emailId;
	}
	
	/****************************
	 * To set Email Id
	 ***************************/
	@JsonIgnore
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	/****************************
	 * To get Date Of Birth
	 * @return DateOfBirth
	 ***************************/
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	/****************************
	 * To set Date Of Birth
	 ***************************/
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/****************************
	 * To get Date Of Joining
	 * @return
	 ***************************/
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	
	/****************************
	 * To set Date Of Joining
	 ***************************/
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	/****************************
	 * To get CtcPerAnnum
	 * @return CtcPerAnnum
	 ***************************/
	public double getCtcPerAnnum() {
		return ctcPerAnnum;
	}
	
	/****************************
	 * To set Employee CtcPerAnnum
	 ***************************/
	public void setCtcPerAnnum(double ctcPerAnnum) {
		this.ctcPerAnnum = ctcPerAnnum;
	}
	
	@Override
	public String toString() 
	{
		return "Employee \n employeeName=" + employeeName + " \n employeeId="
				+ employeeId + ", \n emailId=" + emailId + " \n dateOfBirth="
				+ dateOfBirth + ", \n dateOfJoining=" + dateOfJoining
				+ " \n ctcPerAnnum=" + ctcPerAnnum + "\n";
	}
}
