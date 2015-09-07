import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class RoomAllotment {
	
	public static void main(String[] args) {
		
		/* Initialization */
		final int NUMBEROFROOMS = 23;
		Scanner scan = null;
		BufferedReader bufferedReaderObj = null;
		try
		{
			scan = new Scanner(System.in);
			String name;
			int age, i, count = 1, roomNumber, hashCode, choice;
			boolean flag = true;
			Enumeration<Integer> roomNumbers;
			
			/* buffered reader object creation for taking names as input */
			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));	
			
			/* rooms is a hashTable that will contain room number as key
			 * and name of guest as data
			 */
			Hashtable<Integer, String> rooms = new Hashtable<Integer, String>();
			
			/* Intializing hash table */
			for(i = 0; i < NUMBEROFROOMS; i++)
			{
				rooms.put(i, "");
			}
			
			do
			{
				flag = true;
				System.out.println("1. Show Status of rooms");
				System.out.println("2. Allot room to a guest");
				System.out.println("3. Particular Room Status");
				System.out.println("4. Particular Person Status");
				System.out.println("5. Exit");
				System.out.println("Enter your choice: ");
				
				/* inputting user's choice */
				choice = Validation.isInteger();
				
				switch(choice)
				{
					 /* if choice is 1 then status of rooms will be displayed
					  * Status of rooms will be shown as
					  * Room number : name of alloted guest
					  */
					case 1:
						System.out.println("Status of rooms is: ");
						roomNumbers = rooms.keys();
						while(roomNumbers.hasMoreElements()) {
					         roomNumber = roomNumbers.nextElement();
					         System.out.println("Room "+(roomNumber) + " : " +
					         rooms.get(roomNumber));
						}
					    break;
				    
					    /* If choice is 2, then room is alloted to a new guest */
					case 2:
						System.out.println("Enter name of guest: ");
						while(true) {
							System.out.println("name : ");
							name = bufferedReaderObj.readLine();
							if(Validation.isName(name))
								break;
							else
								System.out.println("Please Enter a valid Name");
						}
						
						/* Age of guest must be 18 or above */
						System.out.println("Enter age of the guest: ");
						do {
							System.out.println("(Please Enter Positive integer Number greater than or equal to 18)");
							age = Validation.isInteger();
						} while(age < 18);
						
						hashCode = age % NUMBEROFROOMS;
						
						/* Searching a empty room for allotment */
						for(i = hashCode; i <= (NUMBEROFROOMS - 1);)
						{
							if(rooms.get(i).equals(""))
							{
								rooms.put(i, name);
								System.out.println("Room number "+i+" is alloted to "+name);
								flag = false;
								break;
							}
							else
							{
								i += 3;	// increasing room number by 3
							}
						}
						i = 0;
						while(flag)
						{
							for(int j = i; j <= (NUMBEROFROOMS - 1); j++)
							{
								if(rooms.get(j).equals(""))
								{
									rooms.put(j, name);
									System.out.println("Room number "+j+" is alloted to "+name);
									flag = false;
									break;
								}
								else
								{
									j += 3;
								}
							}
							i++;
						}
						count++;
						break;
						
						/* if choice is 3, then status of particular room will be displayed */
					case 3:
						System.out.println("Enter Room Number: ");
						do {
							System.out.println("(Please enter valid room number)");
						while(!scan.hasNextInt()) {
							System.out.println("Please Enter Integer Number");
							scan.next();
						}
						roomNumber = scan.nextInt();
						} while(roomNumber < 0 || roomNumber > (NUMBEROFROOMS - 1));
						
						if(rooms.get(roomNumber) != "")
							/* name of the guset to whom the room is alloted will be displayed */
							System.out.println("Room "+roomNumber+" is alloted to "+rooms.get(roomNumber));
						else
							/* if room is not alloted to anyone then this code will be executed */
							System.out.println("Room is not alloted to anyone yet");
						break;
						
						/* if choice is 4, then particular person will be searched
						 * whether he has been alloted any room or not 
						 */
					case 4:
						boolean flag2 = false;
						roomNumber = 0;
						
						/* Inputting name of the person */
						System.out.println("Enter Name: ");
						while(true) {
							System.out.println("name : ");
							name = bufferedReaderObj.readLine();
							if(Validation.isName(name))
								break;
							else
								System.out.println("Please Enter a valid Name");
						}
						
						/* Get all keys of the hashtable */
						roomNumbers = rooms.keys();
						
						/* Seaching for the person by using key */
						while(roomNumbers.hasMoreElements()) {
							roomNumber = roomNumbers.nextElement();
							if(rooms.get(roomNumber).equalsIgnoreCase(name)) {
					        	flag2 = true;
								break;
							}
						}
						
						/* If person is found then room number will be displayed */
						if(flag2 == true)
							System.out.println(name+" has been alloted room Number "+ roomNumber);
						
						/* If person is not found then this code will be executed */
						else
							System.out.println("Not alloted any room to "+name);
						break;
						
						/* if choice is 5, the system will be exited. */
					case 5:
						System.out.println("System Exited");
						System.exit(0);
						break;
						
						/* If none of the case value satisfies,
						 * then default part will be executed/
						 */
					default:
						System.out.println("Enter correct Choice");
				}
			} while(count <= NUMBEROFROOMS);
			
			if(count == NUMBEROFROOMS)
				System.out.println("All Rooms are full now");
			
			/* Showing status of rooms */
			System.out.println("Status of rooms is: ");
			roomNumbers = rooms.keys();
			while(roomNumbers.hasMoreElements()) {
		         roomNumber = roomNumbers.nextElement();
		         System.out.println("Room "+(roomNumber) + " : " +
		         rooms.get(roomNumber));
			}
			scan.close();
			bufferedReaderObj.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			scan.close();
		}
	}
}
