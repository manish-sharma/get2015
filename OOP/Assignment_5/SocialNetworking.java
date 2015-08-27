package socialNetwork;

import java.util.HashMap;
import java.util.Scanner;

public class SocialNetworking {

	private static Scanner sc;

	public static void main(String args[]) {
		HashMap<String, Person> personList = new HashMap<String, Person>();
		
		// Add a new node
		Node node = new Node();
		personList = node.addNode();
		int choice,flag=1;
        //Sign In
		while (flag==1) {
            flag=0;  
			System.out.println("Enter your Email Id");
			String email;

			sc = new Scanner(System.in);
			email = sc.next();
			//Sign In authorization validation
			if (personList.containsKey(email)) {
				Person currentPerson = null;
				Graph graph = new Edge();
				currentPerson = personList.get(email);
				System.out.println("\nWelcome " + currentPerson.name + "\n"
						+ "Mobile No. - " + currentPerson.phoneNumber + "\n"
						+ "your Interest is - " + currentPerson.getData());
				
                //User Operations
				while (flag==0) {
					System.out.println("\n1. Friend List");
					System.out.println("\n2. Add Friend");
					System.out.println("\n3. Remove/Block Friend");
					System.out.println("\n4. Sign Out");
					System.out.println("\n5. Exit");

					choice = sc.nextInt();
					switch (choice) {
					case 1:
						//Friend List
						currentPerson.showFriends();
						break;
						
					case 2:
						//Add new Friend
						System.out
								.println("please enter your friends Email ID");
						String friendEmail = sc.next();
						if (personList.containsKey(friendEmail)) {
							Person addFriend = personList.get(friendEmail);
							graph.addConnection(currentPerson, addFriend);
						} else {
							System.out
									.println("\nYou entered Incorrect Email Id !!");
						}
						break;
						
					case 3:
						//Block/Remove friend
						System.out
								.println("please enter your frinds Email ID whom you want to remove");
						String friendEmail1 = sc.next();
						
						if (currentPerson.friends.containsKey(friendEmail1)) {
							Person friendToRemove = personList.get(friendEmail1);
							graph.removeConnection(currentPerson,
									friendToRemove);
						} else {
							System.out
									.println("\nYou entered Incorrect Email Id !!");
						}
						break;
						//Sign Out
					case 4: flag=1;
						
						break;
					//Exit application	
					case 5:
						System.exit(0);
						break;

					default:
						break;
					}
					
				}
					
			} else {
				System.out.println("please enter Valid Email Id");
			}
		}
	}
}
