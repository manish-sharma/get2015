package sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
/**
 * to do radix sort, its a linear sort
 * the sorting is done on the basis of digits of elements 
 * @author Ravika
 * @since 4/9/2015
 */

public class RadixSort {

	/**
	 * to find maximum number in array
	 * @param array = to found maximum
	 * @return = maximum number in array
	 */
	
	private static int max(int[] array) {
		int max = Integer.MAX_VALUE;
		for(int a : array) {
			if(a > max ) {
				max = a;
			}
		}
		return max;
	}
	
	/**
	 * to find digits in maximum number which will be the size of digits array
	 * @param max = the maximum number in array
	 * @return = digits in maximum number
	 */
	private int digitsInMax( int max) {
		int count = 0;
		while (max != 0) {
			max /= 10;
			count++;
		}
		
		return count;
	}
	
	/**
	 * to do radix sort
	 * get maximum number and digits in it
	 * get digits of every element than store in tree map in respective bucket on the basis of i th digit and again store in the array 
	 * one by one in fifo order this will repeat again and again till rightmost digit of maximum number 
	 * @param array = to sort
	 */
	public void radixSort(int[] array) {
		Number[] numbers = new Number[array.length];
		
		//get maximum number in array
		
		int maxInArray = max(array);
		//get digits in maximum number
		
		int digitsInMax = digitsInMax(maxInArray);
		new Number().setDigitsInMax(digitsInMax);
		
		for(int index = 0; index < array.length; index++) {
			numbers[index] = new Number(array[index]);
		}
		// check one by one digits of array elements one by one and store in respective bucket
		for(int count = 0; count < digitsInMax ; count++) {
			
			//store elements of array in respective bucket
			Map<Integer, ArrayList<Number>> hashMap = new TreeMap<Integer, ArrayList<Number>>();
			for(int index = 0 ; index < numbers.length ; index++) {
					int key = numbers[index].digits[count];
					if(hashMap.containsKey(key)) {
						ArrayList<Number> bucket = hashMap.get(key);
						bucket.add(numbers[index]);
						hashMap.put(key, bucket);
					} else {
						ArrayList<Number> bucket =  new ArrayList<Number>();
						bucket.add(numbers[index]);
						hashMap.put(key, bucket);
				}
				
			}
			int index = 0;
			// save the elements again in array 
			for(Entry<Integer, ArrayList<Number>> entry : hashMap.entrySet()) {
				ArrayList<Number> list = entry.getValue();
				Iterator<Number> it = list.iterator();
				while (it.hasNext()) {
					Number number = it.next();
					array[index] = number.value;
					numbers[index] = number;
					index++;
				}
			}
		}
		
	}
}

/**
 * to store the digits of number
 * @author Ravika
 *
 */
class Number {
	private static int MaxOfDigitsMax;
	int value;
	int[] digits;
	public Number() {
		
	}
	//set digits in maximum number that will be length of digits array
	public void setDigitsInMax(int MaxOfDigitsMax) {
		Number.MaxOfDigitsMax = MaxOfDigitsMax;
	}
	public Number(int value) {
		this.value = value;
		digits = getDigits(value);
	}
	int[] getDigits(int number) {
		int[] digits = new int[MaxOfDigitsMax];
		
		int index = 0;
		while(number != 0 ) {
			digits[index] = number % 10;
			number /= 10;
			index++;
		}
		return digits;
	}
	@Override
	public String toString() {
		return "Number [value=" + value + "]";
	}
}
