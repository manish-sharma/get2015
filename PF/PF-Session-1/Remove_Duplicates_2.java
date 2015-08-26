import java.util.Scanner;


public class Remove_Duplicates_2 {
	static int x;
	public static void main(String args[])
	{
		int n,i;
		Scanner scan;
		System.out.println("Enter total no. of elements in array");
		scan=new Scanner(System.in);
		n=Integer.parseInt(scan.nextLine());
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(scan.nextLine());//reading array string elements and converting them ino integers
		}
		
		Remove_Duplicates_2 obj=new Remove_Duplicates_2();
		
		 arr=obj.remove(arr);//call remove method
      
		System.out.println("Output Array Is :\n");
	    for(i=0;i<x;i++)
		{
	    	System.out.println(arr[i]);
		}
	}

	public int[] remove(int[] Input_arr) {
		// TODO Auto-generated method stub
		
		int Output_arr[]=new int[Input_arr.length];
		int i;
		x=0;
	
		int max=Input_arr[0];
		for(i=1;i<Input_arr.length;i++)
		{
		   if(Input_arr[i]>max)
		   {
			   max=Input_arr[i];
		   }
		}
		
		int a[] = new int[max+1];
		for(i=0;i<max;i++)
		{
			a[i]=0;
		}
		
		for(i=0;i<Input_arr.length;i++) //check and remove dulicate elements
		{
			if(a[Input_arr[i]]==0)
			{
				a[Input_arr[i]]=1;
				Output_arr[x]=Input_arr[i];
			    x++;
			    
			}
			
		}
		
		
		int Output[]=new int[x];
		for(i=0;i<x;i++)
		{
			Output[i]=Output_arr[i];
		}
		
		return Output;
	}

}
