/*
 * This is the main class for trying arrayList class
 * @author Banwari kevat
 */
public class ArrayListMain {

	public static void main(String [] argumnet) {
		//list1 creation
		ArrayList arraylist1 = new ArrayList(2);
		//list2 creation
		ArrayList arraylist2 = new ArrayList(2);
		
		arraylist1.addElement(23);
		arraylist1.addElement(87);
		arraylist1.addElement(34);
		arraylist1.addElement(99);
		
		arraylist2.addElement(11);
		arraylist2.addElement(10);
		arraylist2.addElement(50);
		arraylist2.addElement(75);
		
		System.out.println("List1 is :");
		int [] list1=arraylist1.getArrayList();
		for(int i: list1) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		System.out.println("List2 is :");
		int [] list2=arraylist2.getArrayList();
		for(int i: list2) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n\nList1 after adding List2 to List1: ");
		arraylist1.addList(arraylist2);
		list1=arraylist1.getArrayList();
		for(int i: list1) {
			System.out.print(i+" ");
		}
		
		
		
	}
}
