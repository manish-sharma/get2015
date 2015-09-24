package Com.Vehicle;

/**
 * car is the child class of the vehicle class
 * this class have the extra attributes of the car
 * @author Ankur
 * @since 14-09-2015
 */
public class Car  extends Vehicle{
	private int carId;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	private boolean Ac;
	private boolean powerSteering;
	private String accessoryKit;
	/**
	 * method to check presence of AC in car
	 * @return.. true if the car is AC else return false
	 */
	public boolean isAc() {
		return Ac;
	}
	/**
	 * method to set the presence of AC in car or not
	 * @param AC.. presence of AC in car or not
	 */
	public void setAc(boolean AC) {
		this.Ac = AC;
	}
	/**
	 * method to check the presence of power steering in vehicle or not
	 * @return.. true if car is power steering else return false
	 */
	public boolean isPowerSteering() {
		return powerSteering;
	}
	/**
	 * method to set the presence of power steering in vehicle or not
	 * @param powerSteering.. true if car is power steering else return false 
	 */
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	/**
	 * method to get the details of accessory kit of the car
	 * @return
	 */
	public String getAccessoryKit() {
		return accessoryKit;
	}
	/**
	 * method to set the accessory kit of the car
	 * @param accessoryKit
	 */
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	/**
	 * method to calculate the on road price of the car
	 */
	public long calculateOnRoadPrice( long price){

		if(isAc())
			price =price + 40000 ;
		price=price + 30000 + super.getRoadTax();
		return (price);	
	}
	/**
	 * method to covert the attributes in a single string
	 */
	@Override
	public String toString() {
		String carAttributes = "   " + super.getVehicleId() + "               "
		+ super.getMake() + "          " + super.getCreatedTime()
		+ "    " + super.getModel() + "        " + ""
		+ super.getEngineInCC() + "                 "
		+ super.getFuelCapacity() + "          	   "
		+ super.getMilage() + "            " + super.getPrice()
		+ "           " + super.getRoadTax() + "             " + "  "
		+ super.getPrice() + "                 " + carId
		+ "           " + Ac + "            " + powerSteering
		+ "              " + accessoryKit;
		return carAttributes;

		}
	

}
