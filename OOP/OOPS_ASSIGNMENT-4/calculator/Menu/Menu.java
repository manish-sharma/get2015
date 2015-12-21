package com.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	List<String> items = new ArrayList<>();
	private Scanner scan  = new Scanner(System.in);
	
	MenuItem actionable=new ActionableMenuItem();

	public void addMenuItem(String item){
	
	items.add(item);
	}

	public void display() {
	   while (true) {
	     java.util.Iterator<String> itemIterator=items.iterator();
	     actionable.display("\n----MENU----");
	     
	     while (itemIterator.hasNext()) {
	     String stringObect=itemIterator.next();
	     actionable.display(stringObect);
		}
	     
	   actionable.display("Enter Your Choice : ");
	   int choice = scan.nextInt();  
	   actionable.display("Enter 1st operand : ");
	   int operand1=scan.nextInt();
	   actionable.display("Enter 2nd operand : ");
	   int operand2=scan.nextInt();
	   
	   //String i = items.get(choice - 1) ;
	   actionable.takeAction(choice, operand1,operand2);
	 }
   }
}
