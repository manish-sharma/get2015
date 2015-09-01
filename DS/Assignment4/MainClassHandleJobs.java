import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClassHandleJobs {

	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of jobs in printing");
		int data;
		HeapDatasStructure heap = new HeapDatasStructure();
		do 
		{  
			System.out.println("Enter no like 4 for the chair, 3 for professors, 2 for grad students, and 1 for undergrads");
			data=getData(br);
			if(data>4)
			{
				System.out.println("please enter correct input");
				continue;
			}
			heap.insertInHeap(data);
			System.out.println("press 1 for continue else press 2");
			data= getData(br);
			if(data==2)
				break;
		}while(true);
		System.out.println("Before");
		heap.display();
		System.out.println("After");
		int size=HeapDatasStructure.size;
		for(int index=0; index < size; index++)
		{
			System.out.println("Printing of jobs are in order "+heap.extractRootNode());
		}
		
		
	}


	public static  int getData(BufferedReader br)
	{
		int data=0;
		do
		{
			try
			{
				data=Integer.parseInt(br.readLine());
			}
			catch(IOException ipe)
			{
				System.out.println("Please enter valid input");
				continue;
			}
			catch(NumberFormatException nf)
			{
				System.out.println("Please enter valid input");
				continue;
			}
			if(data<=0)
			{
				System.out.println("Please enter valid input");
				continue;
			}
			break;
		}while(true);
		
	return data;
	}
}
