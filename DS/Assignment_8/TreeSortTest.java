
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class TreeSortTest
{
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

	/** positive test case for TreeSort */
	
	@Test
	public void test() {
		TreeSort tree=new TreeSort();
		int inpArray[]={5,3,7,1,4,3,2,7,4};
		
		for(int i=0;i<inpArray.length;i++) {
			tree.root=tree.insert(inpArray[i],tree.root);
		}
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr=tree.DispalyInSortedOrder(tree.root,arr);
		
		
		Integer expArray[]={1,2,3,3,4,4,5,7,7};
		for(int i=0;i<inpArray.length;i++)  
        {
			if(arr.get(i)!=expArray[i]) 
              {
				fail("Method fails");
				break;
			}
		}
		

		
	}


}
