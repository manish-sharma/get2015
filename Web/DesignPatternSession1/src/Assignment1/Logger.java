package Assignment1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Chetna
 * Logger class (Singleton) to log application exceptions in Log file
 */
public class Logger {
	Calculator calculator;
	private static Logger logger = new Logger();
	File file = null;
	BufferedWriter writer = null;

	/**
	 * It will catch exception and will make log file.
	 */
	private Logger() {
		try {
			file = new File(".\\logFile.txt");
			writer = new BufferedWriter(new FileWriter(file));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (Exception ex) {
			}
		}
		System.out.println("Stored data in temporary file.");
	}

	/**
	 * @return : instance of logger class
	 */
	public static Logger getInstance() {
		return logger;
	}

	/**
	 * @param message : to be saved in log file
	 */
	public void insertIntoLogger(String message) {
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(message);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
