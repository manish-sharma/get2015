package com.speedster.model;

import lombok.Data;

@Data
public class Car extends Vehicle {
	private String ac;

	private String powerSteering;

	private String accessoryKit;
}
