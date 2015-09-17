import java.util.List;
import java.util.Scanner;

/*
 * This class prints all the books published by author
 */
public class Assignment1 {
     public static void main(String [] arg)
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter the name of author: ");
    	 String author = sc.next(); 
    	 BusinessLogic businessLogic = new BusinessLogic();
    	 
    	 List<String> titleList = businessLogic.getTitlesByAuthor(author);
    	 
    	 System.out.println("All titles of this author: ");
    	 for(String i: titleList)
    	 {
    		 System.out.println(i);
    	 }
    	 
    	 
	  
     }
}
