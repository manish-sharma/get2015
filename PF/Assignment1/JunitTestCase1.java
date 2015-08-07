import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTestCase1 {

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

	@Test
	public void test1() {
		System.out.println("Test1");
	Assign1 assign1=new Assign1();
	int octalReturn = assign1.convertBinaryToOctal(110101);
	assertEquals("match",65,octalReturn);
		
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	Assign1 assign1=new Assign1();
	int octalReturn = assign1.convertBinaryToOctal(1010101);
	assertEquals("match",125,octalReturn);
		
	}


}
