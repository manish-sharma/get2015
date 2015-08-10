
public class CheckSorting {


     public int checkSorting(int a[])
     {
    	if(a[0]<a[1])
    	{
    		
    		for(int i=1;i<a.length-1;i++)
    		{
    			if(a[i]>a[i+1])
    			{
    				
    				return 0;
    				
    			}else
    			{
    				continue;
    			}
    			
    			
    			
    		}
    		
    		return 1;
    		
    	}else if(a[0]>a[1])
    	{
    		
    		for(int i=1;i<a.length-1;i++)
    		{
    			if(a[i]<a[i+1])
    			{
    				
    				return 0;
    				
    			}else
    			{
    				continue;
    			}
    			
    			
    			
    		}
    		
    		return 2;
    		
    		
    		
    		
    	}
    	 
    	 
    	return 0; 
    	 
     }



}
