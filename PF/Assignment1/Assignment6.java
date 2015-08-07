package Assignments;

public class Assignment6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6 assign=new Assignment6();
		int a[]={1,3,5,6,8};
		int b[]={2,4,7,8,9,11,12};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<assign.join(a,a.length,b,b.length,c).length;i++)
		{
			System.out.print(assign.join(a, a.length,b,b.length,c)[i]+" ");
		}
	}
	int[] join(int a[], int asize, int b[], int bsize, int c[])
	{
		c=new int[asize+bsize];
		int i=0,j=0,k=0;
		while(i!=asize && j!=bsize)
		{
			if(a[i]<=b[j])
			{
				c[k]=a[i];
				k++;
				i++;
			}
			else if(a[i]>=b[j])
			{
				c[k]=b[j];
				k++;
				j++;
			}
		}
		
			 if(i==asize)
			{while(j!=bsize)
			{   c[k]=b[j];
				j++;
				k++;
			}
			}
			else if(j==bsize)
			{while(i!=asize)
				{c[k]=a[i];
				i++;
				k++;
				}
			}

		
		return c;
	}

	

}
