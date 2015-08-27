import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InheritanceTest 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void testUId() 
	{
		int expectedUId = 1;
		String coursesArr[] = {"Java","OOPs"};
		Student obj = new Student (1, "Kajal", 11, coursesArr);
		assertEquals( "Matched", expectedUId, obj.getUid());
	}
	
	@Test
	public void testName() 
	{
		String expectedName = "Kajal";
		String coursesArr[] = {"Java","OOPs"};
		Student obj = new Student (1, "Kajal", 11, coursesArr);
		assertEquals( "Matched", expectedName, obj.getName());
	}
	
	@Test
	public void testStudentId() 
	{
		int expectedStudentId = 11;
		String coursesArr[] = {"Java","OOPs"};
		Student obj = new Student (1, "Kajal", 11, coursesArr);
		assertEquals( "Matched", expectedStudentId, obj.getStudentId());
	}
	
	@Test
	public void testCourses() 
	{
		String expectedCourses[] = {"Java","OOPs"};
		String coursesArr[] = {"Java","OOPs"};
		Student obj = new Student (1, "Kajal", 11, coursesArr);
		assertArrayEquals( "Matched", expectedCourses, obj.getCourses());
	}

}
