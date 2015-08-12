import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest1 {

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
	public void positiveTest()                            /*JUnit Test Function of Tower of Hanoi for Positive Case*/
	{
		String expect="A->C\nA->C\nB->A\nA->C\nB->A\nB->A\nC->B\n";
		
		
		assertEquals(expect, Assignment1.hanoi(3,"A","B","C"));
		
		 
	}
	
/*	@Test
	public void nagativeTest()                               //JUnit Test Function of Tower of Hanoi for Negative Case
	{
		String expect="A->C\nA->C\n  B->A\nA->C\nB->A\nB->A\nC->B\n";
		
		
		assertEquals(expect, Assignment1.hanoi(3,"A","B","C"));
		
	} */
	
}
