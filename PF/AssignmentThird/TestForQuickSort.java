import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestForQuickSort {

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
	public void testForRandom() {
		QuickSort quick=new QuickSort();
		int expected[]={2,5,8,9,10,11,55,77};
		int input[]={2,5,8,9,10,55,77,11};
		quick.sort(input, 0, 7);
		  assertArrayEquals(expected,input);
	}

	@Test
	public void testForAccending() {
		QuickSort quick=new QuickSort();
		int expected[]={2,5,8,9,10,11,55,77};
		int input[]={2,5,8,9,10,11,55,77};
		quick.sort(input, 0, 7);
		  assertArrayEquals(expected,input);
	}
	@Test
	public void testForDecending() {
		QuickSort quick=new QuickSort();
		int expected[]={2,5,8,9,10,11,55,77};
		int input[]={77,55,11,10,9,8,5,2};
		quick.sort(input, 0, 7);
		  assertArrayEquals(expected,input);
	}
	@Test
	public void testForZero() {
		QuickSort quick=new QuickSort();
		int expected[]={};
		int input[]={};
		quick.sort(input, 0, -1);
		  assertArrayEquals(expected,input);
	}



}
