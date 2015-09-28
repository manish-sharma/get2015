/*This class reads the question from the text file and stores in list
 * @author Shishir Pareek
 * Date 17th Aug 2015
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class surveyQues {

	static String DELIMITER="\n";
	static String url="D://Questions.txt";//location of the text file 
	static List<String> questions=new ArrayList<String>();
	/*This function reads the question from the file and stores it in array list
	 * and returns the list object*/
	public static List<String> readQuestion() throws IOException
	{
		BufferedReader fileReader=null;//bufferReader object
		try//try block 
		{
			String line="";
			fileReader=new BufferedReader(new FileReader(url));
			fileReader.readLine();
			while((line=fileReader.readLine())!=null)//loop to read all the file contents
			{
				String token=line;//creating string tokens
				questions.add(token);//adding the elements to list
			}
		}
		//catch block 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	finally 
	{
		fileReader.close();//closing the file 
	}
		return questions;
	}
}
	

