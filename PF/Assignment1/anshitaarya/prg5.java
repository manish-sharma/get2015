package anshitaarya;


import java.util.Scanner;
public class prg5 {
	int checkOrder(int input[])
	{
		int i,j,count=0,count1=0,count2=0;
		
		for(i=0;i<input.length-1;i++)
		{
			
				if(input[i]<input[i+1] )
				{
					count1++;
				}
				else
					break;
				
		}
		for(i=0;i<input.length-1;i++)
		{
			if(input[i]>input[i+1])
			{
				count2++;
			}
			else break;
			
		}
		
		if(count1==input.length-1)
			return 1;
		else if(count2==input.length-1)
		 return 2;
		else return 0;
		}
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter array size ");
		int size=in.nextInt();
		System.out.println("enter array  ");
		int[] input =new int[size];
		for (int a=0; a<size; a++)
		{
			
	
		input[a]= in.nextInt();
		}
		prg5 assign=new prg5();
		System.out.println(assign.checkOrder(input));
	}

}
