import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class DisplayMenu extends AddFriend {
	
	public boolean isValidEmail(String mailId){
		
		String emailregex ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			        
	boolean b=	mailId.matches(emailregex);
			      
			        return b;
			    }
	
	void displayMenu(){
		DisplayMenu displayMenuObject = new DisplayMenu(); 
		while(true){
			System.out.println("Enter 1 to show friends");
			System.out.println("Enter 2 add friends");
			System.out.println("Enter 3 to delete / block friends");
			System.out.println("Enter 4 to delete account");
			System.out.println("Enter 5 to make account");
			System.out.println("Enter 6 to see graph of users");
			System.out.println("Enter 0 to exit");
			Scanner scan = new Scanner(System.in);
			int userInput =0;
			userInput = scan.nextInt();
			switch (userInput) {
			case 1:
				System.out.println("Enter your email");
				String email = scan.next();
				boolean checkEmail = displayMenuObject.isValidEmail(email);
				if(checkEmail){
					DisplayFriends displayFriendsObject = new DisplayFriends();
					displayFriendsObject.displayFriends(email);
				}
				else{
					System.out.println("Please enter a valid email id");
					
				}
				break;
			case 2:
				System.out.println("Enter your Email ID");
				String email1 = scan.next();
				checkEmail = displayMenuObject.isValidEmail(email1);
				if(checkEmail){
					System.out.println("Enter email of the person you want to add");
					String email2 = scan.next();
					checkEmail = displayMenuObject.isValidEmail(email2);
					if(checkEmail){
						super.addFriend(email1,email2);
					}
					else{
						System.out.println("Please Enter valid Email Id");
					}
					
				}
				else{
					System.out.println("Please Enter Valid Email Id");
				}
				break;
			case 3:
				System.out.println("Enter your email id");
				email1  = scan.next();
				checkEmail = isValidEmail(email1);
				if(checkEmail){
					System.out.println("Enter the email Id that you want to remove");
				 	String email2 = scan.next();
				 	checkEmail = isValidEmail(email2);
				 	if(checkEmail){
				 		RemoveFriend removeFriendObject = new RemoveFriend();
						removeFriendObject.removeFriend(email1, email2);
				 	}
				 	else{
				 		System.out.println("Enter valid Email");
				 	}
					
				}
				else{
					System.out.println("Please Enter a valid Email");
				}
				break;
			case 4:
				System.out.println("Enter your email id");
				email = scan.next();
				checkEmail = isValidEmail(email);
				if(checkEmail){
					RemoveUser removeUserObject = new RemoveUser();
					removeUserObject.removeUser(email);
				}
				else{
					System.out.println("Enter valid email");
				}
				break;
			case 5:
				System.out.println("Enter your email");
				email = scan.next();
				checkEmail = isValidEmail(email);
				if(checkEmail){
					System.out.println("Enter your first name");
					String firstName = scan.next();
					System.out.println("Enter your last name");
					String lastName = scan.next();
					String name = firstName +" "+ lastName;
					
					List<String> interest = new ArrayList<String>();
					while(true){
						System.out.println("Enter your interests");
						interest.add(scan.next()+"-");
						System.out.println("Press 1 to add more interests");
						System.out.println("Press 0 to move to next step");
						int userInputInterests = scan.nextInt();
						if(userInputInterests == 0){
							break;
						}
					}
					System.out.println("Enter some description about you");
					String description = scan.nextLine();
					description = scan.nextLine();
					AddUser addUserObject = new AddUser();
					addUserObject.addUser(name, interest, description, email);
				}
				else{
					System.out.println("Please enter valid email");
				}
				
				break;
			case 6:
				Graph object = new Graph();
				object.showGraph();
			case 0:
				System.exit(0);
			}
		}
	}
	 
}
