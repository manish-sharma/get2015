import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 * @author Nikhil
 *
 */
public class SortedLinkList {
 int position=0;
	static List<Integer> sortedList=new LinkedList<Integer>();

/**
 *  userInput is function which is take input from user and validate it.
 *
 */
	private static int userInput() {
    	int number = 0;
    	Scanner sc = new Scanner(System.in);
		try {
		number = sc.nextInt();
		return number;
		}
    	catch(InputMismatchException e) {
    		System.out.println("\nenter only integer");
    		number = userInput();
    	}
    	return number;
    }

/**
 *  insert function which is take insert element in sorted linkList in recursive way.
 *
 */
public static void insert(int index, int element)
{
if(index==sortedList.size())
{
	sortedList.add(element);
}
else if(((int)sortedList.get(index) < element)&&((index+1)<=sortedList.size())) {
	insert(index+1, element);
}	
else {
	sortedList.add(index, element);
}	
}
   public static void main(String[] args) 
   {
	   Scanner scanner=new Scanner(System.in);
	   
	   int choice=0;
		/* Showing menu */
	   while(choice!=3)
	   {
		System.out.println("Enter your choice: ");
		System.out.println("1. Insert Element in List");
		System.out.println("2.show list");
		System.out.println("3.Exit");
		 choice=userInput();
		 switch(choice)
		 { case 1:  System.out.println("Enter element");
			        int element=userInput();
		             insert(0, element);
		            break;
		 case 2:   if(sortedList.size()==0)
			          System.out.println("List is empty");
		          else
			          System.out.println("List is\n"+sortedList);
		           break;
		 case 3: choice=3;          
	               break;
	     default:  System.out.println("Enter correct choice");          
		 }
		 }
   }


}