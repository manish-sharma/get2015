

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Entities extends Nodes{
	
	
	               protected String name,email,phone,description,address;
	
	
public void AddEntity(int id,String name, String email, String phone, String description, String address, String schoolOrCollegeName, String subOrStandard, ArrayList<String> interest){
		
	               String fileName="UserDetails.txt"; 
		
	  if(super.flag == 1){
			
		          System.out.println(email + " already exist");
		}
		
	  else{
			
		 try {
          	         FileWriter fileWriter = new FileWriter(fileName,true);
          	         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          	       
          if(id == 1) {
          	         bufferedWriter.append("--"+name+"-");
          	         bufferedWriter.newLine();
          	         bufferedWriter.append(email+"-");
          	         bufferedWriter.newLine();
          	         bufferedWriter.append(description+"-");
        	         bufferedWriter.newLine();
        	         bufferedWriter.append(address+"-");
        	         bufferedWriter.newLine();
        	         bufferedWriter.append("////");
        	         bufferedWriter.newLine();
          	         bufferedWriter.append(phone+"-");
          	         bufferedWriter.newLine();
          	         bufferedWriter.append(schoolOrCollegeName+"-");
          	         bufferedWriter.newLine();
          	         bufferedWriter.append(subOrStandard+"-");
          	         bufferedWriter.newLine();
          	         bufferedWriter.append("INTERESTS ARE : ");
          	         int i=0;
          	         
            for(i = 0; i < interest.size(); i ++){
          	        bufferedWriter.append(interest.get(i)+",");
          	        	
          	         }
          	       bufferedWriter.newLine();
          	       bufferedWriter.append("#");
          	       bufferedWriter.newLine();
          	       
          	        }
      else if(id == 2){
          	        	 bufferedWriter.append("--"+name+"-");
          	        	 bufferedWriter.newLine();
             	         bufferedWriter.append(email+"-");
             	         bufferedWriter.newLine();
             	         bufferedWriter.append(description+"-");
            	         bufferedWriter.newLine();
            	         bufferedWriter.append(address+"-");
            	         bufferedWriter.newLine();
            	         bufferedWriter.append("////");
             	         bufferedWriter.newLine();
             	         bufferedWriter.append(phone+"-");
             	         bufferedWriter.newLine();
             	        
             	        bufferedWriter.append("-");
              	        bufferedWriter.newLine();
             	        bufferedWriter.append(subOrStandard);
             	        bufferedWriter.newLine();
             	        bufferedWriter.append("#");
              	        bufferedWriter.newLine();
          	        }
          	        
          	            bufferedWriter.close(); 
          	            System.out.println(name+" entity is added ");
			   
		           }  catch(FileNotFoundException ex) {
	                   System.out.println("Unable to open file '" +fileName + "'"); 
	            
	               }catch(IOException ex) {
	                  System.out.println("Error reading file '"+ fileName + "'");   
	              }  
		}
	}
	
	
public void AddEntity1(String name, String email, String phone,
			          String description, String address,
			          ArrayList<String> placementsList, ArrayList<String> coursesList) {
		
		              String fileName="UserDetails.txt"; 
		if(super.flag==1){
		}
		
	   else{
			
		   
		try {
     	         FileWriter fileWriter = new FileWriter(fileName,true);
     	         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
     	         bufferedWriter.append("--"+name+"-");
     	         bufferedWriter.newLine();
     	         bufferedWriter.append(email+"-");
     	         bufferedWriter.newLine();
     	         bufferedWriter.append(description+"-");
    	         bufferedWriter.newLine();
    	         bufferedWriter.append(address+"-");
    	         bufferedWriter.newLine();
    	         bufferedWriter.append("////");
     	         bufferedWriter.newLine();
     	         bufferedWriter.append(phone+"-");
     	         bufferedWriter.newLine();
     	         
     	         bufferedWriter.append("Placements ARE : ");
     	       
     	         int i=0;
     	         
     	for(i=0;i<placementsList.size();i++){
     	         bufferedWriter.append(placementsList.get(i)+",");
     	         }
     	         bufferedWriter.newLine();
     	         int j = 0;
     	         bufferedWriter.append("Courses Available : ");
 	            
       for(j=0;j<coursesList.size();j++){
 	        	 
    	         bufferedWriter.append(coursesList.get(j)+",");
 	            }
 	            bufferedWriter.newLine();
 	            bufferedWriter.append("#");
 	            bufferedWriter.newLine();
 	            bufferedWriter.close();  
 	            System.out.println(name+" entity is added ");
		   
		}  catch(FileNotFoundException ex) {
                System.out.println("Unable to open file '" +fileName + "'"); 
            
        }  catch(IOException ex) {
               System.out.println("Error reading file '"+ fileName + "'");   
            
        }
      	  
	  }
	}
}
