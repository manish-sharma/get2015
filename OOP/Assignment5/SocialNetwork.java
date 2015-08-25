/****************************************************************************************
Name            : SocialNetwork
Revision Log    : 2015-08-24: Babalu patidar : created.
                : 
                : 
Use             : This class is used to handle social network
                :
****************************************************************************************/

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocialNetwork {
    
    
    //Start of main
	//@param HashMap Person :Specify all person entity
	//@param HashMap Organisation :Specify all Organisation entity
	//@param Node 
    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
        HashMap<String,Person> personList=new HashMap<String,Person>();
        HashMap<String,Organisation> organisationList=new HashMap<String,Organisation>();
        
        Node node=new Node();
        try {
        	
        	//calling method to add all person nodes in social network
        	personList =node.addPersonNode();
        	organisationList=node.addOrganisationNode();
        } 
        catch (IOException ex) {
            Logger.getLogger(SocialNetwork.class.getName()).log(Level.SEVERE, null, ex);
        }
        String choice = "1";
        
       
       //While loop is used for handle input from person or orgnisation 
       while(true){
    	   
    	   
	       System.out.println("If you are of person type user press 1 \nand for Organisation type press 2 ");
	       String type=scan.next();  
		   if(type.equals("1")){  
			   
	   
		        System.out.println("Enter your Email Id");
		        String email;
	        
		        email = scan.next();
		        if(personList.containsKey(email)){
		        	
	        	
		        	Person currentPerson=null;
		        	Graph graph=new Graph();
		        	//getting current person object
		        	currentPerson=personList.get(email);
		        	System.out.println("\nWelcome "+currentPerson.name+"\n"+"Mobile No. - "+currentPerson.phoneNumber+"\n"+"your Interest is - "+currentPerson.getInterest());
		                   
		        	while(true){
		        		System.out.println("\npress 1 to see your friend List");
		        		System.out.println("press 2 to add your friend");
		        		System.out.println("press 3 to remove your friend");
		        		System.out.println("press 4 for Sign Out");
		        		System.out.println("press 5 exit the application");
	        			choice=scan.next();
	                    if(choice.equals("1")||choice.equals("2")||choice.equals("3")||choice.equals("4")||choice.equals("5")){
	                    	
	                    
	                    	if(choice.equals("1")){
	                    		//calling method to show list of all friends
	                    		currentPerson.showFriends();
	                    	}
	                    	//End of if "1"
	                    	if(choice.equals("2")){
	                    		System.out.println("please enter your friends Email ID");
	                    		String friendEmail=scan.next();
	                    		if(personList.containsKey(friendEmail)){ 
	                    			Person addFriend=personList.get(friendEmail);
	                    			//calling method to add connection between the persons
	                    			graph.addConnection(currentPerson, addFriend);
	                    		}
	                    		if(organisationList.containsKey(friendEmail)){
	                    			Organisation addFriend=organisationList.get(friendEmail);
	                    			//calling method to add connection between the persons
	                    			graph.addConnection(currentPerson, addFriend);
	                    	
	                    		}
	                    		else{
	                    			System.out.println("\nYou entered Incorrect Email Id !!");
	                    		}
	                    	}
	                    	//End of if "2"
	                   
	                    	if(choice.equals("3")){
	                       
	                    		System.out.println("please enter your frinds Email ID whom you want to remove");
	                    		String friendEmail=scan.next();
	                    		if(personList.containsKey(friendEmail)){
	                    			if(currentPerson.friends.containsKey(friendEmail)){
	                    				Person friendToRemove=personList.get(friendEmail);
	                    				//calling method to remove connection between the persons
	                    				graph.removeConnection(currentPerson, friendToRemove);
	                    			}
	                    		}
	                    		if(organisationList.containsKey(friendEmail)){
	                	 
	                    			Organisation friendToRemove=organisationList.get(friendEmail);
	                    			graph.removeConnection(currentPerson, friendToRemove);
	                    		}
	                    		else{
	                    			System.out.println("\nYou entered Incorrect Email Id !!");
	                    		}
	                    	}
	                    	//End of if "3"
	                   
	                    	if(choice.equals("4")){
	                    		break;
	                    	}
	                    	//End of if "4"
	                    	if(choice.equals("5")){
	                    		System.exit(0);
	                    	}
	                    	//End of if "5"
	                   }
	                   else{
	                	   System.out.println("Please choose correct option !");
	                   }
		        	}
		        	//End of while
		        
		        }
		        else{
		    	    System.out.println("please enter Valid Email Id");
		        }
		   }
		   //End of if
		   
		   else if(type.equals("2")){
			   
			   System.out.println("Enter your Email Id");
			   String email;
            
			   email = scan.next();
			   if(organisationList.containsKey(email)){
				   Organisation currentOrganisation=null;
				   Graph graph=new Graph();
				   //getting current person object
				   currentOrganisation=organisationList.get(email);
				   System.out.println("\nWelcome "+currentOrganisation.name+"\n"+"Contact No. - "+currentOrganisation.phoneNumber+"\n"+"Campus Placement is - "+currentOrganisation.getPlacementRecord());
                       
				   while(true){
					   System.out.println("\npress 1 to see your Organisation Member List");
					   System.out.println("press 2 to add any Member");
					   System.out.println("press 3 to remove any Member");
					   System.out.println("press 4 for Sign Out");
					   System.out.println("press 5 exit the application");
					   choice=scan.next();
					   if(choice.equals("1")||choice.equals("2")||choice.equals("3")||choice.equals("4")||choice.equals("5")){
						   
						   if(choice.equals("1")){
							   //calling method to show list of all friends
							   currentOrganisation.showFriends();
						   }
						   //End of if "1"
						   if(choice.equals("2")){
							   System.out.println("please enter your friends Email ID");
							   String friendEmail=scan.next();
                        
							   if(organisationList.containsKey(friendEmail)){ 
								   Organisation addFriend=organisationList.get(friendEmail);
								   //calling method to add connection between the persons
								   graph.addConnection(currentOrganisation, addFriend);
							   }
							   if(personList.containsKey(friendEmail)){
								   Person addFriend=personList.get(friendEmail);
								   //calling method to add connection between the persons
								   graph.addConnection(currentOrganisation, addFriend);
							   }
							   else{
                        
								   System.out.println("\nYou entered Incorrect Email Id !!");
							   }
						   }
						   //End of if "2"
                       
						   if(choice.equals("3")){
                           
							   System.out.println("please enter your Member Email ID whom you want to remove");
							   String friendEmail=scan.next();
							   if(organisationList.containsKey(friendEmail)){
								   if(currentOrganisation.friends.containsKey(friendEmail)){
									   Organisation friendToRemove=organisationList.get(friendEmail);
									   //calling method to remove connection between the persons
									   graph.removeConnection(currentOrganisation, friendToRemove);
								   }
							   }
							   if(personList.containsKey(friendEmail)){
                    	 
								   Person friendToRemove=personList.get(friendEmail);
								   graph.removeConnection(currentOrganisation, friendToRemove);
							   }
							   else{
								   System.out.println("\nYou entered Incorrect Email Id !!");
							   }
						   }
						   //End of if "3"
						   if(choice.equals("4")){
							   break;
						   }
						   //End of if "4"
						   if(choice.equals("5")){
							   System.exit(0);
						   }
						   //End of if "5"
					   }
					   else{
						   System.out.println("Please choose correct option !");
					   }
                        
				   }
				   //End of while
            
			   }
			   //End of if
			   else{
				   System.out.println("please enter Valid Email Id");
			   }
        }
		//End of if(type.equals("2")) 
        else{
        	System.out.println("Invalid Input either choose 1 or 2");
        }
                    
             
       }
       //End of while
                        
    }
    //End of main
}
//End of class
