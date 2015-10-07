/*this test class will test gcd fn which 
 * was defined in class Find_GCD
 */
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Find_GCD {
	Find_GCD obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
    obj=new Find_GCD();
    }

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		int n1,n2;
		System.out.println("Enter number 1");
		Scanner scan = new Scanner(System.in);
		n1=Integer.parseInt(scan.nextLine());
		System.out.println("Enter number 2");
		n2=Integer.parseInt(scan.nextLine());
	
		int expected;
		System.out.println("Enter expected result");
		expected=Integer.parseInt(scan.nextLine());
		assertEquals(expected, obj.gcd(n1, n2));
	}

}
