import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestStringPermutation {

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
		
		
		String input="ABC";
        StrPermu obj = new StrPermu(3);
        obj.generatePermutations(input);
        String[] output= obj.storeAllPermutation();
        assertArrayEquals(new String[]{"ABC","ACB","BAC","BCA","CBA","CAB"}, output);
	}

}
