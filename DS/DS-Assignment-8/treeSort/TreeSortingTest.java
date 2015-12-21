package treeSort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeSortingTest {
	
	TreeSort treeSort=new TreeSort();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		treeSort.insert(3);
		treeSort.insert(5);
		treeSort.insert(4);
		treeSort.insert(2);
		treeSort.insert(6);
		treeSort.insert(1);		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void positiveInorderTest() {
		
		//Positive Test for in order tree Sorting
		int expected[]={1,2,3,4,5,6};
		
		treeSort.inorderTreeSorting();
		assertArrayEquals(expected,treeSort.sortedArray);
		
	}
	/*
	@Test
	public void negativeInorderTest() {
	
		//Negative Test for in order tree Sorting
		int expected[]={1,2,3,4,6,5};
		
		treeSort.inorderTreeSorting();
		assertArrayEquals(expected,treeSort.sortedArray);
		
	}*/

}
