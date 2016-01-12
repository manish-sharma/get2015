import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		String input, repeatChoice;
		int choice;
		try 
		{
			sc = new Scanner(System.in);
			do
			{
				System.out.println("\nEnter list in string representation\n{eg. (9,(55,8),(29,(3,5),1),87)}");
				input = sc.next();
				if(Validation.isExpression(input)) 
				{
					List list = new List(input);
					do 
					{
						System.out.println("\nEnter choice :\n1.Traverse the list\n2. Find Max element in the list\n3. Find Sum of the elements\n4. Size of the list\n5. Structure Of list\n6. Search an element");
						do
						{
							System.out.println("Enter Positive Number");
							while (!sc.hasNextInt())
							{
							System.out.println("That's not a number!Please enter again");
							sc.next();
							}
							choice = sc.nextInt();
							} while (choice <= 0);
						
						switch(choice) { 
							case 1:
								list.traverse(list.first);
								break;
							case 2:
								System.out.println("Max = " + list.max());
								break;
							case 3:
								System.out.println("Sum = " + list.sum());
								break;
							case 4:
								System.out.println("size = " + list.size());
								break;
							case 5:
								System.out.println(list.first);
								break;
							case 6:
								System.out.println("Enter Element to be searched : ");
								int searchingElement;
								do {// Validation
									System.out.println("Enter Positive Number");
									while (!sc.hasNextInt()) {
									System.out.println("That's not a number!Please enter again");
									sc.next(); // this is important!
									}
									searchingElement = sc.nextInt();
									} while (searchingElement <= 0);
								boolean isAvailable = list.find(searchingElement);
								if(isAvailable == true) {
									System.out.print("\n Element is found ");
								} else {
									System.out.print("\n Element is not found ");
								}
								break;
							default : 
								System.out.println("Enter Correct Chocie");
						}
						System.out.println("\nDo you want to continue with the same list.\n Press y or Y for Yes and any other key for No");
						repeatChoice = sc.next();
						if(!(repeatChoice.charAt(0) == 'Y' || repeatChoice.charAt(0) == 'y')) {
							break;
						}
					} while(true);
				}
				else {
					System.out.println("Please provide valid List");
				}
				System.out.println("\nDo you want to provide another list\nPress Y or y for YES and any other key for EXIT");
				repeatChoice = sc.next();
				if(!(repeatChoice.charAt(0) == 'Y' || repeatChoice.charAt(0) == 'y')) {
					System.out.println("System Exit");
					System.exit(0);
				}
			} while(true);
		}
		catch(Exception e) { 
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}
