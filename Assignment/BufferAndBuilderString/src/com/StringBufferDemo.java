package com;

public class StringBufferDemo {
	
	
	private StringBuffer stringBuffer ;
	
	public StringBufferDemo(String input) {
		stringBuffer = new StringBuffer(input);
	}
	
	public void display() {
		System.out.println(stringBuffer);
	}
	public void append(int i) {
		stringBuffer.append(i);
	}

}
