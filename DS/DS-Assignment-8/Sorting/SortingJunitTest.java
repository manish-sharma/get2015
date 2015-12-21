package Sorting;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class SortingJunitTest {
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	static ArrayList<Integer> expectedList = new ArrayList<Integer>();
	
	static ArrayList<Integer> expectedListForNagative = new ArrayList<Integer>();
	
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		list.add(18);
		list.add(55);
		list.add(100);
		list.add(3);
		list.add(1);
				
		expectedList.add(1);
		expectedList.add(3);
		expectedList.add(18);
		expectedList.add(55);
		expectedList.add(100);
		
		expectedListForNagative.add(1);
		expectedListForNagative.add(18);
		expectedListForNagative.add(5);
		expectedListForNagative.add(55);
		expectedListForNagative.add(100);
		
	}

	@After
	public void tearDown() throws Exception {
		
		list.clear();
		expectedList.clear();
		expectedListForNagative.clear();
	}

	@Test
	public void positiveCmparisonSortTest() {
		
		// Positive test for comparison sorting
		ComparisonSorting comparisonSorting=new ComparisonSorting();
		boolean expected=true;
		boolean actual=expectedList.equals(comparisonSorting.sort(list));
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void negativeCmparisonSortTest() {
		
		// Negative test for comparison sorting
		ComparisonSorting comparisonSorting=new ComparisonSorting();
		boolean expected=false;
		boolean actual=expectedListForNagative.equals(comparisonSorting.sort(list));
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void positiveLinearSortTest() {
		
		// Positive test for Linear sorting
		LinearSorting linearSorting=new LinearSorting();
		boolean expected=true;
		boolean actual=expectedList.equals(linearSorting.sort(list));
		
		assertEquals(expected,actual);
	}
 
	
	@Test
	public void negativeLinearSortTest() {
		
		// Negative test for linear sorting
		LinearSorting linearSorting=new LinearSorting();
		boolean expected=false;
		boolean actual=expectedListForNagative.equals(linearSorting.sort(list));
		
		assertEquals(expected,actual);
	}

}
