/****************************************************************************************
Name            : SinglyLinkListOperation
Revision Log    : 2015-08-26: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform all opertion of singleLink list
                :
****************************************************************************************/

import java.util.Scanner;


public class SinglyLinkListOperation {

	public static void main(String[] args) {
		int choice = 0, location, item;
		Scanner scan = new Scanner(System.in);
		SinglyLinkList list = new SinglyLinkList();
		//While is used to perform all operation
		while(choice!=9)
		{
			try{
				
				
				System.out.print("\n 1. Add Element at First"
								+"\n 2. Add Element at Location"
								+"\n 3. Removal of an item based on its value "
								+"\n 4. Removal of an item based on its index"
								+"\n 5. Retrieval of an item of particular index"
								+"\n 6. Reversal of linked list"
								+"\n 7. Sorting of linked list"
								+"\n 8. Display linked list"
								+"\n 9. Exit");
				System.out.print("\n Enter Your choice : ");
				choice = Integer.parseInt(scan.next());
				// Apply switch case and call corresponding method according to the user's choice
				switch(choice)			
				{
					
					case 1:
						System.out.print("\n Enter node value : ");
						item = Integer.parseInt(scan.next());
						list.addAtFirst(item); break;
					case 2:
						System.out.print("\n Enter node value : ");
						item = Integer.parseInt(scan.next());
						System.out.print("\n Enter Location : ");
						location = Integer.parseInt(scan.next());
						list.addAtLoc(location, item); break;
					case 3:
						System.out.print("\n Enter node value : ");
						item = Integer.parseInt(scan.next());
						list.remove(item); break;
					case 4:
						System.out.print("\n Enter Location : ");
						location = Integer.parseInt(scan.next());
						list.removeAtIndex(location); break;
					case 5:
						System.out.print("\n Enter Location : ");
						location = Integer.parseInt(scan.next());
						list.retrievel(location); break;
					case 6:
						list.reverse(); break;
					case 7:
						list.sort(); break;
					case 8:
						list.display(); break;
					case 9:
						System.exit(0);
				}
			}
			//End of try
			catch (Exception e) {
				System.out.println("Please Enter Integer value..");
			}
			//End of catch
			scan.close();
		}
		//End of while

	}//End of main

}
//End of class

