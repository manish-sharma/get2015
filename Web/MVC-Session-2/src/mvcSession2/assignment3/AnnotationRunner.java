package mvcSession2.assignment3;

/**
 * Name: AnnotationRunner
 * @author Gaurav Saini
 * Since: 16-10-2015
 * Description: Defines the function with annotations
 **/

public class AnnotationRunner {
	
	// Annotation for method1
	@CanRun
	public static void method1() {
		System.out.println("inside first method");
	}
	
	// Method 2 without annotation
	public static void method2() {
		System.out.println("inside second method");
	}
	
	// Method 3 with annotation
	@CanRun
	public static void method3() {
		System.out.println("inside third method");
	}
	
	// Method4  without annotation
	public static void method4() {
		System.out.println("inside fourth method");
	}
	
	// Method 5 with annotation
	@CanRun
	public static void method5() {
		System.out.println("inside fifth method");
	}
}