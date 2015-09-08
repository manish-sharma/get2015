
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassArrayList 
{

	public static void main(String args[]) 
	{
		ArrayList arrayList = new ArrayList();
		String choiceContinue="";
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		do 
		{
			System.out.println("Array List Operation");
			System.out.println("Menu:\n"
					+ "1. Add Item at Index\n"
					+ "2. Display List\n"
					+ "3. Reverse of an ArrayList\n"
					+ "4. Sorting of ArrayList \n"
					+ "5. Clear array list\n"
					+ "6. First Occurrene of Item \n"
					+ "7. First Occurrence by given Position\n"
					+ "8. Remove Item by data\n"
					+ "9. Remove Item by Index");
					
			int choice = DoublyLinkedList.readData();
			switch(choice) 
			{
				case 1:
						System.out.println("Enter element");
						int element=readData(bufferedReader);
						System.out.println("Enter position");
						int position=readData(bufferedReader);
						arrayList.insertItem(element, position);
						break;
				case 2:	
						arrayList.displayArrayList(arrayList);		
						break;
						
				case 3:
						int array[] = arrayList.reverseArray(arrayList);
						int sizeOfArray = array.length;
						System.out.println("Reversed Array: ");
						for(int counter=0;counter<sizeOfArray;counter++)   
						{
							System.out.print(array[counter]+ " ");
						}
						System.out.println();
						break;
						
				case 4:
						System.out.println("Sorted Array: ");
						array = arrayList.sortingOfArray();
						sizeOfArray = array.length;
						for(int counter=0;counter<sizeOfArray;counter++)
						{ 
							System.out.print(array[counter]+ " ");
						}
						System.out.println();
						break;
						
				case 5: 
						arrayList.clearArrayList(arrayList);	
						break;
				case 6:	
						System.out.println("Enter element");
						element=readData(bufferedReader);
						arrayList.firstOccurence(element);
						break;
				case 7: 
						System.out.println("Enter element");
						element=readData(bufferedReader);
						System.out.println("Enter position");
						position=readData(bufferedReader);
						arrayList.firstOccurence(element, position);
						break;
				case 8: 
						element=readData(bufferedReader);
						arrayList.removeElement(element);
						break;
				case 9: 
						int location=readData(bufferedReader);
						arrayList.removeElementOnLocation(location);
						break;
				
			
				default:
					System.out.println("Please enter corrrect choice");
			}
			System.out.println("Do you want to perform more operations??(Y/N)");
			try
			{
				choiceContinue = bufferedReader.readLine().trim();
			}
			catch(IOException io)
			{
				System.out.println("Error Occured Please enter again");
				continue;
			}
		} while(choiceContinue.equalsIgnoreCase("y"));
		
	
		do 
		{
			
			try
			{
				System.out.println("Do you want to perform more insertion??(Y/N)");
				choiceContinue = bufferedReader.readLine().trim();
			}
			catch(IOException io)
			{
				System.out.println("Error Occured Please enter again");
				continue;
			}
			if(choiceContinue.equalsIgnoreCase("Y"))
			{
				continue;
			}
			break;
		}while(true);
			
	
		
			
		arrayList.displayArrayList(arrayList);			
		
	}
	public static int  readData(BufferedReader bufferedReader)
	{
		int data=0;
		boolean isCorrect=false;
	
		do
		{
			try 
			{
				data =Integer.parseInt(bufferedReader.readLine());
			}
			catch(NumberFormatException nf)
			{
				System.out.println("Please enter no like 1 2 ..");
				continue;
			}
			catch(IOException io)
			{
				System.out.println("Error Occured please enter again");
				continue;
			}
			isCorrect=true;
			
		}while(!isCorrect);
		return data;
	}
}
