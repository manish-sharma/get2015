/*
 * This class Delete all the books which are not issued more than one year
 * @author Banwari kevat 
 */
import java.util.Scanner;
public class Assignment3 {
		
	public static void main(String [] arg)
	    {
	   	      Scanner sc = new Scanner(System.in);
	   	   	  BusinessLogic businessLogic = new BusinessLogic();
	   	      //Variable for storing count of deleted book
	   	      int noOfBooksDeleted = 0;
	   	      System.out.println("If you want to Delete books which are not issued more than one year Press Y else any key ");
	   	      if(sc.next().equalsIgnoreCase("y"))
	   	        {
	   		       noOfBooksDeleted = businessLogic.deleteBooksNotIssuedFromOneYear();
	         	 }   	 
	   	 
	   	      System.out.println( noOfBooksDeleted +" books deleted");
	   	 	  
	    }
}
