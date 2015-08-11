import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTest2 {

	@Test
	public void testLinearSearch() {
		int array[]= {2,5,8,9,10,77,55};
		int valueExpected=-1;
		Assignment2 assignment2= new Assignment2();
		int valueActual=assignment2.linearSearch(array,0,array.length-1,88);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testLinearSearch2() {
		int array[]= {2,5,8,9,10,77,55,11};
		int valueExpected=5;
		Assignment2 assignment2= new Assignment2();
		int valueActual=assignment2.linearSearch(array,0,array.length-1,77);
		assertEquals(valueActual,valueExpected);
	}
	
	
	
	@Test
	public void testBinarySearch() {
		int array[]= {2,5,8,9,10, 55, 77};
		int valueExpected=-1;
		Assignment2 assignment2= new Assignment2();
		int valueActual=assignment2.binarySearch(array,0,array.length-1,88);
		System.out.println(valueActual);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testBinarySearch2() {
		int array[]= {2,5,8,9,10,55,77};
		int valueExpected=6;
		Assignment2 assignment2= new Assignment2();
		int valueActual=assignment2.binarySearch(array,0,array.length-1,77);
		assertEquals(valueActual,valueExpected);
	}

}
