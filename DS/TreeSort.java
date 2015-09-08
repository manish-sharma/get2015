import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * main class for tree sort
 * @author Ankur
 * @since 03-09-2015
 */
public class TreeSort {

	static Node<Integer> root = new Node<Integer>();
	static Map<Integer, String> display = new HashMap<Integer, String>();
	static Scanner scan = new Scanner(System.in);
	/**
	 * main method
	 * @param arg
	 */
	public static void main(String [] arg) {
		root = null;
		Student student = new Student();
		int choice=0;
		do{
			choice = student.displayMenu();
			switch(choice){

			case 1://to create the list
				root = student.createStudentList();
				break;
			case 2://to print list by tree sort algorithm
				System.out.println("Roll Number,   Name");
				display = student.showStudentList(root);
				System.out.println(display);
				break;

			case 0://to exit from console
				System.out.println("***Exit***");
				System.exit(0);
			default:
				System.out.println("Enter valid option");
				break;
			}
		}while(choice !=0);

	}

	public int displayMenu(){
		System.out.println("Enter 1  for enter Roll number to add in list \nEnter 2 for Show list\nEnter 0 for exit\nEnter your choice:");
		while(!scan.hasNextInt()){
			System.out.println("Enter Integer values only");
			scan.next();
		}
		int choice = scan.nextInt();
		return choice;
	}

}
