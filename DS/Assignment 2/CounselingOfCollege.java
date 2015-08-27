import java.util.*;

public class CounselingOfCollege extends Queue {
	//List of available college
	String[] college = {"MBM", "CTAE", "RTU", "JECRC", "SKIT"};
	//List of avilable seat in college
	int[] seats = {5, 4, 1, 1, 10};
	
	//method is used for counslingProcess of college 
	void counselingProcess()
	{
		int numberOfStudents, count, count2 = 0;
		Object name;
		String collegeName;
		Scanner scan = new Scanner(System.in);
		System.out.print("\n Enter how many students are eligible for counseling : ");
		numberOfStudents = scan.nextInt();
		
		//For loop is for entry of all student name in queue
		for(count=0; count<numberOfStudents; count++)
		{
			System.out.print("Enter "+(count+1)+" student name : ");
			name = scan.next();
			enqueue(name);
		}
		
		
		System.out.println("\n There are following college available for counseling");
		for(count=0; count<5; count++)
		{
			System.out.print("\n "+college[count]);
		}
		//End of for loop
		
		for(count=0; count<numberOfStudents; count++)
		{
			name = getFront();
			boolean flag = true;
			while(flag)
			{
				System.out.print("\n Select any college from above colleges for "+name+" : ");
				collegeName = scan.next();
				for(count2=0; count2<college.length; count2++)
				{
					if( college[count2].compareToIgnoreCase(collegeName) == 0 )
					{
						break;
					}
				}
				if( count2 ==college.length )
				{
					System.out.print("\n select any valid college ");
				}
				else
				{
					dequeue();
					flag = false;
				}
			}
			//End of while
			
			
			if( seats[count2] == 0 )
			{
				System.out.println("No seats available in this college....\n Try again in next round.. ");
			}
			else
			{
				System.out.println(" Congratulations.. You have got "+college[count2]+" college.");
				seats[count2]--;
			}
		}
		//End of for loop
		scan.close();
	}
	//End of method

	public static void main(String[] args) {
		
					CounselingOfCollege counseling = new CounselingOfCollege();
					counseling.counselingProcess();
	}
	//End of main method

}
//End of class