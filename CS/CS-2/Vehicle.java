/**
 * @author Girdhari
 * Vehicle class
 */
import java.util.Date;

/* Starting of Vehicle class */
public  class Vehicle 
{
	
	protected String makeYear;
	protected String  model;
	protected int  engineInCC;
	protected int fuelCapacity;
	protected double milage;
	protected double price;
	protected double roadTax;
	protected String createdBy;
	protected Date createdTime;
	protected VehicleType vehicleType;
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String modelNumber) {
		this.model = modelNumber;
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
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRoadTax() {
		return roadTax;
	}
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}
	public  void vehicle() {
		createdTime = new Date();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + engineInCC;
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
		if (engineInCC != other.engineInCC)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Vehicle [makeYear=" + makeYear + ", model=" + model
				+ ", engineInCC=" + engineInCC + ", fuelCapacity="
				+ fuelCapacity + ", milage=" + milage + ", price=" + price
				+ ", roadTax=" + roadTax + ", createdBy=" + createdBy
				+ ", createdTime=" + createdTime + ", vehicleType="
				+ vehicleType + "]";
	}
	/* Starting of calculateOnRoadPrice function */
	public double calculateOnRoadPrice()
	{
		return price + roadTax;
	}
	

}
/* Ending of Vehicle class */
