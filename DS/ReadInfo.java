import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * this method is used to read info of the file
 * @author Ankur
 *
 */

public class ReadInfo {
	
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
				// TODO: handle exception
				 System.out.println("Unable to open file '" +  fileName + "'");
				readInfo(fileName);
		}
		catch (IOException ex) {
				// TODO: handle exception
				readInfo(fileName);
		}
		return Info;
	}
	
	

}
