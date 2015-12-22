package Assignment4;

public class ParameterizedConstructor {
	public static void main(String args[]) {
		//Advantage:- we don't need set value of each variable of class we can pass values directly using parameterized constructor.
		
		//using setter
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Avinash");
		employee.setAddress("address");
		System.out.println(employee.toString());
		//using constructor
		Employee employeeUsingConstructor = new Employee(1, "Avinash", "address");
		System.out.println(employeeUsingConstructor.toString());
	}
}
