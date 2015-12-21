package vehicle.pojoClasses;

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
	
	/* tostring() method*/
	@Override
	public String toString() {
		
		return super.toString()+ "Car [AC=" + AC + ", powerSteering=" + powerSteering + "]" ;
	}
	
	@Override
	public int calculateOnRoadPrice(Vehicle vehicle) {
		/*method for calculating RoadPrice*/
		// TODO Auto-generated method stub
		return vehicle.getPrice() + getRoadtax();
	}

}
