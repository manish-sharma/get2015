package com.metacube.Question3;

import java.lang.reflect.Method;
import com.metacube.Question3.annotations.CanRun;

/**
 * @author Riddhi
 *
 */

/* Main Class to parse the annotation */
public class Q3Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Parsing the values...");
		Q3Main objQ3Main = new Q3Main();
		objQ3Main.parse(AnnotationRunner.class);
	}

	/**
	 * ---Function to parse the class and call the annotations
	 * 
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
