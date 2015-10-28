import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
 * or the first access to SingletonHolder.INSTANCE, not before.
 */

 



public class Logger 
{
	
	 private static final Logger INSTANCE = new Logger();
     // Private constructor prevents instantiation from other classes
	 private Logger() {}
	
	 public static Logger getInstance() {
	   return Logger.INSTANCE;
	 }
	 
	 public static void log(String str) throws FileNotFoundException, UnsupportedEncodingException {
	 
	   PrintWriter writer = new PrintWriter("./src/logfile.txt", "UTF-8");
	   writer.println(str);
	   writer.close();
	 }
 
 
}