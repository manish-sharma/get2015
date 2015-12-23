package model;

import java.util.Date;
/*
 * this class initalize specific attributes of Vehicle car
 * @author Banwari kevat 
 */
public class Car  {
	
		private String createdBy;
		private String createdTime;
		private String make;
		private String model;
		private String enginInCC;
		private String fuelCapacity;
		private String milage;
		private String price;
		private String roadTax;  
		private String Ac;
		private String powerSteering;
		private String accessoryKit;
		 
		public Car() 
		 {
			
		 }

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getCreatedTime() {
			return createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

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

		public String getEnginInCC() {
			return enginInCC;
		}

		public void setEnginInCC(String enginInCC) {
			this.enginInCC = enginInCC;
		}

		public String getFuelCapacity() {
			return fuelCapacity;
		}

		public void setFuelCapacity(String fuelCapacity) {
			this.fuelCapacity = fuelCapacity;
		}

		public String getMilage() {
			return milage;
		}

		public void setMilage(String milage) {
			this.milage = milage;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getRoadTax() {
			return roadTax;
		}

		public void setRoadTax(String roadTax) {
			this.roadTax = roadTax;
		}

		public String getAc() {
			return Ac;
		}

		public void setAc(String aC) {
			Ac = aC;
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
		
}
