package Assignment2;

import java.util.List;
import java.util.Scanner;

/**
 * @author Chetna
* application to create a Company and its employees(Developers) without exposing their public constructors.
* Implement Classes(Factory Pattern) 
 */
public class FactoryDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Developer> devloperList;
		Developer developer = null;
		String name;
		String role;
		int choice= 0;
		
		do{	
			System.out.println("Enter Devloper name ");
			name = scan.next();
			System.out.println("Enter Devloper role");
			role = scan.next();
			developer = Company.getDeveloper(name, role);
			Company.addDevloper(developer);
			System.out.println("Enter 1 for inserting another Developer's information");
			System.out.println("Enter -1 to stop inserting Developer information");
			System.out.println("Enter your choice");
			choice= scan.nextInt();
		}while(choice != -1);
		
		devloperList = Company.getDeveloperList();
		for (Developer developer1 : devloperList) {
			System.out.println("Devloper name = " + developer1.getName());
			System.out.println("Devloper role = " + developer1.getRole());
			System.out.println();
		}
		scan.close();
	}
}