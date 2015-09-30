package vehicle;

public class Car extends Vehicle {

	private String AC;
	private String powerSteering;

	public String getAC() {
		return AC;
	}

	public void setAC(String aC) {
		AC = aC;
	}

	public String getPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(String powerSteering) {
		this.powerSteering = powerSteering;
	}

	@Override
	public int calculateOnRoadPrice(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicle.getPrice() + getRoadtax();
	}

}
