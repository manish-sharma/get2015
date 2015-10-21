package mvcSession2.assignment1;

import java.lang.reflect.Method;

/**
 * Name: TestAnnotationParser
 * @author Gaurav Saini
 * Since: 16-10-2015
 * Description: class for parsing employee data
 **/

public class TestAnnotationParser {
	
	/**
	 * Name:parse
	 * @param tempClass
	 * @throws Exception
	 * Description: Parses the Data
	 **/
	
	public void parse(Class<?> tempClass) throws Exception {
		// array of Methods
		Method[] methods = tempClass.getMethods();
		
		for (Method method : methods) {
			
			// Checking for the Data
			if (method.isAnnotationPresent(RequestForEnhancement.class)) {
				RequestForEnhancement test = method.getAnnotation(RequestForEnhancement.class);
				int info = test.id();
				String synopsis = test.synopsis();
				
				// Matching the Data
				if (info == 1) {
					System.out.println("\nannotation data");
					method.invoke(Employee.class.newInstance(), info, synopsis, test.engineer(), test.date());
				}
			}
		}
	}
}