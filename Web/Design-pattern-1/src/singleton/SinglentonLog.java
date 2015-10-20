/**
 * 
 */
package singleton;

/**
 * @author Suman
 *
 */
public class SinglentonLog {

	private static SinglentonLog instance;

	private SinglentonLog() {
		System.out.println("Singleton(): Initializing Instance");
	}

	public static SinglentonLog getInstance(String message) {
		if (instance == null) {
			synchronized (SinglentonLog.class) {
				if (instance == null) {
					System.out.println(message + "Exception Occured!!!!!!");
					instance = new SinglentonLog();
					exceptionHandled(message);
				}
			}
		}

		return instance;
	}

	public static void exceptionHandled(String message) {
		System.out.println(message + "Exception successfully handled!!!!!");
	}
}
