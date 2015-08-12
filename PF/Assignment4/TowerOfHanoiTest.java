/****************************************************************************************
Name            : TowerOfHanoi
Revision Log    : 2015-08-12: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test towerofhanoi problem.
                :
****************************************************************************************/
import static org.junit.Assert.*;

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

	//Test for one disk
	@Test
	public void testforonedisk() 
	{
		TowerOfHanoi object=new TowerOfHanoi();
		String actual=object.towerofhanoi("A", "B", "C", 1);
		String expected="Move disk 1 From A To C\n";
		assertEquals(expected,actual);
	}
	
	//Test for two disk
	@Test
	public void testfortwodisk() 
	{
		TowerOfHanoi object=new TowerOfHanoi();
		String actual=object.towerofhanoi("A", "B", "C", 2);
		String expected="Move disk 1 From A To B\nMove disk 2 From A To C\nMove disk 1 From B To C\n";
		assertEquals(expected,actual);
	}
	
	//Test for three disk
	@Test
	public void testforthreedisk() 
	{
		TowerOfHanoi object=new TowerOfHanoi();
		String actual=object.towerofhanoi("A", "B", "C", 3);
		String expected="Move disk 1 From A To C\nMove disk 2 From A To B\nMove disk 1 From C To B\nMove disk 3 From A To C\nMove disk 1 From B To A\nMove disk 2 From B To C\nMove disk 1 From A To C\n";
		assertEquals(expected,actual);
	}

}
