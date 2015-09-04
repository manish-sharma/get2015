/**
 * @author : Pooja Khandelwal
 * @crated Date : 04/09/2015
 * @Name : TreeSort_Test
 * @Description : this class will test the sortStudentsListBasedOnId() function of School_Or_College class
 */
package com.test.treesort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.treesort.School_Or_College;
import com.treesort.Student;

public class TreeSort_Test {
	private School_Or_College<Map<Integer, String>> studentsList;

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

	/**
	 * @Name : positiveTestSortStudentsListBasedOnId()
	 * @Description : this method will positively test the
	 *              sortStudentsListBasedOnId() method of School_Or_College
	 *              class
	 * @param :
	 * @return :
	 */
	@Test
	public void positiveTestSortStudentsListBasedOnId() {
		School_Or_College<Map<Integer, String>> school_Or_College = new School_Or_College<Map<Integer, String>>(
				4);
		studentsList = new School_Or_College<Map<Integer, String>>();
		studentsList = null;
		Student student = new Student();
		student.setName("pooja");
		student.setRollNo(4);
		studentsList = school_Or_College.addNewStudent(studentsList);
		student.setName("ravika");
		student.setRollNo(2);
		studentsList = school_Or_College.addNewStudent(studentsList);
		student.setName("sumi");
		student.setRollNo(3);
		studentsList = school_Or_College.addNewStudent(studentsList);
		student.setName("kiran");
		student.setRollNo(7);
		studentsList = school_Or_College.addNewStudent(studentsList);
		Map<Integer, String> expectedList = new LinkedHashMap<Integer, String>();
		expectedList.put(2, "ravika");
		expectedList.put(3, "sumi");
		expectedList.put(4, "pooja");
		expectedList.put(7, "kiran");
		Map<Integer, String> actualList = new LinkedHashMap<Integer, String>();
		actualList = school_Or_College.sortStudentsListBasedOnId(studentsList);
		ArrayList<Integer> actualIdList = new ArrayList<Integer>();
		for (Integer id : actualList.keySet()) {
			actualIdList.add(id);
		}
		int idCount = 0;
		int actualId;
		int expectedId;
		for (Integer id : expectedList.keySet()) {
			actualId = actualIdList.get(idCount);
			expectedId = id;
			assertEquals(actualId, expectedId);
			idCount++;
		}
		for (Entry<Integer, String> name : expectedList.entrySet()) {
			String actualName = actualList.get(name.getKey());
			assertNotNull(actualName);
			assertEquals(name.getValue(), actualName);
		}
	}

	/**
	 * @Name : negativeTestSortStudentsListBasedOnId()
	 * @Description : this method will negatively test the
	 *              sortStudentsListBasedOnId() method of School_Or_College
	 *              class
	 * @param :
	 * @return :
	 */
	@Test
	public void negativeTestSortStudentsListBasedOnId() {
		School_Or_College<Map<Integer, String>> school_Or_College = new School_Or_College<Map<Integer, String>>(
				4);
		studentsList = new School_Or_College<Map<Integer, String>>();
		studentsList = null;
		Student student = new Student();
		student.setName("pooja");
		student.setRollNo(4);
		studentsList = school_Or_College.addNewStudent(studentsList);
		student.setName("ravika");
		student.setRollNo(2);
		studentsList = school_Or_College.addNewStudent(studentsList);
		student.setName("sumi");
		student.setRollNo(3);
		studentsList = school_Or_College.addNewStudent(studentsList);
		student.setName("kiran");
		student.setRollNo(7);
		studentsList = school_Or_College.addNewStudent(studentsList);
		Map<Integer, String> expectedList = new LinkedHashMap<Integer, String>();
		expectedList.put(3, "sumi");
		expectedList.put(2, "ravika");
		expectedList.put(4, "pooja");
		expectedList.put(7, "kiran");
		expectedList.put(2, "ravika");
		Map<Integer, String> actualList = new LinkedHashMap<Integer, String>();
		actualList = school_Or_College.sortStudentsListBasedOnId(studentsList);
		ArrayList<Integer> actualIdList = new ArrayList<Integer>();
		for (Integer id : actualList.keySet()) {
			actualIdList.add(id);
		}
		int idCount = 0;
		int actualId;
		int expectedId;
		for (Integer id : expectedList.keySet()) {
			actualId = actualIdList.get(idCount);
			expectedId = id;
			assertEquals(actualId, expectedId);
		}
		for (Entry<Integer, String> name : expectedList.entrySet()) {
			String actualName = actualList.get(name.getKey());
			assertNotNull(actualName);
			assertEquals(name.getValue(), actualName);
		}
	}
}
