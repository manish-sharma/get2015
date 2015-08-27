package QueueApplication;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CollegeAllotment college = new CollegeAllotment(5, 2);
		Queue student = new Queue(12);
		String collegeName[] = { "PCE", "PIET", "JECRC", "PGI", "GIT" };
		college.getCollegeData(collegeName);

		student.enQueue("suman");
		student.enQueue("Richa");
		student.enQueue("Nitesh");
		student.enQueue("Nidhi");
		student.enQueue("Chetna");
		student.enQueue("Anjita");
		student.enQueue("Manish");
		student.enQueue("Aarti");
		student.enQueue("Rahul");
		student.enQueue("Renu");
		student.enQueue("Seema");
		student.enQueue("Vishal");
		student.enQueue("Mayank");

		int i = 0, status = 1, collegeChoosen = 0;

		while (i < student.queueArray.length && college.noOfallotedSeat != 10) {

			try {
				String studentName = student.getRear(i);

				System.out.println(studentName
						+ " choose college for councelling ");

				college.displayCollegelist();
				collegeChoosen = sc.nextInt();
				if (collegeChoosen != 1 || collegeChoosen != 2
						|| collegeChoosen != 3 || collegeChoosen != 4
						|| collegeChoosen != 5) {
					System.out.print("Wrong Input");
					return;
				}
				status = college.allotSeat(studentName, collegeChoosen - 1);
				if (college.noOfallotedSeat != 10 && status == 0) {
					System.out.println(studentName
							+ " choose another college for councelling ");
					college.displayCollegelist();
					collegeChoosen = sc.nextInt();
					status = college.allotSeat(studentName, collegeChoosen - 1);
				}

				i++;
			} catch (Exception ex) {

				System.out.print("College not available");
			}
		}

		college.displayAlotmentList();
		sc.close();
	}

}
