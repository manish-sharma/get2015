package assignment;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class binaryToOctalTest {

	

	@Test
	public void test1() {
		binaryToOctal obj=new binaryToOctal();
		int octalNumber=obj.convertBinarytoOctal(110101);
		assertEquals( "this is correct",65, octalNumber);//check the expected and actual value
		
	}

}
