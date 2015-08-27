package Question1;

public class MenuItemNew 
{
	// prints main menu
	public void addItemsToMenuList()
	{
		Menu menuObj = new Menu();
		ActionableMenuItem actionableMenuItemObj[] = new ActionableMenuItem[11];
		actionableMenuItemObj[0] = new ActionableMenuItem("\n\nMenu : ");
		actionableMenuItemObj[1] = new ActionableMenuItem("1). Add an Item");
		actionableMenuItemObj[2] = new ActionableMenuItem("2). Add an item at particular location");
		actionableMenuItemObj[3] = new ActionableMenuItem("3). Retrieving the first occurrence of an item based on its given location");
		actionableMenuItemObj[4] = new ActionableMenuItem("4). Retrieving the first index of particular item");
		actionableMenuItemObj[5] = new ActionableMenuItem("5). Removing an item based on particular location");
		actionableMenuItemObj[6] = new ActionableMenuItem("6). Remove given particular item from the arraylist");
		actionableMenuItemObj[7] = new ActionableMenuItem("7). Reverse the arraylist");
		actionableMenuItemObj[8] = new ActionableMenuItem("8). Sort the elements of arraylist");
		actionableMenuItemObj[9] = new ActionableMenuItem("9). Clear the list");
		actionableMenuItemObj[10] = new ActionableMenuItem("10). Exit");
		for (int index = 0; index<actionableMenuItemObj.length; index++)
			menuObj.addMenuItem(actionableMenuItemObj[index]);
		
		menuObj.display();	
	}
	
}
