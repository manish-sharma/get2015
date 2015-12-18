import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest5 {

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
		int arr[]={2,5,6,7,8,9};
		
		SortingCheck sc=new SortingCheck();
		int status=sc.sortingCheck(arr);
		 
		  if(status==1)
		   {
			assertEquals(1,status);
		   }
		   else if (status==2)
		   {
			   assertEquals(1,status);
	   	   }
		   else
		   {
			   assertEquals(0,status);
		   }
		
	}

}
