package Helper;

import java.util.Date;

import model.Car;

public class CarHelper {
      public CarHelper(){}

	public Car createCar( String createdBy,String createdTime, String model, String make, String enginInCC, String fuelCapacity, String milage,
			                               String price,String roadTax, String ac, String powerSteering, String accessoryKit )
	{    
		
	    Car car =  new Car();
		car.setCreatedBy(createdBy);
		car.setCreatedTime(createdTime);
		car.setModel(model);
		car.setMake(make);
		car.setEnginInCC(enginInCC);
		car.setFuelCapacity(fuelCapacity);
		car.setMilage(milage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		car.setAc(ac);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		return car;

	}

	
}
