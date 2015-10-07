/*this test class will test largestDigit fn 
 * which was defined in class Find_Largest_Digit
 */
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Find_Largest_Digit {
	Find_Largest_Digit obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new Find_Largest_Digit();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		  Scanner scan;
		  long number;
		  System.out.println("Enter number");
		  scan=new Scanner(System.in);
		  number=scan.nextLong();
		  long expected;
		  System.out.println("Enter expected result");
		  expected=scan.nextLong();
		  assertEquals(expected, obj.largestDigit(number));
		  
	}

}
