package com.Vehicle;
/**
 * 
 * @author Sumitra
 *This Class Bike extend Vehicle Class and hold the attribute of vehicle that is common for both bike and car
 *use attribute of bike that is special in bike only
 */
public class Bike extends Vehicle{
	
	
	private boolean selfStart;
	private long  helmetPrice;
	
	
	@Override
	/**
	 * @ return String  of bike attribute with common attribute as a string 
	 */
	public String toString() {
		return "Bike:-\n" + super.toString() +"selfStart:" + selfStart + "\n helmetPrice=" + helmetPrice
				+"\nOn Road Price:"+ calculateOnRoadPrice(super.price)+"\n";
	}

	/**
	 * selfStart attribute if it hold selfStart attribute hold by bike
	 * @return true or false
	 */
	public boolean isSelfStart() {
		return selfStart;
	}
	/**
	 * this set the value of variable selfStart
	 * @param selfStart it hold boolean value  either true of false
	 */
	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}
	/**
	 * this get the value of helmet price
	 * @return long type value that is price of helmet
	 */
	public long getHelmetPrice() {
		return helmetPrice;
	}
	/**
	 * this set the value of variable helmet price
	 * @param helmetprice it hold long value  that is the price of helmet
	 */
	public void setHelmetPrice(long helmetPrice) {
		this.helmetPrice = helmetPrice;
	}
	
	/**
	 * this method calculate total price of bike 
	 * it add the price of helmet with the bike price
	 */
	long calculateOnRoadPrice(long price){
		return (price + helmetPrice);
			
		}
	}
