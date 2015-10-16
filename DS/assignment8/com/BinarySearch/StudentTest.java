package com.BinarySearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * this is the test class for student roll no in sorted form using tree sort
 * @author Sumitra
 *
 */
public class StudentTest {

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
	/**
	 * this test case method is for test positive values
	 */
	public void testPositiveTestCase() {
		Map<Integer, String> outputMap = new HashMap<Integer, String>();
		int [] studentRollNo = new int[]{1,7,4,0,6};
		String [] studentName= new String[]{"sumitra","pooja","ravika","ankur","sanjay"};
		Student student = new Student();
		Node<Integer> root = new Node<Integer>();
		root=null;
		for(int i=0;i<5;i++){
			int item1=studentRollNo[i];
			String item2 = studentName[i];
		   root=  student.insertBinarySearchTree(root , item1, item2);
		}
		outputMap=student.showStudentList(root);
	 
	 Map<Integer, String> expectedList=new HashMap<Integer, String>();
     expectedList.put(0 , "ankur");
     expectedList.put(1, "sumitra");
     expectedList.put(4, "ravika");
     expectedList.put(6, "sanjay");
     expectedList.put(7, "pooja");
    
        
         boolean actualId =false;
        boolean expectedId =true;
          for(Integer id:expectedList.keySet()){
              actualId=outputMap.containsKey(id);
              assertEquals(expectedId, actualId);
             
            }
         
            for(Entry<Integer, String> name:expectedList.entrySet()){
                String actualName = expectedList.get(name.getKey());
                assertNotNull(actualName);
                assertEquals(name.getValue(), actualName);
            }
       
    }
	@Test
	/**
	 * this is negative test case  method for student roll number in sorted form here unsorted list is 
	 * inserted in to expected list so it give negative response 
	 * 
	 */
	public void testNegativeTestCase() {
		Map<Integer, String> outputMap = new HashMap<Integer, String>();
		int [] studentRollNo = new int[]{1,7,4,0,6};
		String [] studentName= new String[]{"sumitra","pooja","ravika","ankur","sanjay"};
		Student student = new Student();
		Node<Integer> root = new Node<Integer>();
		root=null;
		for(int i=0;i<5;i++){
			int item1=studentRollNo[i];
			String item2 = studentName[i];
		   root=  student.insertBinarySearchTree(root , item1, item2);
		}
		outputMap=student.showStudentList(root);
	 
	 Map<Integer, String> expectedList=new HashMap<Integer, String>();
     expectedList.put(3 , "ankur");
     expectedList.put(1, "sumitra");
     expectedList.put(4, "ravika");
     expectedList.put(6, "sanjay");
     expectedList.put(7, "pooja");
    
        
         boolean actualId =false;
        boolean expectedId =true;
          for(Integer id:expectedList.keySet()){
              actualId=outputMap.containsKey(id);
              assertEquals(expectedId, actualId);
             
            }
         
            for(Entry<Integer, String> name:expectedList.entrySet()){
                String actualName = expectedList.get(name.getKey());
                assertNotNull(actualName);
                assertEquals(name.getValue(), actualName);
            }
       
    }
}
