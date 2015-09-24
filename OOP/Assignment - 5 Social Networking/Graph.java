/**
 * Class to show the users and their friends
 * @author Sanjay
 */
import java.util.HashMap;
import java.util.Set;


public class Graph extends FileInformation {
	
	/**
	 * method to display the graph of user
	 */
	void showGraph(){
		String fileName = "D:/workspace/SocialNetwork/src/FriendList.txt";
		HashMap<String, String> userList = super.readInformation(fileName);
		for (String itr : userList.keySet()) {
			DisplayFriends object = new DisplayFriends();
			System.out.print(itr+" : ");
			object.displayFriends(itr);
			System.out.println();
		}
	}
}
