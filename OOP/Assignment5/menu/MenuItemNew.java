package menu;

public class MenuItemNew 
{
	// prints main menu
	public void addItemsToMenuList()
	{
		Menu menuObj = new Menu();
		ActionableMenuItem actionableMenuItemObj[] = new ActionableMenuItem[4];
		actionableMenuItemObj[0] = new ActionableMenuItem("\n\nMenu : ");
		actionableMenuItemObj[1] = new ActionableMenuItem("1). Sign Up");
		actionableMenuItemObj[2] = new ActionableMenuItem("2). Log In");
		actionableMenuItemObj[3] = new ActionableMenuItem("3). Exit");
		
		for (int index = 0; index<actionableMenuItemObj.length; index++)
			menuObj.addMenuItem(actionableMenuItemObj[index]);
		
		menuObj.display();	
	}
	
	// prints sub main menu
	public void addItemsToSubMenuList()
	{
		Menu menuObj = new Menu();
		ActionableMenuItem actionableMenuItemObj[] = new ActionableMenuItem[3];
		actionableMenuItemObj[0] = new ActionableMenuItem("\nSign Up : ");
		actionableMenuItemObj[1] = new ActionableMenuItem("1). Person");
		actionableMenuItemObj[2] = new ActionableMenuItem("2). Organisation");
		
		for (int index = 0; index<actionableMenuItemObj.length; index++)
			menuObj.addMenuItem(actionableMenuItemObj[index]);
		
		menuObj.display();	
	} 
	
	// prints sub menu of sub menu of main menu
	public void addSubItemsToSubMenuList()
	{
		Menu menuObj = new Menu();
		ActionableMenuItem actionableMenuItemObj[] = new ActionableMenuItem[7];
		actionableMenuItemObj[0] = new ActionableMenuItem("\nMenu :");
		actionableMenuItemObj[1] = new ActionableMenuItem("1). Add friend");
		actionableMenuItemObj[2] = new ActionableMenuItem("2). Remove friend");
		actionableMenuItemObj[3] = new ActionableMenuItem("3). Search friend");
		actionableMenuItemObj[4] = new ActionableMenuItem("4). Delete account");
		actionableMenuItemObj[5] = new ActionableMenuItem("5). Display whole social network");
		actionableMenuItemObj[6] = new ActionableMenuItem("6). Logout");
		
		for (int index = 0; index<actionableMenuItemObj.length; index++)
			menuObj.addMenuItem(actionableMenuItemObj[index]);
		
		menuObj.display();	
	}
	
}
