/**
 * Class to implement the functionality of remove the user from the list
 * @author Sanjay
 */
import java.util.HashMap;


public class RemoveUser extends RemoveFriend {


	/**
	 * Method to remove the user. and his name from the list of friends
	 * @param email = email of user to be removed
	 */
	public void removeUser(String email) {
		String fileName = "D:/workspace/SocialNetwork/src/FriendList.txt";
		HashMap<String, String> userList = readInformation(fileName);
		String userInfo = userList.get(email);
		String[] addFriendTemp =  new String[userInfo.length()];
		addFriendTemp = userInfo.split(";");
		for(int i=4;i<addFriendTemp.length;i++){
			removeFriend(email, addFriendTemp[i]);
		}

		
		userList = readInformation(fileName);
		userList.remove(email);
		writeInformation(userList);		
	}
}
