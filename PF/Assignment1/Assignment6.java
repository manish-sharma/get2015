
public class Assignment6 {
	
	int[] join(int a[], int asize, int b[], int bsize, int c[])
	{
		c=new int[asize+bsize];
		int x=0,y=0,z=0;
		while(x!=asize && y!=bsize)
		{
			if(a[x]<=b[y])
			{
				c[z]=a[x];
				z++;
				x++;
			}
			else if(a[x]>=b[y])
			{
				c[z]=b[y];
				z++;
				y++;
			}
		}
		
			 if(x==asize)
			{while(y!=bsize)
			{   c[z]=b[y];
				y++;
				z++;
			}
			}
			else if(y==bsize)
			{while(x!=asize)
				{c[z]=a[x];
				x++;
				z++;
				}
			}

		
		return c;
		
		
	}
 
	

	public static void main(String [] arg)
	{
		Assignment6 obj = new Assignment6();
		int[] arr1={1,3,5,8,9};	
		int[] arr2={2,4,10};
		int[] c = new int[arr1.length+arr2.length];
		 c=obj.join(arr1,5,arr2,3,c);
		 
		 for(int i=0;i<c.length;i++)
		 {
			System.out.print(c[i]+" ");
		 }
	}
}
