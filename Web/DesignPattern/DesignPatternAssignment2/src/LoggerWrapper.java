
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerWrapper {
	private static FileHandler myFileHandler;
	public static final Logger myLogger = Logger.getLogger("LoggerMain");
	private static LoggerWrapper instance = null;

	private LoggerWrapper() {

	}

	/**
	 * This method is used to create if instance is null and return the instance
	 * of LoggerWrapper class whenever required
	 * 
	 * @return instance(object/instance of LoggerWrapper class)
	 */
	public static LoggerWrapper getInstance() {
		if (instance == null) {
			prepareLogger();
			instance = new LoggerWrapper();
		}
		return instance;
	}

	/**
	 * This method is used to check that if the file you're using has been
	 * changed! If so,re-do the file setting and then log the exceptions into
	 * that file
	 */
	public void log(Level level, String message) {
		myLogger.removeHandler(myFileHandler);
		myLogger.log(level, message);
	}

	/**
	 * This method is used to create the custom log file(logFile.log) if it does
	 * not exists,then set the level for a log file(level defines the exception
	 * level which can be stored by the log file)
	 */
	private static void prepareLogger() {
		try {
			myFileHandler = new FileHandler("C:/Users/nikhil/Desktop/log.txt", true);
			myFileHandler.setFormatter(new SimpleFormatter());
			myLogger.addHandler(myFileHandler);
			myLogger.setUseParentHandlers(false);
			myLogger.setLevel(Level.ALL);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
