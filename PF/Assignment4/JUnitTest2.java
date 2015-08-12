import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTest2 {

	@Test
	public void testPermutaion1() {
		Assignment2 obj= new Assignment2();
		String[] actual=obj.generatePermutations("ABC");
		String[] expected={"ABC","ACB","BAC","BCA","CAB","CBA"};
		
		assertArrayEquals(actual,expected);
	}
	
	@Test
	public void testPermutaion2() {
		Assignment2 obj= new Assignment2();
		String[] actual=obj.generatePermutations("ABCD");
		String[] expected={"ABCD","ABDC","ACBD","ACDB","ADBC","ADCB","BACD","BADC","BCAD","BCDA","BDAC","BDCA","CABD","CADB","CBAD","CBDA","CDAB","CDBA","DABC","DACB","DBAC","DBCA","DCAB","DCBA"};
		assertArrayEquals(actual,expected);
	}


}
