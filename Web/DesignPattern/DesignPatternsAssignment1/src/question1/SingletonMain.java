package question1;

import java.io.IOException;

public class SingletonMain {

	public static void main(String args[]) throws IOException {
		Singleton objOfSingleton = Singleton.getInstance();
		objOfSingleton.doSomething();
	}
}
