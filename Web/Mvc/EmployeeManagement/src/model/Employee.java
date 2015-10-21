package model;

public class Employee {
	private String email;
	private String dor;
	private  int EmployeeId;
	private int age;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDor() {
		return dor;
	}
	public void setDor(String dor) {
		this.dor = dor;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	
	
}
