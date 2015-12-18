package Assignments;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass1 {
	Assignment1 towerHanoi = new Assignment1(); // object is declared globally

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
	// test class for 3 disk tower of hanoi problem
	public void test1() {
		int numberOfDisk = 3;
		int i = 0;
		String Result1[] = { "Move Disk  1   A->B", "Move Disk  2   A->C",
				"Move Disk  1   B->C", "Move Disk  3   A->B",
				"Move Disk  1   C->A", "Move Disk  2   C->B",
				"Move Disk  1   A->B" };

		Assignment1.Result = new ArrayList<String>();

		Assignment1.Result = towerHanoi
				.towerOfHanoi("A", "B", "C", numberOfDisk);
		for (String a : Assignment1.Result) {

			assertEquals("", Result1[i], a);
			i++;
		}
	}

	@Test
	// test class for 2 disk tower of hanoi problem
	public void test2() {
		int numberOfDisk = 2;
		int i = 0;
		String Result1[] = { "Move Disk  1   A->C", "Move Disk  2   A->B",
				"Move Disk  1   C->B" };

		Assignment1.Result = new ArrayList<String>();

		Assignment1.Result = towerHanoi
				.towerOfHanoi("A", "B", "C", numberOfDisk);
		for (String a : Assignment1.Result) {

			assertEquals("", Result1[i], a);
			i++;
		}
	}

	@Test
	// negative test class where number of disk is taken as 3 but expected
	// string array is for disk 2
	public void test3() {
		int numberOfDisk = 3;
		int i = 0;
		String Result1[] = { "Move Disk  1   A->C", "Move Disk  2   A->B",
				"Move Disk  1   C->B" };

		Assignment1.Result = new ArrayList<String>();

		Assignment1.Result = towerHanoi
				.towerOfHanoi("A", "B", "C", numberOfDisk);
		for (String a : Assignment1.Result) {

			assertEquals("", Result1[i], a);
			i++;
		}
	}
}
