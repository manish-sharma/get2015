import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class gcdThruRecursionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	public void test() {
		gcdThruRecursion object=new gcdThruRecursion();
		int number1=2;
		int number2=1;
		int gcd=object.gcd(number1, number2);
		assertEquals("Pass",1,gcd);
	}
	//Positive Test Case
	@Test
	public void test1() {
		gcdThruRecursion object=new gcdThruRecursion();
		int number1=100;
		int number2=3;
		int gcd=object.gcd(number1, number2);
		assertEquals("Pass",1,gcd);
	}
	//Error Test Case
	@Test
	public void test2() {
		gcdThruRecursion object=new gcdThruRecursion();
		int number1=2;
		int number2=0;
		int gcd=object.gcd(number1, number2);
		assertEquals("Pass",0,gcd);
	}
	//Negative Test Case
	@Test
	public void test3() {
		gcdThruRecursion object=new gcdThruRecursion();
		int number1=10;
		int number2=5;
		int gcd=object.gcd(number1, number2);
		assertNotEquals("Pass",2,gcd);
	}
	//Negative Test Case
	@Test
	public void test4() {
		gcdThruRecursion object=new gcdThruRecursion();
		int number1=27;
		int number2=5;
		int gcd=object.gcd(number1, number2);
		assertNotEquals("Pass",5,gcd);
	}

}
