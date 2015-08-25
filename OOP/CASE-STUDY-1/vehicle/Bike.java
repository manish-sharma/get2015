package vehicle;

public class Bike extends Vehicle {

	private String selfStart;
	private String helmetPrice;

	public String getSelfStart() {
		return selfStart;
	}

	public void setSelfStart(String selfStart) {
		this.selfStart = selfStart;
	}

	public String getHelmetPrice() {
		return helmetPrice;
	}

	public void setHelmetPrice(String helmetPrice) {
		this.helmetPrice = helmetPrice;
	}

	@Override
	public int calculateOnRoadPrice(Vehicle vehicle) {
		return vehicle.getPrice() + getRoadtax();

	}

}
