package assignment1;

public class array {
	public int checkOrder(int arr[])
	{
		int len,flag=-1,i;
		len=arr.length;
		for(i=1;i<len;i++)
		{
			if(arr[i]>=arr[i-1] && flag!=2)
			{
				flag=1;
			}
			else
			{
				if(arr[i]<=arr[i-1] && flag!=1)
				{
					flag=2;
				}
				else
				{
					flag=0;
					break;
				}
			}
		}
		return flag;
	}
	public static void main(String args[])
	{
		int input[]={1,3,4,5,7,5},value;
		array ob=new array();
		value=ob.checkOrder(input);
		if(value==1)
		{
			System.out.println("Array is in Ascending Order.");
		}
		else if(value==2)
		{
			System.out.println("Array is in Descending Order.");
		}
		else if(value==0)
		{
			System.out.println("Array is not Sorted.");
		}	
	}

}
