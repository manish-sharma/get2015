import java.lang.reflect.Method;

/*
 * This Class to parse the annotation
 * @author Banwari Kevat
 *
 */
public class TestAnnotationParser {
	public static void main(String[] args) throws Exception
	{
		System.out.println("Parsing the values...");
		TestAnnotationParser parser = new TestAnnotationParser();
		parser.parse(AnnotationRunner.class);
	}

	/*
	 * Function to parse the class and call the annotations
	 * @param tempClass
	 * @throws Exception
	 */
	public void parse(Class<?> tempClass) throws Exception {

		Method[] methods = tempClass.getMethods();

		for (Method method : methods) {

			if (method.isAnnotationPresent(CanRun.class)) {
				// try to invoke the method with param
				method.invoke(AnnotationRunner.class.newInstance());

			}

		}
	}

}