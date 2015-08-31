import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PyramidTest {
	Pyramid p=new Pyramid();

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
	public void testSpace()
	{
		assertEquals("  ",p.spaceMethod(3, 5));
	}
	@Test
	public void testNumberString()
	{
		assertEquals("1234321",p.numberMethod(4,5));
	}
	@Test
	public void testPatternOfSizeThree()
	{
		String expected[]={"  1"," 121","12321"," 121","  1"};
		String output[]=p.wholePyramid(3);
		for(int i=0;i<5;i++)
		{
			assertEquals(expected[i],output[i]);
		}
		
	}
	@Test
	public void testPatternOfSizeFive() {
		String expected[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		
		String output[]=p.wholePyramid(5);
		for(int i=0;i<9;i++)
		{
			assertEquals(expected[i],output[i]);
		}


	}

}
