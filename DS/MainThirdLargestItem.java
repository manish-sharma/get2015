//optional program
import java.util.Scanner;
class ThirdLargestItem {
	public int[] addElement(int[] list,int listSize,Scanner sc) {
		for(int i=0;i<listSize;i++)
			list[i]=sc.nextInt();
		return list;
	}
	public int getThirdLargest(int[] list) {
		for(int i=0;i<list.length;i++) {
		for(int j=0;j<list.length-1-i;j++) {
			if(list[j]>list[j+1]) {
				int swapVariable;
				swapVariable=list[j];
				list[j]=list[j+1];
				list[j+1]=swapVariable;
				}
			}
		}
		int counter=0,thirdLargest=list[0];
		for(int i=0;i<list.length-1;i++) {
			if(list[i]<list[i+1]) {
				if(counter==2)
					break;
				else {
					counter++;
					thirdLargest=list[i+1];
				}
			}
		}
		if(counter==2)
			return thirdLargest;
		else
			return -1;
	}
}
public class MainThirdLargestItem {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int listSize;
		ThirdLargestItem thirdLargestItemObject=new ThirdLargestItem();
		System.out.println("Enter size of list");
		listSize=sc.nextInt();
		if(listSize<3) {
			System.out.println("Minimum size is three");
			System.exit(0);
		}
		int[] list=new int[listSize]; 
		System.out.println("Enter item");
		list=thirdLargestItemObject.addElement(list,listSize,sc);
		int thirdLargest=thirdLargestItemObject.getThirdLargest(list);
		if(thirdLargest<0)
			System.out.println("No third largest item");
		else
			System.out.println("Third largest item is "+thirdLargest);
	}
}