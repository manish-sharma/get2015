/*
 It is MyException class and it extend Exception class.
 */
public class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	public MyException(Exception e) {
		System.out.print("Entered List is wrong");
	}
}
