import java.util.Scanner;


public class DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateRemoval object1=new DuplicateRemoval();
		 int input[]= {2,5,3,2,3,8,5,9,3,3,2,3,9,2};
	      int output_array[];
	      

	      DuplicateRemoval duplicateElement=new DuplicateRemoval();
	      output_array=duplicateElement.removeDuplicateElement(input);
	       for(int i=0;i<output_array.length;i++)
	       {
	         System.out.println(output_array[i]);
	       }
	}
	int[] removeDuplicateElement(int input[])
	{  int count=0;
		//int outputArray[]=new int[input.length];
	  		for(int i=0;i<input.length;i++)
		    {
			for(int j=i+1;j<input.length;j++)
			   {
				   if(input[i]==input[j] && input[j]!=' ')
				   {
				    input[j]=' ';
				    count++;
				   }
			   }
		    }
		    int j=0;
		    int newLength=input.length-count;
		    int outputArray[]=new int[newLength];
			for(int i=0;i<input.length;i++)
			{
				
			if(input[i]!=' ')
			{
				outputArray[j]=input[i];
				j++;
			}
			
			}
			return outputArray;
	}
}
