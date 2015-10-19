/**
 * 
 */
package com.assignment3;

import java.lang.reflect.Method;


/**
 * @author chetna
 *
 */
public class AnnotationRunnerReflect {
	public static void main(String[] args) {



		try {
			// load the AppTest at runtime
			Class<?> cls = Class.forName("com.assignment3.AnnotationRunner");
			Object obj = cls.newInstance();
			
			Method method;
			
			// call the method1 method
			method = cls.getDeclaredMethod("method1");
			if(method.isAnnotationPresent(CanRun.class)){
				method.invoke(obj);
			}	

			// call the method2 method
			method = cls.getDeclaredMethod("method2");
			if(method.isAnnotationPresent(CanRun.class)){
				method.invoke(obj);
			}
			// call the method3 method
			method = cls.getDeclaredMethod("method3");
			if(method.isAnnotationPresent(CanRun.class)){
				method.invoke(obj);
			}
			// call the method4 method
			method = cls.getDeclaredMethod("method4");
			if(method.isAnnotationPresent(CanRun.class)){
				method.invoke(obj);
			}
			// call the method5 method
			method = cls.getDeclaredMethod("method5");
			if(method.isAnnotationPresent(CanRun.class)){
				method.invoke(obj);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
