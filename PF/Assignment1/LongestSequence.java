
public class LongestSequence 
{
	int result[]= new int[100];
	public int[] longestSequence(int a[])
	{

	
	int count = 1; int max = 1;int start=0;int last=0;


	
	for (int i = 0; i < a.length-1; i++) 
	{
	    if (a[i] < a[i + 1]) 
	    {   
	        
	        count++;
	    } 
	    else {
	        if (count > max)
	        {
	        		last=i;
	            max = count;
	        }
	        count = 1;
	        
	    }
	}
	 if (count > max)
     {
     		last=a.length-1;
         max = count;
     }
	start=last-max+1;
	System.out.println(max);
	//System.out.println(start);
	System.out.println(last);
	int counter=0;
	for(int i=start;i<=last;i++)
	{
		result[counter]=a[i];
		
	counter++;
	}
	return result;
 }
public static void main(String[] args)
{
	LongestSequence sc =new LongestSequence();
	int a[]={1,2,3,1,2,3,4,1,2,3,5,6,7,8};
	int b[]=sc.longestSequence(a);
	for(int i=0;i<b.length;i++)
	{
		
		System.out.print(" "+b[i]);
		
	}
}

}

 
