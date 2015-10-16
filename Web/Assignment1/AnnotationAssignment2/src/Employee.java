
/**
 * its store all the info of the employee
 * @author Ravika
 * @since 10/16/2015
 */

public class Employee {
	
	private String email;	
	private int id;
	private int age;	
	private String dateOfRegistration;
	private String dateOfBirth;
	private float ctcPerAnnum;	
	private String name;
	
	public Employee(){
		this.ctcPerAnnum=18000;
		this.dateOfBirth="";
		this.dateOfRegistration="";
		
	}
	public Employee(String email, int id, int age, String dateOfRegistration,String dateOfBirth, float ctcPerAnnum, String name) {
		
		
		this.email = email;		
		this.id = id;
		this.age = age;		
		this.dateOfRegistration = dateOfRegistration;
		this.dateOfBirth = dateOfBirth;
		this.ctcPerAnnum = ctcPerAnnum;		
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public float getCtcPerAnnum() {
		return ctcPerAnnum;
	}
	public void setCtcPerAnnum(float ctcPerAnnum) {
		this.ctcPerAnnum = ctcPerAnnum;
	}
	public Employee(String name, String email, int id, int age,
			String dateOfRegistration) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
		this.age = age;
		this.dateOfRegistration = dateOfRegistration;
	}
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	
	
}
