import java.lang.reflect.Method;
/**
 * 
 * @author Sumitra
 *
 */
public class TestAnnotationParser {
	 public static void main(String[] args) throws Exception {
	      TestAnnotationParser parser = new TestAnnotationParser();
	      parser.parse(AnnotationRunner.class);
	   }
	public void parse(Class<?> tempClass) throws Exception {

		Method[] methods = tempClass.getMethods();
	

		for (Method method : methods) {
			
			
			if (method.isAnnotationPresent(CanRun.class)) {
				CanRun test = method
						.getAnnotation(CanRun.class);
			
				 
					
					// try to invoke the method with param
					method.invoke(AnnotationRunner.class.newInstance());
				
			}

		}
	}
	
}
