import java.util.Scanner;
/*
 * Here Person is a class in which name and age of a person hve
 * one another class Student is also here
 * student have all properties of a person
 * so student class extends Person class
 */

/** Person class start here */
class Person{
	/** Here Name and Age are attributes of a Person  class  */
	private String name;
	private int age;
	
	 /**   This method sets the Name*/
	public void setName(String x){
		this.name=x;
	}
	
	/** This method returns the Name */
	public String getName(){
		return name;
	}
	
	 /**   This method sets the Age*/
	public void setAge(int a){
           this.age=a;		
	}
	
	 /**   This method returns Age*/
	public int getAge(){
		return age;
	}	
};
/** Ends of Person class */


/** Starts of Student class  */
 class Student extends Person {
	 private String studentId;
	 
	 /**   This method sets the studentId*/
	 public void setStudentId(String id){
			this.studentId=id;
		}
		
	 /**   This method returns studentId*/
		public String getStudentId(){
			return studentId;
		}
 };
 /** Ending of Student class */
 
 
 
 /**  Starting Main class here*/
public class PersonStudentByInheritance {

	      public static void main(String[] arg) throws Exception{
	    	  try {
	    	  Scanner sc = new Scanner(System.in);
	    	  
	    	  /** student1 is the object of Student class */
	    	  Student student1 = new Student();
	    	  String s="";
	    	  
	    	  System.out.print("Enter the StudentId of student: ");
	           /** Read studentId from Key Board */	  
	      	  s=sc.nextLine();
	    	  student1.setStudentId(s);
	    	  
	    	  
	    	  System.out.print("Enter the name of student: ");
	    	  /** Read student name from Key Board */	  
	    	   s=sc.nextLine();
	    	  student1.setName(s);
	    	  
	    	  System.out.print("Enter the Age of student: ");
	    	  /** Read age from Key Board */	  
	    	  int a=sc.nextInt();
	    	  student1.setAge(a);
	    	  
	    	  
	    	  System.out.println("\n\nDetail of student is: \n");
	    	  
	    	  /**  Printing All Details of a Student*/
	    	  System.out.println("Name of Student:  "+student1.getName());
	    	  System.out.println("StudentID :  "+student1.getStudentId());
	    	  System.out.println("Age of Student:  "+student1.getAge());
	      }
	}
}
/**  Ending main class*/