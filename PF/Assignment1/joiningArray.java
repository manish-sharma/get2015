package assignment;

import java.lang.reflect.Array;

public class joiningArray 
{
	public  int[] join(int[] a,int asize, int[] b,int bsize, int[] c) 
	{

	    int i = 0, j = 0, k = 0;

	    while (i < asize && j < bsize )
	    {
	        if (a[i] <= b[j])       
	            c[k++] = a[i++];

	        else        
	            c[k++] = b[j++];               
	    }
	    while (i <asize)  
	        c[k++] = a[i++];


	    while (j <bsize)    
	        c[k++] = b[j++];
	   
	    return c;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		joiningArray ob=new joiningArray();
		int m[]={2,3,4};
		int n[]={1,2,3};
		int[] o=new int[10];
		int[] d=ob.join(m,3,n,3,o);
		for(int i=0;i<d.length;i++)
		{
			if(d[i]!='\0')
			System.out.print(d[i]);
		}
		

	}

}
