package assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class removeDuplicacyTest {
	


	@Test
	public void test() 
	{
		removeDuplicacy obj=new removeDuplicacy();
		
		
		int inputArray[]={1,2,3,4,5,1,2,3,4,5,1};//input array
		int expected[]={1,2,3,4,5};//expected output
		int actual[]=obj.removeDuplicate(inputArray);//method calling
		assertArrayEquals("correct",expected, actual);//check the expected and actual value
		
	}

}
