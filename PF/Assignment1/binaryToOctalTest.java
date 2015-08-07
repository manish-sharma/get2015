package assignment;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class binaryToOctalTest {

	

	@Test
	public void test1() {
		binaryToOctal obj=new binaryToOctal();
		int u=obj.convertBinarytoOctal(110101);
		assertEquals( "correct",65, u);
		
	}

}
