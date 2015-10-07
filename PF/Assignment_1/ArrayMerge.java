
public class ArrayMerge {

	 public int[] joinArray(int a[],int asize,int b[],int bsize,int c[])
	 {
		  int k1=0;
			for(int i1=0;i1<asize;)
			{
				for(int j1=0;j1<bsize;)
				{
					if(a[i1]<b[j1])
					{
						c[k1]=a[i1];
						i1++;
						k1++;
					}
					else
					{
						c[k1]=b[j1];
						j1++;
						k1++;
					}
					if(i1==asize)
					{
						for(int counter=k1;counter<asize+bsize;counter++)
						{
							c[counter]=b[j1];
							j1++;
						}
					}
					else if(j1==bsize)
					{
						for(int counter=k1;counter<asize+bsize;counter++)
						{
							c[counter]=a[i1];
							i1++;
						}
					}
				}
			}
			return c;
		}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7};
		int b[]={11,12,13,14,15,16};
		int asize=a.length;
		int bsize=b.length;
		int c[]=new int[asize+bsize];
		ArrayMerge merge=new ArrayMerge();
		int output_array[]=merge.joinArray(a, asize, b, bsize, c);
		for(int i=0;i<output_array.length;i++)
		{
			System.out.print(output_array[i]);
		}
	}
}

