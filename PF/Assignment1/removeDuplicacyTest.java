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
		
		
		int a[]={1,2,3,4,5,1,2,3,4,5,1};
		int b[]={1,2,3,4,5};
		int c[]=obj.removeDuplicate(a);
		assertArrayEquals("correct",b, c);
		
	}

}
