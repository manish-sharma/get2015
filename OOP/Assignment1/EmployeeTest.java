import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {

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
	public void getEmployeIdTest() {
		
		Employee EmployeeObj = new Employee(23456789, "Amit", 101, "Finance");
		assertEquals("",101, EmployeeObj.getEmployeeId());
	}
	
	@Test
	public void toStringTest() {
		
		Employee EmployeeObj = new Employee(23456789, "Amit", 101, "Accounts");
		assertEquals("", "Name: "+EmployeeObj.getName()+", uid: "+EmployeeObj.getUid() +", EmployeeId: "+EmployeeObj.getEmployeeId()+", Department: "+EmployeeObj.getDepartment(), EmployeeObj.toString());
	}

}
