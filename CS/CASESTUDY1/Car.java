
public class Car extends Vehicle {

	private boolean AC;						// car contains Air conditioner or not
	private boolean powerSteering;			// car contains power steering or not 
	private boolean accessoryKit;			// car has accessories kit or not

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	@Override
	public double calculateOnRoadPrice() { // over ride calcuale road price method
		double onRoadPrice = 0.0;
		if (this.isAC()) {
			onRoadPrice = onRoadPrice + 5000; // if car has AC than increase road price with 5000

		}

		if (isAccessoryKit()) {
			onRoadPrice = onRoadPrice + 10000; // if car has Accessory kit than increase road price with 10000

		}

		if (isPowerSteering()) {
			onRoadPrice = onRoadPrice + 3000;		// if car has power steering than increase road price with 3000 

		}

		return super.calculateOnRoadPrice() + onRoadPrice;
	}

	@Override
	public String toString() {
		return super.toString() + " AC=" + AC + ", powerSteering="
				+ powerSteering + ", accessoryKit=" + accessoryKit;
	}

}
