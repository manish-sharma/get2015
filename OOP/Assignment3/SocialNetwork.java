/**social network class extends the graph class and implements functions of
 * social network such as display the entire social network, show friends of
 * a person.
 * 
 * @author Gaurav
 * Date : 22-Aug-2015
 */

import java.util.List;

public class SocialNetwork extends Graph {
	
	//method to get the friends of a person
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
