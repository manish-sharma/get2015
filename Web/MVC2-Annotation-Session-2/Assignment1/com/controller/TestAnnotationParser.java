package com.controller;

import java.lang.reflect.Method;

import com.model.RequestForEnhancement;
import com.view.Employee;

/*
 * this class to parse the annotation
 * @author Banwari Kevat 
 */
public class TestAnnotationParser {
	/*
	 * Function to parse the class and run their methods through annotation
	 * @param tempClass class in which we have to parse the annotation
	 * @throws Exception
	 */
	public void parse(Class<?> tempClass) throws Exception {

		Method[] methods = tempClass.getMethods();
        for (Method method : methods) 
        {
			if (method.isAnnotationPresent(RequestForEnhancement.class)) {
				RequestForEnhancement test = method.getAnnotation(RequestForEnhancement.class);
				//int info = test.id();
				//String synopsis = test.synopsis();
				System.out.println("Annotation is being process...");
				// try to invoke the method with param
				method.invoke(Employee.class.newInstance(),  test.id(), test.synopsis(),test.engineer(), test.date());

			}

		}
	}
}