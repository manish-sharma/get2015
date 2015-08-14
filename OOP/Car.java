
package oops_asignment_1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**Stores the car information
 * Name: Car
 * @author ankur gupta
 * Since: 14 August,2015
 *  
 */
public class Car 
{
	static String COMMA_DELIMITER = ",";
	static String url = "D:/Car.csv";
	static List<String> car = new ArrayList();
    /**
     * Name: readCsvFile
     * @return list
     * @throws IOException
     * Description: Reads information from car text file  
     **/
	public static List<String> readCsvFile() throws IOException 
	{
		BufferedReader fileReader = null;
		try 
		{
			String line = "";
			fileReader = new BufferedReader(new FileReader(url));//file reading
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null)
			{
				String[] tokens = line.split(COMMA_DELIMITER);//separator
				if (tokens.length > 0) 
				{
					car.add(tokens[0] + tokens[1]);//Adding to the list
				}
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileReader.close();
		}
		return car;
	}
}
