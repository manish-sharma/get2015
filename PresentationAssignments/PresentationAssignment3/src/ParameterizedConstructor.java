/**
 * @class ParameterizedConstructor
 * @author Pulkit This class implements the parameterized constructor example.
 */

public class ParameterizedConstructor {

	/**
	 * This is a default constructor.
	 */

	ParameterizedConstructor() {
		System.out.println("Default constructor");
	}

	/**
	 * This is a parameterized constructor for the class with two int values as
	 * parameters.
	 * 
	 * @param{int i
	 * @param{int j
	 */

	ParameterizedConstructor(int i, int j) {
		System.out.print("parameterized constructor");
		System.out.println(" with Two parameters");
	}

	/**
	 * This is a parameterized constructor for the class with three int values
	 * as parameters.
	 * 
	 * @param{int i
	 * @param{int j
	 * @param{int k
	 */

	ParameterizedConstructor(int i, int j, int k) {
		System.out.print("parameterized constructor");
		System.out.println(" with Three parameters");
	}

	public static void main(String args[]) {

		// This will invoke default constructor

		ParameterizedConstructor defualtObject = new ParameterizedConstructor();

		// This will invoke the constructor with two arguments

		ParameterizedConstructor parameterizedObject1 = new ParameterizedConstructor(12, 12);

		// This will invoke the constructor with three arguments

		ParameterizedConstructor parameterizedObject2 = new ParameterizedConstructor(1, 2, 13);
	}

}
