package arraylist;

/** this class is use for merging the two list
 * @author Khemanshu
 *
 */
public class MergeList {

	//list1 of array list type
	ArrayList arrayListfrist = new ArrayList();
	//list2 of array list type
	ArrayList arrayListSecond = new ArrayList();

	void EntryInListFrist(int item) {
		arrayListfrist.addElement(item);
	}

	void EntryInListSecond(int item) {
		arrayListSecond.addElement(item);

	}

	public static void main(String args[]) {
		
		MergeList mergeList = new MergeList();
		ArrayList mergeLists = new ArrayList();
		
		int item;
		while (true) {
		System.out.println("\n 1. Adding an item  in frist List"
				+ "\n 2. Adding an item in second List " 
				+ "\n 3. for display first list "
				+ "\n 4. for display second list"
				+ "\n 5. merge List "
				+ "\n 6.Display  merge List" + "\n 7.Exit");
		System.out.print("\n Enter Your Choice : ");
		int choice = ArrayList.userInput();
			switch (choice) {
			case 1:
				System.out.println("Enter Element");
				item = ArrayList.userInput();
				mergeList.EntryInListFrist(item);
				break;
			case 2:
				System.out.println("Enter Element");
				item = ArrayList.userInput();
				mergeList.EntryInListSecond(item);
				break;
			case 3:
				mergeList.arrayListfrist.printAllElements();
				break;
			case 4:
				mergeList.arrayListSecond.printAllElements();
				break;
			case 5:
				mergeLists = mergeLists.mergeLists(mergeList.arrayListfrist,mergeList.arrayListSecond);
				break;
			case 6:
				System.out.println("Merge lIst is");
				mergeLists.printAllElements();
				break;
			case 7:
				System.exit(0);
				break;
			default:
			System.out.print("Enter Correct choice");
			}
		}

	}

}