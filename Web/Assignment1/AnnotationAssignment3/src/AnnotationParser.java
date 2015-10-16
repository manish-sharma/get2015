

import java.lang.reflect.Method;
/**
 * it is used to parse the annotations and its also main class
 * @author Ravika
  * @since 10/16/2015
 */
public class AnnotationParser {
	
	//main method
	public static void main(String[] args) throws Exception {
		AnnotationParser parser = new AnnotationParser();
		parser.parse(AnnotationRunner.class);
	}
		 
	/**
	 * it is used to parse the annotations and its also main class
	 * @param tempClass
	 * @throws Exception
	 */
	public void parse(Class<?> tempClass) throws Exception {
		Method[] methods = tempClass.getMethods();
		
		for (Method method : methods) {
			if (method.isAnnotationPresent(CanRun.class)) {
					method.invoke(AnnotationRunner.class.newInstance());
			}
		}
	}
}

