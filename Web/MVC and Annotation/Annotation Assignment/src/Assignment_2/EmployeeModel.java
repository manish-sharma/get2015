package Assignment_2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeModel {

	private String employeeName;
	private int employeeId;
	@JsonIgnore
	private String emailId;
	@JsonIgnore
	private String dateOfBirth;
	private String dateOfJoining;
	@JsonIgnore
	private double ctcPerAnnum;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@JsonProperty
	public String getEmailId() {
		return emailId;
	}
	@JsonIgnore
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@JsonIgnore
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@JsonIgnore
	public double getCtcPerAnnum() {
		return ctcPerAnnum;
	}
	@Override
	public String toString() {
		return "EmployeeModel [employeeName=" + employeeName + ", employeeId="
				+ employeeId + ", emailId=" + emailId + ", dateOfBirth="
				+ dateOfBirth + ", dateOfJoining=" + dateOfJoining
				+ ", ctcPerAnnum=" + ctcPerAnnum + "]";
	}
	public void setCtcPerAnnum(double ctcPerAnnum) {
		this.ctcPerAnnum = ctcPerAnnum;
	}
	
	
}
