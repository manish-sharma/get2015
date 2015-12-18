import java.util.Scanner;


public class MergeSortedArray 

{ 
 static int[] join(int a[],int asize, int b[],int bsize,int c[])
  {
	int i,j,k;
	int csize=asize+bsize;
	
	j=k=0;
	
	for(i=0;i<csize;)
	{
		if(j<asize && k<bsize)
		{
			if(a[j]<b[k])
			{
				c[i]=a[j];
				j++;
			}
			else
			{
				c[i]=b[k];
				k++;
			}
			i++;
		}
		else if(j==asize)
		{
			for(;i<csize;i++)
			{
				c[i]=b[k];
				k++;
			}
		}
		else
		{
			for(;i<csize;i++)
			{
				c[i]=a[j];
				j++;
			}
		}
	}
	return c;
  }

	public static void main(String[] args) 
	{
		int length1=0,length2=0,length3=0,i;		
		
		int arr1[]={0,2,3,4,5,6,7,9};
		length1=arr1.length;
		
		int arr2[]={2,4,6,8,10};
		length2=arr2.length;
				
		length3=length1+length2;
		
		int arr3[]=new int[length3];
		
		arr3=join(arr1,length1,arr2,length2,arr3);
		
		for(i=0;i<length3;i++)
		 System.out.println(arr3[i]);

	}
	
	
}
