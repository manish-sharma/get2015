class StrPermu{
	private String[] res;
	private int index;
	
	StrPermu(int size)
	{
		res= new String[(int)Math.pow(2,size)-1];
		index=0;
	}
	
	public void generatePermutations(String str) {
		char [] strArray= str.toCharArray();
		int charinstr= strArray.length;		
		
		permute(strArray,0,charinstr-1);
		
		
	}
	
	void permute(char arr[], int lowi, int highi)
	{
	   int i;
	   char temp;
	   
	   if (lowi == highi){
	           res[index]=arr.toString();
	           index++;
	     }
	   else
	   {
	       for (i = lowi; i <=highi; i++)
	       {
	          temp=arr[i]; arr[i]=arr[lowi]; arr[lowi]=temp;                                 //swap(arr[lowi], arr[i]);
	          permute(arr, lowi+1, highi);
	          temp=arr[i]; arr[i]=arr[lowi]; arr[lowi]=temp;                                  //swap(arr[lowi], arr[i]) //backtrack
	       }
	   }
	}
	
	
	String [] storeAllPermutation(){
	
		return this.res;
	}
	
};
public class StringPermutation {
	public static void main(String [] arg){
	   
		String s="ABC";
        StrPermu obj = new StrPermu(s.length());
        obj.generatePermutations(s);
       
        String[] result=obj.storeAllPermutation();
        
        for(String i: result) {
        	System.out.println(i);
        }
      
       
        
	}
}
