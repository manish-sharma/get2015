import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * all methods are called here
 * @author Ankur
 *
 */
public class MainSocialNetwork {

	public static Scanner sc = new Scanner(System.in);
	Person personObj = new Person();
	public static Processing obj1 = new Processing();
	
	public static List<Person> pSet = new ArrayList<Person>();		//list to store details of all the persons
																	//in the social network
	
	//main method
	public static void main(String[] args) {
		pSet = obj1.readPersons();			//reading person details
		obj1.readFriends();					//reading friends details
		
		int loopVar = 0;					//to repeat actions until the user wants
		String tempName;
		
		MainSocialNetwork mainObj = new MainSocialNetwork();
		Node nodeObj = new Node();
		
		do {
			MenuClass.showBasicMenu();		//showing the basic menu
		
			int choice = 0;
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("please enter integer values only!");;
			}
			switch (choice) {
			case 1:
				SocialNetwork.showNetwork();		//printing the social network
				break;
			
			case 2:
				Person p1 = mainObj.acceptDetails();	//adding a person to the social network
				if (p1.checkExistance() == false)
					nodeObj.addNode(p1);
				else {
					System.out.println("person with same email Id already exists.");
					System.out.println("re-enter details with different email Id!");
				}
				break;
			
			case 3:						//removing a person from the social network
				System.out.println("enter person name you want to remove : ");
				tempName = sc.next();
				for (Person p : pSet) {
					if (tempName.equalsIgnoreCase(p.getName())) {
						nodeObj.removeNode(p);
						break;
					}
				}
				System.out.println(tempName + " was not found in the network.");
				break;
			
			case 4:					//searching for a person in the social network
				System.out.println("enter person name you want to find : ");
				tempName = sc.next();
				int personIndex = nodeObj.searchByName(tempName);
				findPerson(personIndex);
				break;
			
			case 5:					//showing the connections of a person
				System.out.println("enter person name whose friends list you want : ");
				tempName = sc.next();
				for (Person p : pSet) {
					if (tempName.equalsIgnoreCase(p.getName())) {
						List<String> friends = SocialNetwork.getFriends(p);
						System.out.println("friends of " + tempName + " are :");
						System.out.println(friends);
						break;
					}
				}
				break;
				
			case 6:					//adding a connection between two persons
				System.out.println("enter your name.");
				tempName = sc.next();
				System.out.println("enter name of person you want to add as friend.");
				String friendName = sc.next();
				
				Person person1 = new Person();
				boolean flag = false;
				
				for (Person p : pSet) {
					if (p.getName().equalsIgnoreCase(tempName)) {
						person1 = p;
						flag = true;
					}
				}
				if (flag == false) {			//checking if the person is in the network
					System.out.println(tempName + " was not found in the network.");
					break;
				}
				for (Person p : pSet) {
					if (p.getName().equalsIgnoreCase(friendName)) {
						person1.addFriend(p);
						flag = true;
					}
				}
				if (flag == false) {			//checking if the person is in the network
					System.out.println(friendName + " was not found in the network.");
					break;
				}
				break;
				
			case 7:					//removing a connection between two persons
				System.out.println("enter your name.");
				tempName = sc.next();
				System.out.println("enter name of person you want to remove from your friend list.");
				friendName = sc.next();
				
				Person person2 = new Person();
				flag = false;
				
				for (Person p : pSet) {
					if (p.getName().equalsIgnoreCase(tempName)) {
						person2 = p;
						flag = true;
					}
				}
				if (flag == false) {			//checking if the person is in the network
					System.out.println(tempName + " was not found in the network.");
					break;
				}
				for (Person p : pSet) {
					if (p.getName().equalsIgnoreCase(friendName)) {
						person2.removeFriend(p);
						flag = true;
					}
				}
				if (flag == false) {			//checking if the person is in the network
					System.out.println(tempName + " was not found in the network.");
					break;
				}
				break;

			default:
				System.out.println("please enter a valid choice.");
				break;
			}
			System.out.println("\ndo you want to continue?\n1. yes\n2. no");
			try {
				loopVar = sc.nextInt();
			} catch (Exception e) {
				System.out.println("enter valid input!");
			}
		} while(loopVar == 1);
	}

	/**method to find a person in the network
	 * 
	 * @param personIndex
	 */
	private static void findPerson(int personIndex) {
		if (personIndex == -1)
			System.out.println("the person you are looking for is not found.");
		else {
			System.out.println("the person details are :");
			System.out.println("   name : " + pSet.get(personIndex).getName());
			System.out.println("   phone : " + pSet.get(personIndex).getPhone());
			System.out.println("   email : " + pSet.get(personIndex).getEmail());
			System.out.println("   school : " + pSet.get(personIndex).getSchool());
			System.out.println("   college : " + pSet.get(personIndex).getCollege() + "\n");
		}
	}
	
	/**method to accept details of new person in the social network
	 * 
	 * @return
	 */
	Person acceptDetails() {
		String name;
		BigInteger phone = new BigInteger("9999999999");
		String email;
		String school;
		String college;
		Entity obj1 = new Entity();
		boolean test;
		
		System.out.println("enter person details :");
		System.out.println("name : ");
		name = sc.next();
		
		do {
			System.out.println("phone no. : ");
			try {
				phone = sc.nextBigInteger();
			} catch (Exception e) {
				System.out.println("enter valid input!");
			}
			test = obj1.isValidPhone(phone);
			if (test == false)
				System.out.println("enter a valid 10-digit phone number.");
		} while(test == false);
		
		do {
			System.out.println("email : ");
			email = sc.next();
			test = personObj.isValidEmail(email);
			if (test == false)
				System.out.println("enter a valid email Id (example : abc@xyz.com)");
		} while(test == false);
		
		System.out.println("school : ");
		school = sc.next();
		
		System.out.println("college : ");
		college = sc.next();
		personObj.setName(name);
		personObj.setPhone(phone);
		personObj.setEmail(email);
		personObj.setSchool(school);
		personObj.setCollege(college);
		return personObj;
	}

}