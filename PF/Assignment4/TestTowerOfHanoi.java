package towerofhanoi;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestTowerOfHanoi {

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
	public void testTowerOfHanoi1() {
		int noOfDisk = 2;
		Towerofhanoi towerOfHanoi = new Towerofhanoi(noOfDisk);
		List<String> diskMovementList = towerOfHanoi.towerOfHanoi( "A", "B", "C"  ,noOfDisk);
		String expected[] = {"Move Disk 2 from A to C" , "Move Disk 1 from A to B" , "Move Disk 2 from C to B"};
		int index = 0;
		for(String str  :diskMovementList)
		{
			assertEquals(expected[index++], str);
			
		}

	}
	@Test
	public void testTowerOfHanoi2() {
		int noOfDisk = 3;
		Towerofhanoi towerOfHanoi = new Towerofhanoi(noOfDisk);
		List<String> diskMovementList = towerOfHanoi.towerOfHanoi( "A", "B", "C",noOfDisk);
		String expected[] = {"Move Disk 3 from A to B", "Move Disk 2 from A to C", "Move Disk 3 from B to C","Move Disk 1 from A to B","Move Disk 3 from C to A","Move Disk 2 from C to B","Move Disk 3 from A to B"};
		int index = 0;
		for(String str : diskMovementList)
		{
			assertEquals(expected[index++], str);
			
		}

	}
	@Test
	public void testTowerOfHanoi3() {
		int noOfDisk=1;
		Towerofhanoi towerOfHanoi = new Towerofhanoi(noOfDisk);
		List<String> diskMovementList = towerOfHanoi.towerOfHanoi( "A", "B", "C",noOfDisk);
		String expected[] = {"Move Disk 1 from A to B"};
		int index = 0;
		for(String str : diskMovementList)
		{
			assertEquals(expected[index++] , str);
			
		}

	}

}
