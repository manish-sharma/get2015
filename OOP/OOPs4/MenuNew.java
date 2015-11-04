
public class MenuNew
{
	
	MenuNew() 
	{
		Menu menu = new Menu();
		ActionableMenuItem feedback = new ActionableMenuItem("1. Give Feedback");
		ActionableMenuItem pecentageDistrebution = new ActionableMenuItem("2. Total Percentage Distribution");
		ActionableMenuItem finalOutput = new ActionableMenuItem("3. Final Output");
		ActionableMenuItem exit = new ActionableMenuItem("4. Exit");
		menu.addMenuItem(feedback);
		menu.addMenuItem(pecentageDistrebution);
		menu.addMenuItem(finalOutput);
		menu.addMenuItem(exit);
		menu.display();
	}

}
