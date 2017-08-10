import java.util.*;

/**
 * @author Sumitra
 * tHIS Class contain the main method of the whole program of assignment in which we have to call the student class and record whole data.
 *
 */
public class InheritanceProgram{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter user id");
		int uid=scan.nextInt();
		System.out.println("Enter name");
		String name=scan.next();
		System.out.println("Enter Student Id");
		int studentId=scan.nextInt();
		Student std=new Student(uid,name,studentId);
		//object of student class is created
		
		System.out.println("enter Number of Courses");
		int noOfCourses=scan.nextInt();
		String courses[]=new String[noOfCourses];
		System.out.println("Enter the name of courses");
		for(int i=0;i<noOfCourses;i++)
		{
			courses[i]=scan.next();
		}
		std.setCources(courses);
		//method to ste course is called
		String output=std.toString();
		System.out.println(output);
		String course[]=std.getCourses();
		//will return whole couse that the student will set.
		for(int i=0;i<course.length;i++)
		{
			System.out.println(course[i]);
		}
	
		scan.close();
	}
}
