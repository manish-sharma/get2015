import java.util.InputMismatchException;
import java.util.Scanner;
public class SortingSystem {
	static int[] list=null;
	public static void input() {
		Scanner sc=new Scanner(System.in);
		int sizeOfList=0;
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
		list=new int[sizeOfList];
		System.out.println("Enter number in list:");
		TreeSorting.addElement(list,sc);
		}catch(InputMismatchException exception) {System.out.println("Enter only integer value");System.exit(0);}
	}
	public static void output() {
		Scanner sc=new Scanner(System.in);
		int choise=0;
		try {
			while(true) {
				boolean isCorrect=false;
				while(!isCorrect) {
					System.out.println("\n1:Comperision Sorting\n2:Linear Sorting\n3:Exit");
					choise=sc.nextInt();
					if(choise==1 || choise==2 || choise==3)
						isCorrect=true;
					else {
						System.out.println("Enter correct option:");
					}
				}
				switch(choise) {
				case 1:
					if(list.length<=10) {
						System.out.println("Bubble Sort:");
						BubbleSort.bubbleSort(list);
						for(int i=0;i<list.length;i++) {
							System.out.println(list[i]);
						}
					}
					else {
						System.out.println("Quick Sort:");
						QuickSort.quickSort(list,0,list.length-1);
						for(int i=0;i<list.length;i++) {
							System.out.println(list[i]);
						}
					}
					break;
				case 2:
					int maxItem=maxItem(list);
						if(maxItem<=99) {
							System.out.println("Counting Sort:");
							CountingSort.countingSort(list,maxItem);
							for(int i=0;i<list.length;i++) {
								System.out.println(list[i]);
							}
						}
						else {
							System.out.println("Radix  Sort:");
							RadixSort.radixSort(list,maxItem);
							for(int i=0;i<list.length;i++) {
							System.out.println(list[i]);
							}
						}
					break;
				}
			}
		}catch(InputMismatchException exception) {System.out.println("Enter only integer value");}
	sc.close();
	}
	private static int maxItem(int[] list) {
		int max=list[0];
		for(int i=0;i<list.length-1;i++) {
			if(max<list[i+1])
				max=list[i+1];
		}
		System.out.println(max);
		return max;
	}
	public static void main(String args[]) {
		input();
		output();
	}
}
