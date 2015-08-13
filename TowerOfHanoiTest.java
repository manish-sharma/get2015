import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TowerOfHanoiTest {

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
//positive case as per given in assignment;
	@Test
	public void test() {
		List<String> expected= new ArrayList<String>();
		expected.add("Disk 3 from A to B");
		expected.add("Disk 2 from A to C");
		expected.add("Disk 3 from B to C");
		expected.add("Disk 1 from A to B");
		expected.add("Disk 3 from C to A");
		expected.add("Disk 2 from C to B");
		expected.add("Disk 3 from A to B");
		List<String> Result=new TowerOfHanoi().towerOfHanoi("A","B","C",3);
		assertArrayEquals(expected.toArray(), Result.toArray());
	}
	//negative case as per given in assignment;
	@Test
	public void test1() {
		List<String> expected= new ArrayList<String>();
		expected.add("Disk 1 from A to C");
		expected.add("Disk 2 from A to B");
		expected.add("Disk 1 from C to B");
		expected.add("Disk 3 from A to C");
		expected.add("Disk 1 from B to C");
		expected.add("Disk 2 from B to C");
		expected.add("Disk 1 from A to C");
		List<String> Result=new TowerOfHanoi().towerOfHanoi("A","B","C",3);
		assertArrayEquals(expected.toArray(), Result.toArray());
	}

	

}
