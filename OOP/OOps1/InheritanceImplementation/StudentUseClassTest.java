package InheritanceImplementation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentUseClassTest {

	
	@Test
	public void test() {
		Student obj=new Student(121,"sName",1331);
		int id=obj.getUid();
		assertEquals("not match",121,id);
	}

}
