import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * main class to sort the list of array
 * @author Ankur
 * @since 04-09-2015
 */

public class SortMain {
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]){
		Sort sort = new Sort();
		int[] array = null;
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		try{	
			do {
				System.out.println("enter your choice\n1. create the list" + // display menu
						"\n2. comparision sorting" +
						"\n3. linear sorting" +
						"\n4. display" +
						"\n5. exit" );
				choice = scan.nextInt();

				switch (choice) {
				case 1:	//to create the list				
					System.out.println("how many element to insert?");
					int count = scan.nextInt();
					array = new int[count];
					for (int i = 0; i < count; i++)
						array[i] = scan.nextInt();
					break;

				case 2: //to sort the comparison sort
					if(array == null)
						System.out.println("List is empty so first create the list");
					else{
						if(array.length <= 10){
							System.out.println("bubble sorting is done:");
							sort.bubbleSort(array);
						}
						else{
							System.out.println("quick sorting is done:");
							sort.quickSort(array, 0, array.length-1);
						}
					}
					break;

				case 3:	//to sort the linear sort
					if(array == null)
						System.out.println("List is empty so first create the list");
					else{
						sort.sort(array);
					}
					break;	

				case 4://to display the array
					if(array == null)
						System.out.println("List is empty so first create the list");
					else{
						for(int count2 = 0; count2 < array.length;count2++){
							System.out.print(array[count2] + " ");
						}
						System.out.println("\n");
					}
					break;

				case 5:	// to terminate the code				
					System.exit(0);
					System.out.println("***EXIT***");
					break;

				default:
					System.out.println("choose one of the above option only.");
					break;
				}


			}while(choice!=5);
		}
		catch(InputMismatchException e){
			System.out.println("enter only integer values**EXIT**");
		}
		scan.close();
	}

}
