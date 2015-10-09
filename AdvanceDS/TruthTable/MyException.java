package TruthTable;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	public MyException(Exception e) {
		System.out.print("Input expression is wrong");
	}
}
