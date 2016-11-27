import java.util.InputMismatchException;
import java.util.Scanner;


public class UseGuestHouse {
	/**
	 *  userInput is function which is take input from user and validate it.
	 *
	 */
	String userInputs()
	{
		Scanner scanner =new  Scanner(System.in);
		String input=scanner.nextLine();
		return input;

	}
	/**
	 *  userInput is function which is take input from user and validate it.
	 *
	 */
	static int userInput() {
    	int number = 0;
    	Scanner sc = new Scanner(System.in);
    	try {
    		number = sc.nextInt();
    		if(number<0)
    		{	System.out.println("number can't be negative");
    		   number=userInput();
    		}
    	   	return number;
    	}
    	catch(InputMismatchException e) {
    		System.out.println("\n enter only integer");
    		number = userInput();
    	}
    	return number;
    }
	/**
	 *  storePersonDetail is function store the user detail.
	 *
	 */
	void storePersonDetail(GuestHouse guestHouse)
	{ String name;
	   int age;
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter name of person ");
	 name=userInputs();
	 System.out.println("Enter age of person ");
	  age=userInput();
	  guestHouse.allocate(name,guestHouse.hashFunction(age));
	
	}
	
	
	public  static void  main(String agrs[])
	{
	Scanner scanner= new Scanner(System.in);
	int noOfCustomer=0;
	int choice=0; 
	GuestHouse guestHouse=new GuestHouse();
    UseGuestHouse house=new UseGuestHouse();
	while(choice!=4)
	{
	System.out.println("Enter your choice: ");
	System.out.println("1. Allocate persons to rooms");
	System.out.println("2. search person according to room");
	System.out.println("3. show list of rooms");
	System.out.println("4. Exit");
	
	choice = userInput();
	switch(choice) {
	
	case 1:
		       System.out.println("The guest house have 29 rooms so enter total no of person "
		 		+ "which is less than total no of rooms  \n Enter the number of person");
        	          noOfCustomer=userInput();
        	         while(noOfCustomer>guestHouse.noOfRooms)
        	         {
        	        	 System.out.println("please enter valid no of persons");
        	        	 noOfCustomer=userInput();
        	         }
	         for(int count=0;count<noOfCustomer;count++)
	        	 {
	        	 house.storePersonDetail(guestHouse);
	        	 
	              
	              }
	             break;
	case 2:   if(noOfCustomer==0 )
               	{
		        System.out.println("guest house is empty.");
               	}
	         else
	          {   System.out.println("Enter the age which do you want search persons");
 	             int age=userInput();
	             guestHouse.printDetail(age);
	          }
	         break;
	
	case 3: System.out.println("All detail of guest house rooms is ->");
	        guestHouse.allDetail();
	        break;
	case 4: choice=4;        
            break;
    default:  System.out.println("Enter correct choice");        
	  }
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
