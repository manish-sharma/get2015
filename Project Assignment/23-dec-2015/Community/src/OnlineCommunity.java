
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OnlineCommunity {
      static int population;
      static int [] arrayCommunity;
      static int noOfCommunity=0;
      
      public static void main(String[] args) throws NumberFormatException, IOException {
		
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	  population  = Integer.parseInt(br.readLine());
    	  arrayCommunity = new int[population+1];
    	 
    	  String input;
    	  while( !(input = br.readLine()).equals("-1") )
    	  {
    		  input = input.trim();
    		  
    		  if(input.charAt(0) == 'C')
    		  {
    			 String str[] = input.split(" ");
    			 int i = Integer.parseInt(str[1]);
    			 int j = Integer.parseInt(str[2]);
    			 
    			 if(arrayCommunity[i] ==0 && arrayCommunity[j]==0)
    			 {   
    				 noOfCommunity++;
    				 arrayCommunity[i] = arrayCommunity[j] = noOfCommunity;
    			 }
    			 else if(arrayCommunity[i] ==0 && arrayCommunity[j]!=0 )
    			 {
    				 arrayCommunity[i] = arrayCommunity[j];
    			 }
    			 else if(arrayCommunity[j] ==0 && arrayCommunity[i]!=0 )
    			 {
    				 arrayCommunity[j] = arrayCommunity[i];
    			 }
    			 
    			 else if(arrayCommunity[i] != arrayCommunity[j] )
    			 {
    				 if(arrayCommunity[i] < arrayCommunity[j])
    				 {   int temp = arrayCommunity[i];
    					 for(int index =0; index < population ; index++)
    					 {   
    						 if(arrayCommunity[index] == arrayCommunity[j])
    						 {
    							 arrayCommunity[j] = temp;
    						 }
    						 else if(arrayCommunity[index] >temp) {
    							 arrayCommunity[index] --; 
    						 }
    					 }
    				 }
    				 noOfCommunity--;
    			 }
    			 
    			 
    			    			  
    		  }
    		  else if(input.equals("Q 0 0"))
    		  {      int noOfMember=0;
    		         int noOfEvenGroup = 0;
    			    for(int i = 1;i <= noOfCommunity;i++)
    			    {
    			    	
    			         for(int j: arrayCommunity)
    			         {
    			        	 if(j == i)
    			        		 noOfMember++;
    			         }
    			         if(noOfMember%2 == 0)
    			        	 noOfEvenGroup++;
    			         noOfMember = 0;
    			    }
    			    
    			    System.out.println("No Of Even Group: "+noOfEvenGroup);
    		  }
    		  else
    		  {
    			  
    		  }
    	  }
    	  
	}
}
