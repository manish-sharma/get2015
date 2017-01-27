/*
 * Main class which might generate exception
 * @author Banwari Kevat
 */
public class Main {
	public static void main(String[] args) {
		
		try {
			int[] array = new int[4];
			array[5] = 10;
		} catch (Exception e) {
			Logger.getInstance().addIntoLog("Array Index Out Of Bound\n");
		}
		
		try {
			@SuppressWarnings("unused")
			int c = 100 / 0;
		}
		catch (Exception e) {
			Logger.getInstance().addIntoLog("Divide by zero\n");
		}
		
		Logger.getInstance().closeLogFile();
	}

}
