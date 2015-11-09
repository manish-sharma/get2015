package assignmentDS_4;
/**
 *below class is used for allotment of rooms in Hotel using hashtable
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-09-2
 */


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

//RoomAllotmenetSystem class
public class RoomAllotmentSystem {
	int totalNoOfRoom;
	Hashtable<Integer,Guest> hashTable;
	
	//constructor
	public RoomAllotmentSystem(int totalNoOfRoom)
	{
		super();
		this.totalNoOfRoom = totalNoOfRoom;
		this.hashTable = new Hashtable<Integer, Guest>();
	}
	
	/**
	 *below method is mainly doing allotment of room to the arrived guest using Hashtable
	 *here we use modulus operator as hash function
	 * @param age:age of the guest
	 * @param id :ID of the guest
	 * @param name :name of the guest
	 *
	 */
	public void doAllotement(int age,int id,String name)
	{
		boolean temp=false;
		int key=age % totalNoOfRoom;   //hash function for finding room no which will be alloted
		int i,index;
		i=index=key;
		while(hashTable.containsKey(index)) //check whether room is already reserved or not
		{
			index++;                       //if room is already reserved then set index at next blank position
			if(index==totalNoOfRoom)     
			{
				temp=true;
				break;
			}
		}
		
		/*
		 *below code is used to check if there is no room left empty from room no given by hash function to the last room in hotel.
		 *if not then check if there is any empty room from zero index to given key 
		 */
		if(temp)                        
		{
			System.out.println("Yes "+name);
			index=i;
			i=0;
			temp=false;
			while(i<index && hashTable.containsKey(i))
			{
				i++;
				if(i==index)
				{
					temp=true;
					break;
				}
			}
		}
		else
		{
			hashTable.put(index, new Guest(id,name,index));  //allote room at index position
			temp=false;
			
		}
		if(temp)
		{
			System.out.println("No vacant Room");
		}
		else
		{
			hashTable.put(i, new Guest(id,name,i));   //allote room at ith position that is in between zero and key given by hash function
			
		}
		
	}
	
	
	/**
	 *below method is used to show status of alloted rooms
	 */
	public void showAllotemenet()
	{
		Enumeration items = hashTable.keys();
		while(items.hasMoreElements())
		{
			int i=(int) items.nextElement();
			Guest guest=hashTable.get(i);
		
			
			     System.out.println(guest+"\n");
		}
			     
			
			
	}
	public static void main(String args[])
	{
		RoomAllotmentSystem roomAllotmentSystem = new RoomAllotmentSystem(7);
		Scanner sc=new Scanner(System.in);
		String ans="yes";
		int choice1;
		do
		{
			System.out.println("\nHotel Room Allotement System(Enter your choice)");
			System.out.println("1.Book a Room");
			System.out.println("2.Hotel booking status ");
			choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
				System.out.println("\nEnter your id");
				int id=sc.nextInt();
				System.out.println("\nSelect Your name");
				String name=sc.next();
				System.out.println("\nEnter your age");
				int age=sc.nextInt();
				roomAllotmentSystem.doAllotement(age, id, name);
				break;
			case 2:
				roomAllotmentSystem.showAllotemenet();
				break;
			default: System.out.println("You entered wrong choice");
			}
			System.out.println("\n\nDo you want to continue(press yes for continue)");
	    	ans=sc.next();
			
		}while(ans.equalsIgnoreCase("Yes"));
		sc.close();

	}
	

}

