import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Name: Train
 * @author Anurag
 * Since: 17 August,2015
 * Description: Reads the details from file
 **/
public class Train
{
	static String COMMA_DELIMITER = "\n";
	static String url = "D://Train.txt";
    /**
     * Name: readCsvFile
     * @return list
     * @throws IOException
     * Description: Reads information from car text file  
     **/
	public static List<String> readCsvFile() throws IOException 
	{  
		//list for getting the value from file
		List<String> TrainList = new ArrayList();
		BufferedReader fileReader = null;
		try 
		{
			// takes the avlue
			String line = "";
			//file reading
			fileReader = new BufferedReader(new FileReader(url));
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null)
			{ 
				//Extracts the word
				String[] tokens = line.split(",");
				//checks for null
				if (tokens.length > 0) 
				{
					TrainList.add(tokens[0] + tokens[1] + tokens[2]+tokens[3]+tokens[4]+tokens[5]+tokens[6]);// add it to file
				}
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
		return TrainList;
	}
}
