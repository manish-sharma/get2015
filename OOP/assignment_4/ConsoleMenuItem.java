package assignmentOOP_3;

public class ConsoleMenuItem {
	/**
	 * This function sets the menu
	 */
	public void setMenu()
	{
		String menu[]={"1. Passenger Trains Chart","2. Goods Trains Chart","3. Train Reservation","4. Exit"};
		Menu m=new Menu();
		for (String s : menu)
		{
			m.addMenuItem(s);
		}
		
	}

}
