
public class MenuNew {
	
		MenuNew() {
			Menu menu = new Menu();
			ActionableMenuItem item = new ActionableMenuItem("Press 1 for reservation");
			ActionableMenuItem item2 = new ActionableMenuItem("Press 2 for chart");
			menu.addMenuItem(item);
			menu.addMenuItem(item2);
			menu.display();
		}


}
