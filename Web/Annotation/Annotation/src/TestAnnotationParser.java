/**
 * 
 * @author Sumitra
 *this is test class to test all annotations
 */
import java.lang.reflect.Method;
public class TestAnnotationParser {
	public void parse(Class<?> tempClass) throws Exception {

		Method[] methods = tempClass.getMethods();

		for (Method method : methods) {

			if (method.isAnnotationPresent(RequestForEnhancement.class)) {
				RequestForEnhancement test = method
						.getAnnotation(RequestForEnhancement.class);
				int info = test.id();
				String synopsis = test.synopsis();
				if (1 == info) {
					System.out.println("info is awesome!");
					// try to invoke the method with param
					method.invoke(Employee.class.newInstance(), info, synopsis,
							test.engineer(), test.date());
				}
			}

		}
	}
}
