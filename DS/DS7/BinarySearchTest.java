import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

BinarySearch binarySearch = new BinarySearch();	//create object of BinarySearch class

@Test//negative test case when array is empty
	public void binarySearchtest() {
		BinarySearch binarySearch=new BinarySearch();
		binarySearch.SearchArray.add(1);
		binarySearch.SearchArray.add(2);
		binarySearch.SearchArray.add(3);
		binarySearch.SearchArray.add(4);
		binarySearch.SearchArray.add(4);
		binarySearch.SearchArray.add(4);
		binarySearch.SearchArray.add(5);
		binarySearch.SearchArray.add(6);
		int expected = -1;
		int result = binarySearch.BinarySearchFunction(10, 0,binarySearch.SearchArray.size()-1); //call binary search method
		assertEquals(expected, result);
	}

	@Test//positive test case
	public void binarySearchtestEmptyArray() {
		int result = binarySearch.BinarySearchFunction(4, 0,binarySearch.SearchArray.size()-1);
		int expected =-1;
		assertEquals(expected, result);
	}
	
	@Test//positive test case
	public void binarySearchtestNegativeArray() {
		BinarySearch binarySearch=new BinarySearch();
		binarySearch.SearchArray.add(-8);
		binarySearch.SearchArray.add(-8);
		binarySearch.SearchArray.add(-6);
		binarySearch.SearchArray.add(-5);
		binarySearch.SearchArray.add(-1);
		binarySearch.SearchArray.add(0);
		binarySearch.SearchArray.add(-2);
		binarySearch.SearchArray.add(0);
		int expected = 0;
		int result = binarySearch.BinarySearchFunction(-8, 0,binarySearch.SearchArray.size()-1);
		assertEquals(expected, result);	
	}
}
