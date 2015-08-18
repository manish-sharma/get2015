//main class of inheritance
import java.util.*;
public class InheritenceConcept
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter user id");   //user input
		int uid=scan.nextInt();
		System.out.println("Enter name");        //user input
		String name=scan.next();
		System.out.println("Enter Student Id");     //user input
		int studentId=scan.nextInt();
		Students std=new Students(uid,name,studentId);   //object created
		System.out.println("enter Number of Courses");    //user input
		int noOfCourses=scan.nextInt();
		String courses[]=new String[noOfCourses];
		System.out.println("Enter the name of courses");
		for(int i=0;i<noOfCourses;i++)
		{
			courses[i]=scan.next();
		}
		std.setCources(courses);
		String output=std.toString();
		System.out.println(output);
		String course[]=std.getCourses();
		for(int i=0;i<course.length;i++)
		{
			System.out.println(course[i]);
		}
		scan.close();
	}
}
