import static org.junit.Assert.*;

import org.junit.Test;




public class MatrixTest {

			int isEqual(int[][] expected, int[][] actual)
		{
			int comp=1;
			for(int countRow=0;countRow<expected.length;countRow++)
			{
				for(int countCol=0;countCol<expected[0].length;countCol++)
				{
					if(expected[countRow][countCol]!=actual[countRow][countCol])
						return 0;
				}
			}
			return comp;
		}
		@Test
		public void testForValidation() {
			int output;
			Matrix matrix=new Matrix(2,3);
			MatrixTest assign=new MatrixTest();
			int[][] data={{2,3,5},{4,9,8}};
			int[][] expected={{2,4},{3,9},{5,8}};
			matrix.data=data;
			matrix=matrix.transpose();
			output=assign.isEqual(matrix.data,expected);
			assertEquals("not match",1,output);
		
			
		}
		@Test
		public void testForInValidation() {
			int output;
			Matrix matrix=new Matrix(2,3);
			MatrixTest assign=new MatrixTest();
			int[][] data={{2,3,5},{4,9,8}};
			int[][] expected={{0,0},{0,0},{0,0}};
			matrix.data=data;
			matrix=matrix.transpose();
			output=assign.isEqual(matrix.data,expected);
			assertEquals("not match",0,output);
		
			
		}
	}


