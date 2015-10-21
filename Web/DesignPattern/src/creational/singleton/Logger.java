package creational.singleton;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;
/**
 * this is logger class which create a file and save exception in log file order by date
 * @author Sumitra
 *
 */
public class Logger {
	private static Logger logger;
	public static Logger getLogger() {
	return logger;
	}
	public static void initialize() {
		logger = new Logger();
		}

 	private static String fileName;
    private Properties properties;

	private Logger() {
		logger = this;
	}


private static String getFileName(Calendar cal) {
SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy");
String dateString = dateFormat1.format(cal.getTime());
 fileName = "ExceptionLog-" + dateString + ".log";
return fileName;
}


public static void logMsg( Exception e) {
try {
Calendar cal = Calendar.getInstance() ;
String fileName = getFileName(cal);
FileOutputStream fileOutputStreamObj = new FileOutputStream(fileName, true);
PrintStream ps = new PrintStream(fileOutputStreamObj);
SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEE, MMM d, yyyy 'at' hh:mm:ss a");
ps.println("<"+dateFormat2.format(cal.getTime())+">\n["+e+"]");
ps.close();
}
catch (IOException ie) {
ie.printStackTrace();
}
}

}// End of class

