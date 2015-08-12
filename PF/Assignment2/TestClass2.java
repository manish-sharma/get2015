package Assignments;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass2 {
	Assignment2 permutation = new Assignment2();

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
	// test class for finding permutation of string ABC
	public void test1() {
		int i = 0;
		String exp[] = { "ABC", "ACB", "BAC", "BCA", "CAB", "CBA" };
		Assignment2.result = new ArrayList<String>();
		Assignment2.result = permutation.generatePermutations("", "ABC");
		for (String a : Assignment2.result) {

			assertEquals("", exp[i], a);
			i++;
		}
	}

	@Test
	// test class for finding permutation of string AB
	public void test2() {
		int i = 0;
		String exp[] = { "AB", "BA" };
		Assignment2.result = new ArrayList<String>();
		Assignment2.result = permutation.generatePermutations("", "AB");
		for (String a : Assignment2.result) {

			assertEquals("", exp[i], a);
			i++;
		}
	}

	@Test
	// negative test class, expected string list is permutation of string ABC
	// but string as input is AB
	public void test3() {
		int i = 0;
		String exp[] = { "ABC", "ACB", "BAC", "BCA", "CAB", "CBA" };
		Assignment2.result = new ArrayList<String>();
		Assignment2.result = permutation.generatePermutations("", "AB");
		for (String a : Assignment2.result) {

			assertEquals("", exp[i], a);
			i++;
		}
	}

}
