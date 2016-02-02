package com;

public class Main {

	public static void main (String args[]) {
		String input = "Hello World";
		StringBufferDemo stringBufferDemo = new StringBufferDemo(input);
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i<100000; i++) {
			
			stringBufferDemo.append(i);
		}
		System.out.println("String Buffer Time Taken "+(System.currentTimeMillis()-startTime)+" ms");
		StringBuilderDemo stringBuilderDemo = new StringBuilderDemo(input);
		startTime = System.currentTimeMillis();
		for(int i = 0; i<100000; i++) {
			stringBuilderDemo.append(i);
		}
		System.out.println("String Builder time taken "+(System.currentTimeMillis()-startTime)+" ms");
		
			
	}
}
