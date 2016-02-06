package serviceStation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*This class returns the car details from stored in file*
 * @author Shishir Pareek 
 * Date 14th August 2015
 */
public class Cars {
	
	static String COMMA_DELIMITER = ",";//constant
	static String url="D://Cars.csv";//location where file is located
	static List<String> cars=new ArrayList<String>();//constant 
	public static List<String> readCarsData() throws IOException 
	{
	BufferedReader fileReader=null;
	try
	{   
		String line="";
		fileReader=new BufferedReader(new FileReader(url));//file reading
			while((line=fileReader.readLine())!=null)
			{
			  String token[]=line.split(COMMA_DELIMITER);//separator
			  if(token.length>0)
			  {
				cars.add(token[0]+token[1]);//Adding to the list
			  }
			    
		    }
		}
		catch(Exception e)
		{
		   e.printStackTrace();
		}
		finally
		{
		   fileReader.close();//closing file object
		}
      return cars;
	}
}


