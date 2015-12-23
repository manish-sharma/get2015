/**
 * @class CallByReference
 * @author Pulkit
 * This class demonstrates the concept of call by reference.
 */

public class CallByReference {
	// private member of the class
	private int data = 20;

	/**
	 * This function makes the changes in the private member of the object passed 
	 * as argument by call by reference.
	 * @param{CallByReference} object
	 */
	
	void change(CallByReference object) {
		object.data = object.data + 30;
	}

	/**
	 * This is the main function of the class and controlling the flow.
	 * @param{String[]} args
	 */
	
	public static void main(String args[]) {
		
		CallByReference object = new CallByReference();
		System.out.println("Before change: " + object.data);
		// making the changes
		object.change(object);
		System.out.println("After change: " + object.data);

	}
}