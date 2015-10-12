package com.metacampus.vehiclemanagement;

public class VehicleDetailPrinter {
	//function returns of specifications for a car or bike depending on its instance
	public static String printVehicleSpecification(Vehicle vehicle){
		if (vehicle instanceof Car) {
			Car car = (Car) vehicle;
			return (car.getMake() + car.getModel());
			}else
			{
				Bike bike = (Bike) vehicle;
				return bike.getMake().toString() + bike.getModel().toString();
			}		
	}

}
