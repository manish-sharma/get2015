// Vehicle class

package vehicles;

public class Vehicle {

	String make;
	String model;
	String engineInCC;
	double fuelCapacity;
	double milage;
	int price;
	int roadTax;
	String vehicleType;
	
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
	
	public String getEngineInCC() {
		return engineInCC;
	}
	
	public void setEngineInCC(String engineInCC) {
		this.engineInCC = engineInCC;
	}
	
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public double getMilage() {
		return milage;
	}
	
	public void setMilage(double milage) {
		this.milage = milage;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getRoadTax() {
		return roadTax;
	}
	
	public void setRoadTax(int roadTax) {
		this.roadTax = roadTax;
	}
	 
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	// calculates road price
	int calculateOnRoadPrice () {
		return (price+roadTax) ;
	}
	
	// override toString() method for printing
	public String toString() {
		return "Engine In CC : "+getEngineInCC()+"\tFuel Capacity : "+getFuelCapacity()
				+"\tMake : "+getMake()+"\tMilage : "+getMilage()
				+"\tModel : "+getModel()+"\tPrice : "+getPrice()
				+"\tRoad Tax : "+getRoadTax();
	}
	
}
