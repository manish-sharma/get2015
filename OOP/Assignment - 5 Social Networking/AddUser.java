/**
 * Class to implement functionality of Adding New User
 * @author Sanjay
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class AddUser extends FileInformation {

	
	/**
	 * Method to implement the functionality of adding a new user
	 * @param name = name of user
	 * @param interest = interest list of user
	 * @param description = description of user
	 * @param eMail = email id of the user 
	 */
	void addUser(String name,List<String> interest, String description, String eMail){
		String fileName = "D:/workspace/SocialNetwork/src/FriendList.txt";
		HashMap<String, String> userInfo = readInformation(fileName);
		if(userInfo.containsKey(eMail)){
			System.out.println("This email address is already registered. Please use another email.");
		}
		else{
			userInfo.put(eMail, eMail+";"+name+";"+description+";"+interest+';');
		}
		writeInformation(userInfo);


	}
	
}
