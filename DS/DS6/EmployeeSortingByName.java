import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EmployeeSortingByName implements Comparable<Object>{
	String employeeID,nameOfEmployee,addressOfEmployee;
	public EmployeeSortingByName(String employeeID,String nameOfEmployee,String addressOfEmployee) {
		this.employeeID=employeeID;
		this.nameOfEmployee=nameOfEmployee;
		this.addressOfEmployee=addressOfEmployee;
	}
	public String getNameOfEmployee() {
		return nameOfEmployee;
	}
	public String toString() {
		return "{"+employeeID+","+nameOfEmployee+","+addressOfEmployee+"}";
	}
	public static void main(String args[]) {
		List<EmployeeSortingByName> employeeList=new ArrayList<EmployeeSortingByName>();
		employeeList.add(new EmployeeSortingByName("101", "Avinash", "ajmer"));
		employeeList.add(new EmployeeSortingByName("105", "Rohit", "jaipur"));
		employeeList.add(new EmployeeSortingByName("103", "Siddharth", "delhi"));
		employeeList.add(new EmployeeSortingByName("104", "Arindam", "kota"));
		employeeList.add(new EmployeeSortingByName("102", "Nishit", "bombay"));
		System.out.println("Employee record is");
		System.out.println(employeeList);
		System.out.println("Employee sorted order By name");
		Collections.sort(employeeList);
		System.out.println(employeeList);
		
	}
	@Override
	public int compareTo(Object o) {
		return getNameOfEmployee().compareTo(((EmployeeSortingByName)o).getNameOfEmployee());
	}
}

