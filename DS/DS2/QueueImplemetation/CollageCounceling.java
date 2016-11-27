package QueueImplemetation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nikhil
 *
 */

public class CollageCounceling {
	String line = "";
	Queue studentQueue = new Queue();
	Queue collegeQueue = new Queue();
	List<Colleges> collegeList = new ArrayList<Colleges>();

	/**
	 * readStudentDetail is a function which is read student detail from file and store in queue
	 */
	
	public void readStudentDetail() {
		List<Student> studentsList = new ArrayList<Student>();
		try {
			// Reading the student detail stored in the txt file
			BufferedReader br = new BufferedReader(new FileReader(
					"C:/Users/Nikhil/Desktop/students.txt"));
			while ((line = br.readLine()) != null) {
				String[] token = line.split(",");
				if (token.length < 2)
					continue;
				Student student = new Student();
				student.setName(token[0]);
				student.setRank(Integer.parseInt(token[1]));
				studentsList.add(student);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);

		} catch (IOException e) {
			System.out.println(e);
		}
		Collections.sort(studentsList, new StudentRankComparater());
		for (Student student : studentsList) {
			studentQueue.enqueue(student);
		}
	}
	/**
	 * collegeDetail is a function which is read college detail from file and store in queue
	 */
       
	public void collageDetail() {

		try {
			// Reading the college data from file
			BufferedReader br = new BufferedReader(new FileReader(
					"C:/Users/Nikhil/Desktop/college.txt"));
			while ((line = br.readLine()) != null) {
				String[] token = line.split(",");
				if (token.length < 2)
					continue;
				Colleges collages = new Colleges();
				collages.setName(token[0]);
				collages.setSeatAvaliable(Integer.parseInt(token[1]));

				collegeQueue.enqueue(collages);
				collegeList.add(collages);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
	/**
	 * showListOfCollage is a function which is show list of college in which seat is available
	 */

	void showListOfCollage() {
		int size = collegeQueue.size();
		Colleges colleges = new Colleges();
		System.out.println("College Name"+"\t"+"Seats");
		for (int count = 0; count < size; count++) {
			colleges = (Colleges) collegeQueue.dequeue();
			if (colleges.getSeatAvaliable() > 0) {
				System.out.println(colleges.getName()+"\t"+colleges.getSeatAvaliable());

				collegeQueue.enqueue(colleges);
			}
		}

	}
	/**
	 * ValidationForCollegeName is a recursive function which is used for validation that entered college name is correct or not
	 */

	String ValidationForCollegeName() {
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		for (Colleges collage : collegeList) {
			if (collage.getName().equalsIgnoreCase(name)
					&& collage.getSeatAvaliable() > 0) {
				flag = true;
				return name;
			}
		}
		if (!flag) {
			System.out.println("please enter correct college name");
			name = ValidationForCollegeName();

		}

		return name;
	}
	/**
	 * calculteTotalSeat is a  function which is used to calculated total available seat in all college
	 * @return total seat
	 */
	int calculteTotalSeat() {
		int totalSeat = 0;

		for (Colleges college : collegeList) {
			totalSeat += college.getSeatAvaliable();

		}

		return totalSeat;
	}
	/**
	 * SeatAllotment is a  function which is used to allot a seat of desire college if seat is available.
	 */
	void SeatAllotment() {

		int collegeCounter = calculteTotalSeat();

		int sizeStudent = studentQueue.size();
		Scanner scanner = new Scanner(System.in);
		int sizeColllege = collegeQueue.size();
		Colleges colleges = new Colleges();
		Student student = new Student();

		while (sizeStudent != 0) {
			if (collegeCounter == 0)
				break;

			student = (Student) studentQueue.dequeue();

			System.out.println("Student Name ->" + student.getName() + "\n"
					+ "Select any college");
			
			showListOfCollage();
			String name = ValidationForCollegeName();

			for (int count = 0; count < sizeColllege; count++) {
				colleges = (Colleges) collegeQueue.dequeue();

				if (colleges.getName().equalsIgnoreCase(name) == true) {
					student.setCollegeName(name);
					colleges.setSeatAvaliable(colleges.getSeatAvaliable() - 1);

				}

				collegeQueue.enqueue(colleges);
			}

			System.out.println("Allotement is successfully done");
			studentQueue.enqueue(student);
			sizeStudent--;
			collegeCounter--;
		}

	}
	
	/**
	 * showListOfStudent is a function which is used to print the student detail
	 * after allotement of colleges.
	 */
	
	void showListOfStudent() {
		int size = studentQueue.size();
		Student student = new Student();
		for (int count = 0; count < size; count++) {
			student = (Student) studentQueue.dequeue();
			if (student.getCollegeName() != null) {
				System.out.println(student.getName() + " ->"
						+ student.getCollegeName());

			} else
				System.out.println(student.getName() + " ->"
						+ "Not alloted any college");
			studentQueue.enqueue(student);
		}

	}

	public static void main(String args[]) {
		CollageCounceling counceling = new CollageCounceling();
		counceling.readStudentDetail();
		counceling.collageDetail();
		counceling.SeatAllotment();
		System.out.println("Student list with alloted a college");
		counceling.showListOfStudent();
	}

}
