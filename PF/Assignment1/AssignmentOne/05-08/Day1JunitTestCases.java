import static org.junit.Assert.*;

import org.junit.Test;


public class Day1JunitTestCases {

	
	@Test
	public void binaryToint() {
		Day1Assignment session1pf=new Day1Assignment();
	assertEquals("Conversion Failed", session1pf.convertBinaryToOctal(110101), 65);
	}
	
	@Test 
	public void deleteDuplicate() {
		Day1Assignment session1pf=new Day1Assignment();
		int[] array={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
	
		int[] arrayP=session1pf.removeDuplicate(array);	
		int[] arrayE={2,5,4,6,3,8,9,0};
		
		assertArrayEquals("Not Deleted Properly",arrayE,arrayP );
		
	}
	
	@Test
	public void mergeTwoArraysTest(){
		Day1Assignment session1pf=new Day1Assignment();
		
		int[] a={1,2,3,4,5,8};
		int[] b={9,10,11,12,13,14};
		int[] c=new int[a.length+b.length];
		c=session1pf.join(a,6,b,6,c);
		int[] d={1,2,3,4,5,8,9,10,11,12,13,14};
		assertArrayEquals("Not Merged Properly",d,c );
		
	}
	
	@Test
	public void checkForAscendingSortOrder(){
		Day1Assignment session1pf=new Day1Assignment();
		int[] arrayA={1,2,3,4,5,8};
		int result=session1pf.isSorted(arrayA);
		
		assertEquals("Not in acending order",1,result );
	}
	
	@Test
	public void checkForDescendingSortOrder(){
		Day1Assignment session1pf=new Day1Assignment();
		int[] arrayA={8,7,6,5,4,3,2};
		int result=session1pf.isSorted(arrayA);
		
		assertEquals("Not in decending order",2,result);
	}
	
	@Test
	public void checkForSort(){
		Day1Assignment session1pf=new Day1Assignment();
		int[] arrayA={1,2,3,4,5,88,15,20,57};
		int result=session1pf.isSorted(arrayA);
		
		assertEquals("Not Sorted",0,result );
	}
	
	static int isArrayEqual(int expected[][], int output[][])
	{
		int result=1;
		int row=expected.length;
		for(int i=0;i<row;i++)
			for(int j=0;j<5;j++)
				if(expected[i][j]!=output[i][j])
					{
					result=0;
					break;
					}
			
		return result;
	}

	@Test
	public void FCFS()
	{
		Day1Assignment obj=new Day1Assignment();
		
		int[] arrival_time={1,5,9,25};
		int[] job_size={12,7,2,5};
		int n=4;
		
		int[][] output=obj.FCFS(arrival_time,job_size,n);
		int[][] expected={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		
		assertEquals("array are not equal",1,Day1JunitTestCases.isArrayEqual(expected,output) );
	
	}
	
	@Test
	public void longestSeqCheck()
	{
		Day1Assignment session1pf=new Day1Assignment();
		int[] arrM={1,2,3,2,3,4,5,1,2,4,8,9};
		int[] longestArr=session1pf.longestSequence(arrM);
		int[] expArr={1,2,4,8,9};
		assertArrayEquals("Code is faulty",expArr, longestArr);
	
	}
}
