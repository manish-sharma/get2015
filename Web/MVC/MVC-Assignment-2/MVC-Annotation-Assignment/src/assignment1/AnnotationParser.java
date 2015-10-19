package assignment1;

import java.lang.reflect.Method;

public class AnnotationParser {

	public void parse(Class<?> tempClass) throws Exception {

		// array of Methods
		Method[] methods = tempClass.getMethods();
		for (Method method : methods) {

			// Checking for the Data
			if (method.isAnnotationPresent(RequestForEnhancement.class)) {

				RequestForEnhancement test = method
						.getAnnotation(RequestForEnhancement.class);
				int info = test.id();
				String synopsis = test.synopsis();
				// Matching the Data
				if (info == 1) {

					System.out.println("\n");
					System.out.println("Data About Annotations");
					method.invoke(Employee.class.newInstance(), info, synopsis,
							test.engineer(), test.date());
				}
			}
		}
	}
}
