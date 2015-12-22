package Assignment5;

public class StringOperation {
	String string;

	public StringOperation(String string) {
		this.string = string;
	}

	// throw keyword if followed by instance whereas throws keyword is followed
	// by class
	// Java throw keyword is used to explicitly throw an exception. Java throws
	// keyword is used to declare an exception.

	public char getCharAt(int index) throws StringException {
		char stringArray[] = string.toCharArray();
		if (index < 0 || index >= string.length()) {
			throw new StringException("Please Enter correct index");
		}
		return stringArray[index];
	}
}
