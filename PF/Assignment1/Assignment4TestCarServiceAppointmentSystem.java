
import static org.junit.Assert.*;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment4TestCarServiceAppointmentSystem {

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
	public void test()
	{
		Assignment4ServiceStation serviceStation = new Assignment4ServiceStation();
		serviceStation.readMechanics();
		serviceStation.readCars();
		serviceStation.doAllotment();
		HashMap<String, Integer> carProcessingList = serviceStation.getCarProcessingStatus();
		HashMap<String, Integer> expCarProcessingList = new HashMap<String, Integer>();
		expCarProcessingList.put("SUV", 2);
		expCarProcessingList.put("Sedan", 1);
		expCarProcessingList.put("Hatchback", 1);
		
		assertEquals(" matched", true, compareHashMap(expCarProcessingList, carProcessingList));

	}
	@Test
	public void test1()
	{
		Assignment4ServiceStation serviceStation = new Assignment4ServiceStation();
		serviceStation.readMechanics();
		serviceStation.readCars();
		serviceStation.doAllotment();
		HashMap<String, Integer> carProcessingList = serviceStation.getCarProcessingStatus();
		HashMap<String, Integer> expCarProcessingList = new HashMap<String, Integer>();
		expCarProcessingList.put("SUV", 1);
		expCarProcessingList.put("Sedan", 1);
		expCarProcessingList.put("Hatchback", 1);
		
		assertEquals("Not matched matched", false, compareHashMap(expCarProcessingList, carProcessingList));

	}

	public boolean compareHashMap(HashMap<String, Integer> hash1, HashMap<String, Integer> hash2)
	{
		if (hash1.keySet().size() != hash2.keySet().size()) // in case when one of the map is containing more elements
			return false;

		for (String carType : hash1.keySet())
		{
			if (hash2.containsKey(carType) && hash1.get(carType) != hash2.get(carType))
				return false;
		}

		return true;

	}


}
