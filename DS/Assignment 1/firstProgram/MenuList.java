package firstProgram;


public class MenuList {
	MenuList()
	{
		Menu menu=new Menu();
		ActionableMenuItem item=new ActionableMenuItem("Press \n1. To add elements to array list");
		ActionableMenuItem item1=new ActionableMenuItem("2. To add elements to array list at a given position");
		ActionableMenuItem item2=new ActionableMenuItem("3. To retrieve first occurence of an element in array list");
		ActionableMenuItem item3=new ActionableMenuItem("4. To retrieve first index of particular item in the arraylist");
		ActionableMenuItem item4=new ActionableMenuItem("5. Removing an item based on particular location");
		ActionableMenuItem item5=new ActionableMenuItem("6. Remove given particular item from the arraylist ");
		ActionableMenuItem item6=new ActionableMenuItem("7. Clear the list ");
		ActionableMenuItem item7=new ActionableMenuItem("8. Reverse the arraylist");
		ActionableMenuItem item8=new ActionableMenuItem("9. To Sort the elements of arraylist");
		ActionableMenuItem item9=new ActionableMenuItem("10. To merge the elements of two arraylist");
		menu.addMenuItem(item);
		menu.addMenuItem(item1);
		menu.addMenuItem(item2);
		menu.addMenuItem(item3);
		menu.addMenuItem(item4);
		menu.addMenuItem(item5);
		menu.addMenuItem(item6);
		menu.addMenuItem(item7);
		menu.addMenuItem(item8);
		menu.addMenuItem(item9);
		menu.display();
	}

}
