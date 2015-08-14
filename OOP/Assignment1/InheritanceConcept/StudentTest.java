/****************************************************************************************
Name            : StudentTest
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test Student class. 
                :
****************************************************************************************/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StudentTest {
	
	Student object=new Student(45, "amar", 4567);
	String courses[]={"Hindi","English"};
	
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
	//Test of toString method
	public void testForToString() {
		assertEquals("Name:amar\nUID:45\nStudent Id : 4567", object.toString());
	}
	//Test of GetstudentId method
	@Test
	public void testForGetstudentId() {
		assertEquals(4567,object.getStudentId());
	}
	
	//Test of getUid method
	@Test
	public void testForGetUId() {
		assertEquals(45,object.getUid());
	}

}
//End of class
