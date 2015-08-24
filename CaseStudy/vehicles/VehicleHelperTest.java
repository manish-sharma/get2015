package vehicles;
import static org.junit.Assert.*;
import org.junit.Test;

public class VehicleHelperTest {
	
	@Test
	public void testCreationOfVehicleInstance() {
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		assertNotNull(vehicleHelperObj.createVehicle("vehicle"));
	}
	
	@Test
	public void testCreationOfCarInstance() {
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		assertNotNull(vehicleHelperObj.createVehicle("car"));
	}
	
	@Test
	public void testCreationOfBikeInstance() {
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		assertNotNull(vehicleHelperObj.createVehicle("bike"));
	}

	@Test
	public void testVehicleOnRoadPrice() {
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		Vehicle vehicleObj = vehicleHelperObj.createVehicle("vehicle");
		int outputPrice = vehicleObj.calculateOnRoadPrice();
		int expectedPrice = 51000;
		assertEquals ( "Matched", expectedPrice, outputPrice );
	}
	
	@Test
	public void testCarOnRoadPrice() {
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		Vehicle vehicleObj = vehicleHelperObj.createVehicle("car");
		int outputPrice = vehicleObj.calculateOnRoadPrice();
		int expectedPrice = 702000;
		assertEquals ( "Matched", expectedPrice, outputPrice );
	}
	
	@Test
	public void testBikeOnRoadPrice() {
		VehicleHelper vehicleHelperObj = new VehicleHelper ();
		Vehicle vehicleObj = vehicleHelperObj.createVehicle("bike");
		int outputPrice = vehicleObj.calculateOnRoadPrice();
		int expectedPrice = 60500;
		assertEquals ( "Matched", expectedPrice, outputPrice );
	}
	
}
