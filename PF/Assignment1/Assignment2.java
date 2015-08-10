import java.util.Scanner;
public class Assignment2 
{
	/**remove duplicate  is function which remove the duplicate elements in an array it works only only for the integer array.
	 * 
	 * @param input is an array which is pass as the parameter. It may consist of duplicate elements.
	 * @return This function return a integer array which is the reduced form of the input array.In this array there is no duplicacy of elements.
	 */
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
		Scanner sc=new Scanner(System.in);
		int a[]=new int[15];
		System.out.println("enter the elements in array with duplicacy");
		for(int count=0;count<15;count++)
		{
			a[count]=sc.nextInt();
		}
		
		Assignment2 obj= new Assignment2();
		int out[]=obj.removeDuplicate(a);
		System.out.println("distinct elements of array are");
		for(int count=0;count<out.length;count++)
			System.out.print(out[count]+",");
	}
}
