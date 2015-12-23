package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Pojo class for employee
 * @author Banwari Kevat
 */
public class Employee {
	
	@JsonIgnore
	String employeeName;
	@JsonIgnore
	int employeeId;
	@JsonIgnore
	String email;
	@JsonIgnore
	String dob;
	@JsonIgnore
	String dateOfJoining;
	@JsonIgnore
	int ctcPerAnnum;



	/*
	 * Parameterized Constructor
	 * @param employeeName
	 * @param employeeId
	 * @param email
	 * @param dateOfJoining
	 */
	public Employee(String employeeName, int employeeId, String email,String dateOfJoining,String dob,int cpa) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.email = email;
		this.dateOfJoining = dateOfJoining;
		this.ctcPerAnnum=cpa;
		this.dob=dob;

	}

	public Employee() {
		

	}
	
	@JsonProperty
	public String getEmployeeName() {
		return employeeName;
	}
	@JsonProperty
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	

	@JsonProperty
	public int getemployeeId() {
		return employeeId;
	}

	@JsonProperty
	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@JsonProperty
	public String getemail() {
		return email;
	}

	@JsonIgnore
	public void setemail(String email) {
		this.email = email;
	}
	@JsonIgnore
	public String getdob() {
		return dob;
	}
	

	@JsonProperty
	public void setdob(String dob) {
		this.dob = dob;
	}
	@JsonProperty
	public String getdateOfJoining() {
		return dateOfJoining;
	}

	@JsonIgnore
	public void setdateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@JsonIgnore
	public int getCtcPerAnnum() {
		return ctcPerAnnum;
	}

	@JsonIgnore
	public void setCtcPerAnnum(int ctcPerAnnum) {
		this.ctcPerAnnum = ctcPerAnnum;
	}
	
	@Override
	public String toString() {
		
		return "Employee [employeeId=" + employeeId + ", emailId=" + email
				+ ", dateOfBirth=" + dob + ", dateOfJoining="
				+ dateOfJoining + ", ctcPerAnnum=" + ctcPerAnnum
				+ ", employeeName=" + employeeName + "]";
	}

}