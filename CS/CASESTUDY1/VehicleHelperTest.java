import org.junit.Test;
public class VehicleHelperTest {
	@Test
	public void testVehicleHelperForBike() {

		Vehicle vehicle = VehicleHelper.createVehicle("bike", "ApacheRTR","TVS");
		assert (vehicle instanceof Bike);
	}
	@Test
	public void testVehicleHelperForCar() {
		Vehicle vehicle = VehicleHelper.createVehicle("car", "EchoSports","Ford");
		assert (vehicle instanceof Car);
	}
}
