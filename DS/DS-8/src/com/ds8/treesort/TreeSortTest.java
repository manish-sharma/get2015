package com.ds8.treesort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TreeSortTest {

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
	public void rollNumberAscendingOrderTest() {

		Tree studentTree = new Tree();

		studentTree.addNode(2, "Shishir");
		studentTree.addNode(1, "Shreerath");
		studentTree.addNode(7, "Rohit");
		studentTree.addNode(10, "Shubham");
		studentTree.addNode(6, "Shubhendu");
		studentTree.addNode(11, "Rashmi");
		studentTree.inOrderTraversalTree(studentTree.getRoot());
		int[] ascendingOrderRollNumber = studentTree.ascendingOrderRollNumber();
		int[] expectedArray = { 1, 2, 6, 7, 10, 11 };
		assertArrayEquals(expectedArray, ascendingOrderRollNumber);

	}

}
