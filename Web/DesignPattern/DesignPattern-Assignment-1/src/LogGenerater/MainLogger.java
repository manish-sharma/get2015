package LogGenerater;

public class MainLogger {

	public static void main(String args[]) {
		LoggerClass loggerClass = LoggerClass.getInstance();
		int numanator = 9;
		int denominator = 0;
		loggerClass.performDivide(numanator, denominator);
		System.out.println("executed Successfully");
	}

}
