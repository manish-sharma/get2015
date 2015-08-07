import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnit1_1 {


	@Test
	public void spaceTest() {
		Assignment1 obj= new Assignment1();
		String actual=obj.spaces(4, 5);
		assertEquals(" ",actual);
	}

	@Test
	public void numberCheck() {
		Assignment1 obj= new Assignment1();
		String actual=obj.number(4,5);
		assertEquals("1234321",actual);
	}

	@Test
	public void patternCheck() {
		Assignment1 obj=new Assignment1();
		String[] actual=obj.printWholePyramid(5);
		String[] expected={"    1",
				           "   121",
				           "  12321",
				           " 1234321",
				           "123454321",
				           " 1234321",
				           "  12321",
				           "   121",
				           "    1",};
		assertEquals(expected,actual);
	}

}
