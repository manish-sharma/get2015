import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/*This class implements the main function and all the working starts from here and what all will be done here will be
 * visible to user only
 * @author Shishir Pareek
 * Date 24th August 2015
 */

public class SocialNetwork {
   /*main function starts*/
	public static void main(String args[])
	{ 
		/*hashmap to store use email id as key and its details as object person*/
		HashMap<String,Person> personMap=new HashMap<String,Person>();
		//Object of node type 
		Node node = new Node();
		try{
			/*calling function to read user data from file and storing it in hashmap and 
			returning it*/
			personMap = node.addNode();
		}
		catch(IOException ex){
			//to catch exception if file doesn't exists
			System.out.print("File Does not exists");
		 Logger.getLogger(SocialNetwork.class.getName()).log(Level.SEVERE, null, ex);
		}
    String choice = "1";
	//Infinite loop to display menu and take inputs based on user inputs 
    while(true)
	{
		System.out.print("Enter email id");
		String emailID;
		Scanner sc = new Scanner(System.in);
		emailID=sc.nextLine();
		if(personMap.containsKey(emailID))//checking if the user exists or not 
		{
			Person currentUser=null;
			currentUser = personMap.get(emailID);//getting user details 
			Graph graph=new Graph();
			System.out.println("Welcome " + currentUser.getName() + "Phone Number " + currentUser.getPhoneNo() + "Hobbies"
					+ currentUser.getHobbies());
			while(true)//loop to display inner menu
			{
				 System.out.println("\npress 1 to see your friend List");
			        System.out.println("press 2 to add your friend");
			        System.out.println("press 3 to remove your friend");
			        System.out.println("press 4 for Sign Out");
			        System.out.println("press 5 exit the application");
			        choice=sc.next();
			        //condition to check the choice of user input
			        if(choice.equals("1")||choice.equals("2")||choice.equals("3")||choice.equals("4")||choice.equals("5"))
			        	{
			        	//if user choose 1st option
	                    if(choice.equals("1")){
	                    	//calling method to show list of all friends
	                       currentUser.showFriends();
	                      }
	                    //if user choose second option 
	                    if(choice.equals("2")){
	                    	System.out.println("Enter the emailID of the person you want to add");
	                    	String friendEmailID=sc.next();//reading the id of the friend user want to add 
	                    	if(personMap.containsKey(friendEmailID)){//if such user exists of not
	                    		Person addedFriend=personMap.get(friendEmailID);//getting details of friend 
	                    		graph.addConnection(currentUser,addedFriend);//adding connection between user and the friend
	                    	}
	                    	else
	                    	{
	                    		System.out.print("You have entered wrong emailID");//if entered id is wrong or doesn't exists
	                    	}
	                    }
	                    /*if user choose option 3rd*/
	                    if(choice.equals("3"))
	                    {
	                    	System.out.print("Enter the emailID of friend you want to remove");
	                    	/*email id of person user want tot remove*/
	                    	String removeFriendEmailID=sc.next();
	                    	/*checking if the user is friend with him or not*/
	                    	if(currentUser.friend.containsKey(removeFriendEmailID))
	                    	{
	                    		Person friendToRemove=personMap.get(removeFriendEmailID);//getting friend details
	                    		graph.removeConnection(currentUser,friendToRemove);//removing friend
	                    	}
	                    	else
	                    	{
	                    		System.out.println("You have enetred wrong email ID");//entered id is wrong
	                    	}
	                    }
	                    /*checking if user choice is 4*/
	                    if(choice.equals("4"))
	                    {
	                    	break;//signing out
	                    }
	                    /*checking if user choice is 5th option*/
	                    if(choice.equals("5"))
	                    {
	                        System.exit(0);//exiting the system
	                    }
			       	}
	                    else
	                    {
	                 	   System.out.println("Please choose correct option !");//if user entered the wrong choice
	                    }
	                     
	                }
	         
	        }
	        else
	        {
	             System.out.println("please enter Valid Email Id");//if entered email id by user is wrong 
	        }
	    }        
	}

}

