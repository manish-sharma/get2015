import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * for counseling
 * @author Ravika
 *
 */
public class Counseling {
 /**
  * purpose : to do counseling
  * @param colleges = list of colleges
  * @param student = current student to assign college
  * @return list of colleges after allocation
  */
	ArrayList<College> doCouseling(ArrayList<College> colleges, Student student) {
		System.out.println("Enter ");
		for(int count = 0; count < colleges.size(); count++) {
			College college = colleges.get(count );
			System.out.println(count + 1 + " for " + colleges.get(count) + " seats available " + college.getSeats());
		}
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		College college = colleges.get(choice - 1 );
		student.setCollege(college);
		college.setStudents(student);
		System.out.print( student + " assigned " );
		System.out.print(college);
		college.setSeats(college.getSeats() - 1 );
		if(college.getSeats() == 0) {
			colleges.remove(college);
		}
		return colleges;
	}
	/**
	 * purpose : to read the info of student
	 * @return list of students
	 */
	ArrayList<Student> readStudentInfo() {
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of students ");
		int numberOfStudents = scanner.nextInt();
		for(int count = 0; count < numberOfStudents ; count++) {
			System.out.println("Enter Id of student " + count);
			String id = scanner.next();
			System.out.println("Enter Rank of student " + count);
			int rank = scanner.nextInt();
			Student student = new Student(id, rank);
			students.add(student);			
		}
		scanner.close();
		return students;
	} 
	/**
	 * purpose : to read the info of college
	 * @return list of colleges
	 */
	ArrayList<College> readCollegeInfo() {
		ArrayList<College> colleges = new ArrayList<College>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of college ");
		int numberOfColleges=0;
		while(numberOfColleges < 5) {
			numberOfColleges = scanner.nextInt();
		}
		for(int count = 0; count < numberOfColleges ; count++) {
			System.out.println("Enter code of college " + (count + 1));
			String id = scanner.next();
			System.out.println("Enter seats of college " + (count +1 ));
			int seats = scanner.nextInt();
			College college = new College(id, seats);
			if(seats != 0) {
				colleges.add(college);
			}
		}
		scanner.close();
		return colleges;
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		Counseling counseling = new Counseling();
		ArrayList<Student> students = counseling.readStudentInfo();
		ArrayList<College> colleges = counseling.readCollegeInfo();
		Collections.sort(students);
		int numberOfStudents = students.size();
		Queue studentQueue = new Queue(numberOfStudents);
		for(int count = 0; count < numberOfStudents ; count++) {
			studentQueue.enqueue(students.get(count));
		}
		Student student = null;
		for(int count = 0 ;count < students.size() ; count++) {
			student = (Student)studentQueue.dequeue();
			if(colleges.isEmpty()) {
				break;
			}
			colleges = counseling.doCouseling(colleges, student);
			System.out.println();
		}
	}
}


