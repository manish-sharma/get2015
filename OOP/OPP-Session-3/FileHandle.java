
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileHandle {

	void removeNthLine(String f, int toRemove) throws IOException {

	    File tmp = File.createTempFile("tmp", "");

	    BufferedReader br = new BufferedReader(new FileReader(f));
	    BufferedWriter bw = new BufferedWriter(new FileWriter(tmp));

	    for (int i = 0; i < toRemove; i++)
	        bw.write(String.format("%s%n", br.readLine()));

	    br.readLine();

	    String l;
	    while (null != (l = br.readLine()))
	        bw.write(String.format("%s%n", l));

	    br.close();
	    bw.close();

	    File oldFile = new File(f);
	    if (oldFile.delete())
	        tmp.renameTo(oldFile);

	}
	
	
	void addLine(String file, String toAdd) throws IOException {

		 BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
	     bw.newLine();
	     bw.write(toAdd);
         bw.close();


	}
	void updateTrainList(int trainLine, String currentLine, int seatOrWeightCount) throws IOException{
		  removeNthLine("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt",0);
		 String [] tokens = currentLine.split("\\s+");
		 int updatedSeats= Integer.parseInt(tokens[7])-seatOrWeightCount;
		 String updatedTrain=tokens[0]+" "+tokens[1]+" "+tokens[2]+" "+tokens[3]+" "+
				                   tokens[4]+" "+tokens[5]+" "+tokens[6]+" "+Integer.toString(updatedSeats)+" "+tokens[8];
	     addLine("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt",updatedTrain);
		
	}
	
}
