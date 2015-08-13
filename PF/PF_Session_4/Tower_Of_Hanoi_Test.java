import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Tower_Of_Hanoi_Test {

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
	public void test() 
	{
		Tower_Of_Hanoi TOI=new Tower_Of_Hanoi();
		String result=TOI.towerOfHanoi("A", "C", "B", 2);
		String real="Move Disk 1 from A to B\nMove Disk 2 from A to C\nMove Disk 1 from B to C";
		assertEquals("",real,result);
	}
	@Test
	public void test1() 
	{
		Tower_Of_Hanoi TOI=new Tower_Of_Hanoi();
		String result=TOI.towerOfHanoi("A", "C", "B", 1);
		String real="Move Disk 1 from A to C";
		assertEquals("",real,result);
	}
	@Test
	public void test2() 
	{
		Tower_Of_Hanoi TOI=new Tower_Of_Hanoi();
		String result=TOI.towerOfHanoi("A", "C", "B", 3);
		String real="Move Disk 1 from A to C\nMove Disk 2 from A to B\nMove Disk 1 from C to B\nMove Disk 3 from A to C\nMove Disk 1 from B to A\nMove Disk 2 from B to C\nMove Disk 1 from A to C";
		assertEquals("",real,result);
	}

}
