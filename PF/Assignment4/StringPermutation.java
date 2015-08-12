/** 
   *   class for To generate all possible permutation of an given string
*/
class StrPermu{
	//res store all permutation string
	private String[] res;
	// index for res
	private int index;
	
	StrPermu(int size)
	{
		// decision for how many permutations will be generated 
		res= new String[(int)Math.pow(2,size)-2];
		index=0;
	}
	
	// This function take string and convert it into array then call for permute()
	public void generatePermutations(String str) {
		char [] strArray= str.toCharArray();
		int charinstr= strArray.length;		
		
		permute(strArray,0,charinstr-1);
		
		
	}
	
//  this is recursive function
	void permute(char arr[], int lowi, int highi)
	{
	   int i;
	   char temp;
	   
	   if (lowi == highi){
	           res[index]=arrayToString(arr);
	           index++;
	     }
	   else
	   {     
	       for (i = lowi; i <=highi; i++)
	       {
	    	   //swap(arr[lowi], arr[i]);
	    	   temp=arr[i]; arr[i]=arr[lowi]; arr[lowi]=temp;                                 //swap(arr[lowi], arr[i]);
	          permute(arr, lowi+1, highi);
	          //swap(arr[lowi], arr[i]);
	          temp=arr[i]; arr[i]=arr[lowi]; arr[lowi]=temp;                                  //swap(arr[lowi], arr[i]) //backtrack
	       }
	   }
	}
	
	// this method returns the final Array of permutations
	String [] storeAllPermutation(){
	
		return this.res;
	}
	
	
	//convert array to string
	String arrayToString(char[] arr){
		String str="";
		for(int i=0;i<arr.length;i++)
		      { str= str+arr[i];}
	    return str;	
	}
	
};
public class StringPermutation {
	public static void main(String [] arg){
	   
		String s="ABC";
        StrPermu obj = new StrPermu(s.length());
        obj.generatePermutations(s);
       
        String[] result=obj.storeAllPermutation();
        
        for(int i=0;i<result.length;i++) {
        	System.out.println(result[i]);
        }
      
       
        
	}
}
