import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClassGuestRoom {

	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name="";
		int age;
		GuestHouse guestHouse=new GuestHouse(29);
		do
		{
			System.out.println("Enter your name");
			try
			{
				 name=br.readLine().trim();
			
				 if(name.equals(""))
				 {
					 System.out.println("please enter correct name");
					 continue;
				 }
				 System.out.println("Enter age");
				 age=Integer.parseInt(br.readLine());
			}
			catch(IOException io)
			{
				System.out.println("Error Occured please enter again");
				continue;
			}
			catch(NumberFormatException nf)
			{
				System.out.println("please enter valid input");
				continue;
			}
			if(age<18)
			{
				 System.out.println("Age should be grater than 18");
				 continue;
			 }
	   		int roomNo=guestHouse.allotRoom(name,age);
	   		if(roomNo==-1)
	   			System.out.println("Room no is not alloted");
	   		else
	   			System.out.println("Your room no is\t"+roomNo);
			System.out.println("press 1 for Continue else for press 0");
			int choice=0;
			try
			{
				choice=Integer.parseInt(br.readLine());
			}
			catch(IOException io)
			{
				System.out.println("Error Occured please enter again");
			}
			catch(NumberFormatException nf)
			{
				System.out.println("please enter valid input");
				continue;
			}
			if(choice==1)
				 continue;
			else 
				break;
		}while(true);
		
		guestHouse.display();
	}
}
