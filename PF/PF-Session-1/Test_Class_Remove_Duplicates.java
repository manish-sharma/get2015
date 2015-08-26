import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Remove_Duplicates {
	Remove_Duplicates_2 obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new Remove_Duplicates_2();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
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
		
		System.out.println("Enter total no. of elements in expected array");
		scan=new Scanner(System.in);
		m=Integer.parseInt(scan.nextLine());
		int expected[]=new int[m];
		System.out.println("Enter expected array elements");
		for(i=0;i<m;i++)
		{
			expected[i]=Integer.parseInt(scan.nextLine());//reading expected array string elements and converting them ino integers
		}
		
		
		assertArrayEquals(expected, obj.remove(arr));
		
	}

}
