/*this test class will test the search fn 
 * which was defined in Binary_Search class
 */
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Binary_Search {
 
	Binary_Search obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new Binary_Search();
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
		 System.out.println("Enter elements of array in SORTED MANNER-Assending Order");
		 for(i=0;i<n;i++)
		 {
			arr[i]=Integer.parseInt(scan.nextLine());//reading array elements 
		 }
		 
		 System.out.println("Enter element to be searched");
		 element = Integer.parseInt(scan.nextLine());
		 int low=0;
		 int high=n-1;
		 int expected;
		 System.out.println("Enter expected result that has to be returned\n 0 for element not found\n 1 for element found");
		 expected=Integer.parseInt(scan.nextLine());
		 assertEquals(expected, obj.search(arr, element, low, high));
		
	}

}
