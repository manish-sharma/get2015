import java.util.List;
import java.util.Scanner;


public class FactoryDemo 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		List<Developer> devloperList;
		Developer developer = null;
		String name;
		String role;
		
		String inputChoice ;
		final String YES_STRING = "Y";
		do
		{
			System.out.println("Press 1. For inserting Developer");
			System.out.println("Press 2. For Printing List");
			int choice= 0;
			do
			{
				System.out.println("Please Enter your Choice(>0 and <3)");
				while(!scanner.hasNextInt())
				{
					System.out.println("Please Enter Integer Value");
					scanner.next();
					
				}
				choice = scanner.nextInt();
			}while(choice<1||choice>2);
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter Role");
				role = scanner.next();
				developer = Company.getDeveloper(name, role);
				Company.addDeveloper(developer);
				break;
			case 2:
				devloperList =  Company.getDeveloperList();
			    for(Developer developer1 :devloperList)
			    {
			    	System.out.println(developer1);
			    }
			    break;
			 default:
				 System.out.println("You Entered Incorrect Choice");
			 }
			System.out.println("want to continue(y/n)");
			inputChoice = scanner.next();
		}while(inputChoice.equalsIgnoreCase(YES_STRING));
		scanner.close();
		
	}

}
