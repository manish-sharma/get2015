
import java.util.logging.Level;

public class LoggerMain {
	public static void main(String args[]) {
		
		try {
			int exceptionVar = 5 / 0;
		} catch (Exception e) {
			LoggerWrapper.myLogger.log(Level.SEVERE,
					""+ e.fillInStackTrace());
		}
		try {
			int exceptionVar[] = new int[3];
			exceptionVar[4] = 3;
		} catch (Exception e) {
			LoggerWrapper.myLogger.log(Level.SEVERE,
					"" + e.fillInStackTrace());

		}
	}
}
