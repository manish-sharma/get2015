import java.util.Scanner;


public class Check_Sorted_Order {

	public static  void main(String args[]) {
		
		Scanner scan;
		int num,i;
		System.out.println("Enter total no. of elements in array");
		
		scan = new Scanner(System.in);
		num = Integer.parseInt(scan.nextLine());
		int arr[]=new int[num];
		System.out.println("Enter elements of array");
		for(i=0;i<num;i++)
		{
			arr[i]=Integer.parseInt(scan.nextLine());//reading array string elements and converting them ino integers
		}
	    
		Check_Sorted_Order obj=new Check_Sorted_Order();
		int res=obj.check(arr);//call check fn
		if(res==0)
		{
			System.out.println("Array is not sorted");
			
		}
		if(res==1)
		{
			System.out.println("Array is in assending order");
			
		}
		
		if(res==2)
		{
			System.out.println("Array is in descending order");
		}
	}

	public int check(int[] arr) {
		// TODO Auto-generated method stub
		int i,j,flag=0;
		
		//find array is not sorted(at flag=0) or sorted in assending order(at flag=1)
		if(arr[0]<arr[1])
			
		{    flag=1;
			for(i=1;i<arr.length-1;i++)
		
		    {
			
			if(arr[i]>arr[i+1])
				{
					flag=0;
				}
		    }
		}	
			
		//find array is not sorted(at flag=0) or sorted in descending order(at flag=2)
		else
		{
			flag=2;
					for(i=1;i<arr.length-1;i++)
				
				    {
					
					if(arr[i]<arr[i+1])
						{
							flag=0;
						}
				    }
		}
		return flag;
	}
}
