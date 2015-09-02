import java.util.*;
//class to sort employee based on there address
public class EmployeeSortingByNatural implements Comparable<Object>{
	String employeeID,nameOfEmployee,addressOfEmployee;
	public EmployeeSortingByNatural(String employeeID,String nameOfStudent,String addressOfEmployee) {
		this.employeeID=employeeID;
		this.nameOfEmployee=nameOfStudent;
		this.addressOfEmployee=addressOfEmployee;
	}
	public String getAddressOfEmployee() {
		return addressOfEmployee;
	}
	public String toString() {
		return "{"+employeeID+","+nameOfEmployee+","+addressOfEmployee+"}";
	}
	@Override
	//override method to sort employee object based on their address
	public int compareTo(Object o) {
		return getAddressOfEmployee().compareTo(((EmployeeSortingByNatural)o).getAddressOfEmployee());
	}
	
	public static void main(String args[]) {
		List<EmployeeSortingByNatural> employeeListByAddress=new ArrayList<EmployeeSortingByNatural>();
		employeeListByAddress.add(new EmployeeSortingByNatural("101", "Avinash", "address"));
		employeeListByAddress.add(new EmployeeSortingByNatural("105", "Rohit", "ganeshchowk"));
		employeeListByAddress.add(new EmployeeSortingByNatural("103", "Siddharth", "sadarbazar"));
		employeeListByAddress.add(new EmployeeSortingByNatural("102", "Nishit", "ajmer"));
		employeeListByAddress.add(new EmployeeSortingByNatural("104", "Bhaskar", "jaipur"));
		System.out.println("Employee record is");
		System.out.println(employeeListByAddress);
		System.out.println("Employee in natural sorted order");
		Collections.sort(employeeListByAddress);
		System.out.println(employeeListByAddress);
		
	}
}
