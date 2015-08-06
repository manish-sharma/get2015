import java.util.*;
class ArraySort
{	
	public int[] join(int a[], int asize, int b[],int bsize, int c[])
	{
		int k=0;
		for(int i=0;i<asize;)
		{
			for(int j=0;j<bsize;)
			{
				if(a[i]<b[j])
				{
					c[k]=a[i];
					i++;
					k++;
				}
				else
				{
					c[k]=b[j];
					j++;
					k++;
				}
				if(i==asize)
				{
					for(int count=k;count<asize+bsize;count++)
					{
						c[count]=b[j];
						j++;
					}
				}
				else if(j==bsize)
				{
					for(int count=k;count<asize+bsize;count++)
					{
						c[count]=a[i];
						i++;
					}
				}
			}
		}
		return c;
	}
	public static void main(String args[])
	{
		int[] a=new int[5];
		int[] b=new int[5];
		ArraySort Ob1=new ArraySort();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[10];
		c=Ob1.join(a,5,b,5,c);
		System.out.println("Joined array is: ");
		for(int i=0;i<10;i++)
		{
			System.out.println(c[i]);
		}
	}
}