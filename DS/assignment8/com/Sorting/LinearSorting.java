package com.Sorting;


import java.util.*;
import java.util.Map.Entry;
/**
 * this class is used to linear sort perform on given array 
 * @author Sumitra
 *
 */
public class LinearSorting extends SortingSystem{
	/**
	 *  this method use to sort array accordingly as good for array to be sorted
	 *  if items  less than 99 then it perform counting sort
	 *  else it perform radix sort
	 * @return 
	 */
      public static int[] sort(int [] arrayList) {
	                                   int max=0;
	
	               for(int i=0;i < arrayList.length;i++){
	                    if(arrayList[i]>max)
		                               max = arrayList[i];
	                                      }
	                if(max<=99){
		
		                             arrayList=  countingSort(max,arrayList);
		                           	   flag =2;
	                            }
	                else {
	                             	arrayList=  radixSort(arrayList);
		                              flag =3;
	                     }
	                return arrayList;
             }
      /**
       *  this method use to perform counting sort
       * @param max max value in array 
       */
         private static int[] countingSort(int max,int[] arrayList) {
	                                   int [] arrayCount= new int[max+1];
	                     for(int i=0;i<arrayList.length;i++){
		                      if(arrayCount[arrayList[i]] == 0)
		                              arrayCount[arrayList[i]]=1;
		                       else{
			                          arrayCount[arrayList[i]]++;
		                           }
	                       }
	                                   int index =0;
	                     for(int j=0;j<=max;j++){
	                      	if(arrayCount[j] !=0){
		             	for(int k =0;k<arrayCount[j];k++){
	                          		arrayList[index] =j;
			                        index++;
			                      }
	                     	}
	               }
	                     return arrayList;
             }

/**
 * calculate max value
 * @param array array to be sorted
 * @return max value in array
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
 * this is to calculate digits in max 
 * @param max return no of digits in max value of array
 * @return
 */
               private static int digitsInMax( int max) {
	                         int count = 0;
	                         while (max != 0) {
		                        max /= 10;
		                          count++;
	                          }
	
	                           return count;
                             }
               /**
                * this perform radix sort 
                * @param array take array as a  input given by user to sort
                */
     public static int [] radixSort(int[] array) {
	                           Number[] numbers = new Number[array.length];
	
	                           int maxInArray = max(array);
	                           int max = digitsInMax(maxInArray);
	                           new Number().setMaxOfDigitsMax(max);
	                  for(int index = 0; index < array.length; index++) {
	                           numbers[index] = new Number(array[index]);
	                        }
	                   for(int count = 0; count < max ; count++) {
		
		                      Map<Integer, ArrayList<Number>> hashMap = new TreeMap<Integer, ArrayList<Number>>();
	               	for(int index = 0 ; index < numbers.length ; index++) {
			        	      int key = numbers[index].digits[count];
				     if(hashMap.containsKey(key)) {
					          ArrayList<Number> value = hashMap.get(key);
					          value.add(numbers[index]);
					          hashMap.put(key, value);
				             }
				     else {
					         ArrayList<Number> value =  new ArrayList<Number>();
					         value.add(numbers[index]);
					         hashMap.put(key, value);
			             }
			
		                    }
		                    int index = 0;
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
	                   return array;
     	   }
      
    }


/**
 * this class use to perform operation on numbers as  digits of that particular number
 * @author Sumitra
 *
 */
     class Number {
                         private static int MaxOfDigitsMax;
                         int value;
                         int[] digits;
               public Number() {
	
                                  }
               /**
                * take max value
                * @param MaxOfDigitsMax
                */
                public void setMaxOfDigitsMax(int MaxOfDigitsMax) {
	                      Number.MaxOfDigitsMax = MaxOfDigitsMax;
                         }
                /**
                 * this take value of number into digits
                 * @param value
                 */
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
/**
 * convert in to string to print output
 */
public String toString() {
	return "Number [value=" + value + "]";
}
}

