/*
 * This class records the exception into a logfile
 * @author Banwari Kevat
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Singleton class
public class Logger {
   private static Logger logger = new Logger(); ;
  // buffered writer object to write into log file
   private static BufferedWriter bw;
  
   
   private  Logger()
   {
	   createLogFile();
   }
   
   //This method create logfile
   private void createLogFile() {
	   try {
		   File file = new File("logfile.txt");
		bw = new BufferedWriter(new FileWriter(file,true));
		PrintWriter pw = new PrintWriter(file);
		pw.write("");
		pw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
   public static Logger getInstance()
   { return logger;}
   
   public void addIntoLog(String msg){
	    try 
	   {
		   bw.write(msg);
		   bw.newLine();
	   } catch (IOException e) {
		e.printStackTrace();
	}
   }

public void closeLogFile() {
	try {
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}	
}
}
