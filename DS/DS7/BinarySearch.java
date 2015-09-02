import java.util.InputMismatchException;
import java.util.Scanner;
//class to search an item using binary search
public class BinarySearch {
	static int result=-1;  //result used to hold the result
	//method to add element in list
	private static int [] addElement(int[] list,Scanner sc) {
		try {
			for(int i=0;i<list.length;i++) {
				list[i]=sc.nextInt();
			}
		}catch(InputMismatchException exception) {
			System.out.println("Enter only Integer value");
		}
		return list;
	}
	//method to find an item
	public static int searchItem(int item,int[] list,int startIndex,int lastIndex) {
		int midIndex=(startIndex+lastIndex)/2;
			if(list.length==0)  //if length is zero then return -1
				return -1;
			else if(startIndex>lastIndex)
				return result;
			else if(list[midIndex]==item) { //to check if another item is available left side or not
				result=midIndex+1;
				searchItem(item, list,startIndex,midIndex-1);
			}
			else if(list[midIndex]>item)
					searchItem(item, list,startIndex,midIndex-1);
			else if(list[midIndex]<item)
					searchItem(item, list,midIndex+1,lastIndex);
		return result;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sizeOfList=0,isItemFound=-1;
		boolean isPositive=false;
		try {
			while(!isPositive) {
				System.out.println("Enter size of array");
				sizeOfList=sc.nextInt();
				if(sizeOfList<=0) {
					System.out.println("Enter only positive value");
				}
				else {
					isPositive=true;
				}
			}
		}catch(InputMismatchException exception){System.out.println("Enter only Integer value");return;}
		int[] list=new int[sizeOfList];
		System.out.println("Enter Item in list");
		BinarySearch.addElement(list,sc);
		System.out.println("Enter item to be search");
		try {
			int item=sc.nextInt();
			isItemFound=BinarySearch.searchItem(item,list,0,list.length-1);
		}catch(InputMismatchException exception){System.out.println("Please Enter only integer value");return;}
		if(isItemFound==-1) 
			System.out.println("Item not found");			
		else
			System.out.println("Item found at "+isItemFound);
		}
	}

