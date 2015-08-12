import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class JUnitTest1 {

	@Test
	public void testTowerOfHanoi1() {
		List<String> res= new ArrayList<String>();
		Assignment1 assignment1= new Assignment1();
		res=assignment1.towerOfHanoi("A","B","C",1);
		String[] actualList=res.toArray(new String[res.size()]);
		String[] expectedList={"Moves Disk 1 from A to B"};
		assertArrayEquals(expectedList,actualList);
	}  

	@Test
	public void testTowerOfHanoi2() {
		List<String> res= new ArrayList<String>();
		Assignment1 assignment1= new Assignment1();
		res=assignment1.towerOfHanoi("A","B","C",2);
		String[] actualList=res.toArray(new String[res.size()]);
		System.out.print(actualList[0]);
		String[] expectedList={"Moves Disk 1 from A to C","Moves Disk 2 from A to B","Moves Disk 1 from C to B"};
		assertArrayEquals(expectedList,actualList);
	}


	@Test
	public void testTowerOfHanoi3() {
		List<String> res= new ArrayList<String>();
		Assignment1 assignment1= new Assignment1();
		res=assignment1.towerOfHanoi("A","B","C",3);
		String[] actualList=res.toArray(new String[res.size()]);
		String[] expectedList={"Moves Disk 1 from A to B","Moves Disk 2 from A to C","Moves Disk 1 from B to C","Moves Disk 3 from A to B","Moves Disk 1 from C to A","Moves Disk 2 from C to B","Moves Disk 1 from A to B"};
		assertArrayEquals(expectedList,actualList);
	}

}