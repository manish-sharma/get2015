
public class JoinTwoArray {
	public int[] joinTwoArray(int a[],int asize,int b[],int bsize,int c[])
	{
		//int c[]=new int[];
		int i=0,k=0,j=0;
		while(i<asize&&j<bsize)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
			
		}
		while(i<asize)
			c[k++]=a[i++];
		while(j<bsize)
			c[k++]=b[j++];
			
		
		return c;
	}
	public static void main(String args[])
	{
		
		/*int op[],asize=0,bsize=0,i=0;
		int a[]=new int[]{1,5,8};
		int b[]=new int[]{2,3,4};
		asize=a.length;
		bsize=b.length;
		int len=asize+bsize;
		int c[]=new int[len];
		JoinTwoArray rm=new JoinTwoArray();
		c=rm.joinTwoArray(a, asize, b, bsize,c);*/
		int op[],asize=0,bsize=0,i=0;
		int c[];
		int a[]=new int[]{1,5,8};
		int b[]=new int[]{2,3,4};{
		asize=a.length;
		bsize=b.length;
		int len=asize+bsize;
		c=new int[len];
		
		JoinTwoArray rm=new JoinTwoArray();
		c=rm.joinTwoArray(a, asize, b, bsize,c);
		}
		System.out.println("output is");
		for(i=0;i<c.length;i++)
			System.out.println(c[i]);
	  
		
	}
	
	

}
