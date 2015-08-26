/*this test class will test find fn which 
 * was defined in class Find_Remainder
 */
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Find_Remainder {

	Find_Remainder obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 obj=new Find_Remainder();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		int dividend,divisor;
		System.out.println("Enter Dividend");
		Scanner scan = new Scanner(System.in);
		dividend=Integer.parseInt(scan.nextLine());
		System.out.println("Enter Divisor");
		divisor=Integer.parseInt(scan.nextLine());
	
		int expected;
		System.out.println("Enter expected result :\n -1 when divisor=0\n -2 when divisor is less than 0 \n -3 when divident is less than 0\n otherwise enter expected result ");
		expected=Integer.parseInt(scan.nextLine());
		assertEquals(expected, obj.find(dividend, divisor));
	}

}
