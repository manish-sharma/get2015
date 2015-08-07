package JoinArray;

public class JoinArray 
{
	public static void main(String args[])
	{
		
	
	}
	int[] join(int a[], int asize, int b[], int bsize)
	{
		int c[]=new int[asize+bsize];
		int aIndex=0,bIndex=0,cIndex=0;
		while(aIndex<asize&&bIndex<bsize)
		{
			if(a[aIndex]<=b[bIndex])
			{
				c[cIndex]=a[aIndex];
				aIndex++;
			}
			else
			{
				c[cIndex]=b[bIndex];
				bIndex++;
				
			}
			cIndex++;
			
		}
		while(aIndex<asize)
		{
			c[cIndex++]=a[aIndex++];
		}
		while(bIndex<bsize)
		{
			c[cIndex++]=b[bIndex++];
		}
		return c;
	}

}
