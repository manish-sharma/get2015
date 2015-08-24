package menu;

public class MenuItemNew 
{
	public void addItemsToMenuList()
	{
		Menu menuObj = new Menu();
		ActionableMenuItem actionableMenuItemObj[] = new ActionableMenuItem[4];
		actionableMenuItemObj[0] = new ActionableMenuItem("\n\n1). Book train ticket");
		actionableMenuItemObj[1] = new ActionableMenuItem("2). Generate ticket");
		actionableMenuItemObj[2] = new ActionableMenuItem("3). See updated train time table");
		actionableMenuItemObj[3] = new ActionableMenuItem("4). Exit");
		
		for (int index =0; index<actionableMenuItemObj.length; index++)
			menuObj.addMenuItem(actionableMenuItemObj[index]);
		
		menuObj.display();	
	}
}
