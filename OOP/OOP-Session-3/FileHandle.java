/*
 * This class contains the methods for handling and updating the train list
 * @author Banwari
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandle {
    /*
     * This method for removing nth line in a text file
     * @param f file name with location
     * @param toRemove line number in a text file which have to remove
     */
	void removeNthLine(String f, int toRemove) throws IOException {
         /*
          * first of all  a temporary file is created tmp
          * then file contents of original file is copied to tmp file
          * while copying skip the line which have to remove 
          */
		File tmp = new File("D://tmp.txt");

	    BufferedReader br = new BufferedReader(new FileReader(f));
	    BufferedWriter bw = new BufferedWriter(new FileWriter(tmp));
        String line="";
        int i=1;
	    for (i = 1; i < toRemove; i++) {
	    	line=br.readLine();
	    	if(i!=1) bw.newLine();
	        bw.write(line);
	    }
	    //skip the toRemove line
	    br.readLine();

	    while (null != (line = br.readLine()))  {
	    	if(i!=1) bw.newLine();i++;
	    	bw.write(line);  
	    }
	    br.close();
	    bw.close();
	    //Now copy the contents of tmp file to  original file
	    File trainInfo= new File("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt");
	    
	    BufferedReader br1 = new BufferedReader(new FileReader(tmp));
	    BufferedWriter bw1 = new BufferedWriter(new FileWriter(trainInfo));
	    int flag=1;
	    //copy tmp to trainInfo line by line
	    while ( (line = br1.readLine())!=null ) {
	       bw1.write(line);
	    	if(flag!=i-1) {bw1.newLine();flag++;}
	       
	    }	
	    br1.close();
	    bw1.close();
	}
	
	/*
	 * addLine add a line to the file
	 * @param file name with location of file in which line have to be written
	 * @param toAdd is a string line which have to be added
	 */
	void addLine(String file, String toAdd) throws IOException {

		 BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
	     bw.newLine();
	     bw.write(toAdd);
         bw.close();


	}
	/*
	 * This method update the train list
	 * @param trainLine is integer value which is the line of train which have to update
	 * @param currenLine is String Which is the all information of train which have to be updated
	 * @param seatWeightCount is a integer which contains the number of seats or weights  decrease
	 */
	void updateTrainList(int trainLine, String currentLine, int seatOrWeightCount) throws IOException{
		  removeNthLine("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt",trainLine);
		  //split the current line to tokens then seats/weight take as tokes[7]
		 String [] tokens = currentLine.split("\\s+");
		 int updatedSeats= Integer.parseInt(tokens[7])-seatOrWeightCount;
		 String updatedTrain=tokens[0]+" "+tokens[1]+" "+tokens[2]+" "+tokens[3]+" "+
				                   tokens[4]+" "+tokens[5]+" "+tokens[6]+" "+Integer.toString(updatedSeats)+" "+tokens[8];
	     addLine("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt",updatedTrain);
		
	}
	
}
