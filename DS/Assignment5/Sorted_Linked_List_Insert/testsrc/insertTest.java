import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class insertTest {

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
	public void testInsertPositive() {
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(3);
		linkedList.add(6);
		linkedList.add(1);
		linkedList.add(3);
		Collections.sort(linkedList);
		
		List<Integer> expectedList = new LinkedList<Integer>();
		expectedList.add(1);
		expectedList.add(3);
		expectedList.add(3);
		expectedList.add(5);
		expectedList.add(6);
		
		Linked_List_Operations linked_List_OperationsObj = new Linked_List_Operations();
		linked_List_OperationsObj.insert(5, linkedList);
		assertEquals(expectedList, linkedList);
	}
	
	@Test
	public void testInsertNegative() {
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(3);
		linkedList.add(6);
		linkedList.add(1);
		linkedList.add(3);
		Collections.sort(linkedList);
		
		List<Integer> unExpectedList = new LinkedList<Integer>();
		unExpectedList.add(1);
		unExpectedList.add(3);
		unExpectedList.add(3);
		unExpectedList.add(6);
		unExpectedList.add(5);
		
		Linked_List_Operations linked_List_OperationsObj = new Linked_List_Operations();
		linked_List_OperationsObj.insert(5, linkedList);
		assertNotEquals(unExpectedList, linkedList);
	}
	
	@Test
	public void testInsertNullListPositive() {
		List<Integer> linkedList = null;
		Linked_List_Operations linked_List_OperationsObj = new Linked_List_Operations();
		assertEquals(false, linked_List_OperationsObj.insert(5, linkedList));
	}
	
	@Test
	public void testInsertNullListNegative() {
		List<Integer> linkedList = null;
		Linked_List_Operations linked_List_OperationsObj = new Linked_List_Operations();
		assertNotEquals(true, linked_List_OperationsObj.insert(5, linkedList));
	}

}
