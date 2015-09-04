import java.util.ArrayList;
class RadixSort {
	public static int[] radixSort(int[] list, int maxNumber){
		try {
			int exp = 1;//10^0;
			int maxDigits=getMaxDigits(maxNumber);
			for(int i =0; i < maxDigits; i++) {
				ArrayList<Integer> bucketList[] = new ArrayList[10];
				for(int k=0; k < 10; k++) {
					bucketList[k] = new ArrayList<Integer>();
				}
				for(int j =0; j < list.length; j++)	 {
					int number = (list[j]/exp)%10;
					bucketList[number].add(list[j]);
				}
				exp =exp*10;
				int index =0;
				for(int k=0; k < 10; k++) {
					for(int num: bucketList[k]) {
						list[index] = num;
						index++;
					}
				}
			}
		}catch(Exception exception){System.out.println("counting sort is not applicable for negetive numbers");}
		return list;
	}
		public static int getMaxDigits(int maxNumber) {
			int count=0;
			while(maxNumber>0) {
				count++;
				maxNumber=maxNumber/10;
			}
			return count;
		}
	}