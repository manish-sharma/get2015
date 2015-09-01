import java.util.*;
/**
 * this class is used to insert element in the sorted list
 * @author Ankur
 *
 */
public class SortedLinkedList {
	
	static LinkedList<Integer> list = new LinkedList<Integer>();
	 public static int index = 0;
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]){
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		try{	
		   do {
			
			System.out.println("enter your choice\n1. create the list" + // display menu
					"\n2. enter the element into sorted list" +
					"\n3. display" +
					"\n4. exit" );
			choice = scan.nextInt();

			switch (choice) {
				case 1:	//to create the list				
					System.out.println("how many element to insert?");
					int count = scan.nextInt();
					for (int i = 0; i < count; i++)
						list.add(scan.nextInt());
						list.sort(null);
					break;
			
				case 2: //to insert the single element in the sorted list
					if(list.size() == 0)
						System.out.println("first create the list");
					else{
						System.out.println("enter the element");
						int item = scan.nextInt();
						insert(list, item);
					}
					break;
		
				case 3:	//to print the linked list		
					if(list.size() == 0)
						System.out.println("first create the list");
					else{
					for (int i = 0;i < list.size();i++) {
						System.out.print(list.get(i) + " ");
					}
					System.out.println();
					}
					break;	
		
				case 4:	// to terminate the code				
					System.exit(0);
					System.out.println("***EXIT***");
					break;
	
				default:
					System.out.println("choose one of the above option only.");
					break;
			}
			
			
		}while(choice!=4);
		}
		catch(InputMismatchException e){
			System.out.println("enter only integer values**EXIT**");
		}
	}
	/**
	 * method to insert element in the sorted linked list through recursive method
	 * @param list
	 * @param element
	 */
	public static void insert(LinkedList<Integer> list,int element){
		if (index >= list.size() || list.get(index) >= element){
			list.add(index,element);
			index = 0;
		}
		else if(list.get(index)<element){
			
			index++;
			insert(list, element);
		
		}
		else{
			list.addLast(element);
			index = 0;
		}
	}

}
