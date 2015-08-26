import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Check_Sorted_Order {
	Check_Sorted_Order obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception 
	{
		obj=new Check_Sorted_Order();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() 
	{
		 int n,i,m;
			Scanner scan;
			System.out.println("Enter total no. of elements in array");
			scan=new Scanner(System.in);
			n=Integer.parseInt(scan.nextLine());
			int arr[]=new int[n];
			System.out.println("Enter array elements");
			for(i=0;i<n;i++)
			{
				arr[i]=Integer.parseInt(scan.nextLine());//reading array string elements and converting them ino integers
			}
			
			System.out.println("Enter expected value to  be returned "
					+ "-\n 1 for assending\n 2 for descending\n 0 for not sorted");
			scan=new Scanner(System.in);
			int expected=Integer.parseInt(scan.nextLine());
		
			assertEquals(expected, obj.check(arr));
			
	}

}
