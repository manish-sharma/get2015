/****************************************************************************************
Name            : Node
Revision Log    : 2015-08-24: Babalu patidar : created.
                : 
                : 
Use             : This class is used to create Node of social network
                :
****************************************************************************************/


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Node {
    HashMap<String,Person> personList=new HashMap<String,Person>();
    HashMap<String,Organisation> organisationList=new HashMap<String,Organisation>();
    
    //Method addPersonNode is used to crate node and input from file person.txt
    public  HashMap<String,Person> addPersonNode() throws IOException{
        
        try {
			StringTokenizer stringTokenizer;
			FileInputStream fin = new FileInputStream(new File(".\\src\\Person.txt"));
			DataInputStream in = new DataInputStream(fin);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String personData="";
			int i=1;
			String email="",name="",phoneNumber="",interest="";
			//while loop is used for read data from file
			while ((personData = br.readLine()) != null) {
				
				Person person;
				stringTokenizer = new StringTokenizer(personData,","); 
				i=1;
				while (stringTokenizer.hasMoreTokens()) {  
					
			        if(i==1){  
			        	email=stringTokenizer.nextToken();
			        }
			        else if(i==2){
			        	name=stringTokenizer.nextToken();
			        }
			        else if(i==3){
			        	phoneNumber=stringTokenizer.nextToken();
			        }
			        else{
			        	 interest=stringTokenizer.nextToken();
			        }
			        
			        i++; 
				}
				long phoneNum= Long.parseLong(phoneNumber);
				person=new Person(phoneNum,email,name);
                person.setInterest(interest);
				personList.put(email, person);
			}
			//End of while
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        return personList;
	}
    //End of  method addPersonNode
    
    //Method addOrgnisationNode is used to crate node and input from file organisation.txt
	public  HashMap<String,Organisation> addOrganisationNode() throws IOException{
	    
	    try {
			StringTokenizer stringTokenizer;
			FileInputStream fin = new FileInputStream(new File(".\\src\\organisation.txt"));
			DataInputStream in = new DataInputStream(fin);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String organisationData="";
			int i=1;
			String email="",name="",phoneNumber="",placementRecord="";
			//while loop is used for read data from file
			while ((organisationData = br.readLine()) != null) {
				Organisation organisation;
				stringTokenizer = new StringTokenizer(organisationData,","); 
			 	i=1;
			 	while (stringTokenizer.hasMoreTokens()) {  
			 		
			         if(i==1){  
			        	 email=stringTokenizer.nextToken();
			         }
			         else if(i==2){
			        	 name=stringTokenizer.nextToken();
			         }
			         else if(i==3){
			        	 phoneNumber=stringTokenizer.nextToken();
			         }
			         else{
			        	 placementRecord=stringTokenizer.nextToken();
			         }
			         
			         i++; 
			 	}
			 	long phoneNum= Long.parseLong(phoneNumber);
				organisation=new Organisation(phoneNum,email,name);
				organisation.setPlacementRecord(placementRecord);
				organisationList.put(email,organisation);
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    return organisationList;
	}
	//End of method


}
//End of class
    
    

