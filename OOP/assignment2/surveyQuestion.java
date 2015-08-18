package survey;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Name: surveyQuestion
 * @author anurag
 * Since: 14 August,2015
 * Description: Stores the Question to be asked information
**/
public class surveyQuestion
{
	static String COMMA_DELIMITER = "\n";
	static String url = "D://surveyQuestion.csv";
	static List<String> questionList = new ArrayList();
    /**
     * Name: readCsvFile
     * @return list
     * @throws IOException
     * Description: Reads information from Question text file  
    **/
	public static List<String> readCsvFile() throws IOException 
	{ 
		//  To Read the ile
		BufferedReader fileReader = null;
		try 
		{
			// To store the file
			String line = "";
			// File reading
			fileReader = new BufferedReader(new FileReader(url));
			// Reading the file
			fileReader.readLine();
			// Checking if it is not null
			while ((line = fileReader.readLine()) != null)
			{ 
				// Reading tokens
				String tokens=line;
				questionList.add(tokens);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileReader.close();
		}
		// Returning list of questions
		return questionList;
	}
	
}