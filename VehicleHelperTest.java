package com.test.vehicle;
import com.Vehicle.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleHelperTest {
    static Vehicle vehicle;
    static Car car;
    static Bike bike;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    
      
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    /**
     * this method use to test each value provide to vehicle either car or bike
     * it check object and then get values from that class 
     */
    public void testCreateVehicle1() {
    	 Vehicle vehicle= new Vehicle();
        vehicle=VehicleHelper.createVehicle("car","Ford","EcoSport");
        vehicle.getMake();
        if(vehicle.getClass().equals(new Car().getClass())){
            
            car=VehicleHelper.createCar((Car)vehicle,  2000,50, 22, 850000, 40049,true, true, "Radio , Cd Player");
            String result= VehicleDetailPrinter.printVehicleDetail(car);
            System.out.println(result);
            
            Assert.assertEquals("Ford", car.getMake());
            Assert.assertEquals("EcoSport", car.getModel());
            Assert.assertEquals(2000, car.getEngineInCC());
            Assert.assertEquals(50, car.getFuelCapacity());
            Assert.assertEquals( 22,car.getMilage());
            Assert.assertEquals( 850000, car.getPrice());
            Assert.assertEquals(40049,car.getRoadTax());
            Assert.assertEquals(true, car.isAc());
            Assert.assertEquals(true, car.isPowerSteering());
            Assert.assertEquals( "Radio , Cd Player",car.getAccessoryKit());
            
        }
        
        else if(vehicle.getClass().equals(new Bike().getClass())){
            
            bike=VehicleHelper.createBike((Bike)vehicle, 350, 15, 30, 120000, 150049, true, 1500);
            String result= VehicleDetailPrinter.printVehicleDetail(bike);
            System.out.println(result);
            
            Assert.assertEquals("Royal Enfield",  bike.getMake());
            Assert.assertEquals("Bullet 300", bike.getModel());
            Assert.assertEquals(350,  bike.getEngineInCC());
            Assert.assertEquals(15,  bike.getFuelCapacity());
            Assert.assertEquals( 30,  bike.getMilage());
            Assert.assertEquals( 120000, bike.getPrice());
            Assert.assertEquals(150049,  bike.getRoadTax());
            Assert.assertEquals(true, bike.isSelfStart());
            Assert.assertEquals(1500, bike.getHelmetPrice());
        }
        
        
    }
    @Test
/**
* this method use to test each value provide to vehicle either car or bike
* it check object and then get values from that class 
*/
       public void testCreateVehicle2() {
           Vehicle vehicle= new Vehicle();
           vehicle=  VehicleHelper.createVehicle("bike","Royal Enfield", "Bullet 300");
       
           if(vehicle.getClass().equals(new Car().getClass())){
               car=VehicleHelper.createCar((Car)vehicle,  2000,50, 22, 850000, 40049,true, true, "Radio , Cd Player");
               String result= VehicleDetailPrinter.printVehicleDetail(car);
               System.out.println(result);
            Assert.assertEquals("Ford", car.getMake());
            Assert.assertEquals("EcoSport", car.getModel());
            Assert.assertEquals(2000, car.getEngineInCC());
            Assert.assertEquals(50, car.getFuelCapacity());
            Assert.assertEquals( 22,car.getMilage());
            Assert.assertEquals( 850009, car.getPrice());
            Assert.assertEquals(40049,car.getRoadTax());
            Assert.assertEquals(true, car.isAc());
            Assert.assertEquals(true, car.isPowerSteering());
            Assert.assertEquals( "Radio , Cd Player",car.getAccessoryKit());
        }
        
           else if(vehicle.getClass().equals(new Bike().getClass())){
               bike=VehicleHelper.createBike((Bike)vehicle, 350, 15, 30, 120000, 150049, true, 1500);
           
               String result= VehicleDetailPrinter.printVehicleDetail(bike);
               System.out.println(result);
            Assert.assertEquals("Royal Enfield",  bike.getMake());
            Assert.assertEquals("Bullet 300", bike.getModel());
            Assert.assertEquals(350,  bike.getEngineInCC());
            Assert.assertEquals(15,  bike.getFuelCapacity());
            Assert.assertEquals( 30,  bike.getMilage());
            Assert.assertEquals( 120000, bike.getPrice());
            Assert.assertEquals(150049,  bike.getRoadTax());
            Assert.assertEquals(true, bike.isSelfStart());
            Assert.assertEquals(1500, bike.getHelmetPrice());
        }
        
           
           
       }
    


    


}
