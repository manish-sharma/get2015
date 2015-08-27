import org.junit.Test;

import static org.junit.Assert.*;

public class TestJUnit1 {

	TowerOfHanoi ob=new TowerOfHanoi();
	String str="";
	

	@Test
	public void testForTwoDisk() {
		
		str=ob.towerOfHanoi(2, "a", "b", "c",str);
		String expected ="a -> b\na -> c\nb -> c\n";
		assertEquals(expected, str);

		
	}
	@Test
	public void testForThreeDisk() {
		
		str=ob.towerOfHanoi(3, "a", "b", "c",str);
		String expected ="a -> c\na -> b\nc -> b\na -> c\nb -> a\nb -> c\na -> c\n";
		assertEquals(expected, str);

		
	}

}
