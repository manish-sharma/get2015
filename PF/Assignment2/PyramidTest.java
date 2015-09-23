package pyramid;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * @author Girdhari
 * @since:August 8,2015
 */

public class PyramidTest {

	

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
/**
 * Name:test
 * description:checks for the string
 */
		@Test
		public void test() {
			Pyramid objectForNumber = new Pyramid();
			String resultNumber = objectForNumber.numbers(5, 5);
			assertEquals("123454321",resultNumber);
		}
		/**
		 * Name:test1
		 * description: checks for the space if expected and actual is correct or not
		 */
		@Test
		public void test1(){
			Pyramid objectForSpace = new Pyramid();
			String resultSpace = objectForSpace.space(5, 1);
			assertEquals("",resultSpace);
		}
		/**
		 * Name:test2
		 * description:checks for the pattern for the whole pattern
		 */
		
		@Test
		public void test2(){
			Pyramid objectForWhole = new Pyramid();
			String wholePyramid[] = objectForWhole.finalTriangle(5);
			String expected[] = {"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
			assertArrayEquals(expected,wholePyramid);	
		}
		
	}

