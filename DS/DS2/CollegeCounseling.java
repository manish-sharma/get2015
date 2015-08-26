import java.util.*;
public class CollegeCounseling extends Queue {
	String[] college={"MBM","CTAE","RTU","JECRC","SKIT"}; // assign 5 colleges in which student select for counseling
	int[] seats = {5,5,5,5,5};			// each college have maximum 5 seats
	void counselingProcess() {
		int numberOfStudents,i,j=0;
		Object studentName;
		String collegeName;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter how many students are eligible for counseling : ");
		numberOfStudents = sc.nextInt();	// take no of students from user
		for(i=0;i<numberOfStudents;i++) {
			System.out.print("Enter "+(i+1)+" student name : ");	// enter student name according to their rank in queue
			studentName = sc.next();
			enqueue(studentName);
		}
		System.out.println("\n There are following college available for counseling");
		for(i=0; i<5; i++) {
			System.out.print("\n "+college[i]);		// display the college list to user in which he can select college
		}
		for(i=0; i<numberOfStudents; i++) {
			studentName = getFront();		// take student at front position
			boolean checkCollegeName = true;
			while(checkCollegeName) {					
				System.out.print("\n Select any college from above colleges for "+studentName+" : ");
				collegeName = sc.next();			// student select college
				for(j=0;j<5;j++) {
					if( college[j].compareToIgnoreCase(collegeName)==0) {  // check whether student select correct college or not
						break;
					}
				}
				if(j==5) {
					System.out.print("\n select any valid college ");
				}
				else { 	// if student select invalid college than continue the loop otherwise come outside from loop make boolean value false 
					dequeue();
					checkCollegeName = false;
				}
			}
			if( seats[j] == 0 ) {  // if seats are full of selected college than gives the message that try again in next round
				System.out.print("\n No seats available in this college....\n Try again in next round!!! ");
			}
			else {   		// If seats are available than allocate the college to student and reduce that college seats by one
				System.out.print("\n Congratulations!!! You have got "+college[j]+" college.");
				seats[j]--;
			}
		}
	}
	public static void main(String[] args) {
					CollegeCounseling counseling = new CollegeCounseling();
					counseling.counselingProcess();
	}

}
