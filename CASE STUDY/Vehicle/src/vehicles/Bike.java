package vehicles;
/**
 * to store the information of bike
 * @author Ravika
 * @since 9/15/2015
 */

public class Bike extends Vehicle{
	
	private boolean selfStart;
	private long helmetPrice;
	public boolean isSelfStart() {
		return selfStart;
	}
	public void setSelfStart(Boolean selfStart) {
		this.selfStart = selfStart;
	}
	public long getHelmetPrice() {
		return helmetPrice;
	}
	public void setHelmetPrice(long helmetPrice) {
		this.helmetPrice = helmetPrice;
	}


	long calculateOnRoadPrice(long price){
		return (price + helmetPrice);
			
	}
	@Override
	public String toString() {
		return "Bike " + super.toString() + ", selfStart : " + selfStart + ", helmetPrice :" + helmetPrice;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}

