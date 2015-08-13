import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTest3 {

	@Test
	public void test() {

		Assignment3 testObject1 = new Assignment3(4);
		int expected[][] = {{'0','0','1','0'}, {'1','0','0','0'}, {'0','0','0','1'}, {'0','1','0','0'}};
		int actual[][] = testObject1.placeNqueens(0,4);
		JUnitTest3 test = new JUnitTest3();
		int result=test.compare(expected, actual);
		assertEquals("", 1,result);
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
