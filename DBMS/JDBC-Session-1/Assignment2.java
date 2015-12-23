/*
 * This class issue books for a member if available
 * @author Banwari kevat
 */
import java.util.List;
import java.util.Scanner;


public class Assignment2 {
	public static void main(String [] arg)
    {
   	 Scanner sc = new Scanner(System.in);
   	 System.out.print("Enter the name of book: ");
   	 String book = sc.next(); 
   	 System.out.print("Enter the name of member: ");
  	 String member = sc.next(); 
  	 BusinessLogic businessLogic = new BusinessLogic();
   	 //Message for book issue
   	 String flag = businessLogic.issueBookToMember(book, member);
   	 
   	 System.out.println(flag);
   	 	  
    }
}
