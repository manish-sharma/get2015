/*/*this test class will test search fn which 
 * was defined in Linear_Search
 */
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Linear_Search {
	Linear_Search obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new Linear_Search();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		 Scanner scan;
		 int n,i,element;
		 System.out.println("Enter total no. of elements in array");
		 scan = new Scanner(System.in);
		 n = Integer.parseInt(scan.nextLine());
		 int arr[]=new int[n];
		 System.out.println("Enter elements of array");
		 for(i=0;i<n;i++)
		 {
			arr[i]=Integer.parseInt(scan.nextLine());//reading array elements 
		 }
		 System.out.println("Enter element to be searched");
		 element = Integer.parseInt(scan.nextLine());
		 int expected;
		 System.out.println("Enter expected value to be returned ;\n 1 if Element Found\n 0 if Element Not Found");
		 expected=Integer.parseInt(scan.nextLine());
		 assertEquals(expected,obj.search(arr, element, n-1));
		 
		 
	}

	

}
