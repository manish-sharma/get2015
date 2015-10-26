public class Car extends Vehicle
{
	private IsAvailable hasAC;  /*IsAvailable is a enum define yes or no*/
	private IsAvailable haspowerSteering;
	private IsAvailable hasaccessoryKit;

	public IsAvailable getHasAC() {
		return hasAC;
	}

	public void setHasAC(IsAvailable hasAC) {
		this.hasAC = hasAC;
	}

	public IsAvailable getHaspowerSteering() {
		return haspowerSteering;
	}

	public void setHaspowerSteering(IsAvailable haspowerSteering) {
		this.haspowerSteering = haspowerSteering;
	}

	public IsAvailable getHasaccessoryKit() {
		return hasaccessoryKit;
	}

	public void setHasaccessoryKit(IsAvailable hasaccessoryKit) {
		this.hasaccessoryKit = hasaccessoryKit;
	}

	@Override
	public String toString() {
		return super.toString() + "Car [hasAC=" + hasAC + ", haspowerSteering="
				+ haspowerSteering + ", hasaccessoryKit=" + hasaccessoryKit
				+ "]";
	}

	@Override
	public double calculateOnRoadPrice() {
		return super.calculateOnRoadPrice() + 2000;
	}

}
