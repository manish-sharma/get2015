/*MenuItem interface
 * 
 */
package com.social.network.menu;

import java.io.IOException;

abstract interface MenuItem {
	abstract void displayMenu();

	abstract int takeActionOnMainMenu(int userInput) throws IOException;
}
