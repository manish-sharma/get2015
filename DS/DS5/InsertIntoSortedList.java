import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
//class to add an element in link list in sorted manner
class SortedList {
	public LinkedList<Integer> getSortedList(int index,int nodeInformation,LinkedList<Integer> linkList) {
		if(linkList.size() == 0) {//if list is empty then add first
			linkList.addFirst(nodeInformation);
		}
		else if(linkList.get(index)>=nodeInformation) {//if it found an item which is greater then current node information
			linkList.add(index, nodeInformation);
		}
		else if(index==linkList.size()-1) {//if the current node information is largest
			linkList.add(index+1, nodeInformation);
		}
		else {//recursive method
			getSortedList(index+1, nodeInformation, linkList);
		}
		return linkList;
	}
}
public class InsertIntoSortedList {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int choise=0;
		LinkedList<Integer> linkList=new LinkedList<Integer>();
		try {
			do {
				System.out.println("\n1:To add an item\n2:exit");//for menu
				System.out.println("Enter choise");
				do {
					while(!sc.hasNextInt()) {
						System.out.println("Enter only Integer value");
					}
					choise=sc.nextInt();
				}
				while(choise<0 || choise>3);
				switch(choise) {
				case 1:
					SortedList sortedListObject=new SortedList();
					System.out.println("Enter item");
					int nodeInformation=sc.nextInt();
					System.out.println("Sorted list is"+sortedListObject.getSortedList(0,nodeInformation,linkList));
					break;
				case 2:
					System.exit(0);
				}
			}while(true);
		}catch(InputMismatchException exception){System.out.println("Enter only Integer value");}
		sc.close();
	}
}
