package com;

public class StringBuilderDemo {

		private StringBuilder stringBuilder ;
		
		public StringBuilderDemo(String input) {
			stringBuilder = new StringBuilder(input);
		}
		
		public void display() {
			System.out.println(stringBuilder);
		}
		public void append(int i) {
			stringBuilder.append(i);
		}

}
