import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class InhertitanceTest {

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
	public void test()
	{
			Person personObj = new Person(23456789, "Amit");
			assertEquals("",23456789, personObj.getUid());
	}
	/**
	 * Name:test
	 * Description: checks the value returned
	 **/
	@Test
	public void test1()
	{
		Student StudentObj = new Student(23456789, "Amit", 101);
		assertEquals("",101, StudentObj.getStudentId());
	}

}
