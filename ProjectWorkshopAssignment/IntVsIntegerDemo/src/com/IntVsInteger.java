package com;

public class IntVsInteger {

	public static void main(String args[]){
		int integer1 = 5;
		Integer integer2 = 6;
		intVsInteger(integer1, integer2);
		System.out.println(integer1+"..........."+integer2);
	}
	
	public static void intVsInteger(int integer1,Integer integer2){
		integer1=7;
		integer2=2;
	}
}
