import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class printPatternTest {

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
		printPattern p=new printPattern();
		String arr2[]={" "," "};
		assertArrayEquals("Match",arr2,p.spaces(2,5));
    }
	
	@Test
	public void test_numbers() 
	{
		printPattern p=new printPattern();
		String arr2[]={"1","2","3"};
		assertArrayEquals("Match",arr2,p.numbers(2,5));	
	}
	
	@Test
	public void test_pattern() 
	{
		printPattern p=new printPattern();
		String str[]={" "," ","1","2","3"};
		assertArrayEquals("Match",str,p.pattern(2,5));	

	}
	@Test
	public void test_spaces1() 
	{
		printPattern p=new printPattern();
		String arr2[]={" ","1"};
		assertArrayEquals("Fail",arr2,p.spaces(2,5));
    }
	
	@Test
	public void test_numbers1() 
	{
		printPattern p=new printPattern();
		String arr2[]={"1","3","3"};
		assertArrayEquals("Fail",arr2,p.numbers(2,5));	
	}
	
	@Test
	public void test_pattern1() 
	{
		printPattern p=new printPattern();
		String str[]={" ","3","1","2","3"};
		assertArrayEquals("Fail",str,p.pattern(2,5));	

	}

}
