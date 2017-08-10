import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/*This class forms the node for the graph reading data from the file and forming node to store in hashmap 
 * @author Shishir Pareek
 * Date 24th August 2015
 */
public class Node {
HashMap<String,Person> personList=new HashMap<String,Person>();
    /*function to read user data from the file and adding node in hashmap*/
    public  HashMap<String,Person> addNode() throws IOException{
        //try block starts
        try {
        	//string tokenizer object to forms tokens of String
			StringTokenizer stringTokenizer;
			//reading file using input Stream
			FileInputStream fin = new FileInputStream(new File(".\\src\\Person.txt"));
			//data from the file is transferred into data input  
			DataInputStream in = new DataInputStream(fin);
			//buffered reader to store the data read from file
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String personData="";//String Object
			int i=1;
			String email="",name="",phoneNumber="",hobbies="";
			//Loop for reading the data from the file
			while ((personData = br.readLine()) != null) {
                           Person person;
                //putting the read data into string tokens
				stringTokenizer = new StringTokenizer(personData,","); 
				 i=1;
				 //loop to add data from string tokenizer to string objects
				 while (stringTokenizer.hasMoreTokens()) {  
			         //checking for the type of data read 1 for email
					 if(i==1){  
			        	 email=stringTokenizer.nextToken();
			         }
					 //Checking for name token
			         else if(i==2){
			        	 name=stringTokenizer.nextToken();
			         }
					 //checking for phone number token
			         else if(i==3){
			        	 phoneNumber=stringTokenizer.nextToken();
			         }
					 //condition for hobbies
			         else{
			        	 hobbies=stringTokenizer.nextToken();
			         }
			         
			        	i++; //incrementing whenever a condition matches
			     }
				 //converting phone number into long through wrapper classes 
			long phoneNum= Long.parseLong(phoneNumber);
			
			//creating object of person
			person=new Person(email,name,phoneNum);
			person.setHobbies(hobbies);
			//putting person object into hashmap where email id is key 
			personList.put(email, person);
        }
        fin.close();//closing file
    } catch (FileNotFoundException e) {
		e.printStackTrace();
	}
    return personList;//returning the hashmap
    }
}