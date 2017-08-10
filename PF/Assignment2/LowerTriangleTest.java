import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LowerTriangleTest {
	LowerTriangle lower=new LowerTriangle();

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
	public void SpaceTest()
	{
		assertEquals("  ",lower.spaceMethod(2, 5));
	}
	@Test
	public void testNumberString()
	{
		assertEquals("1234",lower.numberMethod(1,5));
	}
	@Test
	public void lowerTriangleTestOfThree()
	{
		String expected[]={"123"," 12","  1"};
		String output[]=lower.wholePyramid(3);
		for(int i=0;i<3;i++)
		{
			assertEquals(expected[i],output[i]);
		}
	}
	@Test
	public void lowerTriangleTest() {

		String expected[]={"12345"," 1234","  123","   12","    1"};
		
		String output[]=lower.wholePyramid(5);
		for(int i=0;i<5;i++)
		{
			assertEquals(expected[i],output[i]);
		}
	}

}
