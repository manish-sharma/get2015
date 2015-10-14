package advanceds;

/**This class is use to access list class through console.
 * @author Khemanshu
 *
 */
public class ListUse {

	public static void main(String[] args) {
		List lists = null;
		int choice = 0;
		while (choice != 5) {
			Util.displayMenueForList();
			choice = Util.userInput();
			switch (choice) {
			case 1:
				Util.print("Please Enter list Elements in the form of String ");
				String element = Util.userInputForString();
				lists = new List(element);
				lists.insert(lists.root);
				break;
			case 2:
				if (lists != null)
					Util.print("Maximum element is ->"
							+ lists.max(lists.root, -123232));
				else
					Util.print("List is Empty");
				break;
			case 3:
				if (lists != null)
					Util.print("Sum of all Elements is ->"
							+ lists.sumOfelements(lists.root, 0));
				else
					Util.print("List is Empty");
				break;

			case 4:
				if (lists == null)
					Util.print("List is Empty");
				else {
					Util.print("Search an Element");
					int search = Util.userInput();
					if (lists.search(lists.root, search, false))
						Util.print("Element in list");
					else
						Util.print("Element not found");
				}
				break;
			case 5:
				if (lists != null) {
					Util.print("List is ->");
					lists.display(lists.root);
				} else
					Util.print("List is Empty");

			case 6:
				choice = 6;
				break;
			default:
				Util.print("Please Enter correct choice.");
			}
		}
	}
}
