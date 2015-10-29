package question1;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Lazy instantiation using double locking mechanism.(Thread safe)
class Singleton {
	private static Singleton instance;
	private final static Logger LOGGER = Logger.getLogger(Singleton.class
			.getName());

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

	public void doSomething() {
		FileHandler fh;

		try {

			// This block configure the logger with handler and formatter
			fh = new FileHandler("MyLogFile.log");
			LOGGER.addHandler(fh);
//			LOGGER.setLevel(Level.INFO);

			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);

			// the following statement is used to log any messages
			LOGGER.info("My first log");
			int result = 1 / 0;

		} catch (ArithmeticException e) {
			LOGGER.info("Throws an arithmetic Exception " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
