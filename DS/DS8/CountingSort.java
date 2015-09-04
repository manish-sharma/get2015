public class CountingSort {
	public static int [] countingSort(int[] list,int max) {
		try {
			int counterArray[]=new int[max+1];
			int j=0;
			for(int i=0;i<list.length;i++) {
				counterArray[list[i]]=counterArray[list[i]]+1;
			}
			for(int i=0;i<counterArray.length;i++) {
				if(counterArray[i]==0)
					continue;
				else
					while(counterArray[i]!=0) {
						list[j++]=i;
						counterArray[i]--;
					}	
			}
		}catch(Exception exception){System.out.println("counting sort is not applicable for negetive numbers");}
		return list;
	}
}
