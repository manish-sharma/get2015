package anshitaarya;

public class prg2 {
	 public static int[] removeDuplicates(int[] duplicate){
         int l= duplicate.length;
         int i,j,m=1,count;
        
         int[] dup= new int[l];
         dup[0]=duplicate[0];
         for(i=1;i<l;i++)
         {
        	 count=0;
        	for(j=0;j<i;j++)
        	{
        		if(duplicate[i]==dup[j])
        		
        	{
        			count++;
        	}
        	}
        	if(count==0)
        	{
        			dup[m]=duplicate[i];
        			m++;
        		}
        	}
         
         
	        return dup;
	    }
	     
	    public static void main(String args[]){
	    	prg2 obj=new prg2();
	        int[] duplicate = {2,5,4,6,3,8,5,3,3,6,3,9,0};
	        int[] output = obj.removeDuplicates(duplicate);
	        for(int i=0; i<8 ;i++)
	        {
	            System.out.print(output[i]);
	        }
	    }
}
