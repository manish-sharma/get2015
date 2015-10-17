package Assignment_3;

import java.lang.reflect.Method;


public class AnnotationMain {
	public static void main(String[] args) throws Exception {
		System.out.println("Parsing the values...");
		 AnnotationMain objMain = new AnnotationMain();
		objMain.parse(AnnotationRunner.class);
	}

	/**
	 * ---Function to parse the class and call the annotations
	 * 
	 * @param tempClass
	 * @throws Exception
	 */
	public void parse(Class<AnnotationRunner> annotationRunnerClass) throws Exception {

		Method[] methods = annotationRunnerClass.getMethods();

		for (Method method : methods) {

			if (method.isAnnotationPresent(CanRun.class)) {
				// try to invoke the method with param
				method.invoke(AnnotationRunner.class.newInstance());
			}
		}
	}
}
