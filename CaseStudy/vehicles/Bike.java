// bike class 

package vehicles;

public class Bike extends Vehicle {

	String selfStart;
	int helmetPrice;
	
	public String getSelfStart() {
		return selfStart;
	}
	
	public void setSelfStart(String selfStart) {
		this.selfStart = selfStart;
	}
	
	public int getHelmetPrice() {
		return helmetPrice;
	}
	
	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}
	
	// override toString() method for printing
	public String toString() {
		return super.toString()+"\tSelf Start : "+getSelfStart()
				+"\tHelmet Price : "+getHelmetPrice();
	}
	
}
