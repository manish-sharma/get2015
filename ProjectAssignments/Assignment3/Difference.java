package Assignment3;

public class Difference {
	public static void main(String args[]) {
		/*String is immutable object. The object created as a String is stored in the  Constant String Pool. Every immutable object in Java is 
		 * thread safe ,that implies String is also thread safe . String can not be used by two threads simultaneously.String  once assigned can
		 * not be changed.*/
		System.out.println("String:-");
		String firstString = "Avinash";//this string object is stored in constant string pool.
		System.out.println(System.identityHashCode(firstString));//it will print address of "Avinash" referenced by firstString
		firstString = "Barola";//new "Barola" string is created in constant pool and referenced by the firstString variable            
		 // "Avinash" string still exists in string constant pool and its value is not overrided but we lost reference to the "Avinash"string  
		System.out.println(System.identityHashCode(firstString));//it will print address of "Barola" referenced by firstString
		System.out.println("As we change value of string address will also change::::");
		System.out.println();
		/*
		 * StringBuilder vs StringBuffer
		 */
		//Both are mutable but only difference is that StringBuffer is thread safe or synchronized means no two or more threads can access StringBuilder at same time
		//whereas StringBuilder is thread unsafe unsynchronized means two or more threads can access StringBuilder at same time.
		System.out.println("StringBuffer : -");
		StringBuffer stringBuffer = new StringBuffer("I am String Buffer");
		System.out.println("address of stringBuffer befor modification : "+stringBuffer+":"+System.identityHashCode(stringBuffer));
		stringBuffer = stringBuffer.append(" after modifications");
		System.out.println("address of stringBuffer after modification : "+stringBuffer+":"+System.identityHashCode(stringBuffer));
		System.out.println("As we change value of stringBuilder address will not change::::");
		System.out.println();
		System.out.println("StringBuilder : -");
		StringBuilder stringBuilder = new StringBuilder("I am String Builder");
		System.out.println("address of stringBuilder befor modification : "+stringBuilder+":"+System.identityHashCode(stringBuilder));
		stringBuilder = stringBuilder.append(" after modifications");
		System.out.println("address of stringBuilder after modification : "+stringBuilder+":"+System.identityHashCode(stringBuilder));
		System.out.println("As we change value of stringBuilder address will not change::::");
		
		
		//in terms of efficiency
		//StringBuffer is less efficient then StringBuilder
		long startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			stringBuffer.append("hii");
		}
		System.out.println(System.currentTimeMillis() - startTime);
		
		long startTime2 = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			stringBuilder.append("hii");
		}
		System.out.println(System.currentTimeMillis() - startTime2);
	}
}
