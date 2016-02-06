package serviceStation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*This class returns the details of mechanic stored in file 
 * @author Shishir Pareek
 * Date 14th August 2015
 */
public class Person extends Cars {
	static String COMMA_DELIMITER = ",";//constant value 
	static String url="D://Mechanic Data.csv";//location where file is stored
	static List<String> mechanic=new ArrayList<String>();
	/*function to read data from file and store it in list*/
	public List<String> readTheMechanicData() throws IOException
	{
		BufferedReader fileReader=null;
		try
		{   
			String line="";
			//read from file;
			fileReader=new BufferedReader(new FileReader(url));
			while((line=fileReader.readLine())!=null)
			{
			  //Extracts the word
			  String token[]=line.split(COMMA_DELIMITER);
			  if(token.length>0)
			  {
				// add it to file
				mechanic.add(token[0]+token[1]+token[2]);
			  }
			    
		    }
		}
		catch(Exception e)
		{
		   e.printStackTrace();
		}
		finally
		{
		   fileReader.close();//closing the file
		}
      return mechanic;
	}
}
