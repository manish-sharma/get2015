import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test1 {

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
		Program1 object= new Program1();
		String result="->A->C->A->B->C->B->A->C->B->A->B->C->A->C";
		String input=object.towerOfHanoi(3,"A","B","C");
		assertEquals(result,input);
	}
	@Test
	public void test2() {
		Program1 object= new Program1();
		String result="->A->B->A->C->B->C";
		String input=object.towerOfHanoi(2,"A","B","C");
		assertEquals(result,input);
	}
	@Test
	public void test3() {
		Program1 object= new Program1();
		String result="->A->C";
		String input=object.towerOfHanoi(1,"A","B","C");
		assertEquals(result,input);
	}

}
