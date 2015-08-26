/**
 * Program to demonstrate the concept of inheritance
 */
public class Assignment2Main 
{
	public static void main(String[] args)
	{
		Assignment2Student studentObj = new Assignment2Student(101, "Dheeraj", 1001);
		Assignment2Teacher teacherObj = new Assignment2Teacher(1, "Kumar", 2001);
		System.out.println("Uid of teacher is "+teacherObj.getUid());
		System.out.println("Uid of student is "+studentObj.getUid());
	}

}
