/*MenuItem1_2 interface
 * 
 */
package com.social.network.menu;

import java.io.IOException;

abstract interface MenuItem1_2 {
	abstract void displayFriendRequestMenu1_2();

	abstract void takeActionOnFriendRequestMenu1_2(int choice, String line,
			String userName, String mailId) throws IOException;

}
