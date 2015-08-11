package programing_fundamental;
import java.util.*;

public class assignment6 {
	public int[] join(int a[], int asize, int b[], int bsize, int c[])
	{
		int i,j,l;
		int k=0;
		for(i=0,j=0;i<asize&&j<bsize;i++,j++)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i];j--;
			}
			else if(b[j]<a[i])
			{
				c[k++]=b[j];i--;
			}
			else
			{
				c[k++]=a[i];
				c[k++]=b[j];
			}
		}
		if(i==asize&&j!=bsize)
		{
			for(l=j;l<bsize;l++)
				c[k++]=b[l];
		}
		else if(i!=asize&&j==bsize)
		{
			for(l=i;l<asize;l++)
				c[k++]=a[l];
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
		assignment6 a6=new assignment6();
		c=a6.join(a, asize, b, bsize, c);
		System.out.print("\n Merge array is : ");
		for(i=0;i<c.length;i++)
			System.out.print(" "+c[i]);
	}

}
