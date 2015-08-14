package assignment3;

import java.util.Scanner;
//program for binary search
public class Prg2b {
	private static Scanner in;
	 public static void main(String[] args)     
	 {        
		 in = new Scanner(System.in);
		 System.out.println("Enter the size of the array: ");        
		 int size = in.nextInt();         
		 System.out.println("Enter an array of numbers: ");        
		 int[] arr = new int[size];         
		 for(int i=0; i<size; i++)
		 {
			 arr[i]=in.nextInt();
		 }
				 
		 System.out.println("Enter number you want to search: ");  
		 int num=in.nextInt();  
		 Prg2b obj =new Prg2b();
		 int start=0;
	     int end=arr.length-1;
		 int index=obj.binary(arr, num, start, end);
		 if(index>0)
		 {
			 System.out.println("Number you wanted to search is at "+(index+1));
			 
		 }
		 else
		 {
			 System.out.println("Number invalid");   
		 }
		 
	 }
	 
	 
	 //recursive function for binary search
	 int binary (int[] arr, int num, int st, int end)
	 {
		 int mid;
		 while(st<=end)
		 {
			 mid= (st+end)/2;
			 if(arr[mid]==num)
			 {
				 return mid;
			 }
			 else if(num>arr[mid])
			 {
				 return(binary(arr, num,mid+1, end));
			 }
			 else
			 {
				 return(binary(arr, num,st,mid-1));
			 } 
		 }
		 return -1;
	 }
}
