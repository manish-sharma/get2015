
public class DuplicateRemove {
	
	static int[] removeDuplicate(int input[])
	{
		int i,j,k=0,flag=0;
		int size=input.length;
		int[] output = new int[size];
		
		for (i = 0; i < size; i++)
		{
		      for (j = i + 1; j < size;j++)
		      {
		        if (input[i] == input[j])
		         {
		        	flag=1;
		         }
		         
		      }
		      if(flag==1)
		      {
		        flag=0;
		      }
		      else
		      {
		    	  output[k]=input[i];
		    	  k++;
		      }
		   }
		return output;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int arr[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		
		int arr1[]=removeDuplicate (arr);
		
		for(int count=0;count<arr1.length;count++)
		{
			System.out.println(arr1[count]);
		}

	}

}
