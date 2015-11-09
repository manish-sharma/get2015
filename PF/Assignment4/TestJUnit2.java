import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJUnit2 {

	GeneratePermutation ab=new GeneratePermutation();
	List<String> list = new ArrayList<String>(); {
	}

	//test case when there is two character present in string 
	@Test
	public void test1() {
		list=ab.generatePermutation("ab", 0,list);
		List<String> list1 = new ArrayList<String>(); 
		list1.add("ab");list1.add("ba");
		assertEquals(list1, list);

		
	}
	//test case when there is three character present in string 
		@Test
		public void test2() {
			list=ab.generatePermutation("abc", 0,list);
			List<String> list1 = new ArrayList<String>(); 
			list1.add("abc");list1.add("acb");list1.add("bac");list1.add("bca");list1.add("cba");list1.add("cab");
			assertEquals(list1, list);

			
		}

}