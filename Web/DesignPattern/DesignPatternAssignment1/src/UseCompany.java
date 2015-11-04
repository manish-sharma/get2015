
public class UseCompany {

	public static void main(String args[]) {

		EmployeeFactory employeeFactory = new EmployeeFactory();
		Company company = Company.getInstant();

		String name;
		while (true) {

			Util.displayMenueForEmolyee();
			int choice = Util.userInput();

			switch (choice) {
			case 1:
				Util.displayMenueForEmolyeeType();
				int etype = Util.userInput();
				switch (etype) {
				case 1:
					IEmployee employee = employeeFactory
							.getEmployee(EmployeeType.devloper);
					System.out.println("Enter name");
					name = Util.userInputForSimpleString();
					employee.createEmployee(name,
							EmployeeType.devloper.toString());
					company.addEngineer(employee);
					break;

				case 2:
					employee = employeeFactory.getEmployee(EmployeeType.tester);
					System.out.println("Enter name");
					name = Util.userInputForSimpleString();
					employee.createEmployee(name,
							EmployeeType.tester.toString());
					company.addEngineer(employee);
					break;
				case 3:
					employee = employeeFactory
							.getEmployee(EmployeeType.hrManager);
					System.out.println("Enter name");
					name = Util.userInputForSimpleString();
					employee.createEmployee(name,
							EmployeeType.hrManager.toString());
					company.addEngineer(employee);
					break;
				default:
					System.out.println("Enter correct input");
				}
				break;

			case 2:
				for (IEmployee employee : Company.employeeList) {
					System.out.println(employee);

				}
				System.out.println("\n\n");
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid Input");
			}
		}

	}

}
