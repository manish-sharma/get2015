import java.lang.reflect.Method;


/**
 * Its is used to parse the annotation requestForEnhancement
 * @author Sanjay
 */
public class AnnotationParser {
	public void parse(Class<?> tempClass) throws Exception {

		Method[] methods = tempClass.getMethods();

		for (Method method : methods) {

			if (method.isAnnotationPresent(RequestForEnhancement.class)) {
				RequestForEnhancement test = method.getAnnotation(RequestForEnhancement.class);
				int info = test.id();
				String synopsis = test.synopsis();
				if (1 == info) {
					System.out.println("info is awesome!");
					method.invoke(UseOfRequestForEnhancement.class.newInstance(), info, synopsis,	test.engineer(), test.date());
				}
			}

		}
	}
}

