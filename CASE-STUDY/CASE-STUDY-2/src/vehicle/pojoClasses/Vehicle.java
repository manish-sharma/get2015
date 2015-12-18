package vehicle.pojoClasses;

public abstract class Vehicle {

	private String ID;
	private String createdBy;
	private String createdTime;
	private String make;
	private String model;
	private int engineInCC;
	private int fuelCapacity;
	private int milage;
	private int price;
	private int roadtax;
	
	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRoadtax() {
		return roadtax;
	}

	public void setRoadtax(int roadtax) {
		this.roadtax = roadtax;
	}
	
	@Override
	public String toString() {
		/* tostring() method*/
		return "Vehicle [ID=" + ID + ", createdBy=" + createdBy
				+ ", createdTime=" + createdTime + ", make=" + make
				+ ", model=" + model + ", engineInCC=" + engineInCC
				+ ", fuelCapacity=" + fuelCapacity + ", milage=" + milage
				+ ", price=" + price + ", roadtax=" + roadtax + "]";
	}

	@Override
	public int hashCode() {
		/*Hashcode method*/
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result
				+ ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result
				+ ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + engineInCC;
		result = prime * result + fuelCapacity;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + milage;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + roadtax;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*Equals method to compare two strings*/
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdTime == null) {
			if (other.createdTime != null)
				return false;
		} else if (!createdTime.equals(other.createdTime))
			return false;
		if (engineInCC != other.engineInCC)
			return false;
		if (fuelCapacity != other.fuelCapacity)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (milage != other.milage)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (roadtax != other.roadtax)
			return false;
		return true;
	}

	public abstract int calculateOnRoadPrice(Vehicle vehicle);
}
