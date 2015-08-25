import java.util.Scanner;
/**
 * Main class that does all operations of taking input from the user and displaying information
 * @author Riddhi
 *
 */
public class MainFunction {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			SocialNetwork object = new SocialNetwork();
			Entity p, p1;
			int y = 1, choice = 0, accountType;
			String name, email, hobbies, achievements;
			Long phonenumber;
			boolean result = true, valid = false;
			UsersInfo.readUserDetails();                       //method invoked to read information from the file
			int number = SocialNetwork.totalUsers.size();
			do {
				System.out
						.println("1. Sign Up \n 2. Delete\n 3. Add Friends\n 4. Remove Friends\n 5. All Users\n 6. Search By Name");
				choice = sc.nextInt();                     //taking user input from the available options
				switch (choice) {
				case 1:
					System.out.println("1. Person\n 2. Organization");
					accountType = sc.nextInt();               //asking for the type of account user wants to create
					switch (accountType) {
					case 1: //asking information for person type account
						p = new Person();
						System.out.println("Enter your Name");
						name = sc.next();
						System.out.println("Enter your phone number");
						phonenumber = sc.nextLong();
						do {
							System.out.println("Enter your email");
							email = sc.next();
							valid = object.isValidEmail(email);
							if (valid == false) {
								System.out
										.println("Enter a valid email id.[Example abc@xyz.com]");
							}
						} while (valid == false);
						System.out.println("Enter your hobbies");
						hobbies = sc.next();
						//setter for all data members of person class is invoked
						p.setFirstName(name);
						p.setPhoneNumber(phonenumber);
						p.setEmail(email);
						p.setUniqueId(number++);
						Person e = (Person) p;
						e.setHobbies(hobbies);
						p = object.find(email);
						if (p == null)
							object.addEntity(e);        //method invoked to add entry of user in the list
						else
							System.out
									.println("User already exits, Enter different email Id");
						break;

					case 2://asking information for organization type account
						p = new Organization();
						System.out.println("Enter your name");
						name = sc.next();
						System.out.println("Enter your phone number");
						phonenumber = sc.nextLong();
						do {
							System.out.println("Enter your email");
							email = sc.next();
							valid = object.isValidEmail(email);
							if (valid == false) {
								System.out
										.println("Enter a valid email id.[Example abc@xyz.com]");
							}
						} while (valid == false);
						System.out.println("Enter your Accievements");
						achievements = sc.next();
						//setter for all data members of person class is invoked
						p.setFirstName(name);
						p.setPhoneNumber(phonenumber);
						p.setEmail(email);
						p.setUniqueId(number++);
						Organization o = (Organization) p;
						o.getAchievements();
						p = object.find(email);
						if (p == null)
							object.addEntity(o);        //method invoked to add entry of organization in the list
						else
							System.out
									.println("Organization already exits, Enter different email Id");
						break;
					}
					break;

				case 2:
					System.out
							.println("Enter emailId of the account to be deleted");
					email = sc.next();
					p = object.find(email);         //searching whether the user exits or not
					if (p != null) {
						for (Entity s : SocialNetwork.totalUsers) {
							if (s.getEmail().equals(email)) {
								object.removeEntity(s);        //method invoked to remove user from the list
							}
						}
					} else
						System.out.println("No such User Exists");
					break;

				case 3:
					System.out.println("Enter your email id");
					p = object.find(sc.next());                //searching whether the user exits or not
					System.out.println("enter his/her emailId");
					p1 = object.find(sc.next());              //searching whether the user exits or not
					if (p != null && p1 != null) {
						object.mutualFriends(p, p1);         //method invoked to display mutual friends
						System.out.println("Press 1 to confirm or 0 to cancel");
						int response = sc.nextInt();        //reconfirming user for friendship
						if (response == 1) {
							result = object.addFriend(p, p1);
						}
						if (result == false) {
							System.out
									.println("Enter valid email Id, No Such User Exists");
						}
					} else {
						System.out
								.println("Enter valid email id, No Such User Exists");
					}
					object.printFriends();

					break;

				case 4:
					System.out.println("Enter your email id");
					p = object.find(sc.next());            //searching whether the user exits or not
					System.out.println("enter his/her emailId");
					p1 = object.find(sc.next());             //searching whether the user exits or not
					if (p != null && p1 != null) {
						object.mutualFriends(p, p1);          //method invoked to display mutual friends between two users
						System.out.println("Press 1 to confirm or 0 to cancel");
						int response = sc.nextInt();         //reconfirming user for friendship
						if (response == 1) {                
							result = object.removeFriend(p, p1);
						}
						if (result == false) {
							System.out.println("Enter valid email Id");
						}
					} else {
						System.out.println("Enter valid email id");
					}
					object.printFriends();
					break;

				case 5:
					object.print();
					break;

				case 6:
					System.out.println("Enter name to be searched");
					name = sc.next();          
					object.searchByName(name);              //method invoked to search user in the list by his/her name
					break;

				default:
					System.out.println("Enter a valid input");    

				}
				System.out.println("Press 1 to continue and 0 to exit");        
				y = sc.nextInt();                             //asking user to continue or exit
			} while (y == 1);

		} catch (Exception e) {
			System.out.println("Enter a valid input");
		} finally {
			sc.close();
		}
	}
}
