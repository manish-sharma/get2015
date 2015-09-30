package HashMap;

import java.util.Scanner;

public class HeapMainClass {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String customerName;
		int customerAge = 0, count = 0;
		Guest guest;
		System.out.print("Enter number of rooms: ");
		int noOfRoomsInHotel = scanner.nextInt();
		while (true) {
			try {

				System.out.println("\n1. For Booking Room"
						+ "\n2. List Rooms Allocation" + "\n3. exit"
						+ "\nEnter your choice : ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					//Case for booking room
					if (count < noOfRoomsInHotel) {
						System.out.print("Enter customer name : ");
						customerName = scanner.next();
						System.out.print("Enter customer age : ");
						customerAge = scanner.nextInt();
						guest = new Guest(customerName, customerAge,
								noOfRoomsInHotel);
						guest.roomAllotment(guest);
						count++;
					} else {
						System.out.print("Booking Full");
					}
					break;

				case 2:
					//Case for accessing list of room allocation
					Guest.displayRoomAllocationList();
					break;

				case 3:
					System.exit(0);

				default:
					System.out.println("Please enter valid choice");
					scanner.close();
					break;

				}
			} catch (Exception e) {
				System.out.print(e);
				System.exit(0);
			}

		}

	}

}
