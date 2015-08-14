
package oops_asignment_1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** This class extends the car class  
 * Name: Persons
 * @author ankur gupta
 * Since: 13 August,2015
 * 
 */

public class Mechanic extends Car 
{
	
	static String COMMA_DELIMITER = ",";
	static String url = "D:/Mechanic.csv";
	static List<String> mechanic = new ArrayList();
    /**
     * Name: readCsvFilePerson
     * @return list of string
     * @throws IOException
     * Description: This method returns the name of person who is mechanic and his details
     **/
	public static List<String> readCsvFilePersons() throws IOException
	{
		BufferedReader fileReader = null;
		try {
			String line = "";
			fileReader = new BufferedReader(new FileReader(url));//read from file;
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				String[] tokens = line.split(COMMA_DELIMITER);//Extracts the word
				if (tokens.length > 0) {
					mechanic.add(tokens[0] + tokens[1] + tokens[2]);// add it to file
				}
			}
		} 
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			fileReader.close();
		}
		return mechanic;

	}
}
