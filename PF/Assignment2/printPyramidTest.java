import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class printPyramidTest {

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
	public void test_spaces() 
	{
		printPyramid p=new printPyramid();
		String arr2[]={" "," "};
		assertArrayEquals("Match",arr2,p.spaces(2,5));
    }
	@Test
	public void test_spaces1() 
	{
		printPyramid p=new printPyramid();
		String arr2[]={" ","1"};
		assertArrayEquals("Match",arr2,p.spaces(2,5));
    }
	@Test
	public void test_numbers() 
	{
		printPyramid p=new printPyramid();
		String arr2[]={"1","2","3","2","1"};
		assertArrayEquals("Match",arr2,p.numbers(2,5));	
	}
	@Test
	public void test_numbers1() 
	{
		printPyramid p=new printPyramid();
		String arr2[]={"1","2","1","2","1"};
		assertArrayEquals("fail",arr2,p.numbers(2,5));	
	}
	@Test
	public void test_pyramid() 
	{
		printPyramid p=new printPyramid();
		String str[]={" "," ","1","2","3","2","1"};
		assertArrayEquals("Match",str,p.pyramid(2,5));	

	}
	@Test
	public void test_pyramid1() 
	{
		printPyramid p=new printPyramid();
		String str[]={" ","0","1","2","3","2","1"};
		assertArrayEquals("Fail",str,p.pyramid(2,5));	

	}

}
