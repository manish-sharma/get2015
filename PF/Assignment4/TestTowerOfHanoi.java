import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;

public class TestTowerOfHanoi {

	TowerOfHanoi testObject = new TowerOfHanoi();  // Make object of testObject
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
	public void test1() {				// Test Case 1
		
		List<String> actual = new ArrayList<String>();
		String[] expected = {"Move Disk From A to C",
				"Move Disk From A to B",
				"Move Disk From C to B",
				"Move Disk From A to C",
				"Move Disk From B to A",
				"Move Disk From B to C",
				"Move Disk From A to C"};
		actual = testObject.towerOfHanoi("A", "B", "C", 3);
		int i = 0;
		for ( String s : actual )
		{
			assertEquals("", expected[i], s);
			i++;
		}
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {				// Test Case 2
		
		List<String> actual = new ArrayList<String>();
		String[] expected = {"Move Disk From A to B",
				"Move Disk From A to C",
				"Move Disk From B to C"
                                         };
		actual = testObject.towerOfHanoi("A", "B", "C", 2);
		int i = 0;
		for ( String s : actual )
		{
			assertEquals("", expected[i], s);
			i++;
		}
		
	}
	
	@Test
	public void test3() {				// Test case 3
		
		List<String> actual = new ArrayList<String>();
		String[] expected = { "Move Disk From A to C" };
		actual = testObject.towerOfHanoi("A", "B", "C", 1);
		int i = 0;
		for ( String s : actual )
		{
			assertEquals("", expected[i], s);
			i++;
		}
		
	}

}
