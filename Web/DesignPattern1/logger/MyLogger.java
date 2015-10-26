package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Logger class to log the exceptions .It is a singleton class so only one
 * instance can be created
 * 
 * @author Khemanshu
 */
public class MyLogger {

	private static final Logger LOGGER = Logger.getLogger(MyLogger.class
			.getName());
	private static MyLogger objectOfMyLogger = null;

	private Handler fileHandler = null;

	/*
	 * private constructor of MyLogger class to create object and initialize
	 * object of FileHandler
	 */
	private MyLogger() {
		try {
			/* initialization of fileHandler with a file */
			fileHandler = new FileHandler("./exceptionlog4.log", true);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doLogging(String logException) {
		fileHandler.setLevel(Level.ALL);
		LOGGER.setLevel(Level.ALL);

		LOGGER.addHandler(fileHandler);

		fileHandler.setFormatter(new SimpleFormatter());

		LOGGER.log(Level.FINE, logException);

		LOGGER.removeHandler(fileHandler);
	}

	/**
	 * Method to get the instance of MyLogger class
	 * 
	 * @return instance of MyLogger class
	 */
	public static MyLogger getInstance() {
		if (objectOfMyLogger == null) {
			/* synchronized is used for multi-threading */
			synchronized (MyLogger.class) {
				if (objectOfMyLogger == null) {
					/* Creating single instance of MyLogger class */
					objectOfMyLogger = new MyLogger();
				}
			}
		}
		return objectOfMyLogger;
	}
}
