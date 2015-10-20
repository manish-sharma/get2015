/*
 * Class to implement annotation "can run"
 * @author Banwari Kevat
 *
 */
public class AnnotationRunner {
	
	//Method 1 implementing annotation
	@CanRun
	public static void method1() 
	{
		System.out.println("method1 executing");
	}

	 // Method 2 not implementing annotation
	 
	public static void method2() {
		System.out.println("method2 executing");
	}
	
	//Method 3 implementing annotation
	@CanRun
	public static void method3() {
		System.out.println("method3 executing");
	}


	// Method 4 not implementing annotation
	public static void method4() {
		System.out.println("method4 executing");
	}

	//Method 5 implementing annotation
	@CanRun
	public static void method5() {
		System.out.println("method4 executing");
	}

}