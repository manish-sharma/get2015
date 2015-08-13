import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class NQueenProblemTest {

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
	public void test() {
	int[] actual[]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int [] expected[]={{0,0,1,0},{1,0,0,0},{0,0,0,1},{0,1,0,0}};
		 new NQueenProblem().nQueen(actual,0,4);
		 NQueenProblemTest n=new NQueenProblemTest();
		 boolean b= n.isArrayEqual(expected ,actual);
		assertTrue(b);
		
	}
public	boolean	isArrayEqual(int []expected[] ,int []actual[])
{ 
 int flag=0;
 for(int count1=0;count1<4;count1++)
	 for(int count2=0;count2<4;count2++)
{if(expected[count1][count2]==actual[count1][count2])
	flag=0;
else
	flag=1;
}
if(flag==0)
return true;
else 
return false;
}
	@Test
	public void test1() {
		assertEquals(false,new N_Queen_Problem().solveNQ(4));
	}
}
