import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class TypeOfOrderTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("In Method setup");
	}

	
	@After
	public void tearDown() throws Exception {
		System.out.println("In Method teardown");
	}
	

	
	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("In Class tearDownClass");
	}
	
	@Test
	public void test() {
		System.out.print("Type of list");
		TypeOfOrder typeOfOrder_object=new TypeOfOrder();
		int input[]={23,23,21,44,55};
	    assertEquals("Pass", 0, typeOfOrder_object.sortedOrNot(input));
	}
}
