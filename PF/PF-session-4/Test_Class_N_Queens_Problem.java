import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_N_Queens_Problem {
	N_Queens_Problem obj;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new N_Queens_Problem();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//boolean expected;
		Scanner scan;
		scan=new Scanner(System.in);
		//expected=Boolean.valueOf(scan.nextLine());
		 System.out.println("Enter Total no. of Queens");
		   int n=Integer.parseInt(scan.nextLine());
			boolean actual=obj.solveNQ(n);//call solveNQ() fn
			
			assertEquals(true, actual);
	}   

}
