import java.util.List;
/**
 * this method is used to get the friends and show the network of friends 
 * @author Ankur
 *
 */
public class SocialNetwork  {
	
	//method to get the friends of a person
	/**
	 * to get the friendlist of friends
	 * @param personObj
	 * @return the list of friends
	 */
	public static List<String> getFriends(Person personObj) {		//personObj holds person details of the person
																	//whose friends you want to find

		return Processing.friendMap.get(personObj.getEmail());		//returning the friends list
	}
	
	//method to print the social network
	public static void showNetwork() {
		int i = 1;
		for (Person e : MainSocialNetwork.pSet) {		//printing details of each person in person set
			System.out.println("person " + i + " details");
			System.out.println("   name : " + e.getName());
			System.out.println("   phone : " + e.getPhone());
			System.out.println("   email : " + e.getEmail());
			System.out.println("   school : " + e.getSchool());
			System.out.println("   college : " + e.getCollege() + "\n");
			i += 1;
		}
	}
	
}
