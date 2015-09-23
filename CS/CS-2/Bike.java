/**
* @author Girdhari
* Bike class */

package casestudy2;

enum IsAvailable {YES , NO}; // it define that specific functionality is available or not 

/* Starting of Bike class */
public class Bike extends Vehicle 
{
	
	private IsAvailable isSelfStart; /*IsAvailable is a enum define yes or no*/
	private int helmetPrice;
	
	public IsAvailable getIsSelfStart() {
		return isSelfStart;
	}

	public void setIsSelfStart(IsAvailable isSelfStart) {
		this.isSelfStart = isSelfStart;
	}

	public int getHelmetPrice() {
		return helmetPrice;
	}

	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}

	
	@Override
	public double  calculateOnRoadPrice() {
		return super.calculateOnRoadPrice() + 1000;
	}

	@Override
	public String toString() {
		return super.toString() + "Bike [isSelfStart=" + isSelfStart + ", helmetPrice="
				+ helmetPrice + "]";
	}
}
/* Ending of Bike class */
