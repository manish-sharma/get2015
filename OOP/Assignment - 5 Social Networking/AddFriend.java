/**
 * Class to implement Add Friend/ Add Connection functionality
 * @author Sanjay
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AddFriend extends FileInformation {
	
	
	/**
	 * Method to add friend
	 * @param email1 = email of user
	 * @param email2 = email of friend
	 */
	void addFriend(String email1,String email2){
		
		
			String fileName = "D:/workspace/SocialNetwork/src/FriendList.txt";
			HashMap<String, String> userList = super.readInformation(fileName);
			String friendList1 = "";
			boolean check = userList.containsKey(email1);
			boolean check2 = userList.containsKey(email2);
			if(!check){
				System.out.println("There is no account with your email id. Please make one and then add friends");
			}
			else if(!check2){
				System.out.println("No user with such email Id. Please mention the correct email id");
			}
			else{
				boolean checkFriend = false;
				String userInfo = userList.get(email1);
				String[] addFriendTemp = userInfo.split(";");
					for(int i= 4;i<addFriendTemp.length;i++){
							if(email2.equalsIgnoreCase(addFriendTemp[i])){
								System.out.println("This Friend already exists in your friend list");
								checkFriend= true;
								break;
								
								
							}
							friendList1+=addFriendTemp[i]+";";
						}
						if(!checkFriend){
							userList.put(email1,  addFriendTemp[0]+";"+addFriendTemp[1]+";"+addFriendTemp[2]+";"+addFriendTemp[3]+";"+friendList1+email2);
							
							
							
							String userInfo2 = userList.get(email2);
							String[] addFriendTemp2 = userInfo2.split(";");
								for(int i= 4;i<addFriendTemp2.length;i++){
										friendList1+=addFriendTemp2[i]+";";
									}
							
							
							userList.put(email2, addFriendTemp2[0]+";"+addFriendTemp2[1]+";"+addFriendTemp2[2]+";"+addFriendTemp2[3]+";"+friendList1+email1);
							writeInformation(userList);
						}
						
			}
			
	}
}
	

