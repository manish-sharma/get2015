import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;


public class Main 
{
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException 
	{
		try 
		{
			int dividend = 7;
			int divisor = 0;
			int quotient = dividend / divisor;
			System.out.print("dividend/divisor = " + quotient);
		} catch (Exception ex) 
		{
			Logger.getInstance();
			Logger.log(ex.getMessage());
		}
		
	}
	
	

}
