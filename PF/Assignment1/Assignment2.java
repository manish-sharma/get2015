public class Assignment2 
{
	public int[] removeDuplicate(int input[])
	{
		int[] output=new int[input.length];
		output[0]=input[0];
		int count=0,index=0;
		for(int count_1=1;count_1<input.length;count_1++)
		{
			int temp;
			temp=input[count_1];
			int flag=1;
			for(int count_2=0;count_2<=index;count_2++)
			{
				if(temp==output[count_2])
				{
					flag=0;
					count++;
				}
			}
			if(flag==1)
			{
				
				index=count_1-count;
				output[index]=input[count_1];
			}
		}
		int out[]=new int[index+1];
		for(count=0;count<=index;count++)
			out[count]=output[count];
		return out;
	}
	public static void main(String args[])
	{
		
	}
}
