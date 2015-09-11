/**
 * Class to implement removal of friend from friend list
 * @author Sanjay
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;


public class RemoveFriend extends FileInformation {
	
	/**
	 * Method to remove friend from our friend list and our name from the friend list of the other person
	 * @param email1 = email of the user
	 * @param email2 = email of friend to be removed
	 */
	void removeFriend(String email1, String email2){
		String fileName = "D:/workspace/SocialNetwork/src/FriendList.txt";
		HashMap<String, String> userList = super.readInformation(fileName);
		boolean checkEmail1 = userList.containsKey(email1);
		boolean checkEmail2 = userList.containsKey(email2);
		if(!checkEmail1){
			System.out.println("There is no account with your email Id. Please make an account first");
		}
		else if(!checkEmail2){
			System.out.println("There is no user with the entered email address");
		}
		else{
			List<String> friendList1 = new ArrayList<String>();
			List<String> friendList2 = new ArrayList<String>();
			String userInfo = new String();
			userInfo=userList.get(email1);
			String[] removeFriendTemp = new String[userInfo.length()];
			removeFriendTemp = userInfo.split(";");
			for(int i = 4;i<removeFriendTemp.length;i++){
				friendList1.add(removeFriendTemp[i]);
			}

			if(friendList1.contains(email2)){
				friendList1.remove(email2);
				String userInfo2 = new String();
				userInfo2=userList.get(email2);
				String[] removeFriendTemp2 = new String[userInfo2.length()];
				removeFriendTemp2 = userInfo2.split(";");
				for(int i = 4;i<removeFriendTemp2.length;i++){
					friendList2.add(removeFriendTemp2[i]);
				}
				friendList2.remove(email1);
				Iterator itr = friendList1.iterator();
				String friend = new String();
				while(itr.hasNext()){
					friend += (String)itr.next()+";";
				}
				Iterator itr2 = friendList2.iterator();
				String friend2 = new String();
				while(itr2.hasNext()){
					friend2 += (String)itr2.next()+";";
				}
				userList.put(email1, removeFriendTemp[0]+";"+removeFriendTemp[1]+";"+removeFriendTemp[2]+";"+removeFriendTemp[3]+";"+friend);
				userList.put(email2, removeFriendTemp2[0]+";"+removeFriendTemp2[1]+";"+removeFriendTemp2[2]+";"+removeFriendTemp2[3]+";"+friend2);
				writeInformation(userList);
			}
			else{
				System.out.println("There is no friend with such email id");
			}
			
		}
	}
}
