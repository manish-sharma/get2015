

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class OperationsOnEntities extends Entities{

	
	public void searchEntityByName(String friend,String userName,String emailID) throws IOException {
		      String fileName="UserDetails.txt"; 
		      String line = null;
	          ArrayList<String> database = new ArrayList<String>();
	  
	          Scanner scanner =new Scanner(System.in);
	          int flagsearch=0;
		
	  try {
			    FileReader fileReader = new FileReader(fileName);
		        BufferedReader bufferedReader = new BufferedReader(fileReader);
			   
     while((line = bufferedReader.readLine()) != null) {
			       
    	        database.add(line);   
			     }  
			
	for(int i=0;i<database.size();i++){
					
	if(database.get(i).equalsIgnoreCase("--"+friend+"-")){
						
		
		do{
				System.out.println(database.get(i));
				i++;
				
		}while(!database.get(i).equalsIgnoreCase("#"));
						System.out.println("\n");
						flagsearch=1;
					}
					
				}
				       bufferedReader.close(); 
		 } catch(FileNotFoundException ex) {
		             System.out.println("Unable to open file '" +fileName + "'"); 
		     
		 }catch(IOException ex) {
		            System.out.println("Error reading file '"+ fileName + "'");   
		           }
				
	  if(flagsearch == 0){
					System.out.println(friend+" not have  account!!!:)");
				}
			     
	   else{  
					int flagsendrequest=0;
	                System.out.println("Prees 1 to Send Friend Request");
	                System.out.println("Otherwise press any other no. key");
	                int choice=scanner.nextInt();
	   if(choice==1) {  
		             String line1=null;
	            	 System.out.println("Enter name and Email of person whom you want to send friend request");
	      	         String Name=scanner.next();
	      	         String friendEmailID=scanner.next();
	      	         if(new Verification().checkId(friendEmailID) == 1){
	      	      
	   try{ 
	      	         FileReader fileReader1 = new FileReader("Nodes.txt");  
	      	         BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
	      	              
	  while ((line1=bufferedReader1.readLine())!=null) {
					      
		if(line1.contains(friendEmailID)) {
						     
			while(!(line1=bufferedReader1.readLine()).equalsIgnoreCase("#")){
							
				if(line1.contains(emailID)){
					flagsendrequest=1;
								
				}
						
			}
					   
		}	 
		
	  }
	      	          bufferedReader1.close();
		              
	   }catch(FileNotFoundException fe) {
		                System.out.println("file not found");
		      	        
	   }catch(IOException ioe){
		      	        System.out.println("IO exception");
		      	         }
	      	         }
	    else{
	    	           System.out.println("Wrong email");
	    }
	    if(flagsendrequest==0){
	      	     
	    	try{   
	      	        FileReader fileReader = new FileReader("FriendList1.txt");
			        BufferedReader bufferedReader = new BufferedReader(fileReader);
				  
			while((line1 = bufferedReader.readLine()) != null){
				    	
				    System.out.println("friends");
			      
			 if(line1.contains(emailID)){
	            	
				 if(line1.contains(friendEmailID))
	            	flagsendrequest=1;
	            	  break;
			      }
			 }
				    bufferedReader.close();
					
	        }catch(FileNotFoundException fe)
	      	         {
	            	 System.out.println("file not found");
	       }catch(IOException ioe){
	      	         System.out.println("IO exception");
	      	         }
	      	     
		 if(flagsendrequest==0){
				     new OperationsOnEntities().sendFriendRequest( userName, emailID, Name, friendEmailID);
				     System.out.print("Friend request sent to " + Name + "\n");
				    }
				 else  
				     System.out.println("you are already friend with "+Name);
					
				}  
	      else{
          	        System.out.println("you have already sent friend request to "+Name);
          }
	      }
	            
				}     
		
	}
	
public void sendFriendRequest(String userName,String emailID,String friendName,String friendEmailID) throws IOException{
		
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
		     
	  } catch(IOException ex) {
		          System.out.println("Error reading file '"+ fileName + "'");   
		           }

		          int p=0;
                  ArrayList<String> newList=new ArrayList<String>();
     		 
       for(int i=0;i<database.size();i++){
    	   
    	   if(database.get(i).equalsIgnoreCase("----"+friendName+"-")){
     				
     				
    		if(database.get(i+1).equalsIgnoreCase(friendEmailID+"-")){
     					
    			
     		 for(int j=i+2;j<database.size();j++){
     					
     			 newList.add(database.get(j));
     		}
     					
     			 p=i+1;
     				
    		}
     				break;
     	}
    }
     		

     	try{
     		
          		 FileWriter fileWriter1=new FileWriter(fileName);
			     BufferedWriter bufferedWriter1=new BufferedWriter(fileWriter1);
     			 ArrayList<String> database1=new ArrayList<String>();
     			
        for(int i=0;i<=p;i++){
     			 database1.add(database.get(i));
     				
     			}
     		
     			database1.add(userName+","+emailID);
     			
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
			       System.out.println("exception in sendrequest");
              
		}
		
	}
			
	
	
public void acceptFriendRequest(String userName ,String emailID,String friendName, String friendEmailID) throws IOException{
		     
	               String fileName1="FriendList1.txt";
		
	   try {
      	           FileWriter fileWriter1 = new FileWriter(fileName1,true);
      	           BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
  	   
      	           bufferedWriter1.append(userName+ "(" +emailID +") friend with " +friendName+ "(" +friendEmailID+")" );
      	           bufferedWriter1.newLine();
      	           bufferedWriter1.close();  
     	           System.out.println(friendName + "  Added to your friend list");
   
	        }  catch(FileNotFoundException ex) {
                 System.out.println("Unable to open file '" +fileName1 + "'"); 
      
            } catch(IOException ex) {
                System.out.println("Error reading file '"+ fileName1 + "'");     
        }
	}
	
	
public void showFriendList(String userName, String mailId) {
		
		          String fileName="FriendList1.txt";
		          String line=null;
		          int flagfriendList=0;
		          Scanner scanner = new Scanner(System.in);
	
		try {
			     FileReader fileReader = new FileReader(fileName);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
           
        while((line = bufferedReader.readLine()) != null) {
            	
        if(line.contains(mailId)){
            		System.out.println(line);
            		flagfriendList=1;
            	}
            }
                    bufferedReader.close();
	  
	       	} catch(FileNotFoundException ex) {
                   System.out.println("Unable to open file '" +fileName + "'"); 
     
	       	} catch(IOException ex) {
	               System.out.println("Error reading file '"+ fileName + "'");   
   }
		      
		if(flagfriendList==0) {
		    	   System.out.println("You have an Empty FriendList");
		    	 
		    	   return;
		       }
		 
		else{
		    	       System.out.println("Prees 1 to Remove Friend");
		               System.out.println("Otherwise press any other no. key");
		               int choiceRemove=0;
		               choiceRemove= scanner.nextInt();
		          
		  if(choiceRemove == 1){   
		         	      System.out.println("Enter name and Email of person whom you want to remove from friend list");
		   	              String Name=scanner.next();
		   	              String friendEmailID=scanner.next();
		   	  if(new Verification().checkId(friendEmailID) == 1){
				          new OperationsOnEntities().removeFriend( userName, mailId, Name, friendEmailID); 
		          }
		   	 else{
		   		         System.out.println("Wrong Email");
		   	 }
		  }
		          
		  else{
		        	  
		        	   return;
		               }
		       }
		     
		    }

private void removeFriend(String userName, String mailId, String name,String friendEmailID) {
		          String fileName="FriendList1.txt"; 
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
		    
        } catch(IOException ex) {
		        System.out.println("Error reading file '"+ fileName + "'");   
		           }
                 int p=0;
                 int flagFriend=0;
                 ArrayList<String> newList=new ArrayList<String>();
 		
    for(int i=0;i<database.size();i++){
    	
 			if((database.get(i)).contains(mailId)){
 				
 				if((database.get(i)).contains(friendEmailID)){
 					flagFriend=1;
 					p=i;
 					break; 
 					
 				}				
 			}		       					
 		}
 		
 	if(flagFriend==1){
 		           
 		for(int j=p+1;j<database.size();j++){
   						newList.add(database.get(j));
   					}
 		
 		try{
     		
 	     		   FileWriter fileWriter1=new FileWriter("FriendList1.txt");
 				   BufferedWriter bufferedWriter1=new BufferedWriter(fileWriter1);
 	     		   ArrayList<String> database1=new ArrayList<String>();
 	     			
 	     for(int countremove=0;countremove<p;countremove++){
 	     			database1.add(database.get(countremove));
 	     				
 	     			}
 	     		
 	     		    int j;
 	     			
 	    for(j=0;j<newList.size();j++){
 	     				
 	     				database1.add(newList.get(j));	
 	     			}
 	     			
 	     for(int count=0;count<database1.size();count++){
 	     				
 	     				bufferedWriter1.write(database1.get(count).toString());
 	     				bufferedWriter1.newLine();
 	     			}
 	     			
 	                   System.out.println(name+" remove from your friend List");
 	                   bufferedWriter1.close();
 	           
 		}catch(Exception e){
 				      System.out.println("exception in sendrequest");
 	              
 			}
 		
	} 
 	          else{
 		             System.out.println(name+" is not your friend");
 	       }
		
     
	}

}