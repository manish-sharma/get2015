package Assignment1;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 * Creates the Singleton class to Create the Object
 * @author Ankur
 * Since: 21 October,2015
 **/
public class Singleton
{
	// Creating the static object
	private static Singleton singleton = new Singleton();
	// Constructor Created
	private Singleton()
	{
	}
	// Creating Instance
	public static Singleton getInstance()
	{
		return singleton;
	}
	/**
	 * Name:logException
	 * Description: Generates The Exception
	 **/
	protected void logException() 
	{
		// Creating the Object
		Logger logger = Logger.getLogger("MyLog");
		String name = logger.getName();
		System.out.println("Logger name: " + name);
		//writes to the Specified file 
		FileHandler fh;
		try
		{
			//Writes to the Specified file
			fh = new FileHandler("D:/Assignments/design-pattern-1/MyLogFile.log");
			logger.addHandler(fh);
			// To print the Simple formatter Tyep
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
			logger.info("My first log");
			int value = 5 / 0;
		} 
		catch (ArithmeticException e)
		{
			// Adding to the Specified Path
			logger.info("Throws a ArithmeticException "+ e.getMessage());
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
