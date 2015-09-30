package arrayList;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {

		MyArrayList arrayList = new MyArrayList();
		int ch, item, loc;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out
					.println("\n1. Adding an item "
							+ "\n2. Adding an item into array list at particular location "
							+ "\n3. Retrieving the first occurrence of an item byit's location"
							+ "\n4. Retrieving the first index of particular item in the arraylist"
							+ "\n5. Removing an item based on particular location"
							+ "\n6. Remove given particular item from the arraylist  "
							+ "\n7. Clear the list i.e. remove all the elements of the list"
							+ "\n8. Reverse the arraylist"
							+ "\n9. Display List"+"\n10. Exit");
			System.out.println("\nEnter Your Choice : ");
			ch = sc.nextInt();
			switch (ch) // Apply switch case and call corresponding method
						// according to the choice
			{
			case 1:
				System.out.print("\n Enter item : ");
				item = sc.nextInt();
				arrayList.addElement(item);
				break;
			case 2:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				System.out.print("\n Enter item : ");
				item = sc.nextInt();
				arrayList.addElementAtPosition(loc, item);
				break;
			case 3:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				int i=arrayList.retrievingPosition(loc);
				System.out.println(i);
				break;
			case 4:
				System.out.print("\n Enter item : ");
				item = sc.nextInt();
				arrayList.retrievingPositionBasedOnLocation(item,2);
				break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				arrayList.removeAtIndex(loc);
				break;
			case 6:
				System.out.print("\n Enter item : ");
				item = sc.nextInt();
				arrayList.removeItem(item);
				break;
			case 7:
				arrayList.clearList();
				break;
			case 8:
				arrayList.reverseArrayList();
				break;
			case 9:
				arrayList.printAllElements();
				break;
			case 10:
				sc.close();
				System.exit(0);
			}
		}
		
	}
}
