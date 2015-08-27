/*
 * interface MenuItemForStack 
 * this will be implemented by ActionableMenu of stack
 */
package com.stack.linked.list;

abstract interface MenuItemForStack {
	abstract void displayMenu();

	abstract int takeActionOnUserChoice(int userChoice);
}
