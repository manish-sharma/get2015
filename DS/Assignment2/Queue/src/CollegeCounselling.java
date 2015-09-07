import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 *@author Amit
 *
 */
public class CollegeCounselling extends Queue {
	
	/* List of 6 colleges */
	String[] collegeList = {"SBTC", "JECRC", "MIT", "PIT", "PCE", "Bhawani"}; 
	int[] seatsInColleges = {5, 4, 7, 9, 5, 8};		
	public void counselling(int numberOfStudents)
	{
		Scanner scan =  null;
		BufferedReader bufferedReaderObj = null;
		try
		{
			int collegeNumber;
			String nameOfStudent;
			scan = new Scanner(System.in);
			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
			
			for(int i = 0; i < numberOfStudents; i++)
			{
				/* Entering Student Names according to rank*/
				
				while(true) {
					System.out.println("Enter Student Name with rank: " + (i + 1));
					nameOfStudent = bufferedReaderObj.readLine();
					if(Validation.isName(nameOfStudent))
						break;
					else
						System.out.println("Please Enter a valid Name");
				}
				enqueue(nameOfStudent);
			}
			System.out.println("\n These are the colleges available for counselling with number of seats available: ");
			for(int i = 0; i < collegeList.length; i++)
			{
				/* Displaying College List */
				System.out.println((i+1)+". Name of College: "+collegeList[i]);
				System.out.println("No. of seats: "+seatsInColleges[i]);
				System.out.println();	
			}
			for(int i = 0; i < numberOfStudents; i++)	
			{
				/* Take front element of the queue as student name */ 
				nameOfStudent = (String)getFront();		
				System.out.print("\n Select any college from above colleges for "+nameOfStudent+" : ");
				do {// Validation
					System.out.println("(Enter Positive Number(Greater than zero and Less than "+(collegeList.length+1)+")");
					while (!scan.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					scan.next(); // this is important!
					}
					collegeNumber = scan.nextInt();
			
				} while (collegeNumber <= 0 || collegeNumber > 6);	
				dequeue();
				
				/* If seats are full in college */
				if( seatsInColleges[collegeNumber-1] == 0 ) 
				{
					System.out.print("\n Seats are full in this college\n Try again in next round!!! ");
				}
				/* if Seats are available */
				else		
				{
					System.out.print("\n Congratulations!!! You have got "+collegeList[collegeNumber-1]+" college.");
					seatsInColleges[collegeNumber-1]--;
				}
			}
			System.out.println("\nCounselling Over\nSystem Closed");
			System.exit(0);
			scan.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

