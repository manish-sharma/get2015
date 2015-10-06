/**
 * Class to read and write information to the file
 * @author Sanjay
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class FileInformation {
		
	
	/**
	 * Method to read information from the file
	 * @param fileName = path to file
	 * @return = hashmap of the details in the file
	 */
	HashMap<String, String> readInformation(String fileName){
		String line = null;
		HashMap<String, String> database = new HashMap<String, String>();

		try {
			FileReader fileReader = 
					new FileReader(fileName);

			BufferedReader bufferedReader = 
					new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null) {

				database.put(line.split(";")[0], line);
			}    

			bufferedReader.close();            
		}
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" +fileName + "'"); 
			readInformation(fileName);
		}
		catch(IOException ex) {
			System.out.println("Error reading file '"+ fileName + "'");   
			readInformation(fileName);

		}
		return database;
	}
		
		
	
	
	/**
	 * Method to write the information to the file
	 * @param addUser = hashmap of information to be added to the file
	 */
	void writeInformation(HashMap<String, String> addUser){
		String fileName="D:/workspace/SocialNetwork/src/FriendList.txt"; 
		try {
			FileWriter fileWriter = 
					new FileWriter(fileName);

			BufferedWriter bufferedWriter = 
					new BufferedWriter(fileWriter);
			for(Map.Entry<String, String> m:addUser.entrySet()){
				bufferedWriter.write((String)m.getValue());
				bufferedWriter.newLine();
			}


			bufferedWriter.close();            
		}
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" +fileName + "'"); 

		}
		catch(IOException ex) {
			System.out.println("Error reading file '"+ fileName + "'");   


		}

	}
}
