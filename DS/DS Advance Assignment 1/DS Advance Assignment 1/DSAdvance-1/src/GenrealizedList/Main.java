package GenrealizedList;
/**This class implements the main method and calls the various 
 * method for insert,display,sum of all the elements in the list
 * @author Shishir 
 *
 */
public class Main {
	/**Main function
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new List("((251,3),5)");
		System.out.println(list.list);
		list.insert(list.root);
		list.display(list.root);
		// list.sumOfelements(list.root);
		System.out.println(list.search(list.root, 31, false));
		System.out.println("sum of elements is ->"
				+ list.sumOfelements(list.root, 0));

		System.out.println("sum of elements is ->"
				+ list.max(list.root, -1275867));
	}
}
