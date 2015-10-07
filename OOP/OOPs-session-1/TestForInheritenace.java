/*Test for inheritence
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/*this is a parent class,it will provide 
 * user id and name of user
 */
 class Person {
	int uid;
	String name;
	 public Person()
	    {
	    	
	    }
    public Person(int uid,String name)
	{
	 	this.uid=uid;
	 	this.name=name;
	}

 }
 
/* this class is derive class which 
 * inherits the properties of person class
 * 
 */
  class Student extends Person{
	//ArrayList<Student> students;
	
   int studentId;
	
  public Student(int uid, String name,int studentId) {
		super(uid, name);
		this.studentId=studentId;
	}
   
}
 /*this is main class which will
  * print the information of user 
  */
public class TestForInheritenace
  {
	 
     
	  public static void main(String args[])
		{
		  int n;
		  int uid,studentId;
	      String name;
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter Total no. of Students");
		  n=Integer.parseInt(scan.nextLine());
		  //Student obj=new Student();
		 // Student obj=new Student();
		  ArrayList<Student> students=new ArrayList<Student>();
		
		  int x=1;
			 while(n>0)
			  {   System.out.println("Enter "+x+" user id,name and Student id in order ");
			      uid=Integer.parseInt(scan.nextLine());
			      name=scan.nextLine();
			      studentId=Integer.parseInt(scan.nextLine());
			      Student obj1=new Student(uid, name, studentId);
				  students.add(obj1);
				  x++;
				  n--;
			  }
		  //students1=obj.setDta(n);
		  Iterator<Student> iterator = ((ArrayList<Student>) students).iterator();
		   x=0;
		   TestForInheritenace test=new TestForInheritenace();;
		  do
		  {
			  x++;
			  Student obj1=iterator.next();
			  test.show(obj1,x);
		  }while(iterator.hasNext());
		 }

	  public void show(Student obj,int studentNo) {
			 System.out.println("Student"+studentNo+" Data is:");
			 System.out.println();
		    System.out.println("Student id is:"+obj.studentId);
		    System.out.println("Student name is:"+obj.name);
		    System.out.println();
			}

		
		
  }