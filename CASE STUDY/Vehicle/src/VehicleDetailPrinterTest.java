import static org.junit.Assert.*;

import org.junit.Test;

import vehicles.*;
/**
 * to test the printer class
 * @author Ravika
 * @since 9/15/2015
 */
public class VehicleDetailPrinterTest {
//test for car
	@Test
	public void testForCar() {
		 Vehicle vehicle= new Vehicle();
	        vehicle=VehicleHelper.createVehicle(VehicleType.CAR,"Ford","EcoSport");

	        if(vehicle instanceof Car){
	            
	            Car car = VehicleHelper.createCar((Car)vehicle,  2000,50, 22, 850000, 40049,true, true, "Radio , Cd Player");
	            String result= VehicleDetailPrinter.printVehicleSpecification(car);
	            System.out.println(result);
	            String expected = "Car " + " make : " + car.getMake() + ", model : " + car.getModel() + ", engineInCC : "
				+ car.getEngineInCC() + ", fuelCapacity : " + car.getFuelCapacity() + ", milage : "
				+ car.getMilage() + ", price : " + car.getPrice() + ", roadTax : " + car.getRoadTax() 
				+ ", AC : " + car.isAC() + ", powerSteering : " + car.isPowerSteering()
				+ ", accessoryKit : " + car.getAccessoryKit();
	            
	            assertEquals(expected, result);
	            
	        } else if(vehicle instanceof Bike){
	            
	            Bike bike=VehicleHelper.createBike((Bike)vehicle, 350, 15, 30, 120000, 150049, true, 1500);
	            String result= VehicleDetailPrinter.printVehicleSpecification(bike);
	            System.out.println(result);
	            
	            String expected = "Bike " + " make : " + bike.getMake() + ", model : " + bike.getModel() + ", engineInCC : " + bike.getEngineInCC() + 
	            		", fuelCapacity : " + bike.getFuelCapacity() + ", milage : " + bike.getMilage() + ", price : " + bike.getPrice() + ", roadTax : " 
	            		+ bike.getRoadTax()	+ ", selfStart : " + bike.isSelfStart() + ", helmetPrice :" + bike.getHelmetPrice();
	            assertEquals(expected, result);
	        }
	}
	
	//test for bike
	@Test
	public void testForBike() {
		 Vehicle vehicle= new Vehicle();
         vehicle=  VehicleHelper.createVehicle(VehicleType.BIKE,"Royal Enfield", "Bullet 300");
     
	        if(vehicle instanceof Car){
	            
	            Car car = VehicleHelper.createCar((Car)vehicle,  2000,50, 22, 850000, 40049,true, true, "Radio , Cd Player");
	            String result= VehicleDetailPrinter.printVehicleSpecification(car);
	            System.out.println(result);
	            String expected = "Car " + " make : " + car.getMake() + ", model : " + car.getModel() + ", engineInCC : "
				+ car.getEngineInCC() + ", fuelCapacity : " + car.getFuelCapacity() + ", milage : "
				+ car.getMilage() + ", price : " + car.getPrice() + ", roadTax : " + car.getRoadTax() 
				+ ", AC : " + car.isAC() + ", powerSteering : " + car.isPowerSteering()
				+ ", accessoryKit : " + car.getAccessoryKit();
	            
	            assertEquals(expected, result);
	        } else if(vehicle instanceof Bike){
	            
	            Bike bike=VehicleHelper.createBike((Bike)vehicle, 350, 15, 30, 120000, 150049, true, 1500);
	            String result= VehicleDetailPrinter.printVehicleSpecification(bike);
	            System.out.println(result);
	            
	            String expected = "Bike " + " make : " + bike.getMake() + ", model : " + bike.getModel() + ", engineInCC : " + bike.getEngineInCC() + 
	            		", fuelCapacity : " + bike.getFuelCapacity() + ", milage : " + bike.getMilage() + ", price : " + bike.getPrice() + ", roadTax : " 
	            		+ bike.getRoadTax()	+ ", selfStart : " + bike.isSelfStart() + ", helmetPrice :" + bike.getHelmetPrice();
	            
	            assertEquals(expected, result);
	        }    
	}

}
