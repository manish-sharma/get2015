
public class MenuForMakePayment {
	public MenuForMakePayment() {
		Menu menu = new Menu();
		ActionableMenuItemForMakePayment item = new ActionableMenuItemForMakePayment("Press 1 for Credit/Debit Card");
		ActionableMenuItemForMakePayment item2 = new ActionableMenuItemForMakePayment("Press 2 for cash");
		ActionableMenuItemForMakePayment item3 = new ActionableMenuItemForMakePayment("Press 3 for net banking");
		menu.addMenuItem(item);
		menu.addMenuItem(item2);
		menu.addMenuItem(item3);
		menu.display();
	}
}
