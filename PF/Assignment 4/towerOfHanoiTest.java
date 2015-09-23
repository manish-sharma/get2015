import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class towerOfHanoiTest {

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
	public void test1() {
		
		towerOfHanoiRecursion testObject1 = new towerOfHanoiRecursion();
		List<String> actual = new ArrayList<String>();
		String expected[]={"Move Disk 1 from A to C", "Move Disk 2 from A to B", "Move Disk 1 from C to B", "Move Disk 3 from A to C", "Move Disk 1 from B to A", "Move Disk 2 from B to C", "Move Disk 1 from A to C"};
		actual=testObject1.towerOfHanoi("A", "B", "C", 3);
		int i=0;
		for(String s:actual)
		{
			assertEquals("", expected[i], s);
			i++;
		}
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		
		towerOfHanoiRecursion testObject2 = new towerOfHanoiRecursion();
		List<String> actual = new ArrayList<String>();
		String expected[]={"Move Disk 1 from A to C"};
		actual=testObject2.towerOfHanoi("A", "B", "C", 1);
		int i=0;
		for(String s:actual)
		{
			assertEquals("", expected[i], s);
			i++;
		}
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		
		towerOfHanoiRecursion testObject3 = new towerOfHanoiRecursion();
		List<String> actual = new ArrayList<String>();
		String expected[]={"Move Disk 1 from A to B", "Move Disk 2 from A to C", "Move Disk 1 from B to C"};
		actual=testObject3.towerOfHanoi("A", "B", "C", 2);
		int i=0;
		for(String s : actual)
		{
			assertEquals("", expected[i], s);
			i++;
		}
		//fail("Not yet implemented");
	}

}

