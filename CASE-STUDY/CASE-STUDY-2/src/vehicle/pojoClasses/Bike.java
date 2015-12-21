package vehicle.pojoClasses;

public class Bike extends Vehicle {

	private String selfStart;
	private int helmetPrice;

	public String getSelfStart() {
		return selfStart;
	}

	public void setSelfStart(String selfStart) {
		this.selfStart = selfStart;
	}

	public int getHelmetPrice() {
		return helmetPrice;
	}

	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}
	
	/* tostring() method*/
	@Override
	public String toString() {
		super.toString();
		return super.toString()+"Bike [selfStart=" + selfStart + ", helmetPrice=" + helmetPrice
				+ "]";
	}

	@Override
	public int calculateOnRoadPrice(Vehicle vehicle) {
		/*method for calculating RoadPrice*/
		return vehicle.getPrice() + getRoadtax();

	}

}
