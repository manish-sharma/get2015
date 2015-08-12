package priyamvada;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test6 {

	Program6 obj=new Program6();
	int a[]={1, 5, 9, 25};
	int size[]={12,7,2,5};
	int expected[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
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
	 int isArrayEqual(int expected[][], int output[][])
	 {
		 int i,j,count=0;
		 for(i=0;i<expected.length;i++)
		 {
			 for(j=0;j<expected[i].length;j++)
			 {
				 if(expected[i][j]==output[i][j]) 
				 {
					 count++;
				 }
				 else
					 return 0;
			 }
		 }
		 return count;
	 }
	@Test
	public void test() {
	int ab[][]=obj.FCFS(a, size, 4);
	  assertEquals(20,isArrayEqual(expected,ab));
		
		
	}

}