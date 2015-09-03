package ds6;

public class EmployeeMain {
	
	/** this is the main class of employee system from which you can access any finction of employee
	 * @param args
	 */
	public static void main(String args[]) {
		EmployeeCollection employeeCollection = new EmployeeCollection();
		do{
			System.out.println(" 1. add employee"
					+"\n 2. natural order sort"
					+"\n 3. sort according to name"
					+"\n 4. exit from system");
			int choice = Util.userChoice();
			switch(choice) {
			case 1:
				employeeCollection.addEmployee();
				break;
			case 2:
				employeeCollection.naturalOrderSort();
				break;
			case 3:
				employeeCollection.nameSort();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("enter correct choice");
				break;
			}
		}while(true);
	}
}
