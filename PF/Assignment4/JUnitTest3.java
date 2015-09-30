import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest3 {

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
	public void positiveTest()                           /*JUnit Test Function of NQueen for Positive Case*/ 
	{
		int N=4;
		int[][] board = new int[N][N];
		String[][] expected = {{"*\t","Q\t","*\t","*\t"},{"*\t","*\t","*\t","Q\t"},{"Q\t","*\t","*\t","*\t"},{"*\t","*\t","Q\t","*\t"}};	
				
		
		String [][] output = new String[N][N];
		
		Assignment3  ass=new Assignment3 ();
		ass.solve(0, board, N);
		
		
		for(int i = 0; i < N; i++)
	    {
	      for(int j = 0; j < N; j++)
	      {
	        if(board[i][j]==1) output[i][i]="Q\t";
	        else output[i][i]="*\t";
	      }
	  }
		int flag=compare2dArr(expected,output);
		 assertEquals(1, flag);
		
		 
	}
	
/*	@Test
	public void nagativeTest()                            //JUnit Test Function of NQueen for Negative Case
	{
		int N=4;
		int[][] board = new int[N][N];
		String[][] expected = {{"  *\t","Q\t","*\t","*\t"},{"*\t","*\t","*\t","Q\t"},{"Q\t","*\t","*\t","*\t"},{"*\t","*\t","Q\t","*\t"}};	
				
		
		String [][] output = new String[N][N];
		
		Assignment3  ass=new Assignment3 ();
		ass.solve(0, board, N);
		
		
		for(int i = 0; i < N; i++)
	    {
	      for(int j = 0; j < N; j++)
	      {
	        if(board[i][j]==1) output[i][i]="Q\t";
	        else output[i][i]="*\t";
	      }
	  }
		int flag=compare2dArr(expected,output);
		 assertEquals(1, flag);
		
	}*/
	int compare2dArr(String expected[][],String output[][])
	{
		int i,j,flag=1;
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				if(output[i][j] == expected[i][j])
				{
					
				}
				else
				{
					flag=0;
				}
			}
		}
		return flag;
	}
}