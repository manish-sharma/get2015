/**
 * Main class to take user input.
 * @author Sanjay
 */

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		String input, repeatChoice;
		int choice, number;
		try {
			sc = new Scanner(System.in);
			do{
				System.out.println("\nEnter list in string representation\n{eg. (4,(5,8),(2,(3,5),1),7)}");
				input = sc.next();
				if(Validation.isExpression(input)) {
					List list = new List(input);
					do {
						System.out.println("\nEnter choice :\n1. Traverse the list\n2. Find Max element in the list\n3. Find Sum of the elements\n4. Size of the list\n5. Structure Of list\n6. Find a number");
						do {// Validation
							System.out.println("Enter Positive Number");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							choice = sc.nextInt();
							} while (choice <= 0);
						
						switch(choice) { 
							case 1:
								if(!list.isEmpty()) {
									list.traverse(list.first);
								}
								else {
									System.out.println("List is empty");
								}
								break;
							case 2:
								if(!list.isEmpty())
									System.out.println("Max = " + list.max());
								else
									System.out.println("list is empty");
								break;
							case 3:
								if(!list.isEmpty())
									System.out.println("Sum = " + list.sum());
								else
									System.out.println("List is empty");
								break;
							case 4:
								if(!list.isEmpty())
									System.out.println("size = " + list.size());
								else
									System.out.println("List is empty");
								break;
							case 5:
								if(!list.isEmpty())
									System.out.println(list.first);
								else
									System.out.println("List is empty");
							case 6:
								System.out.println("Enter a number");
								while (!sc.hasNextInt()) {
									System.out.println("That's not a number!Please enter again");
									sc.next(); // this is important!
									}
									number = sc.nextInt();
								if(!list.isEmpty())
									if(list.find(number)) {
										System.out.println("Number is found");
									}
									else
										System.out.println("Number is not found");
								else
									System.out.println("List is empty");
								break;
							default : 
								System.out.println("Enter Correct Chocie");
						}
						System.out.println("\nDo you want to continue with the same list.\n Press y or Y for Yes and any other keyu for No");
						repeatChoice = sc.next();
						if(!(repeatChoice.charAt(0) == 'Y' || repeatChoice.charAt(0) == 'y')) {
							break;
						}
					} while(true);
				}
				else {
					System.out.println("Please provide valid List");
				}
				System.out.println("\nDo you want to provide another list\nPress Y or y for YES and any ither key for EXIT");
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
