import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TreeSortTest {
	
	TreeSort treeSort  = new TreeSort();

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
		List<Integer> rollNumberList = new ArrayList<Integer>(Arrays.asList(76, 65, 80, 10, 23, 34));
		List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(10, 23, 34, 65, 76, 80));
		
		assertEquals( expectedList, treeSort.treeSort(rollNumberList) );
	}
	
	@Test
	public void test1() {
		List<Integer> rollNumberList = new ArrayList<Integer>(Arrays.asList(76));
		List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(76));
		
		assertEquals( expectedList, treeSort.treeSort(rollNumberList) );
	}
	
	@Test
	public void test2() {
		List<Integer> rollNumberList = new ArrayList<Integer>(Arrays.asList(2,2,0,2,1,1,1,3,3,0,0));
		List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(0,0,0,1,1,1,2,2,2,3,3));
		
		assertEquals( expectedList, treeSort.treeSort(rollNumberList) );
	}

}
