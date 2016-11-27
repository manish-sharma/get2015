package com;

public class TemperatureConvertor {

	public float fahrenheitToCelsius(float value) {
		return ((((value) - 32) / 9) * 5);

	}

	public float celsiusTofahrenheit(float value) {
		return ((((value) * 9) / 5) + 32);

	}
}
