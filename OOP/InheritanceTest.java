package oops_asignment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class InheritanceTest {

	@Test
	
	public void test()
	{
			Person personObj = new Person(23456789, "Amit");
			assertEquals("",23456789, personObj.getUid());
	}
	/**
	 * Name:test
	 * Description: checks the value returned
	 **/
	
	@Test
	public void test1()
	{
		Student StudentObj = new Student(23456789, "Amit", 101);
		assertEquals("",101, StudentObj.getStudentId());
	}
	/*tested perfectly*/


}
