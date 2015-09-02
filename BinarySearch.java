package com;
import java.util.*;
/**
 * this class is to binary search
 * @author Sumitra
 *
 */
public class BinarySearch {
	
	                static Scanner sc=new Scanner(System.in);
		/**
		 * main method of class binary search
		 * @param args
		 * it take array to binary search sort array and then perform binary search 
		 * print the index at which array element found
		 */
	public static void  main(String args[]) {
			
			                     int number = 0,high=0;
			                     int [] array = null;
		             	         List<Integer> list = new ArrayList<Integer>();
					             System.out.println("Enter Array Size");
				        while(!sc.hasNextInt()){
				        	     System.out.println("Enter Integer value"); 
					             sc.next();
				                 }
				               high = sc.nextInt();
				               array=new int[high];
					           System.out.println("Enter Array ");
					     for(int i=0;i<high;i++){
					    
					    while(!sc.hasNextInt()){
				        	     System.out.println("Enter Integer value"); 
					             sc.next();
				                 }
						      list.add(sc.nextInt());
					       }
					list.sort(null);

					int index=0;
					for (int element : list) {
						array[index]=element;
						index++;
					}
			
			                    System.out.println(" Enter  Number ");
			           while(!sc.hasNextInt()){
			        	        System.out.println("Enter Integer value"); 
				                sc.next();
			                 }
			                    number=sc.nextInt();
					
	                     BinarySearch binarySearch= new BinarySearch();
			
			             int out=binarySearch.binarySearch(array,number,high-1,0);
		           	if(out!=-1)
		               	 System.out.println(" Number at position =" + (out+1));
			         else
				         System.out.println(" Number is not persent in array");
	       	}
		/**
		 * 
		 * @param array array of elements
		 * @param number to be searched into array
		 * @param high highest index of array
		 * @param low lowest index of array
		 * @return return index if element found  else return -1
		 */
public int binarySearch(int [] array,int number ,int high,int low)
		{
			
			if(low>high)
			{return -1;
			// condition at element not found in array
			}
			else{
			int mid=(high+low)/2; 
			// calculate middle index of array
			 if(number>array[mid]){
				 // condition if element greater then middle element then call again with next half array
				
				return binarySearch(array,number,high,mid+1);
			 }
			 // middle is not zero
			else if(mid>0 && array[mid-1] >= number){
				// if middle element is less then or equal to element past of middle then call first half of array
			return binarySearch(array,number,mid-1,low);
			}
			else if( number==array[mid]){
				// element match with middle element
				return mid;
			}
			}
			return -1;
			
	}

	}

