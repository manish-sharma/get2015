import java.util.Scanner;

//Program to implement Quick sort recursively
public class Program6 
{
	public static void main(String args[]) //main class definition
	{
	int[] arr=new int[8];
	int i,end,start=0;
	Program6 object= new Program6();   //Object of class program6
	Scanner scan= new Scanner(System.in);
    System.out.println("Enter size of array");
    end=scan.nextInt();
    System.out.println("Enter elements of array");
    for(i=0;i<end;i++)
    	{
    	arr[i]=scan.nextInt();
    	}
    object.quickSort(arr, start, end-1); //Calling quickSort function
    System.out.println("Sorted elements of array");
    for(i=0;i<end;i++)
    	{
    	System.out.println(arr[i]); //Displaying sorted array
    	}
	}

//Function to apply quickSort recursively
	void quickSort(int arr[],int start,int end)
	{
	int i,j,pivot,temp=0;
	if(start<=end)
	{
		i=start;
		j=end;
		pivot=start; //Assigning pivot with start index of array
		while(i<j)
		{
			while(arr[i]<=arr[pivot] && i<end)
			{
				i++;	
			}
			while(arr[j]>arr[pivot] && j>=start)
			{
				j--;	
			}
			if(i<j) //Swapping values of i and j
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	temp=arr[j];  //Swapping pivot with value of j when i and j cross each other
	arr[j]=arr[pivot];
	arr[pivot]=temp;
	quickSort(arr,start,j-1); //Recursive call
	quickSort(arr,j+1,end);
	}
	}
}

