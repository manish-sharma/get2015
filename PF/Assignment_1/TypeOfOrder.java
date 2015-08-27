
public class TypeOfOrder {
	  
	public int sortedOrNot(int input_array[])
	
	 {
	       int type=0;
	        for(int i=1;i<input_array.length;i++)
	        	
	        { 
	        	 if(input_array[i-1]<=input_array[i])
	        	 {  
	        		 type++;
	        	 }
	        	 else 
	        		 type=0;
	        }
	
	     if(type==0)
	     
	     return 2;
	     
	     else if(type==(input_array.length-1))
	    	 
	    	 return 1;
	     else 
	    	 return 0;
	 }
	
 public static void main(String args[]) 
     {
	  int input_array[]={23,23,33,21};

	  TypeOfOrder order_type=new TypeOfOrder();
	  int type=order_type.sortedOrNot(input_array);
      System.out.print("Type of list" +  type); 
     }

}