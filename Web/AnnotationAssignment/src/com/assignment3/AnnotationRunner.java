/**
 * 
 */
package com.assignment3;

/**
 * @author chetna
 *
 */
public class AnnotationRunner {
	
	@CanRun
	public void method1(){
		System.out.println("Executing method-1 ");
	}

	public void method2(){
		System.out.println("Executing method-2");
	}
	@CanRun
	public void method3(){
		System.out.println("Executing method-3");
	}
	
	public void method4(){
		System.out.println("Executing method-4");
	}
	@CanRun
	public void method5(){
		System.out.println("Executing method-5");
	}

}
