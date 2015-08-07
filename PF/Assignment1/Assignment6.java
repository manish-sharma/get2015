import java.util.Scanner;


public class Assignment6
{
	/**join is a function which take two sorted array, their size and an output array as parameter and return the
	 * concatenate of the given two array.  
	 * 
	 * @param a is an array of sorted integer.
	 * @param asize is the size of array a.
	 * @param b is an array of sorted array.
	 * @param bsize is the size of b array.
	 * @param c is an array which size is equal to the sum of size of a and b respectively.
	 * @return It return a sorted integer array which consist of all the elements of array passes in parameter to function.
	 */
	public  int[] join(int[] a,int asize, int[] b,int bsize, int[] c)
	{

	    int i = 0, j = 0, k = 0;

	    while (i < asize && j < bsize)
	        if (a[i] < b[j])       
	            c[k++] = a[i++];

	        else        
	            c[k++] = b[j++];               

	    while (i < asize)  
	        c[k++] = a[i++];


	    while (j < bsize)    
	        c[k++] = b[j++];

	    return c;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements in array1");
		int n=sc.nextInt();
		int inputArray1[]=new int[n];
		System.out.println("enter the sorted elements in array one");
		for(int count=0;count<n;count++)
		{
			inputArray1[count]=sc.nextInt();
		}
		System.out.println("enter the no of elements in array two");
		int m=sc.nextInt();
		int inputArray2[]=new int[m];
		System.out.println("enter the sorted elements in array one");
		for(int count=0;count<m;count++)
		{
			inputArray2[count]=sc.nextInt();
		}
		int[] output=new int[n+m];
		Assignment6 obj=new Assignment6();
		output=obj.join(inputArray1,n,inputArray2,m,output);
		for(int count=0;count<m+n;count++)
		{
			System.out.println(output[count]);
		}
	}
}
