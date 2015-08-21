import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/** Junit test class for testing PersonStudentByInheritance test case   */

public class TestStudentInharitence {

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
	public void test() {
		
		Student s1 = new Student();
		s1.setName("xyz");
		s1.setAge(22);
		s1.setStudentId("0111CS015");
		
		assertEquals("xyz",s1.getName());
		assertEquals(22,s1.getAge());		
		assertEquals("0111CS015",s1.getStudentId());
		
	}

}
