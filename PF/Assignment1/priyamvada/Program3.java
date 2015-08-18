package priyamvada;

/*Program to find the longest sequence in an array*/
public class Program3 {

	int[] longestSequence(int input[])
	{
		int i,j,k=input.length,count=0,maxCount=0,state=0;
		for(i=1;i<k;i++)
		{
			if(input[i-1]<input[i])
			{
				count++;
			}
			else
				count=0;
			if(maxCount<count)
			{
				maxCount=count;
				state=i-count;
			}
		}
		
		maxCount=maxCount+1;
		
		int []arr=new int[maxCount];
		j=0;
		for(i=state;i<state+maxCount;i++)
		{
		 arr[j]=input[i];
		 j++;
		}
		return arr;
	}
	public static void main(String arg[])
	{
		int []input={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		Program3 assign=new Program3();
		 for(int i=0;i<assign.longestSequence(input).length;i++)
		 {
		 System.out.print(assign.longestSequence(input)[i]);
		 }
		
	}
}

