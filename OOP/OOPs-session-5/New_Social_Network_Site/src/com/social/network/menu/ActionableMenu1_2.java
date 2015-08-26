/*ActionableMenu1_2 class
 * this class implements MenuItem1_2 interface
 * this is the nested menu of Main Menu
 */
package com.social.network.menu;

import java.io.IOException;
import java.util.StringTokenizer;

import com.social.network.entity.OperationOnEntities;

public class ActionableMenu1_2 implements MenuItem1_2 {
	private String displayText;

	/*
	 * constructor of ActionableMenu1_2 class this will set the value of
	 * menuItem1_2 for each menuItem1_2
	 */
	public ActionableMenu1_2(String displayText) {
		this.displayText = displayText;

	}

	public ActionableMenu1_2() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * this will display nested menu
	 */
	@Override
	public void displayFriendRequestMenu1_2() {
		// TODO Auto-generated method stub
		System.out.println(displayText);
	}

	/*
	 * this method will take suitable action on the basis of user input this
	 */
	@Override
	public void takeActionOnFriendRequestMenu1_2(int choice, String line,
			String userName, String mailId) throws IOException {
		try {
			switch (choice) {
			case 1:
				int i = 0;
				StringTokenizer stringTokenizer = new StringTokenizer(line,
						"-,");
				String[] Tocken = new String[4];

				while (stringTokenizer.hasMoreTokens()) {
					Tocken[i] = stringTokenizer.nextToken();
					i++;
				}
				String friendName = Tocken[0];
				String friendEmailID = Tocken[1];
				OperationOnEntities operationOnEntities = new OperationOnEntities();
				operationOnEntities.acceptFriendRequest(userName, mailId,
						friendName, friendEmailID);
				operationOnEntities.removeText(userName, mailId, line);
				break;
			case 2:
				System.out.println("Request ignored");
				break;
			default:
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
