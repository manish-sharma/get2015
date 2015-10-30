import vehicles.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.*;

/**
 * to test the Helper class
 * @author Ravika
 * @since 9/15/2015
 */
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
    
    //test for car
    @Test
    public void testCreateVehicle1() {
    	 Vehicle vehicle= new Vehicle();
        vehicle=VehicleHelper.createVehicle(VehicleType.CAR,"Ford","EcoSport");

        if(vehicle instanceof Car){
            
            car=VehicleHelper.createCar((Car)vehicle,  2000,50, 22, 850000, 40049,true, true, "Radio , Cd Player");
            String result= VehicleDetailPrinter.printVehicleSpecification(car);
            System.out.println(result);
            
            Assert.assertEquals("Ford", car.getMake());
            Assert.assertEquals("EcoSport", car.getModel());
            Assert.assertEquals(2000, car.getEngineInCC());
            Assert.assertEquals(50, car.getFuelCapacity());
            Assert.assertEquals( 22,car.getMilage());
            Assert.assertEquals( 850000, car.getPrice());
            Assert.assertEquals(40049,car.getRoadTax());
            Assert.assertEquals(true, car.isAC());
            Assert.assertEquals(true, car.isPowerSteering());
            Assert.assertEquals( "Radio , Cd Player",car.getAccessoryKit());
            
        } else if(vehicle instanceof Bike){
            
            bike=VehicleHelper.createBike((Bike)vehicle, 350, 15, 30, 120000, 150049, true, 1500);
            String result= VehicleDetailPrinter.printVehicleSpecification(bike);
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
    
    //test for bike
    @Test
    public void testCreateVehicle2() {
           Vehicle vehicle= new Vehicle();
           vehicle=  VehicleHelper.createVehicle(VehicleType.BIKE,"Royal Enfield", "Bullet 300");
       
           if(vehicle instanceof Car){
        	   
	           car=VehicleHelper.createCar((Car)vehicle, 2000,50, 22, 850000, 40049,true, true, "Radio , Cd Player");
	           String result= VehicleDetailPrinter.printVehicleSpecification(car);
	           System.out.println(result);
	           Assert.assertEquals("Ford", car.getMake());
	           Assert.assertEquals("EcoSport", car.getModel());
	           Assert.assertEquals(2000, car.getEngineInCC());
	           Assert.assertEquals(50, car.getFuelCapacity());
	           Assert.assertEquals( 22,car.getMilage());
	           Assert.assertEquals( 850009, car.getPrice());
	           Assert.assertEquals(40049,car.getRoadTax());
	           Assert.assertEquals(true, car.isAC());
	           Assert.assertEquals(true, car.isPowerSteering());
	           Assert.assertEquals( "Radio , Cd Player",car.getAccessoryKit());
           } else if(vehicle instanceof Bike){
               bike=VehicleHelper.createBike((Bike)vehicle, 350, 15, 30, 120000, 150049, true, 1500);
           
               String result= VehicleDetailPrinter.printVehicleSpecification(bike);
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


