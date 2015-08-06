import java.util.*;
class CheckSorted
{
	public static void main(String args[])
	{
		CheckSorted one=new CheckSorted();
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("enter array size. ");
		size = sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter Elements of Array: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		int result;
		result=one.check(array);
		if(result==0)
			System.out.println("Array is not Sorted. ");
		else if(result==1)
			System.out.println("Array is in increasing order. ");
		else
			System.out.println("Array is in decreasing order. ");
	}
	public int check(int input[])
	{
		int j;
		int count1=0, count2=0;
		for(int i=0;i<input.length-1;)
		{
			j=i+1;
			if(input[i]<input[j])
			{
				count1++;
			}
			else
			{
				count2++;
			}
			i++;
		}
		if(count1==input.length-1)
			return 1;
		else if(count2==input.length-1)
			return 2;
		else
			return 0;
	}
}