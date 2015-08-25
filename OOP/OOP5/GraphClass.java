

import java.io.*;
import java.util.*;

public class GraphClass {
	              int flag;
	              
public void addNodes(String name, String email, String phone, String description, String address){
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
		  
        } catch(FileNotFoundException ex) {
		        System.out.println("Unable to open file '" +fileName + "'"); 
		      }
		   
          catch(IOException ex) {
		            System.out.println("Error reading file '"+ fileName + "'");   
		      }
       
                 flag = 0;
	  
       for(int i=0;i<database.size();i++){
			
       if(database.get(i).equalsIgnoreCase(email+"-")) {
				
    	         flag = 1;
			}
		}
		
       if(flag==1){
			
    	          System.out.println(email + " already exist");
		}
		
       else{
			
         try {
            	  FileWriter fileWriter = new FileWriter(fileName,true);
            	  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            	  bufferedWriter.append("----"+name+"-");
            	  bufferedWriter.newLine();
            	  bufferedWriter.append(email+"-");
            	  bufferedWriter.newLine();
            	  bufferedWriter.append("#");
            	  bufferedWriter.newLine();
            	  bufferedWriter.close();  
			   
         }  catch(FileNotFoundException ex) {
	              System.out.println("Unable to open file '" +fileName + "'"); 
	            
	       
         }catch(IOException ex) {
	            System.out.println("Error reading file '"+ fileName + "'");      
	        }
            	  
		}
      
    }
        
}


