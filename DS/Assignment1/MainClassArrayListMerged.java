package question2;

public class MainClassArrayListMerged 
{

	public static void main(String []args)
	{
		ArrayListMerged arrayList = new ArrayListMerged();
		arrayList.insertItem(1,	0);		
		arrayList.insertItem(2, 1);
		arrayList.insertItem(3, 2);
		arrayList.insertItem(4, 3);
		arrayList.insertItem(5, 4);
		arrayList.insertItem(6, 5);
		arrayList.insertItem(7, 6);
		arrayList.insertItem(8, 7);
		arrayList.insertItem(9, 8);
		arrayList.insertItem(10,9);
		arrayList.insertItem(11,10);
		arrayList.displayArrayList(arrayList);
		
		ArrayListMerged arrayList2 = new ArrayListMerged();
		arrayList2.insertItem(10, 0);		
		arrayList2.insertItem(11, 1);
		arrayList2.insertItem(12, 2);
		arrayList2.insertItem(13, 3);
		arrayList2.insertItem(14, 4);
		arrayList2.insertItem(15, 5);
		arrayList2.insertItem(16, 6);
		arrayList2.insertItem(170, 7);
		arrayList2.insertItem(18, 8);
		arrayList2.insertItem(19, 9);
		arrayList2.insertItem(20, 10);
		arrayList2.displayArrayList(arrayList2);		
		int array[] = new int[20];
		array = arrayList.mergeList(arrayList2);
		System.out.println();
		int sizeOfArray = array.length;
		System.out.println("Merged List is");
		for(int counter=0;counter<sizeOfArray;counter++) 
		{ 
			System.out.print(array[counter]+ " ");
		}
	}
}
