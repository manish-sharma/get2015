/**
 * this is main class for annotation
 * @author Sumitra
 *
 */
public class AnnotationMain {
	 public static void main(String[] args) throws Exception {
	      TestAnnotationParser parser = new TestAnnotationParser();
	      parser.parse(Employee.class);
	   }
}
