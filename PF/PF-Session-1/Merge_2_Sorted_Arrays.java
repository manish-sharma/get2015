import java.util.Scanner;


public class Merge_2_Sorted_Arrays 
{
	public static void main(String args[])
	{
		int n,i,m;
		Scanner scan;
		System.out.println("Enter total no. of elements in array1");
		scan=new Scanner(System.in);
		n=Integer.parseInt(scan.nextLine());
		int arr1[]=new int[n];
		System.out.println("Enter array1 elements in sorted manner");
		for(i=0;i<n;i++)
		{
			arr1[i]=Integer.parseInt(scan.nextLine());//reading sorted array1 string elements and converting them ino integers
		}

		System.out.println("Enter total no. of elements in array2");
		scan=new Scanner(System.in);
		m=Integer.parseInt(scan.nextLine());
		int arr2[]=new int[m];
		System.out.println("Enter array2 elements in sorted manner");
		for(i=0;i<m;i++)
		{
			arr2[i]=Integer.parseInt(scan.nextLine());//reading sorted array2 string elements and converting them ino integers
		}
		
		Merge_2_Sorted_Arrays obj=new Merge_2_Sorted_Arrays();
		int Output[]=new int[n+m];
		Output=obj.mwege(arr1,arr2);
		System.out.println("Output Array Is :");
		for(i=0;i<n+m;i++)
		{
			System.out.println(Output[i]);
		}
	}

	public int[] mwege(int[] arr1, int[] arr2) 
	{
		// TODO Auto-generated method stub
		int i,x=0;
		/*int size2=arr2.length;
		int newarr2[]=new int[arr1.length+arr2.length+1];
		for(i=0;i<arr1.length+arr2.length;i++)
		{
			newarr2[i]=0;
		}
			
		for(i=arr1.length;i<arr1.length+size2;i++)
		{
			newarr2[i]=arr2[x];
			x++;
		}
		for(i=0;i<arr1.length+size2;i++)
		{
			System.out.println(newarr2[i]);
		}*/
			
		int l=0;
		int mid=arr1.length-1;
		int h=arr2.length-1;
		int t1=l;
		int t2=l;
		int k=0;
		int Output[]=new int[arr1.length+arr2.length +1];
		while(t1<=mid && t2<=h)
		{
			if(arr1[t1]<arr2[t2])
			{
				Output[k]=arr1[t1];
				t1++;
			}
			
			else 
			{
				Output[k]=arr2[t2];
				t2++;
			}
			
			/*else
			{
				Output[k]=arr1[t1];
				t1++;
				t2++;
			}*/
			
			k++;
		}
		
		
		if(t1>mid)
		{
			for(i=t2;i<=h;i++)
			{
				Output[k]=arr2[i];
				k++;
			}
		}
		
		else if(t2>h)
		{
			for(i=t1;i<=mid;i++)
			{
				Output[k]=arr1[i];
				k++;
			}
		}
        
		return Output;
	}
}
