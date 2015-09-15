package Com.Vehicle;
/**
 * this class is the parent class 
 * contains common attributes of the vehicle
 * @author Ankur
 * @since 14-09-2015
 */
public class Vehicle{
	private  String make;
	private  String model;
	private long engineInCC;
	private  int fuelCapacity;
	private  int milage;
	protected  long price;
	private  int roadTax;


	/**
	 * method to calculate the total price of the vehicle 
	 * @param price.. ex showroom price of the vehicle
	 * @return.. on road price
	 */
	long calculateOnRoadPrice(long price){
		return price;

	}
	/**
	 * method to get the brand name of the vehicle
	 * @return the brand name of the vehicle
	 */
	public String getMake() {
		return make;
	}
	/**
	 * method to set the brand of the vehicle
	 * @param make brand name
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * method to get the model of the vehicle
	 * @return the model name of the vehicle
	 */

	public String getModel() {
		return model;
	}
	/**
	 * method to set the model name of the vehicle
	 * @param model name of the vehicle
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * method to get the capacity of the engine
	 * @return capacity of the engine
	 */
	public long getEngineInCC() {
		return engineInCC;
	}
	/**
	 * method to set engine capacity
	 * @param engineInCC..capacity of the engine
	 */
	public void setEnginenInCC(long engineInCC) {
		this.engineInCC = engineInCC;
	}
	/**
	 * method to get the fuel capacity of the vehicle
	 * @return..fuel capacity of the vehicle
	 */
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	/**
	 * method to set  the fuel capacity of the vehicle
	 * @param fuelCapacity fuel capacity of the vehicle
	 */
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	/**
	 * method to get the mileage of the vehicle
	 * @return approx mileage given by vehicle
	 */
	public int getMilage() {
		return milage;
	}
	/**
	 * method to set the mileage of the vehicle
	 * @param milage approx mileage given by vehicle
	 */
	public void setMilage(int milage) {
		this.milage = milage;
	}
	/**
	 * method to get the price of the vehicle
	 * @return price of the vehicle
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * method to set the price of the vehicle
	 * @param price price of the vehicle
	 */
	public void setPrice(long price) {
		this.price = price;
	}
	/**
	 * method to get the road tax of the vehicle
	 * @return road tax of the vehicle
	 */
	public int getRoadTax() {
		return roadTax;
	}
	/**
	 * method to set the road tax of the vehicle
	 * @param roadTax..road tax of the vehicle
	 */
	public void setRoadTax(int roadTax) {
		this.roadTax = roadTax;
	}
	/**
	 * method to covert the attributes in a single string
	 */
	@Override
	public String toString() {
		return " make:" + make + "\n model:" + model + "\n engineInCC:"
				+ engineInCC + "\n fuelCapacity:" + fuelCapacity + "\n milage:"
				+ milage + "\n price:" + price + "\n roadTax:" + roadTax + "\n";
	}

}