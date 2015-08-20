/****************************************************************************************
Name            : UpdateTrainList
Revision Log    : 2015-08-18: Babalu patidar : created.
                : 
Use             : This class is used implement updateTrainList method.
                :
****************************************************************************************/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateTrainList {
	//updateLine method used to update line with avilability
	//@param fileName : specify name of file
	//@param toRemove : Specify line number
	//@param toAdd : Specify new line 
	void updateLine(String fileName, int toRemove,String toAdd) throws IOException {

	    File tmp = File.createTempFile("tmp", "");
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    BufferedWriter bw = new BufferedWriter(new FileWriter(tmp));
	    for (int i = 0; i < toRemove; i++){
	    	bw.write(String.format("%s%n", br.readLine()));
	    }
	    //update line
	    bw.write(toAdd);
	    bw.newLine();
	    br.readLine();

	    String line;
	    while (null != (line = br.readLine())){
	        bw.write(String.format("%s%n", line));
	    }

	    br.close();
	    bw.close();
	    BufferedReader br1 = new BufferedReader(new FileReader(tmp));
	    BufferedWriter bw1 = new BufferedWriter(new FileWriter(fileName));
	    //copy tmp to trainInfo line by line
	    while ( (line = br1.readLine())!=null ) {
	       bw1.write(line);
	       bw1.newLine();   
	    }	
	    br1.close();
	    bw1.close();
	}
	//End of updateLine method
	
	//Start of updateTrainList method
	//@param currentLine :Specify detail of train.
	//@param seat :Number of seat/weight required
	//@param fileName contains Address of file
	//@param lineNUm Contain line number of remove line
	void updateTrainList(String currentLine[], int seat,String fileName,int lineNum) throws IOException{
		
		 int updatedSeats= Integer.parseInt(currentLine[4].trim())-seat;
		 String updatedTrain=currentLine[0]+","+currentLine[1]+","+currentLine[2]+","+currentLine[3]+","+Integer.toString(updatedSeats)+","+currentLine[5]+","+currentLine[6];
		updateLine(fileName,lineNum,updatedTrain);
		
	}
	//End of updateTrainList method
	
}
//End of UpdateTrainList class



