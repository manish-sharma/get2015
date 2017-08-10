import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;


public class DuplicateRemovalTest {

	public void setUp() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}
	

	
	@AfterClass
	public static void tearDownClass() throws Exception {
	}
	
	@Test
	public void test() {
		System.out.print("Duplicate Element Removal");
		DuplicateRemoval duplicateRemoval_object=new DuplicateRemoval();
		int input[]= {1,2,3,4,7,8,9,9,7,0,7};
		int expected[]={1,2,3,4,7,8,9,0};
		int output[]=duplicateRemoval_object.removeDuplicateElement(input);
	    assertArrayEquals("Pass",expected, output);
	}
	}


