import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class JUnitTest2 {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void spaceTest() {
		Assignment2 obj= new Assignment2();
		String actual=obj.spaces(2, 5);
		assertEquals(" ",actual);
	}

	@Test
	public void numberCheck() {
		Assignment2 obj= new Assignment2();
		String actual=obj.number(4,5);
		assertEquals("12",actual);
	}

	@Test
	public void checkPattern() {
		Assignment2 obj=new Assignment2();
		String[] actual=Assignment2.printWholePattern(5);
		String[] expected={"12345",
				           " 1234",
				           "  123",
				           "   12",
		                   "    1"};
		assertEquals(expected,actual);
	}

}
