package assignment;

import java.lang.reflect.Array;

public class joiningArray //class to join the sorted array
{
	public  int[] join(int[] a,int asize, int[] b,int bsize, int[] c)//method to join the sorted array 
	{

	    int i = 0, j = 0, k = 0;//initial values

	    while (i < asize && j < bsize )
	    {
	        if (a[i] <= b[j])       
	            c[k++] = a[i++];

	        else        
	            c[k++] = b[j++];               
	    }
	    while (i <asize)  
	        c[k++] = a[i++];


	    while (j <bsize)    
	        c[k++] = b[j++];
	   
	    return c;//return the sorted array
	}
	public static void main(String[] args) //main method
	{
		// TODO Auto-generated method stub
		joiningArray ob=new joiningArray();
		int firstArray[]={2,4,5};//first array
		int secondArray[]={2,3,4};//second array
		int[] thirdArray=new int[firstArray.length+secondArray.length];//initialize the third  array where the sorted array is stored
		int[] outputArray=ob.join(firstArray,firstArray.length,secondArray,secondArray.length,thirdArray);
		System.out.println("The joined sorted array is:");
		for(int i=0;i<outputArray.length;i++)
		{
			if(outputArray[i]!='\0')
			System.out.print(outputArray[i]);//print the sorted array
		}
		

	}

}
