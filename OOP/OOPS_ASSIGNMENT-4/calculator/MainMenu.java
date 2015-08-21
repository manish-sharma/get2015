package com;

import com.Menu.Menu;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu=new Menu();
		
		menu.addMenuItem("1.Addition");
		menu.addMenuItem("2.Substraction");
		menu.addMenuItem("3.Multiplication");
		menu.addMenuItem("4.Division");
		menu.addMenuItem("5.Exit");
		
		menu.display();
	}

}
