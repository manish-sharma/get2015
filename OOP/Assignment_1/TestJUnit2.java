package assignmentOOP_1;


import org.junit.Test;

import static org.junit.Assert.*;
public class TestJUnit2
{
	Student student;
	
	/* This is to test  for one of function of parent class when it get called from object of child class*/
	@Test
	public void testForGetIdFunction()
	{
		student= new Student(1,"neha",11);
		int id =student.getUId();
		int expected =1;
		assertEquals(id,expected);
	}
	/*This is to test for setCourses function of child class*/
	@Test
	public void testForsetCoursesFunction()
	{
		student= new Student(1,"neha",11);
		String courses[]=new String[]{"C++","Java","PHP","DotNet"};
		student.setCourses(courses);
		String expected[]=new String[]{"C++","Java","PHP","DotNet"};
		assertArrayEquals(expected,student.getCourses());
	}
	
	/*This is to test for toString Function that is override in parent as well as in child class*/
	@Test
	public void testForToStringFunction()
	{
		student= new Student(1,"neha",11);
		String expected="Student [studentId=11, courses=null, toString()=Person [UId=1, Name=neha]]";
		assertEquals(expected,student.toString());
	}
	

}
