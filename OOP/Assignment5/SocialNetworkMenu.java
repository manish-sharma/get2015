
public class SocialNetworkMenu  {
	
		public void showMenu()
		{
			Menu menu = new Menu();
			ActionableMenuItem item1 = new ActionableMenuItem("Press 1 to view Social Netowrk");
			ActionableMenuItem item2 = new ActionableMenuItem("Press 2 to add a new Person");
			ActionableMenuItem item3 = new ActionableMenuItem("Press 3 to add an new friend");
			ActionableMenuItem item4 = new ActionableMenuItem("Press 4 to remove a Person");
			ActionableMenuItem item5 = new ActionableMenuItem("Press 5 to search an Person by name");
			ActionableMenuItem item6 = new ActionableMenuItem("Press 6 to remove a Friend");
			ActionableMenuItem item7 = new ActionableMenuItem("Press 7 to exit");
			
			menu.addMenuItem(item1);
			menu.addMenuItem(item2);
			menu.addMenuItem(item3);
			menu.addMenuItem(item4);
			menu.addMenuItem(item5);
			menu.addMenuItem(item6);
			menu.addMenuItem(item7);
			menu.display();
		}

}
