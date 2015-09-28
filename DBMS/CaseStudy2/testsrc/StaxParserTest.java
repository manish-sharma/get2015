import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.vehicle.core.Vehicle;
import com.vehicle.db.StaxParser;


public class StaxParserTest {

	StaxParser st = new StaxParser();
	
	@Test
	public void configTest(){
		List<Vehicle> cars = st.readConfig("C://Users/Shishir/workspace/CaseStudy2/xmlFiles/Car.xml");
		List<Vehicle> bikes = st.readConfig("C://Users/Shishir/workspace/CaseStudy2/xmlFiles/Bike.xml");
		if(cars.size()==0 || bikes.size()==0) {
			fail("Objects are not created");
		}	
	}
}
