import java.util.Scanner;


import java.util.Scanner;

/*This class perform binary search using recursive approach*
 * @author Shishir Pareek
 */
public class binarySearchThruRecursion {
	/*function to perform binary search recursively.It contains array,lowerBound index,upperBound index 
	 * and key element as parameter
	 */
	 public int binarySearch(int array[],int lowerBound,int upperBound,int key )
	 {
		 /*condition to check if lowerBound exceeds upperBound then the array is over*/
		 if(lowerBound>upperBound)
		 {
			 return -1;
		 }
		 /*calculating middle element of the array*/
		 int mid=(lowerBound+upperBound)/2;
		 /*if key value is found at middle of array*/
		 if(array[mid]==key)
		 {
			  return mid;
		 }
		 /*if the middle element is greater then key element then update value of upperBound to mid-1*/
		 else if(array[mid]>key)
		 {
	       return binarySearch(array,lowerBound,mid-1,key); //recursive function call
		 }
		 /*if the middle element is less then key element then update value of lowerBound to mid+1*/
		 else if(array[mid]<key)
		 {
			 return binarySearch(array,mid+1,upperBound,key);//recursive function call
		 }
		 else 
		 {
			 return mid; 
		 }
	 }

   public static void main(String args[])
   {    
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter size of array");
	    /*input from user*/
	    int size=input.nextInt();
	    int[] inputArray=new int[size];
	    System.out.println("Enter array elements");
	    for(int index=0;index<size;index++)
	    {
	    	 inputArray[index]=input.nextInt(); //input from user
	    }
	    System.out.print("Enter the value you want to search");
	    int key=input.nextInt();
	    binarySearchThruRecursion binarySearchObject=new binarySearchThruRecursion();
	    int flag=binarySearchObject.binarySearch(inputArray, size-1, 0, key);
	    /*if flag value is one then element is found*/
	    if(flag==1)
	    {
	    	 System.out.print("Element Present");
	    	 	    	 
	    }
	    /*element is not present in array*/
	    else 
	    {
	    	 System.out.print("Element not found");
	    }
   }
}
