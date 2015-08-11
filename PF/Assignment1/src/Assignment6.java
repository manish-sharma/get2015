
public class Assignment6
{
	public  int[] join(int[] a,int asize, int[] b,int bsize, int[] c) {

	    int i = 0, j = 0, k = 0;

	    while (i < asize && j < bsize)
	        if (a[i] < b[j])       
	            c[k++] = a[i++];

	        else        
	            c[k++] = b[j++];               

	    while (i < asize)  
	        c[k++] = a[i++];


	    while (j < bsize)    
	        c[k++] = b[j++];

	    return c;
	}
	
	public static void main(String args[])
	{
		int[] a={2,5,7,9,11};
		int[] b={3,4,6,8};
		int[] c=new int[a.length+b.length];
		Assignment6 obj=new Assignment6();
		c=obj.join(a,5,b,4,c);
		for(int count=0;count<c.length;count++)
		{
			System.out.println(c[count]);
		}
	}
}
