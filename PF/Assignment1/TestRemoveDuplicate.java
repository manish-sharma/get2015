package RemoveDuplicate;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRemoveDuplicate {

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
		int input[]={1,2,3,1,3,2,4,3,2,4,1,3,4,3,2,};
		  
  		//System.out.println("Enter no"); 
	
		RemoveDuplicate rd=new RemoveDuplicate();
			int output[]=rd.removeDuplicate(input);
			int actual[]={1,2,3,4,0,0,0,0,0,0};
		//for(int index=0;index<output.length;index++)	
			//System.out.println(output[index])
			assertArrayEquals(actual, output);
		
	}

}
