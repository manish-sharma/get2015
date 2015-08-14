package assignment3;
// program of linear array search
import java.util.Scanner;

public class Prg2a {
	private static Scanner in;
	int c=0;
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
		 Prg2a obj =new Prg2a();
		 int index=obj.linear(arr, num);
		 if(index==-1)
		 {
			 System.out.println("Number invalid");
		 }
		 else
		 {
			 System.out.println("Number you wanted to search is at "+index);  
		 }
		 
				
	 }
	 
	 //recursive function for linear search
			int linear(int arr[], int num) 
			{
				if(c!=arr.length)
				{
					if(arr[c]==num)
					{
						return (c+1);
					}
					else
					{
						c++;
						return (linear(arr,num));
					}
				}
				return -1;
			}
}
