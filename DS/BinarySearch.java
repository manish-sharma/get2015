import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * class to search the left most occurrence of the key value in the array
 * @author Ankur
 * @since 02-09-2015
 */

public class BinarySearch {
	/**
	 * to find the left most occurrence of the key element
	 * @param key........ value to be found
	 * @param inpurArray.. user array
	 * @param lowerIndex... lower index value of the array
	 * @param higherIndex.. higher index value of the array
	 * @return... if value is find then it returns middleIndex value else it returns -1
	 */

	public int binarySearch(int key, int[] inputArray, int lowerIndex, int higherIndex) {
		/**
		 * if lower Index is greater than HigherIndex it means that key value is not present in the inputArray
		 */
		if (lowerIndex > higherIndex) {
			return -1;
		}
		int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
		/**
		 * if key value is smaller than value at middleIndex then it call method recursively 
		 * lowerIndex now becomes middleIndex value increment by 1
		 */
		if ( inputArray[middleIndex] < key) {
			return binarySearch(key, inputArray, middleIndex+1, higherIndex);
		} 
		/**
		 * if middleIndex is greater than zero and the value at middleIndex greater or equals to key value then it call method recursively 
		 * higherIndex now becomes middleIndex value decrement by 1
		 */

		else if (middleIndex > 0 && inputArray[middleIndex-1] >= key) {
			return binarySearch(key, inputArray, lowerIndex, middleIndex-1);
		} 
		/**
		 * if the value at middleIndex equals to the key value 
		 * @return ... middle index
		 */
		else  if(inputArray[middleIndex] == key) {
			return middleIndex;
		}
		else{
			return -1;
		}
	}



	public static void main(String args[]) {
		BinarySearch binaryObject = new BinarySearch();//class object
		try{
			List<Integer> userArrayList = new ArrayList<Integer>();//list add elements
			Scanner scan = new Scanner(System.in);
			int flag = 0;
			do{
				System.out.println("how many elements you want to enter:");
				int totalElements = scan.nextInt();

				if(totalElements != 0){
					System.out.println("enter the array:");
					int[] inputArray = new int[totalElements];
					/**
					 * add elements in the ArrayList
					 */
					for(int i = 0;i<totalElements;i++){
						userArrayList.add(scan.nextInt());
					}
					userArrayList.sort(null);//sort the list in the ascending order
					int i = 0;
					/**
					 * convert the list into Array
					 */
					for (int value : userArrayList) {
						inputArray[i] = value;
						i++;
					}

					System.out.println("enter value to be found");
					int value = scan.nextInt();
					int index = binaryObject.binarySearch(value, inputArray, 0, inputArray.length - 1);  //method calling
					if(index != -1)
						System.out.println("the left most occurence of the element is at index:" + index);
					else
						System.out.println("value is not present");
					flag = 1;
					scan.close();
				}
				else{
					flag = 0;
					System.out.println("there is no values in array so again enter the elements");
				}
			}while(flag!=1);
		}

		catch(Exception e){
			System.out.println("enter only integer values");
		}

	}

}
