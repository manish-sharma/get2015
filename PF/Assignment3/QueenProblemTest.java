package pf_assignment_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueenProblemTest {

	@Test
	public void test()
	{
		QueenProblem testObject1 = new QueenProblem(4);
		int expected[][] = {{'0','0','1','0'}, {'1','0','0','0'}, {'0','0','0','1'}, {'0','1','0','0'}};
		int NoOfQueens=4;
		 int[][] board = new int[NoOfQueens][NoOfQueens];
		 int actual[][] = testObject1.callplaceNqueens();
		
		QueenProblemTest test = new QueenProblemTest();
		int result=test.compare(expected, actual);
		assertEquals("", 1,result);
		//fail("Not yet implemented");
		}

		public int compare(int[][] expected, int[][] actual)
		{
		int result=1;
		int length = expected.length;
		for(int i=0;i<length;i++)
		{
		for(int j=0;j<length;j++)
		{
		if(expected[i][j]!=actual[i][j])
		{
		result = 0;
		System.out.print(actual[i][j]+"\t");
		return result;

		}
		}
		System.out.println();
		}
		return result;
		}

	}


