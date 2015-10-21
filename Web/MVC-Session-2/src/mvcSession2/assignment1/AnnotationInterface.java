package mvcSession2.assignment1;

/**
 * Name: AnnotationInterface
 * @author Gaurav Saini
 * Since: 16-10-2015
 *
 */

public class AnnotationInterface {
	
	/**
	 * Name:main
	 * @param args
	 * @throws Exception
	 * Description: UserInterface
	 */
	
	public static void main(String[] args) throws Exception {
		// calling the function to test the parser
		TestAnnotationParser parser = new TestAnnotationParser();
		parser.parse(Employee.class);
	}
}