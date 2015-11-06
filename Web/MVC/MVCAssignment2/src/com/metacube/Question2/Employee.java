package com.metacube.Question2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Riddhi
*/

/* Pojo class for employee */
public class Employee {
	String employeeName;
	int employee_id;
	@JsonIgnore
	String email_id;
	
	@JsonIgnore
	String date_Of_Birth;
	String date_Of_Joining;
	
	@JsonIgnore
	int ctcPerAnnum;


	/**
	 * Default constructor
	 */
	public Employee() {
	}
	
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employee_id
	 */
	public int getEmployee_id() {
		return employee_id;
	}

	/**
	 * @param employee_id
	 *            the employee_id to set
	 */
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	/**
	 * @return the email_id
	 */
	@JsonProperty
	public String getEmail_id() {
		return email_id;
	}

	/**
	 * @param email_id
	 *            the email_id to set
	 */
	@JsonIgnore
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
	 * @param date_Of_Birth
	 *            the date_Of_Birth to set
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
	 * @param date_Of_Joining
	 *            the date_Of_Joining to set
	 */
	public void setDate_Of_Joining(String date_Of_Joining) {
		this.date_Of_Joining = date_Of_Joining;
	}

	/**
	 * @return the ctcPerAnnum
	 */
	@JsonIgnore
	public int getCtcPerAnnum() {
		return ctcPerAnnum;
	}

	/**
	 * @param ctcPerAnnum
	 *            the ctcPerAnnum to set
	 */
	public void setCtcPerAnnum(int ctcPerAnnum) {
		this.ctcPerAnnum = ctcPerAnnum;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employee_id="
				+ employee_id + ", email_id=" + email_id + ", date_Of_Birth="
				+ date_Of_Birth + ", date_Of_Joining=" + date_Of_Joining
				+ ", ctcPerAnnum=" + ctcPerAnnum + "]";
	}
}
