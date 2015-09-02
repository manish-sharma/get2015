/**
 * Class that stores information about employee
 * 
 * @author Riddhi
 *
 */
public class Employee implements Comparable<Employee> {

	private String name; // name of employee
	private Integer empId; // employee id
	private double salary; // employee salary

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, Integer empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	// method used to sort employee class object based on their emoloyee id
	@Override
	public int compareTo(Employee e) {

		return getEmpId().compareTo(((Employee) e).getEmpId());
	}

	@Override
	public String toString() {
		return this.name + " " + this.empId + " " + this.salary;
	}
}
