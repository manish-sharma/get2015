import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of array : ");
		size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter Elements of Array: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		int[] uniqueArray;
		RemoveDuplicate Ob1=new RemoveDuplicate();
		uniqueArray=Ob1.removeDuplicate(array);
		for(int i=0;i<uniqueArray.length;i++)
		{
			System.out.println(uniqueArray[i]);
		}
		sc.close();
	}
	
	public int[] removeDuplicate(int input[])
	{
		int n=input.length-1;
		int i,j,k;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<=n;j++)
			{
				if(input[i]==input[j])
				{
					for(k=j;k<n;k++)
					{
						input[k]=input[k+1];
					}
					n--;
					j--;
				}
			}
		}
		int output[]=new int[n+1];
		for(i=0;i<=n;i++)
		{
			output[i]=input[i];
		}
		return output;
	
	}
}
