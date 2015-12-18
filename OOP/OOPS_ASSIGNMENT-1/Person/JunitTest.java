package Person;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

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
	public void testForToString()            //function for Junit Test of ToString() method
	{
	    int uid=101;
	    String name="Suman";
	    int studentid=110;
	    
	    Student std=new Student(uid,name,studentid);
	    String expected;
	    
	    expected=uid+"\t"+name+"\t"+studentid;
	    assertEquals(expected,std.toString());
	}
	@Test
	public void testForToCourses()   //function for Junit Test of course method
	{
	   int uid=101;
	   String name="Suman";
	   int studentid=110;
	   
	   Student std=new Student(uid,name,studentid);
	   
	   String course[]={"computer Science","information Technology"};
	   std.setCources(course);
	}
}
