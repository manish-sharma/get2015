import java.util.Scanner;


public class Remove_Duplicate_Shift {
	static int size;
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
		
		Remove_Duplicate_Shift obj=new Remove_Duplicate_Shift();
		arr=obj.remove(arr);
		System.out.println("Output Array Is :\n");
	    for(i=0;i<size;i++)
		{
	    	System.out.println(arr[i]);
		}

}

	public int[] remove(int[] arr) {
		// TODO Auto-generated method stub
		int i,j,x=0,p,k;
		size=arr.length;
	//	int Output[]=new int[arr.length];
		//Output[0]=arr[0];
		int s=size;
		for(i=0;i<s-1;i++)
		{
			for(j=i+1;j<size;j++)
			{
			  	if(arr[i]==arr[j])
			  	{
			  		p=j;
			  		for(k=p+1;k<size;k++)
			  		{
			  			arr[k-1]=arr[k];
			  			
			  		}	
			  	     size--;
			  	}
			  		
			 }
			s=size;
		 }
			
		int Output[]=new int[size];
		for(i=0;i<size;i++)
		{
			Output[i]=arr[i];
		}
		return Output;
		
	}
	}
