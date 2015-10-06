/**class for reading student and college information from files
 * 
 * @author Gaurav Saini
 * Date : 26/08/2015
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentAndCollegeInfo {
	
	//method to read information from files
	List<String> readInfo(String fileName) throws IOException
	{
		String line  =null;
		List<String> Info = new ArrayList<String>();
		try{  
		    FileReader	fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null){
				Info.add(line);
			}
			bufferedReader.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" +  fileName + "'");
				readInfo(fileName);
		}
		catch (IOException ex) {
				readInfo(fileName);
		}
		return Info;
	}
}