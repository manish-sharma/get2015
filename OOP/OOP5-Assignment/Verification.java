
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Verification {

	
	public int checkId(String mailId) {
		             String fileName="Nodes.txt"; 
		             String line = null;
		             int flag;
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
                   flag=0;
		
      for(int i=0;i<database.size();i++){
			
      if(database.get(i).equalsIgnoreCase(mailId+"-")){
				 flag=1;
			}
		}
		
      if(flag==1)
			return flag;
		
     return flag;
		
	}

}
