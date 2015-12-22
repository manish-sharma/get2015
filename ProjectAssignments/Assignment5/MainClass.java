package Assignment5;

public class MainClass {
	public static void main(String args[]) {
		String string = "Avinash Barola";
		StringOperation stringOperation = new StringOperation(string);
		try {
			System.out.println(stringOperation.getCharAt(13));
		} catch (StringException e) {
			System.out.println("Please Enter Correct Index Value");
		}
	}
}
