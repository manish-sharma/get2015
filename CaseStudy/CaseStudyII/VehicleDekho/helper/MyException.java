package helper;

/**
 * This class handle exception
 * @author Banwari kevat
 */
public class MyException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public MyException(Exception e) 
	{
		System.out.print(e.getMessage());
	}

}
