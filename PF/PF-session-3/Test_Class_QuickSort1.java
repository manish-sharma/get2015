/*this  test class will test the quickSort fn 
 * which is defined in class QuickSort1
 */
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_QuickSort1 {
	QuickSort1 obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new QuickSort1();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] array,expected;
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the lenght of array");
		int totalElements=sc.nextInt();
		array=new int[totalElements];
		if(totalElements==0)
		{
			System.out.println("Please Enter positive value");
		}
		
		else
		{
		

			System.out.print("Enter the Array Elements");
			for(int i=0;i<totalElements;i++)
			{
				array[i]=sc.nextInt();//reading elements of array
			
		   }
		}
		int left=0;
		int right=array.length-1;
		expected=new int[array.length];
		System.out.print("Enter the Expected Array Elements");
		for(int i=0;i<totalElements;i++)
		{
			expected[i]=sc.nextInt();//reading elements of array
		
	   }
		obj.quickSort(array, left, right);
		assertArrayEquals(expected,array );
	}

}
