package sample;

public class PerformanceTestString {
	

	public static void main(String args[]) {
		/* Example of String buffer */
		StringBuffer sBuffer = new StringBuffer("Test of string buffer");
		sBuffer.append(" Appended String Buffer");
		System.out.println(sBuffer);
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 1000000; i++) {
			sb.append("StringBuffer Appended");
		}
		System.out.println("Time taken by StringBuffer: "
				+ (System.currentTimeMillis() - startTime) + "ms");

		/*StringBuilder Example*/
		StringBuilder stringBuilder = new StringBuilder(
				"Test for String Builder");
		stringBuilder.append(" Hello Appended");
		System.out.println(stringBuilder);
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 1000000; i++) {
			sb2.append("StringBuilder Appended");
		}
		System.out.println("Time taken by StringBuilder: "
				+ (System.currentTimeMillis() - startTime) + "ms");

		/* Example of String Class */
		/* New String will be created */
		String str = new String("String Hello");
		/* Append in String */
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			str = new String("String Appended");
		}
		System.out.println("Time taken by String: "
				+ (System.currentTimeMillis() - startTime) + "ms");

	}
}
