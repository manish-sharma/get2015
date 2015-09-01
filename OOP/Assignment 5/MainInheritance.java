import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/*This class test the Inheirtance classes implementattion*
 * @author Shishir Pareek]
 * Date 13th August 2015
 */
public class MainInheritance {
	
	public static void main(String args[]) 
	{
		System.out.println("Enter the name");// input taken
		Scanner Sc = new Scanner(System.in);
		DataInputStream obj = new DataInputStream(System.in);
		String name = null;
		try 
		{
			name = obj.readLine();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("enter the id ");// id
		int id = Sc.nextInt();
		int studentid = Sc.nextInt();
		Person personobj = new Person(id, name);
		Student student = new Student(id, name, studentid);
		System.out.println(personobj);
		System.out.println(student);
	}
}


