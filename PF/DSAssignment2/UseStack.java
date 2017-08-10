import java.util.Scanner;


/**
 * @author Sumitra
 *class to use stack
 */
public class UseStack {
public static void main(String arg[])
{
	Scanner scanner=new Scanner(System.in);
	StackOperator stack =new StackOperator();
	int choice=0;
	do{
		System.out.println("enter 1 to push");
		System.out.println("enter 2 to pop");
		System.out.println("enter 3 to display");
		System.out.println("enter your choice");
		int choiceToSelect=scanner.nextInt();
		switch(choiceToSelect)
		{
		case 1:
			System.out.println("enter the value");
			String value=scanner.next();
			stack.push(value.charAt(0));
			break;
		case 2:
			stack.pop();
			break;
		case 3:
			stack.display();
			break;
		default:
			System.out.println("Wrong Entry \n ");
			break;
			
		}
		System.out.println("enter 1 for continue");
		System.out.println("enter 0 for exit");
		System.out.println("enter your choice");
		choice=scanner.nextInt();
		
	}while(choice!=0);
	scanner.close();
}
}
