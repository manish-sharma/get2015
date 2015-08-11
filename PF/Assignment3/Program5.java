import java.util.Scanner;

//Program to implement Binary Search recursively
public class Program5 
{
	public static void main(String args[]) //main class definition
	{
	int result,number,start=0,end;
	int arr[]= {2,5,8,9,10,55,77};
	end=arr.length-1;
	Program5 object = new Program5();     //Object of class program3
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number to be searched");
	number=scan.nextInt();
	result=object.binarySearch(number,start,end,arr); //Calling function linearSearch
	result=result+1;
	if(result>0)
		System.out.println("Position is "+ result);
	else
		System.out.println("Number not found");
	}

//Function that takes arguments as number to be searched, position of start of array and array
	int binarySearch(int x,int start,int end,int arr[]) 
	{
		int mid;
		while(start<=end)	
		{
			mid=(start+end)/2;
			if(x==arr[mid])
			{
				System.out.println("Number Found");
				return mid;        //Returning position of number found
			}
			else if(x>arr[mid])
			{
				return(binarySearch(x,mid+1,end,arr));//Recursive function calling if number is in first half of array	
			}
			else
			{
				return(binarySearch(x,start,mid-1,arr));//Recursive function calling if number is in other half of array
			}
		}
		return -1;
	}
}

