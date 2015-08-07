import java.util.Arrays;


public class RemoveDuplicate {

	
	 int[] removeDuplicate(int input[])
	 {  
			int[]out=new int[100];
			int j=0,p=0;
			int len=input.length;
			
			//System.out.print(Arrays.toString(input));
			
			for(int i=0;i<len;i++)
			{
				for(j=0;j<p;j++)
				{if(out[j]==input[i])
					break;
				}
				if(p==j)
				{
					
					
					out[p++]=input[i];
				
					
				}
				
			}
			int[] out1=new int[p];
			for(int i=0;i<p;i++)
				out1[i]=out[i];
			System.out.print(Arrays.toString(out1));
			return out1;
		 
		 
		 
		 
	 }
	 
	 public static  void main(String args[])
	 {
		 
	 }
	 

}
