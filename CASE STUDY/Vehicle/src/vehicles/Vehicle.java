package vehicles;
/**
 * to store the information of vehicle
 * @author Ravika
 * @since 9/15/2015
 */
public class Vehicle {
	private String make;
	private String model;
	private int engineInCC;
	private int fuelCapacity;
	private int milage;
	private long price;
	private int roadTax;
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineInCC() {
		return engineInCC;
	}
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getRoadTax() {
		return roadTax;
	}
	public void setRoadTax(int roadTax) {
		this.roadTax = roadTax;
	}
	
	long calculateOnRoadPrice(long price){
		return price;
				
		}
	@Override
	public String toString() {
		return " make : " + make + ", model : " + model + ", engineInCC : "
				+ engineInCC + ", fuelCapacity : " + fuelCapacity + ", milage : "
				+ milage + ", price : " + price + ", roadTax : " + roadTax  ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
}

