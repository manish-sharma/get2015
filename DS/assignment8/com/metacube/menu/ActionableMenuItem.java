package com.metacube.menu;

import com.Sorting.*;
/**
 * this class is used to implements menu items to display take user choice and perform oprations
 * @author Sumitra
 *
 */
public class ActionableMenuItem implements MenuItem{
	Action action;
	String displayText; 
	/**
	 * this method is display all menu item 
	 * @param displayText this is use object of current line to dispaly text
	 */
public ActionableMenuItem(String displayText) {
	this.displayText=displayText;
}
	@Override
	/**
	 * this method is used to display menu items
	 * override from interface MenuItem
	 */
	public void display() {
		System.out.println(displayText);
		
	}

	@Override
	/**
	 * this method override from MenuItem interface
	 * @param i this is user choice
	 * perform action according to user 
	 */
	public void takeAction(int i) {
		ComparisonSorting comparisonSorting = new ComparisonSorting();
		//LinearSorting linearSorting = new LinearSorting();
		SortingSystem sortingSystem = new SortingSystem();
		int[] arr= sortingSystem.arrayList;
		switch (i) {
		case 1:
			 comparisonSorting.sortComparison(arr);
			break;
		case 2:
			LinearSorting.sort(arr);
			break;
		case 3:
			sortingSystem.displayList();
			break;
		case 4:
			System.out.println("***Exit***");
			System.exit(0);
		
		}
		
		
		
	}

}
