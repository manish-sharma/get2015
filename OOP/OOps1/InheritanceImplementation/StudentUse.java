package InheritanceImplementation;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StudentUse {
	
	/**
	 * UserInput is a function which is use take input from user
	 * 
	 * @return It return a number
	 */
	private int UserInput() {
		int number;
		try {
			Scanner sc = new Scanner(System.in);

			number = sc.nextInt();
			if (number < 0) {
				System.out.println("number be negative");
				number = UserInput();

			}
			return number;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			number = UserInput();
			return number;
		}

	}
	/**
	 * UserInputForString is a function which is use take input from user
	 * 
	 * @return It return a number
	 */
	private String UseInputForString()
	
	{  String input;
     	 
	    Scanner sc = new Scanner(System.in);

	    input=sc.next();
		
	   return input;	
		
	}
	
	
	
	
	
	
	public static void main(String args[])
	
	{   int Uid,StudentId,courses;
	    String Name;
	    String Courses[];
	    
	    StudentUse use=new StudentUse();
   
	    System.out.println("Enter the Uid Of Student ");
	    Uid=use.UserInput();
	    
	    System.out.println("Enter the Name Of Student ");
	    Name=use.UseInputForString();
	    	    
	    System.out.println("Enter the StudentId of Student ");
	    StudentId=use.UserInput();
	    
	    System.out.println("How many course you want to add in student courses");
	    courses=use.UserInput();
	    
	    Courses=new String[courses];
	    
	  for(int count=0;count<courses;count++)
		  Courses[count]=use.UseInputForString();

	    Student student=new Student(Uid, Name, StudentId);
	    student.setCources(Courses);
	    
	    System.out.println("Detail of Student is");
	     System.out.println(student.toString());
		    
	   System.out.println("Course of Student is");
	    Courses=student.getCourses();
	   
	    for(int count=0;count<Courses.length;count++)
	    	System.out.println(Courses[count]);
		    	
	  
	  
	}
}
