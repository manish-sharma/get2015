import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClassLeftMostBinarySearch 
{
	public static void main(String args[])
	{
		LeftMostBinarySearch leftMostBinarySearch = new LeftMostBinarySearch();
		int size,data,searchNumber;
		System.out.println("Enter no of element ");
		do
		{
			size=readData();
			if(size<=0)
			{
				System.out.println("Please enter postive size greater than 0");
			}
			break;
			
		}while(true);
		
		int inputArray[] = new int[size];
		//Read array from Keyboard
		System.out.println("Enter element sorted in ascending order ");
		for(int index=0;index<size;index++)
		{
			System.out.println("Enter element "+(index+1));
			data=readData();
			inputArray[index]=data;
			if(index>0)
			{
				if(inputArray[index-1]<=inputArray[index])
					continue;
				else
				{
					System.out.println("Element are not sorted in ascending order");
					index--;
					continue;
				}
			}
		}
		System.out.println("Enter no to be search at left most position");
		searchNumber = readData();
		int index=leftMostBinarySearch.leftMostBinarySearch(inputArray, searchNumber, 0 , size-1);
		//if element means index is -1 otherwise return position 
		if(index==-1)
			System.out.println("Element "+searchNumber+" is not found");
		else
			System.out.println("Element "+searchNumber+" Found at index "+index);
	}

	
	public static int readData()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data =0;
		do
		{
			try
			{
				data=Integer.parseInt(br.readLine());
			}
			catch(IOException io)
			{
				System.out.println("Error occured please enter input again");
				continue;
			}
			catch(NumberFormatException nf)
			{
				System.out.println("Please enter correct input");
				continue;
			}
			break;
		}while(true);
	
		return data;
	}
}
