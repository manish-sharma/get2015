package Com.Vehicle;

/**
 * bike is the child class of the vehicle class
 * this class have the extra attributes of the bike
 * @author Ankur
 * @since 14-09-2015
 */
public class Bike extends Vehicle{

	private int bikeId;
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	/**
	 * method to covert the attributes in a single string
	 */
	

	private boolean selfStart;
	private long  helmetPrice;
	/**
	 * method to check whether the bike has self start or not
	 * @return .. true if bike is self start else false
	 */
	public boolean isSelfStart() {
		return selfStart;
	}
	/**
	 * method to set whether the bike has self start or not
	 * @param selfStart
	 */
	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}
	/**
	 * method to get the price of the helmet
	 * @return.. price of the helmet
	 */
	public long getHelmetPrice() {
		return helmetPrice;
	}
	/**
	 * method to set the price of the helmet
	 * @param helmetPrice.. price of the helmet
	 */
	public void setHelmetPrice(long helmetPrice) {
		this.helmetPrice = helmetPrice;
	}

	public long calculateOnRoadPrice(long price){
		//return (price + helmetPrice);
		return(price + super.getRoadTax());

	}
	@Override
	
	public String toString() {
		String bikeAttributes = "   " + super.getVehicleId() + "         "
		+ super.getMake() + "        " + super.getCreatedTime()
		+ "    " + super.getModel() + "          "
		+ super.getEngineInCC() + "                  "
		+ super.getFuelCapacity() + "                  "
		+ super.getMilage() + "            " + super.getPrice()
		+ "         " + super.getRoadTax() + "              "
		+ super.getPrice() + "                " + bikeId
		+ "                 " + selfStart + "               "
		+ helmetPrice;
		return bikeAttributes;

		}

}
