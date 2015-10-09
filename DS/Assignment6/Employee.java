/**
 * @author Girdhari
 * Employee Class manages all the details regarding employee
 */
package question1;

/* Starting of Employee class */
public class Employee implements Comparable<Employee>{
	
	private Integer id;
	private String name;
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Employee(int id , String name , String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", address=" + address	+ "]";
	}
	
	@Override
	public int compareTo(Employee employee) {
		return this.getId().compareTo(employee.getId());
	}
}

/* Ending of Employee Class */
