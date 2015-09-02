import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class that handles main function and displays menu
 * 
 * @author Riddhi
 *
 */
public class MainClass {

	public static void main(String args[]) {
		Scanner sc = null;
		try {
			List<Employee> list = new ArrayList<Employee>();

			sc = new Scanner(System.in);
			do {
				System.out.println("1.Enter employee details");
				System.out.println("2. Natural Order Sorting");
				System.out.println("3. Sorting by name");
				System.out.println("4. Exit");
				int choice = Utility.checkInteger();

				switch (choice) {
				case 1:
					System.out.println("Entr name");
					String name = sc.nextLine();
					System.out.println("Enter employee id");
					Integer empId = Utility.checkInteger();
					System.out.println("Enter salary");
					Double salary = Utility.checkDouble();
					Employee emp = new Employee(name, empId, salary);
					boolean flag = false;
					// loop to enter only unique employee id
					for (Employee e : list) {
						flag = e.equals(emp);
					}
					if (flag == false)
						list.add(emp);
					break;

				case 2:
					// Sorting based on employeeId using comparable interface
					System.out.println("Natural Order Sorting");
					Collections.sort(list);
					System.out.println(list);
					break;

				case 3:
					// Sorting based on employee name using comparator interface
					System.out.println("Name Ascending order sorting");
					Collections.sort(list, new EmployeeComparator());
					System.out.println(list);
					break;

				case 4:
					System.exit(0);

				default:
					System.out.println("Enter a valid input");
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}

	}
}
