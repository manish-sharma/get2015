/**
 * Class to implement the functionality of displaying friends
 * @author Sanjay
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class DisplayFriends extends FileInformation {
	
	/**
	 * Method to display friends
	 * @param email = email of the user whose friends are to displayed
	 */
	void displayFriends(String email){
		FileInformation fileInformationObject = new FileInformation();
			String fileName = "D:/workspace/SocialNetwork/src/FriendList.txt";
			HashMap<String, String> userList = fileInformationObject.readInformation(fileName);
			boolean mail = userList.containsKey(email);
			if(mail){
				String userInfo = userList.get(email);
				String[] friendTemp = userInfo.split(";");
				for(int i= 4;i<friendTemp.length;i++){
					
					System.out.print(friendTemp[i]+",");
				}
			}
			else{
				System.out.println("There is no account with this email id");
			}
			
			
		
			
		}
}

