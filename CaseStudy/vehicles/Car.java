// car class

package vehicles;

public class Car extends Vehicle {

	String AC;
	String powerSteering;
	String accessoryKit;
	
	public String getAC() {
		return AC;
	}
	
	public void setAC(String aC) {
		AC = aC;
	}
	
	public String getPowerSteering() {
		return powerSteering;
	}
	
	public void setPowerSteering(String powerSteering) {
		this.powerSteering = powerSteering;
	}
	
	public String getAccessoryKit() {
		return accessoryKit;
	}
	
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	
	// override toString() method for printing
	public String toString() {
		return super.toString()+"\tAC : "+getAC()
				+"\tAccessory Kit : "+getAccessoryKit()
				+"\tPower Steering : "+getPowerSteering();
	}
	
}
