import java.util.Scanner;
/*This class performs quicksort recursively*/
public class quicksortThruRecursion {
   /*this functions partitons the array into smaller array so as to perform sorting among them using approach of
    * divide and conquor.Input array,left index and right index is passed as argument*/
	public int partition(int inputArray[],int left,int right)
	{
		 int pivotElement=inputArray[left];//pivot element is first choosed as leftmost element
		 while(true)//infinite loop
		 {
			 /*this loop shifts the position toward right*/
			 while(inputArray[left]<pivotElement)
				 left++;
			 /*this loop shifts the position toward left*/
			 while(inputArray[right]>pivotElement)
				 right--;
			 /*this condition checks that if left index is less than value at right index than the subarray is  
			  * sorted and hence it sort is using swap*/
			 if(left<right)
			 {
				 int tmeporaryVariable=inputArray[right];
				 inputArray[right]=inputArray[left];
				 inputArray[left]=tmeporaryVariable;
			 }
			 /*the input array is already sorted and hence return its rightmost index*/
			 else 
				 
				 return right;
		 }  
	}
	/*recursive function to sort the array.It takes array,leftElement and rightElement as argument */
	public int[] quicksortRecursive(int inputArray[],int leftElement,int rightElement)
	{
		/*if left index is less than right index than partition the array till it become sorted*/
		if(leftElement<rightElement)
		{
			int pivotElement1=partition(inputArray, leftElement, rightElement); //function call for partition the array
			/*this condition check if the pivot element index is greater than 1 then it call the function recursively to 
			 * sort the array till right index of array=pivotElement-1*/ 
			if(pivotElement1>1)
				quicksortRecursive(inputArray,leftElement,pivotElement1-1); //function recursive call
			/*this condition checks if the value of index after pivot element index is less than the rightmost element index 
			then it call the function till pivotElement=rightElement*/
			 if(pivotElement1+1<rightElement)
				quicksortRecursive(inputArray,pivotElement1+1,rightElement); //function recursive call
		}
	       return inputArray;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of array");
		int size=input.nextInt();//size of array by user
		int[] inputArray=new int[size];
		System.out.println("Enter array Elements");
		for(int index=0;index<size;index++)
		{
			inputArray[index]=input.nextInt(); //input by user for array
		}
		quicksortThruRecursion quicksortObject=new quicksortThruRecursion();
		quicksortObject.quicksortRecursive(inputArray, 0, size-1); //function call
		for(int index1=0;index1<size;index1++)
		{
			 System.out.print(inputArray[index1] + " ");
		}
	}
}
