import java.util.Arrays;


public class JoinTwoSortedArray {

public  int[] join(int a[], int asize, int b[], int bsize, int c[])
	
	{
	
		int i=0,j=0,k=0;
		
		while(i<asize&&j<bsize)
		{
			if(a[i]<b[j])
			c[k++]=a[i++];
			else if(a[i]>b[j])
				c[k++]=b[j++];
			else 
			{
				c[k++]=a[i++];
				c[k++]=b[j++];
			}
				
		}
		
		while(i<asize)
			c[k++]=a[i++];
		
		
		while(j<bsize)
			c[k++]=b[j++];
		
		
		
		
		System.out.print(Arrays.toString(c));
		
		return c;
		
		
		
	}
	
}
