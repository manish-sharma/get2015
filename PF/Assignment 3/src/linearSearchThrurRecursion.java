import java.util.Scanner;

public class linearSearchThrurRecursion {
   /*function which implements the logic to perform linear search and uses recursive approach 
    * input array,size of array and key element which we want to search is passed as argument
    *  @author Shishir Pareek*/
	public  int linearSearch(int a[], int n, int key)
	{
	    /*if starting index is less than length then the input value of starting index is wrong*/
		if (n <1) 
	    {
	          return -1;
	    }
	    /*if key is found at n-1 index then return the position of index*/ 
		if(key == a[n-1])
	    {
	           return n - 1;
	    } 
		/*recursive call to function*/
	    return linearSearch(a, n-1, key); 
	}
	public static void main(String args[])
	{     
		 /*variable to hold size of array and key which needed to be searched*/
		 int size,key;
		 /*array to hold the values by user*/
		 int inputArray[];
		 /*variable to hold output*/
		 int output;
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter size of array");
		 size=input.nextInt();//input by user
		 inputArray=new int[size];
		 System.out.println("Enter the elements of array");
		 for(int index=0;index<size;index++)
		    {
               inputArray[index]=input.nextInt();  //function call		
		    } 
		 System.out.println("Enter the key for searching");
		 key=input.nextInt();//input by use 
		 linearSearchThrurRecursion linearSearchObject=new linearSearchThrurRecursion();
	     int position=linearSearchObject.linearSearch(inputArray, size, key);
	     if(position>=0)
	     System.out.println("Element found at"  +  (position+1));
	     else 
	     System.out.println("Element not found");
	}
}
