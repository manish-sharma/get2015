package vehicles;

import static org.junit.Assert.*;
import org.junit.Test;

public class VehicleDetailPrinterTest {

	@Test
	// tests attributes of vehicle class
	public void testVehicleAttributes()  
	{
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		Vehicle vehicleObj = vehicleHelperObj.createVehicle("vehicle");
		String strOutput = VehicleDetailPrinter.printVehicleSpecification (vehicleObj);
		String strExpected = "Engine In CC : 10\tFuel Capacity : 11.0\tMake : Make1\tMilage : 12.0\tModel : Model1\tPrice : 50000\tRoad Tax : 1000";
		assertEquals("Matched", strExpected, strOutput);		
	}	
	
	
	@Test
	// tests attributes of car class
	public void testCarAttributes()  
	{
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		Vehicle vehicleObj = vehicleHelperObj.createVehicle("car");
		String strOutput = VehicleDetailPrinter.printVehicleSpecification (vehicleObj);
		String strExpected = "Engine In CC : 20\tFuel Capacity : 21.0\tMake : Make2\tMilage : 22.0\tModel : Model2\tPrice : 700000\tRoad Tax : 2000\tAC : yes\tAccessory Kit : yes\tPower Steering : yes";
		assertEquals("Matched", strExpected, strOutput);
	}
	
	
	@Test
	// tests attributes of bike class
	public void testBikeAttributes()  
	{
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		Vehicle vehicleObj = vehicleHelperObj.createVehicle("bike");
		String strOutput = VehicleDetailPrinter.printVehicleSpecification (vehicleObj);
		String strExpected = "Engine In CC : 30\tFuel Capacity : 31.0\tMake : Make3\tMilage : 32.0\tModel : Model3\tPrice : 60000\tRoad Tax : 500\tSelf Start : yes\tHelmet Price : 1200";
		assertEquals("Matched", strExpected, strOutput);
	}
	
}
