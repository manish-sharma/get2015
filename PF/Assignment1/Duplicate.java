import java.util.*;
/**
 * @author Sumitra
 * This method is to remove the redundancy fropm the array.
 */
public class Duplicate{
	 public static void main(String arg[]){
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the size of array");
		 int arraySize=scan.nextInt();
		 int input[]=new int[arraySize];
		 System.out.println("enter elements in array");
		 for(int i=0;i<arraySize;i++)
		 {
			 input[i]=scan.nextInt();
		 }
		 Duplicate a=new Duplicate();
		 for(int i=0;i<a.removeDuplicate(input).length;i++)
			 {
			 System.out.print(a.removeDuplicate(input)[i]);
			 }
		 scan.close();
	 }
		 /*
		  * this method in having a array as parameter and than we are testing in other array and than we will copy the array in other array.
		  */
	 int[] removeDuplicate(int input[])
	 {
		 int count=input.length;
		 int []arr=new int[count];
		 int i,j,k;
		 for( i=0;i<input.length;i++)
		 {
			arr[i]=input[i]; 
		}
		 for(i=0;i<input.length;i++)
		 {
			 for(j=i;j<arr.length;j++)
			 {
				 if(input[i]==arr[j])
				 {
					 if(i!=j)
					 {
						 arr[j]=-1;
					 }
					 
				 }
			 }
		 }
		 // above loop has removed all redundancy from array and replace the repeted by -1.
		 int countagain=0;
		 for(i=0;i<arr.length;i++)
		 {
			
			 if(arr[i]!=-1)
			 {
				 countagain++;
			 }
		 }
		 //Calculated the size of array to be returned.
		 int []reducedArray=new int[countagain];
		 k=0;
		 for(i=0;i<arr.length;i++)
		 {
			 if(arr[i]!=-1)
			 {
				 reducedArray[k]=arr[i];
			     k++;
			 }
		 }
		 //calculated the final array.
		 return reducedArray;
	 }
	
}
