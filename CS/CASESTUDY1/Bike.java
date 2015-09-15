public class Bike extends Vehicle {

	private boolean selfStart;     		// bike is self start or not

	private double helmetPrize;			// helmet will be gifted with bike or not

	public boolean isSelfStart() {
		return selfStart;
	}

	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}

	public double getHelmetPrize() {
		return helmetPrize;
	}

	public void setHelmetPrize(double helmetPrize) {
		this.helmetPrize = helmetPrize;
	}

	@Override
	public double calculateOnRoadPrice() {
		double onRoadPrice = 0;
		if (isSelfStart()) {						// if bike is self start than increase road tax with 1000
			onRoadPrice = onRoadPrice + 1000;

		}

		onRoadPrice = onRoadPrice + getHelmetPrize();
		return super.calculateOnRoadPrice() + onRoadPrice;
	}

	@Override
	public String toString() {
		return super.toString() + " selfStart=" + selfStart + ", helmetPrize="
				+ helmetPrize;
	}

}
