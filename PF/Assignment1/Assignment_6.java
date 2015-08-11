package programing_fundamental;
import java.util.*;

public class Assignment_6 {
	public int[] join(int a[], int asize, int b[], int bsize, int c[])
	{
		int i=0,j=0,k=0;
		while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])
	        {
	            c[k] = a[i];
	            i++;
	        }
	        else
	        {
	            c[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a.length)
	    {
	        c[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < b.length)
	    {
	        c[k] = b[j];
	        j++;
	        k++;
	    }
	    
		
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int asize,bsize;
		int i;
		System.out.print("\n Enter 1st array size : ");
		asize=sc.nextInt();
		int a[]=new int[asize];
		System.out.print("\n Enter elements of sorted array A : ");
		for(i=0;i<asize;i++)
			a[i]=sc.nextInt();
		System.out.print("\n Enter 2nd array size : ");
		bsize=sc.nextInt();
		int b[]=new int[bsize];
		System.out.print("\n Enter Elements of sorted array B : ");
		for(i=0;i<bsize;i++)
			b[i]=sc.nextInt();
		int c[]=new int[asize+bsize];
		Assignment_6 a6=new Assignment_6();
		int result[]=a6.join(a, asize, b, bsize, c);
		System.out.print("\n Merge array is : ");
		for(i=0;i<result.length;i++)
			System.out.print(" "+result[i]);
	}

}
