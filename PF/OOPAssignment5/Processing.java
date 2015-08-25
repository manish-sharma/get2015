
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Sumitra
 *this will read data from file and from user.
 */
public class Processing {
	
	BufferedReader br;
	
	final static String DETAILS_FILE = "C:/Users/Sumitra/workspace/SocialNetworking/src/PersonDetails.txt";
	final static String FRIEND_FILE = "C:/Users/Sumitra/workspace/SocialNetworking/src/FriendsList.txt";
	public static Set<Entity> nodeSet = new HashSet<Entity>();
	
	public static HashMap<String, Set<String>> friendMap = new HashMap<String, Set<String>>();
	
	/**
	 * Reading Friends from file
	 */
	public void readFriends() {
		int i=0;
		try {
			File f=new File(FRIEND_FILE).getAbsoluteFile();
			br = new BufferedReader(new FileReader(f));
				String line;
				Set<String> friendSet = new HashSet<String>();
				try {
					while ((line = br.readLine()) != null) {
						
						String[] email = line.split(",");
						for (Entity entity :nodeSet) {
							if(entity.getEmail().equals(email[0])){
								for (int index = 1; index < email.length; index++) {
									for (Entity entityAgain :nodeSet) {
										if(entityAgain.getEmail().equals(email[index])){
											friendSet.add(email[index]);
										}
									}
								}
								
								if(i==0) {
									friendMap.put(email[0], friendSet);
								}else if(!friendMap.containsKey(email[0])) {
									friendMap.put(email[0], friendSet);
								}
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * Reading entity from File
	 */
	public void readPersons() {
		try {
			File f=new File(DETAILS_FILE).getAbsoluteFile();
			br = new BufferedReader(new FileReader(f));
			try {
				String line;
				while ((line = br.readLine()) != null) {
					String[] details = line.split(",");
					if (Integer.parseInt(details[0])==0) {
						Person tempPerson = new Person();
						tempPerson.setName(details[1]);
						BigInteger ob1 = new BigInteger(details[2]);
						tempPerson.setPhone(ob1);
						tempPerson.setEmail(details[3]);
						tempPerson.setSchool(details[4]);
						tempPerson.setCollege(details[5]);
						tempPerson.setInterests(details[6].split("/"));
						nodeSet.add(tempPerson);
					}else {
						Organization  organization=new Organization();
						 organization.setName(details[1]);
						BigInteger ob1 = new BigInteger(details[2]);
						 organization.setPhone(ob1);
						 organization.setEmail(details[3]);
						 organization.setCourses(details[4].split("/"));
						 organization.setFaculty(details[5].split("/"));
						 organization.setPlacements(details[6].split("/"));
						 nodeSet.add(organization);
					}
				}
			}
			
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	
	/**Taking Entity and returning it
	 * @return :returning new entity details
	 */
	Entity acceptDetails() {
		Scanner sc=new Scanner(System.in);
		BigInteger phone;
		String email;
		boolean test;
		int count = 0;
		System.out.println("Press 1 if want to enter person detail ");
		System.out.println("Press 2 if want to enter organizational detail ");
		do {// Validation
			System.out.println("Please enter a positive number!");
			while (!sc.hasNextInt()) {
				System.out
						.println("That's not a number!Please enter again");
				sc.next(); // this is important!
			}
			count = sc.nextInt();
			if ((count != 1) && (count != 2)) {
				System.out.println("Enter right values");
				count=-1;
				}
		} while (count<= 0);
		
		if (count == 1) {//if belong to person
			Person person = new Person();
			System.out.println("enter person details :");
			System.out.println("name : ");
			person.setName(sc.next());
			//validation for phone no
			do {
				System.out.println("phone no. : ");
				phone = sc.nextBigInteger();
				test = person.isValidPhone(phone);
				if (test == false)
					System.out.println("enter a valid 10-digit phone number.");
			} while (test == false);

			person.setPhone(phone);
			//validation for email id
			do {
				System.out.println("email : ");
				email = sc.next();
				test = person.isValidEmail(email);
				if (test == false)
					System.out
							.println("enter a valid email Id (example : abc@xyz.com)");
			} while (test == false);

			person.setEmail(email);
			System.out.println("school : ");
			person.setSchool(sc.next());

			System.out.println("college : ");
			person.setCollege(sc.next());
			System.out.println("Interest : ");
			String interest[] = sc.next().split("/");
			person.setInterests(interest);
			return person;
		} else {//if belong to organization
			Organization organization = new Organization();
			System.out.println("enter Organization details :");
			System.out.println("name : ");
			organization.setName(sc.next());
			//validation for phone no
			do {
				System.out.println("phone no. : ");
				phone = sc.nextBigInteger();
				test = organization.isValidPhone(phone);
				if (test == false)
					System.out.println("enter a valid 10-digit phone number.");
			} while (test == false);
			organization.setPhone(phone);
			//validation for email id
			do {
				System.out.println("email : ");
				email = sc.next();
				test = organization.isValidEmail(email);
				if (test == false)
					System.out
							.println("enter a valid email Id (example : abc@xyz.com)");
			} while (test == false);

			organization.setEmail(email);
			System.out.println("Courses : ");
			String courses[] = sc.next().split("/");
			organization.setCourses(courses);

			System.out.println("Faculty : ");
			String faculty[] = sc.next().split("/");
			organization.setFaculty(faculty);

			System.out.println("Placement : ");
			String placements[] = sc.next().split("/");
			organization.setPlacements(placements);
			return organization;
		}
	}


}
