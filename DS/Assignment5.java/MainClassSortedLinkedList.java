import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClassSortedLinkedList {
	
	public static void main(String args[])
	{
		SortedLinkedList sortedLinkedList = new SortedLinkedList();
		SinglyNode startNode=null;
		int data;
		do
		{
			System.out.println("Enter positive numnber");
			data = readData();
			startNode=sortedLinkedList.insertSortedLinkedList(startNode , data);
			System.out.println("Do you want to add more number press 1 for continue");
			data = readData();
			if(data==1)
				continue;
			break;
		}while(true);
		System.out.println("Number in list are");
		sortedLinkedList.displaySortedLinkedList(startNode);
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
			if(data<0)
			{
				System.out.println("Please enter positive no");
				continue;
			}
			break;
		}while(true);
		return data;
	}
}
