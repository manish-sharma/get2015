import java.util.*;
//class to avoid all the duplicate employee based on employee ID
public class UniqueEmployee {
	String employeeID,nameOfEmployee,addressOfEmployee;
	public UniqueEmployee(String employeeID,String nameOfStudent,String addressOfStudent) {
		this.employeeID=employeeID;
		this.nameOfEmployee=nameOfStudent;
		this.addressOfEmployee=addressOfStudent;
	}
	public String getemployeeID() {
		return employeeID;
	}
	public String toString() {
		return "{"+employeeID+","+nameOfEmployee+","+addressOfEmployee+"}";
	}
	public static void main(String args[]) {
		List<UniqueEmployee> employeeList=new ArrayList<UniqueEmployee>();//list to take input
		employeeList.add(new UniqueEmployee("101", "Avinash", "address1"));
		employeeList.add(new UniqueEmployee("101", "Rohit", "address2"));
		employeeList.add(new UniqueEmployee("101", "Siddharth", "address3"));
		employeeList.add(new UniqueEmployee("102", "Arindam", "address4"));
		employeeList.add(new UniqueEmployee("101", "Nishit", "address5"));
		System.out.println("Employee record is");
		System.out.println(employeeList);//to show input list
		System.out.println("Employee sorted order By name");
		Set<UniqueEmployee> employeeSet=new HashSet<UniqueEmployee>(employeeList);//to remove all the duplicate
		System.out.println(employeeSet);//to shoe all the unique employee
	}
	@Override
	//method to generate hashcode for employee object
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeID == null) ? 0 : employeeID.hashCode());
		return result;
	}
	//method to check whether object are equal or not
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniqueEmployee other = (UniqueEmployee) obj;
		if (employeeID == null) {
			if (other.employeeID != null)
				return false;
		} else if (!employeeID.equals(other.employeeID))
			return false;
		return true;
	}
	
}
	
