import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PersonTest {

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
	public void getUidTest() {
		
		Person personObj = new Person(23456789, "Amit");
		assertEquals("",23456789, personObj.getUid());
	}
	
	@Test
	public void getNameTest() {
		
		Person personObj = new Person(23456789, "Amit");
		assertEquals("", "Amit", personObj.getName());
	}
	
	@Test
	public void toStringTest() {
		
		Person personObj = new Person(23456789, "Amit");
		String expected="\nName:Amit\nuid:23456789";
		assertEquals("",expected,personObj.toString() );
	}
}


