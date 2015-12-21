package com.Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Menu.Action;

public class JunitMenuTest {

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
	public void testAddition() {
		int expected=100;
		Action action=new Action();
		assertEquals(expected,action.addition(40,60));
	}
	@Test
	public void testSubstraction() {
		int expected=40;
		Action action=new Action();
		assertEquals(expected,action.substraction(100,60));
	}
	@Test
	public void testMultiplication() {
		int expected=20;
		Action action=new Action();
		assertEquals(expected,action.multipliaction(4,5));
	}
	@Test
	public void testDivision() {
		int expected=2;
		Action action=new Action();
		assertEquals(expected,action.division(100,50));
	}

}
