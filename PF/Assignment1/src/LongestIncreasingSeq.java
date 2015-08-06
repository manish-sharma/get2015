import java.util.*;
public class LongestIncreasingSeq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array");
		int a[]=new int[25];
		for(int i=0;i<25;i++)
		{
			a[i]=sc.nextInt();
		}
		LongestIncreasingSeq Ob1=new LongestIncreasingSeq();
		int b[]=Ob1.findSequence(a);
		int i;
		System.out.print("Longest Increasing Sequence is : ");
		for(i=0;i<b.length;i++)
			System.out.print(b[i] + " ");

	}
	public int[] findSequence(int input[])
	{
		int n=input.length;
		int temp1[]=new int[n];
		int temp2[]=new int[n];
		int count1=1,count2=1;
		int k=0;
		int i,j,l;
		temp1[k]=input[0];
		for(i=0;i<n;)
		{
			k=0;
			temp2[k++]=input[i];
			for(j=i;j<n-1;j++)
			{
				if(input[j]>=input[j+1])
				{
					
					break;
				}
				temp2[k++]=input[j+1];
				count2++;
			}
			if(count2>count1)
			{
				for(l=0;l<count2;l++)
					temp1[l]=temp2[l];
				count1=count2;
			}
			i=i+count2;
			count2=1;
		}
		int b[]=new int[count1];
		for(i=0;i<count1;i++)
			b[i]=temp1[i];
		return b;
	}
}