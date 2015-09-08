import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
/**
 * test case for the tree sort
 * @author Ankur
 *
 */

public class StudentTest {

	/**
	 * this is positive test case  method for student roll number in sorted form here unsorted list is 
	 * inserted in to expected list so it give positive response 
	 * 
	 */
	@Test
	public void testPositiveTestCase() {
		Map<Integer, String> outputMap = new HashMap<Integer, String>();
		int [] studentRollNo = new int[]{1,7,4,0,6};
		String [] studentName= new String[]{"gaurav","pooja","anurag","ankur","sanjay"};
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
     expectedList.put(1, "gaurav");
     expectedList.put(4, "anurag");
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
		String [] studentName= new String[]{"gaurav","pooja","anurag","ankur","sanjay"};
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
     expectedList.put(1, "gaurav");
     expectedList.put(4, "anurag");
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


