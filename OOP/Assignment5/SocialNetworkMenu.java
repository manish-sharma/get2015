package SocialNetwork;
public class SocialNetworkMenu  {
	
		public void showMenu()
		{
			Menu menu = new Menu();
			ActionableMenuItem item1 = new ActionableMenuItem("Press 1 to view Social Netowrk");
			ActionableMenuItem item2 = new ActionableMenuItem("Press 2 to getRecords of all nodes");
			ActionableMenuItem item3 = new ActionableMenuItem("Press 3 to add a new node");
			ActionableMenuItem item4 = new ActionableMenuItem("Press 4 to add an edge");
			ActionableMenuItem item5 = new ActionableMenuItem("Press 5 to remove a node");
			ActionableMenuItem item6 = new ActionableMenuItem("Press 6 to search an entity by name");
			ActionableMenuItem item7 = new ActionableMenuItem("Press 7 to remove an edge netween two nodes");
			ActionableMenuItem item8 = new ActionableMenuItem("Press 8 to exit");
			
			menu.addMenuItem(item1);
			menu.addMenuItem(item2);
			menu.addMenuItem(item3);
			menu.addMenuItem(item4);
			menu.addMenuItem(item5);
			menu.addMenuItem(item6);
			menu.addMenuItem(item7);
			menu.addMenuItem(item8);
			menu.display();
		}

}
