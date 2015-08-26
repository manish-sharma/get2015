//optional program
import java.util.InputMismatchException;
import java.util.Scanner;
class BinarySearch {
	public int[] addElement(int[] list,int listSize,Scanner sc) {
		for(int i=0;i<listSize;i++)
			list[i]=sc.nextInt();
		return list;
	}
	public int getItemLocation(int[] list,int item) {
		int startingLocation=0,lastLocation=list.length-1,midLocation=(startingLocation+lastLocation)/2;
		while(startingLocation<=lastLocation && list[midLocation]!=item) {
			if(list[midLocation]<item) 
				startingLocation=midLocation+1;
			else
				lastLocation=midLocation-1;
			midLocation=(startingLocation+lastLocation)/2;
		}
		if(list[midLocation]==item)
			return midLocation+1;
		else
			return 0;
	}
}
public class MainBinarySearch {
	public static void main(String args[]) {
		BinarySearch binarySearchObject=new BinarySearch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of list");
		try {
		int listSize=sc.nextInt();
		int[] list=new int[listSize];int choise=-1;
		System.out.println("Enter item");
		list=binarySearchObject.addElement(list,listSize,sc);
			while(true) {
			System.out.println("Enter choise");
			System.out.println("1:To Search an item\n2:Exit");
				choise=sc.nextInt();
			switch(choise) {
				case 1:
					System.out.println("Enter Item to be search");
					int itemToBeSearch=sc.nextInt();
					int getValue=binarySearchObject.getItemLocation(list,itemToBeSearch);
					if(getValue==0)	
						System.out.println("Item not found");
					else
						System.out.println("Item found at "+getValue+"th location");
					break;
				case 2:
					System.exit(0);
				default:System.out.println("Please enter correct choise"); 
			}
		}
	}catch(InputMismatchException exception){System.out.println("Enter only integer value");}
}
}
