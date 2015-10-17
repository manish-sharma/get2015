/********************************************************************
 *  @author Girdhari							   					*
 *  Program to join two sorted array function join will take four   * 
 *  arguments one is  first array second is size of first array,    *
 *  third is second array, fourth is size of second array 			* 
 */
class JoinArray
{
	/*beginning of main function*/
	
	public static void main(String []args)
	{
		JoinArray jA = new JoinArray();
		int arr[] = {10,11,25,32,14,125,11};
		int arr2[] = {5,9,12,16,28,35,43,50};
		int arr4[] = new int[20];
		int arr3[] = jA.join(arr , 7 , arr2 , 7);
		for(int index: arr3)
			System.out.println(index);
	}
	
	/*end of main function*/
	
	/*starting of join function*/
	int[] join(int a[],int asize, int b[], int bsize)
	{
		int indexA=0,indexB=0,index=0;
		int c[]=new int[asize+bsize];
		while(indexA < asize && indexB < bsize) //loop to join arrays until one of two array finish
		{
			if(a[indexA] < b[indexB])
				c[index++] = a[indexA++];
			else
				c[index++] = b[indexB++];	
		}
		while(indexA < asize)				//to add rest of elements of array A
		{
			c[index++] = a[indexA++];
		}
		while(indexB < bsize )				// to add rest of elements of array B
		{
			c[index++] = b[indexB++];
		}
	return c;
	}
	
	/*end of join function*/

}
