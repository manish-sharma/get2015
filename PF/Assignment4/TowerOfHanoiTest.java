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

public class TowerOfHanoiTest {

	List<String> towerStrings = new ArrayList<String>();
	TowerOfHanoi assign=new TowerOfHanoi();
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
	public void checkTowerOfHanoi()
	{
		List<String> resList = assign.towerOfHanoi("A", "C", "B", 1);
		List<String> expList = new ArrayList<String>();
		expList.add("Move Disk 1 from A to C");

		Assert.assertEquals(expList, resList);
	}

	@Test
	public void checkTowerOfHanoi1()
	{
		List<String> resList = assign.towerOfHanoi("A", "C", "B", 2);
		List<String> expList = new ArrayList<String>();
		expList.add("Move Disk 1 from A to B");
		expList.add("Move Disk 2 from A to C");
		expList.add("Move Disk 1 from B to C");
		Assert.assertEquals(expList, resList);
	}

	@Test
	public void checkTowerOfHanoi2()
	{
		List<String> resList = assign.towerOfHanoi("A", "C", "B", 3);
		List<String> expList = new ArrayList<String>();
		expList.add("Move Disk 1 from A to C");
		expList.add("Move Disk 2 from A to B");
		expList.add("Move Disk 1 from C to B");
		expList.add("Move Disk 3 from A to C");
		expList.add("Move Disk 1 from B to A");
		expList.add("Move Disk 2 from B to C");
		expList.add("Move Disk 1 from A to C");

		Assert.assertEquals(expList, resList);
	}

}
