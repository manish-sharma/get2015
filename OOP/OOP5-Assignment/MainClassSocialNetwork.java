

import java.io.*;
import java.util.*;

public class MainClassSocialNetwork {
	                 String name, email, phone, description, address;
	                 String fileName; 
	                 String line ="";
	                 static FileReader fileReader; 
                     static BufferedReader bufferedReader; 
                     static FileWriter fileWriter;
                     static BufferedWriter bufferedWriter;
                     Scanner scan = new Scanner(System.in);
	
 public static void main(String args[]) throws IOException {
		            MainClassSocialNetwork  mainClassSocialNetwork = new MainClassSocialNetwork();
		            mainClassSocialNetwork.displayMenu();
	}

	
 private void displayMenu() throws IOException {
		           MainClassSocialNetwork mainClassSocialNetwork = new MainClassSocialNetwork();
		           int flagMainMenu = 1;
		           OperationsOnEntities operationsOnEntities=new OperationsOnEntities();
	try{
	  
		while (flagMainMenu != 0) {
			       System.out.println("Enter 0 for exit");
			       System.out.println("Enter 1 to sign up");
			       System.out.println("Enter 2 for sign in ");
			       int userInput = scan.nextInt();
	switch (userInput) {
			 
	        case 1:
				
				   mainClassSocialNetwork.entityMenu();
				           break;
			 case 2:
				
				    Verification verification=new Verification();
				    String mailId=null;
				    System.out.println("Sign in with your account,Enter your mail Id");
				    mailId=scan.next();
				  
		if(verification.checkId(mailId) == 1){
					System.out.println("Friend Requests:");
					MainClassSocialNetwork mainClassSocialNetwork2 = new MainClassSocialNetwork();
					String userName = mainClassSocialNetwork2.showFriendRequests(mailId);
					
			     	int flagChoice = 1; 
			     	int choice=0;       
		 while(flagChoice!=3){
		            	 System.out.println("Press 1 to show FriendList");
		            	 System.out.println("Press 2 to Search By Name");	
		            	 System.out.println("Press 3 to sign Out");
		            	 choice = scan.nextInt();
		            	 flagChoice = choice;
		switch (choice) {
		            case 1:
		            	 operationsOnEntities.showFriendList(userName,mailId);
		            	    break;
		            case 2:
		            	String friend = null;
		 				Scanner scanner = new Scanner(System.in);
		 				System.out.println("Enter name of person or organization whom you want to search");
		 				friend = scanner.next();
		 				operationsOnEntities.searchEntityByName(friend,userName,mailId);
		 					break;
		            case 3:
		            		
			             System.out.println("You are succesfully Loged Out");
		            	 mainClassSocialNetwork.displayMenu();
		 				    break;
		         }
		 }
  }
		
		else {
				      System.out.println("This Account does not exist ,Sign up with this account\n");
				}
				      break;
		case 0:
			             flagMainMenu = 0;
				         System.exit(0);
		default:
				      System.out.println("Choose correct option");
				     break;

			}
		
		}
	   }catch(InputMismatchException inputMismatchException){
		        System.out.println("Enter only Integer type Values");
		        return;
	   }catch(Exception exception){
		        System.out.println(exception);
		        return;
	   }
	}

      private String showFriendRequests( String mailId) {
                                int count=0;
                                String fileName="Nodes.txt"; 
		                        String line = null;
	                            BufferedReader bufferedReader = null;
                                ArrayList<String> userData = new ArrayList<String>();
                                String userName = null;
								MainClassSocialNetwork mainClassSocialNetwork = new MainClassSocialNetwork();
	              try {
	                           fileReader = new FileReader(fileName);
		                       bufferedReader= new BufferedReader(fileReader);
		                       fileWriter = new FileWriter(fileName,true);
		                       bufferedWriter= new BufferedWriter(fileWriter);
		       
                 while(!(line = bufferedReader.readLine()).equalsIgnoreCase(mailId+"-") && line != null) {
    	                        userData.add(line);
                	            count++;
                 }  
                                userName =userData.get(count-1);
                                try{
                      			  
                          		  while(!(line = bufferedReader.readLine()).equalsIgnoreCase("#")) {
                          		            	
                          		              System.out.println(line);
                          		              System.out.println("Press 1 to add");
                          		              System.out.println("Press 2 to ignore");
											int choice=scan.nextInt();
                          		 switch (choice) {
                          				case 1:
                          					   int i=0;
                          					   StringTokenizer stringTokenizer=new StringTokenizer(line,"-,");
                          					   String [] Tocken=new String[4];
                          							
                          		  while(stringTokenizer.hasMoreTokens()){
                          						
                          			            Tocken[i]=stringTokenizer.nextToken();
                          						i++;
                          				}
                          						String friendName=Tocken[0];
                          						String friendEmailID=Tocken[1];
                          						Verification verification = new Verification();
                          						
                          						if(verification.checkId(friendEmailID) == 1 ){
									OperationsOnEntities operationsOnEntities = new OperationsOnEntities();
									operationsOnEntities.acceptFriendRequest(userName ,mailId,friendName,friendEmailID );
									mainClassSocialNetwork.removeText(userName,mailId,line);
                          						}
                          						else
                          						{
                          							System.out.println(" This Entity not have an account");
                          						}
                          							break;

                                            case 2:
                          							break;
                          				  default:
                          							break;
                          						} 
                          		  }
                          		             bufferedReader.close();
                          		             
                          		          } catch(IOException a) {
                          		        	  System.out.println("IOException");
                          		        
                          		          }

                } catch(IOException o) {
    	                   System.out.println("IOException");
                      }
	              
	                            return userName;
}


private void removeText(String userName, String mailID,String line1) throws IOException {
	
		           String fileName="Nodes.txt"; 
		           String line = null;
	               ArrayList<String> database = new ArrayList<String>();
        try {
		           FileReader fileReader = new FileReader(fileName);
                   BufferedReader bufferedReader = new BufferedReader(fileReader);
       while((line = bufferedReader.readLine()) != null) {
		           database.add(line);   
		     }    
                   bufferedReader.close();            
		  
        }catch(FileNotFoundException ex) {
		          System.out.println("Unable to open file '" +fileName + "'"); 
		      }catch(IOException ex) {
		          System.out.println("Error reading file '"+ fileName + "'");   
		    }
                  int p=0,q=0;
                  ArrayList<String> newList=new ArrayList<String>();
 	  
       for(int i=0;i<database.size();i++){
 			
 	  
    	   if(database.get(i).equalsIgnoreCase(userName)){
 				
 	    
    		   if(database.get(i+1).equalsIgnoreCase(mailID+"-")){ 
 			      p=i+2;
 			      
   	  
 	               while(!((database.get(p)).equals("#"))){//p=i;
   	
   	
 	            	   if(database.get(p).equalsIgnoreCase(line1)){ 
   			                      q=p; 		       					
    
   			                      for(int j=p+1;j<database.size();j++){
   				  
	                                     newList.add(database.get(j));
   				                        }
   			                    	}
   		                                 p++;
   		
 				                         break;
 		                    	}
 	                 	}
              	}
         }
 		
 	try{
     		
 	     		 FileWriter fileWriter1=new FileWriter(fileName);
 				 BufferedWriter bufferedWriter1=new BufferedWriter(fileWriter1);
 	     		 ArrayList<String> database1=new ArrayList<String>();
 	  for(int i=0;i<q;i++){
 	     		
 		        database1.add(database.get(i));
 	     				
 	     	}
 	     		int j;
 	 for(j=0;j<newList.size();j++){			
 	     	   database1.add(newList.get(j));
 	     				
 	     	}		
 	for(int count=0;count<database1.size();count++){
 	     	  
 	     	  bufferedWriter1.write(database1.get(count).toString());
 	     	  bufferedWriter1.newLine();
 	     	}
 	     			
 	         bufferedWriter1.close();
 	      }catch(Exception e){
 			
 	    	System.out.println("exception in send request");
 	              
 			}
	}


private void entityMenu(){
		       MainClassSocialNetwork mainClassSocialNetwork=new MainClassSocialNetwork();
		       int sign = 0;
		       int flag6=0;
		        System.out.println("Enter 1 for sign up with person\nEnter 2 for sign up with an Organization");
	
		while (flag6!=1){
			
			     sign = scan.nextInt();
			
	   switch (sign) {
			
	        case 1:
				flag6=1;
				name = scan.nextLine();
				System.out.println("Enter name of a person");
				name = scan.nextLine();
				System.out.println("Enter email Id of a person");
				email = scan.nextLine();
				System.out.println("Enter phone no. of a person");
				phone = scan.nextLine();
				System.out.println("Enter description of a person");
				description = scan.nextLine();
				System.out.println("Enter address of a person");
				address = scan.nextLine();
				Person person = new Person(name, email, phone,description, address);
				person.schoolOrCollegeRecords();
				person.interestRecords();
				person.AddPerson();
				break;
		 case 2:
				flag6=1;
				name = scan.nextLine();
				System.out.println("Enter name of Organization");
				name = scan.nextLine();
				System.out.println("Enter email Id of Organization");
				email = scan.nextLine();
				System.out.println("Enter phone no. of Organization");
				phone = scan.nextLine();
				System.out.println("Enter description of Organization");
				description = scan.nextLine();
				System.out.println("Enter address of an Organization");
				address = scan.nextLine();
				int flag7=0; 
				mainClassSocialNetwork.organizationMenu(flag7);
				    break;
		default:
				System.out.println("Please Enter 1 for sign up with person\nEnter 2 for sign up with an Organization");
				break;
			}
		}
		
	}

	
private void organizationMenu(int flag7) {
		       int sign1;
		       System.out.println("Enter 1 if Organization is any School\nEnter 2 if Organization is any College");
		
		while (flag7!=1) {
			
			  sign1 = scan.nextInt();
	   switch (sign1) {
			case 1:
				    flag7=1;
				    School school = new  School(name, email, phone,description, address);
				    school.coursesOrStandardRecords();
				    school.AddSchool();
				     break;
			case 2:
				  flag7=1;
				  College college = new College(name, email,phone, description, address);
				  college.placementRecord();
				  college.coursesOrStandardRecords();
				            break;
			default:
				System.out.println("Please Enter 1 if Organization is any School\nEnter 2 if Organization is any College");
				              break;

			}
		}
	}
}
