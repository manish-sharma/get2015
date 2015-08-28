package secondprogram;
import java.util.List;
import java.util.Scanner;
/**
 * This class deals with all the process involved in college allotment process of the student
 * @author Riddhi
 *
 */
public class CollegeCounselling {
	Queue studentQueue;													
	List<College> collegeList;

	public void collegeAllotment() {

		Student student = new Student();			//object of student class to access private data members

		Scanner sc = new Scanner(System.in);
		String name;
		
		int totalSeats = calculateTotalSeats();     //calculates total college available seats
		int studentSize = studentQueue.size();      //total number of students
		
		while (studentSize != 0) {                //loop stops when number all students have college allocated
			
			if (totalSeats == 0){                //checks if the total number of seats available in all college is filled
				break;
			}
			else {
				student = (Student) studentQueue.dequeue();    //takes first student out of the queue

				System.out.println("Student Name :" + student.getName()       
						+ "\n Select any college");
				showCollegeList();                           //show available number of college list
				do {
					name = sc.next();
				} while (checkCollegeValidatity(name) == false);     //checks if the name of the college entered by the student is available or not
				
				student.setCollegeName(name);               //students college name is updated
				updateSeats(name);                          //updates available seats of college
				
				System.out.println("Successful Seat allotment");    
				
				studentQueue.enqueue(student);          //again inserts student in the queue

				studentSize--;                         //decreases number of student not alloted
				totalSeats--;                          //decreases total number of college seats
			}
		}

	}

	//function is used to calculate number of seats vacant in all colleges
	public int calculateTotalSeats() {
		int totalSize = 0;
		for (College c : collegeList) {
			totalSize += c.getSeatsAvailable();
		}
		return totalSize;
	}

	//function that displays list of all colleges that have seats vacant
	public void showCollegeList() {
		for (College c : collegeList) {
			if (c.getSeatsAvailable() > 0) {
				System.out.println(c.getCollegeName());
			}
		}
	}

	//function which is used to check the validity of the college name entered by the student
	public boolean checkCollegeValidatity(String name) {
		for (College c : collegeList) {
			if (c.getCollegeName().equalsIgnoreCase(name)
					&& c.getSeatsAvailable() > 0) {

				return true;
			}
		}
		System.out.println("Enter a valid college name. Select Again");
		return false;
	}
	
//function that is used to display all students and the college alloted to them
	public void showStudentInformation() {
		Student student;
		while(!studentQueue.isEmpty())
		{
			student = (Student) studentQueue.dequeue();
			if (student.getCollegeName() != null) {
				System.out.println(student.getName() + "  "
						+ student.getCollegeName());
			} else {
				System.out.println(student.getName() + "  No College Allotted");
			}
		}
}

	//function is used to update the seats of a particular college
	public void updateSeats(String name) {
		for (College c : collegeList) {
			if (c.getCollegeName().equalsIgnoreCase(name)) {
				c.setSeatsAvailable(c.getSeatsAvailable() - 1);
			}
		}
	}

	//main function
	public static void main(String args[]) {
		try {
			StudentCollegeInfo object1 = new StudentCollegeInfo();    
			CollegeCounselling object = new CollegeCounselling();
			object.studentQueue = object1.readStudentInfo();         //method invoked to read students information
			object.collegeList = object1.readCollegeInfo();          //method invoked to read colleges information

			object.collegeAllotment();                             //method invoked to allot colleges to student on the basis of rank

			object.showStudentInformation();				      //method to display all students and college alloted to them

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
