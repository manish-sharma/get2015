import java.util.*;
public class Menu  {
	List<MenuItem> items = new ArrayList<>();
	private Scanner scan  = new Scanner(System.in);
	
	
	public void addMenuItem(MenuItem item){
		items.add(item);
	}

	public void display() {
		try
		{
			while (true) {
			for (MenuItem i: items )
			{
			i.display();
			}
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			
			items.get(choice-1).takeAction(choice);
			}
		}catch(IndexOutOfBoundsException ae)
		{
			System.out.println("cdfv");
			return;
		}
	
	}
}



