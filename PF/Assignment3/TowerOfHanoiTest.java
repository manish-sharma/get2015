package pf_assignment_4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TowerOfHanoiTest {

	@Test
	public void test() 
	{
		List<String> expected= new ArrayList<String>();
		expected.add("Disk 1 from A to C");
		expected.add("Disk 2 from A to B");
		expected.add("Disk 1 from C to B");
		expected.add("Disk 3 from A to C");
		expected.add("Disk 1 from B to A");
		expected.add("Disk 2 from B to C");
		expected.add("Disk 1 from A to C");
		List<String> Result=new TowerOfHanoi().towerOfHanoi(3,"A","B","C");
		
		
		assertEquals(expected,Result);
		
	}

}
