/**
 * This class demonstrate the difference between throw and throws
 */
package multithreading;

import java.sql.SQLException;

public class ThrowThrows {
	void mymethod(){  
        throw new ArithmeticException("arithmetic exception occured");  
    }
	
	void mymethod1() throws SQLException, NumberFormatException 
	{
		 String str="66";
		 int num = Integer.parseInt(str);
		 
	}
	
	public static void main(String [] arg)
	{
	    ThrowThrows obj = new ThrowThrows();
	    
	   obj.mymethod();
	    try {
			obj.mymethod1();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
