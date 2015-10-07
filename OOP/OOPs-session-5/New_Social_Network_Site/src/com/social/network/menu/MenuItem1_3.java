/*MenuItem1_3 interface
 * 
 */
package com.social.network.menu;

import java.io.IOException;

abstract interface MenuItem1_3 {
	abstract void displayOperationMenu1_3();

	abstract void takeActionOnOperationMenu1_3(int choice, String userName,
			String mailId) throws IOException;

}
