package Assignment_1;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class showing the singleton design patter using the logger class so whenever
 * an exception is generated its is recorded in Log
 * 
 * @author Shishir
 *
 */
public class Singleton {
	//Logger class instance
	private static final Logger LOGGER = Logger.getLogger(Singleton.class
			.getName());
	private static Singleton myObj;

	/**
	 * Create private constructor
	 */
	private Singleton() {

	}

	/**
	 * Create a static method to get instance.
	 */
	public static Singleton getInstance() {
		if (myObj == null) {
			myObj = new Singleton();
		}
		return myObj;
	}
    /**function which is generating the exception which is being added t othe log
     * 
     */
	public void getSomeThing() {
		System.out.println("Recording Exception in logger");
		Handler fileHandler = null;
		Handler consoleHandler = null;
		try {
			consoleHandler = new ConsoleHandler();
			fileHandler = new FileHandler("./Test.log");
			LOGGER.addHandler(fileHandler);
			LOGGER.addHandler(consoleHandler);
			fileHandler.setLevel(Level.ALL);
			consoleHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);
			LOGGER.config("Configuration done");
			int[] a = { 1, 2, 3 };
			int index = 4;
			LOGGER.config("index is set to " + index);
			System.out.println(a[index]);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Exception occur", e);
		}
	}
}
