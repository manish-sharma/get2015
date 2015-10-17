/**
 * Main Annotation Class
 * @author Ankur
 *
 */
public class AnnotationMain {
	public static void main(String[] args) throws Exception {
		TestAnnotationParser parser = new TestAnnotationParser();
		parser.parse(Employee.class);
	}
}
