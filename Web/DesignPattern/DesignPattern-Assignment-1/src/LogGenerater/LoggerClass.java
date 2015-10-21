package LogGenerater;
import org.apache.log4j.Logger;

public class LoggerClass {

	private final static Logger log = Logger.getLogger(LoggerClass.class
			.getName());
	private static LoggerClass loggerClass;

	public static LoggerClass getInstance() {

		if (loggerClass == null) {
			synchronized (LoggerClass.class) {
				if (loggerClass == null)
					loggerClass = new LoggerClass();
			}
		}
		return loggerClass;
	}

	public Integer performDivide(Integer numanator, Integer denominator) {
		Integer output = 0;
		try {
			output = numanator / denominator;
		} catch (ArithmeticException ae) {
			try {
				log.error("Exception occured at " + ae.getMessage());

			} catch (Exception e) {
				System.out.println("Exception is writing log file");

			}

		}
		return output;
	}
}
