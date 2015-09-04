
public class BubbleSort {
	static public int[] bubbleSort(int[] list){
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length-1-i;j++) {
				if(list[j]>list[j+1])
					swap(list,j);
			}
		}
		return list;
	}
	private static int [] swap(int[] list,int j) {
		int temp;
		temp=list[j];
		list[j]=list[j+1];
		list[j+1]=temp;
		return list;
	}
}
