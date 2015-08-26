/*
 * Adds the menu
 * @author Banwari 
 */
public class MenuNew{
	//adds the menu
	MenuNew() {
		Menu menu = new Menu();
		ActionableMenuItem item1 = new ActionableMenuItem("\nPress 1 for All Trains");
		ActionableMenuItem item2 = new ActionableMenuItem("Press 2 for Goods Trains");
		ActionableMenuItem item3 = new ActionableMenuItem("Press 3 for Passanger Trains");
		ActionableMenuItem item4 = new ActionableMenuItem("Press 4 for Exit");
		menu.addMenuItem(item1);
		menu.addMenuItem(item2);
		menu.addMenuItem(item3);
		menu.addMenuItem(item4);
		menu.display();
	}

}
