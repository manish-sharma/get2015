package com.metacube.Question1;

import java.lang.reflect.Method;

/**
 * @author Riddhi
 */

/* class to parse the annotation */
public class TestAnnotationParser {
	/**
	 * Function to parse the class and run their methods through annotation
	 * 
	 * @param tempClass
	 *            ---class in which we have to parse the annotation
	 * @throws Exception
	 */
	public void parse(Class<?> tempClass) throws Exception {

		Method[] methods = tempClass.getMethods();

		for (Method method : methods) {

			if (method.isAnnotationPresent(RequestForEnhancement.class)) {
				RequestForEnhancement test = method.getAnnotation(RequestForEnhancement.class);

				System.out.println("annotation is present!");
				// try to invoke the method with param
				method.invoke(Employee.class.newInstance(), test.id(), test.synopsis(),
						test.engineer(), test.date());

			}
		}
	}
}

