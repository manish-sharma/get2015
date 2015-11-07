package programingFundamental4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class permutationTest {

	permutation assign = new permutation();
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
	public void checkForPermutation()
	{
		List<String> resList = assign.generatePermutations("", "ABC");

		List<String> expList = new ArrayList<String>();

		expList.add("ABC");
		expList.add("ACB");
		expList.add("BCA");
		expList.add("BAC");
		expList.add("CAB");
		expList.add("CBA");

		Assert.assertEquals(expList, resList);

	}

	@Test
	public void checkForPermutation1()
	{
		List<String> resList = assign.generatePermutations("", "ABCD");
		List<String> expList = new ArrayList<String>();

		expList.add("ABCD");
		expList.add("ABDC");
		expList.add("ACDB");
		expList.add("ACBD");
		expList.add("ADBC");
		expList.add("ADCB");
		expList.add("BCDA");
		expList.add("BCAD");
		expList.add("BDAC");
		expList.add("BDCA");
		expList.add("BACD");
		expList.add("BADC");
		expList.add("CDAB");
		expList.add("CDBA");
		expList.add("CABD");
		expList.add("CADB");
		expList.add("CBDA");
		expList.add("CBAD");
		expList.add("DABC");
		expList.add("DACB");
		expList.add("DBCA");
		expList.add("DBAC");
		expList.add("DCAB");
		expList.add("DCBA");
		Assert.assertEquals(expList, resList);
	}

}
