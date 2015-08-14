package priyamvada;
import java.util.Scanner;
/*Program to merge two sorted arrays*/
class Program4
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int asize=0 ,bsize=0;
		 System.out.println("enter size of array1 ");
		 asize=in.nextInt();
		int a[] = new int[asize]; 
		
		int i;
		
		 System.out.println("enter elements of array1");
		 
		 for(i=0; i<asize; i++)
		 {
			 a[i]=in.nextInt();
		 }
		 System.out.println("enter size of array2 ");
		 bsize=in.nextInt();
		 int b[] = new int[bsize]; 
			
		
		
 System.out.println("enter elements ofarray2");
		 
		 for(i=0; i<bsize; i++)
		 {
			 b[i]=in.nextInt();
		 }
		 int c[] = new int[asize+bsize];
		Program4 obj=new Program4();
	int[] d=obj.merge( a, asize, b,  bsize, c);
	
	System.out.println("resultant array is");
	for(i=0; i< asize+bsize; i++)
	{
		System.out.println(d[i]);
	}
	}
	
	int[] merge(int a[], int asize, int b[], int bsize,int c[])
	{
		int max= asize + bsize;
		int i=0, j = 0, k=0;
		 
		
			while(i!=asize && j!=bsize)
			{
			if(a[i]>b[j])
			{
				c[k]=b[j];
				k++;
			j++;
			}
			else if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else if(a[i]==b[j])
			{
				c[k]=a[i];
				i++;
				j++;
				k++;
			}
			}
			if(i==asize)
				while(j!=bsize)
				{
					c[k]=b[j];
					j++;
					k++;
				}
			if(j==bsize)
				while(i!=asize)
				{
					c[k]=a[i];
					i++;
					k++;
				}
			
			return c;
				
}}