import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest6 {

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
        int length1=0,length2=0,length3=0,i;		
		
		int arr1[]={0,2,3,4,5,6,7,9};
		length1=arr1.length;
		
		int arr2[]={2,4,6,8,10};
		length2=arr2.length;
				
		length3=length1+length2;
		
		int arr3[]=new int[length3];
		
		MergeSortedArray msa=new MergeSortedArray();
	
		
		arr3=msa.join(arr1,length1,arr2,length2,arr3);
		
		int expected[]={0,2,2,3,4,4,5,6,6,7,8,9,10};
		
		assertArrayEquals(expected, arr3);
		
	}

}
