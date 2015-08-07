public class Assignment6
{
	public  int[] join(int[] a,int asize, int[] b,int bsize, int[] c) 
	{

	    int i = 0, j = 0, k = 0;

	    while (i < asize && j < bsize)
	    {
	        if (a[i] < b[j])       
	            c[k++] = a[i++];

	        else        
	            c[k++] = b[j++];               

	    }
	    while (i < asize)  
	        c[k++] = a[i++];


	    while (j < bsize)    
	        c[k++] = b[j++];
	    
	    return c;
	}
	public static void main(String args[])
	{
		
	}
}
