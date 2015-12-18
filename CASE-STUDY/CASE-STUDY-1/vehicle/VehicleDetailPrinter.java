package vehicle;

public class VehicleDetailPrinter {
	public String printVehicleSpecification(Vehicle vehicle) {
		String specification = "";
		specification = "\nMake : " + vehicle.getMake() + "\nModel : "
				+ vehicle.getModel() + "\nEngine in CC : "
				+ vehicle.getEngineInCC() + "\nFuel Capacity : "
				+ vehicle.getFuelCapacity() + "\nMilage : " + vehicle.getMilage()
				+ "\nPrice : " + vehicle.getPrice()+"\nRoad Tax : "+vehicle.getRoadtax();
		return specification;
	}

	public void display(String data) {
		System.out.print(data);
	}

}
