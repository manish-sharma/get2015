package QueueApplication;

import java.util.Scanner;

public class CollegeAllotment {
	String college[];
	String allotment[][];
	int row, column, noOfallotedSeat = 0;
	Scanner sc = new Scanner(System.in);

	public CollegeAllotment(int noCollege, int availableSeat) {
		// TODO Auto-generated constructor stub
		college = new String[noCollege];
		allotment = new String[5][availableSeat];
		this.row = noCollege;
		this.column = availableSeat;
	}

	void getCollegeData(String[] collegeName) {
		// System.out.print("Enter College Name : ");
		for (int i = 0; i < row; i++) {
			college[i] = collegeName[i];
		}
	}

	void displayCollegelist() {
		System.out.println();
		for (int i = 0; i < row; i++) {
			System.out.println((i + 1) + ". " + college[i]);
		}
	}

	int allotSeat(String name, int collegechosen) {
		int flag1 = 0;
		try {

			for (int i = 0; i < allotment.length; i++) {
				if (allotment[collegechosen][i] == null) {
					allotment[collegechosen][i] = name;
					System.out.println("Seat Alloted\n");
					flag1 = 1;
					noOfallotedSeat++;
					return 1;
				}

			}
			if (flag1 == 0 && noOfallotedSeat <= 10) {
				System.out.println("Seats full Please try in 2nd councelling");

			}
			return 0;
		} catch (Exception ex) {
			System.out.println("Seats not available in  "
					+ college[collegechosen]);
			return 0;
			// System.out.print("College not available for councelling");
		}
	}

	void displayAlotmentList() {

		System.out.print("******Counseling Result******\n");
		for (int i = 0; i < row; i++) {
			System.out.print(college[i] + "\t\t\t");
			for (int j = 0; j < column; j++) {
				System.out.print(allotment[i][j] + "\t\t\t");
			}
			System.out.println();
		}
	}

}
