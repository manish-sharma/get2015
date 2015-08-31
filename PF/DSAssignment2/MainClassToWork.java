package CollegeAllotment;

import java.util.Scanner;

/**
 * @author Sumitra
 *this is the main class which will do all the function.
 */
/**
 * @author Sumitra
 *
 */
public class MainClassToWork {
	static Scanner scanner = new Scanner(System.in);
	static CollegeUse clg = new CollegeUse();
	static StudentQueue student = null;
	static int size = 0;
	static int count = 0;

	public static void main(String arg[]) {

		int set = 0;
		int ch;

		do {
			System.out.println("enter 1 for the entry of students");
			System.out.println("enter 2 for college list");
			System.out.println("enter 3 for student list whose seats are not alloacated");
			System.out.println("enter 4 for selection of college");
			System.out.println("enter 5 for final list");
			System.out.println("enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				set = 1;
				enrollStudent();
				break;
			case 2:
				clg.show();
				break;
			case 3:
				if(set!=1)
				{
					System.out.println("!!!!!!atleast enroll students!!!!!!");
					break;
				}
				else
				{
					student.display();
					break;
				}
			case 4:
				if (set != 1) {
					System.out.println("!!!!!!!atleast enroll students!!!!!!!!");
					break;
				} else {
					setCollegeForStudent();
					set=2;
					break;
				}

			case 5:
				if(set!=1 && set!=2)
				{
					System.out.println("Seats are not allocated");
					break;
				}
				else
				{
				clg.showList();
				break;
				}
			default:
				System.out.println("enter correct choice");
				break;
			}
			System.out.println();
			System.out.println("enter 1 for continue");
			System.out.println("enter 0 for exit");
			System.out.println("enter your choice");
			ch = scanner.nextInt();

		} while (ch != 0);

		scanner.close();
	}
/**
 * this method is to enroll student for counseling.
 */
	static void enrollStudent() {

		System.out.println("enter number of students");
		size = scanner.nextInt();
		student = new StudentQueue(size);
		for (int i = 0; i < size; i++) {
			System.out.println("enter name");
			String name = scanner.next();
			System.out.println("enter rank");
			int rank = scanner.nextInt();
			Student stu = new Student(name, rank);
			student.enqueue(stu);
		}
		student.sort();
	}
/**
 * this method is to allocate college.
 */
	static void setCollegeForStudent() {
		if (count != size) {
			Student studentAgain = student.peek();
			System.out.println("NAME 	" + studentAgain.getName());
			System.out.println("RANK  	" + studentAgain.getRank());
			System.out.println("enter id of college");
			int id = scanner.nextInt();
			if (id > 0 && id <= 5) {
				if (clg.allocate(id, student.peek())) {
					student.dequeue();
				} else {
					System.out.println("select another college");
					setCollegeForStudent();
				}
			}
			count++;
		} else {
			System.out.println("all students are enrolled");
		}
	}

}
