package Assignment_3;


/** Class to implement annotation "can run" 
 * @author Shishir 
 * Date 17th October 2015
 * */
public class AnnotationRunner {
	/*Method 1 implementing annotation*/
	@CanRun
	public static void method1() {
		System.out.println("Executing method-1");
	}

	/* Method 2 not implementing annotation */
	public static void method2() {
		System.out.println("Executing method-2");
	}

	/* Method 3 implementing annotation */
	@CanRun
	public static void method3() {
		System.out.println("Executing method-3");
	}

	/* Method 4 not implementing annotation */
	public static void method4() {
		System.out.println("Executing method-4");
	}

	/* Method 5 implementing annotation  */
	@CanRun
	public static void method5() {
		System.out.println("Executing method-5");
	}
}
