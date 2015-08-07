package Assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass6 {

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
	int array1[]={1,2,5,6,9};
	int array2[]={2,3,6,7,8};
	int array3[]={1,2,2,3,5,6,6,7,8,9};
	int array4[]=new int[array1.length+array2.length];
	Assignment6 a1=new Assignment6();
	
	array4=a1.join(array1,array1.length,array2,array2.length,array4);
	assertArrayEquals("Correct",array3,array4);
	
	}

}
