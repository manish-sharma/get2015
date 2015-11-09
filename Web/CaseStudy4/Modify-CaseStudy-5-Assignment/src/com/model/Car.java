package com.model;

import lombok.Data;

@Data
public class Car extends Vehicle {
	private boolean hasAC;  
	private boolean powerSteering;
	private boolean hasaccessoryKit;


	@Override
	public double calculateOnRoadPrice() {
		return super.calculateOnRoadPrice() + 2000;
	}
	
	
}
