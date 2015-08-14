/**
 * Program to demonstrate the concept of inheritance
 */
public class Access 
{
	public static void main(String[] args)
	{
		Student studentObj = new Student(101, "Dheeraj", 1001);
		Teacher teacherObj = new Teacher(001, "Kumar", 2001);
		System.out.println(teacherObj.getUid());
		System.out.println(studentObj.getUid());
	}

}
