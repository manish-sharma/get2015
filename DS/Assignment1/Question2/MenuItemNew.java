package Question2;

public class MenuItemNew 
{
	// prints main menu
	public void addItemsToMenuList()
	{
		Menu menuObj = new Menu();
		ActionableMenuItem actionableMenuItemObj[] = new ActionableMenuItem[6];
		actionableMenuItemObj[0] = new ActionableMenuItem("\n\nMenu : ");
		actionableMenuItemObj[1] = new ActionableMenuItem("1). Add items in list 1");
		actionableMenuItemObj[2] = new ActionableMenuItem("2). Add items in list 2");
		actionableMenuItemObj[3] = new ActionableMenuItem("3). Merge items of both lists");
		actionableMenuItemObj[4] = new ActionableMenuItem("4). Exit");
		actionableMenuItemObj[5] = new ActionableMenuItem("\nEnter choice : ");
		for (int index = 0; index<actionableMenuItemObj.length; index++)
			menuObj.addMenuItem(actionableMenuItemObj[index]);
		
		menuObj.display();	
	}
	
}