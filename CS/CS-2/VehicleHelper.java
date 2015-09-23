/**
 * @author Girdhari
 * Vehicle Helper Class
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

enum VehicleType {BIKE , CAR};  //It define type of vehicle is bike or car

/* Starting of VehicleHelper class */
public class VehicleHelper 
{
	
	/* Starting of addVehicle function */
	public static void addVehicles() 
	{
		Connection connectionObject = ConnectionUtil.getConnection();
		if(connectionObject==null)
		{
			System.out.println("Connection failed");
			System.exit(1);
		}
		VehicleAttributesParser readVehicleAttributes = new VehicleAttributesParser();
		readVehicleAttributes.parseXmlFile();
		readVehicleAttributes.parseDocument();
		List<Vehicle> vehicleList = readVehicleAttributes.getVehicleList();
		PreparedStatement preparedStatement = null;
		
		for(Vehicle vehicle : vehicleList)
		{
			
			System.out.println(vehicle);
			String query = "INSERT INTO vehicle (make_year, modal, engine_in_cc, fuel_capacity, milage, price, road_tax, created_by ,created_time ,vehicle_type )" 
				    		+ "values(?,?,?,?,?,?,?,?,?,?)" ;
			try {
				preparedStatement = connectionObject.prepareStatement(query);
				preparedStatement.setString(1, vehicle.getMakeYear());
				preparedStatement.setString(2, vehicle.getModel());
				preparedStatement.setInt(3, vehicle.getEngineInCC());
				preparedStatement.setInt(4, vehicle.getFuelCapacity());
				preparedStatement.setDouble(5, vehicle.getMilage());
				preparedStatement.setDouble(6, vehicle.getPrice());
				preparedStatement.setDouble(7, vehicle.getRoadTax());
				preparedStatement.setString(8, vehicle.getCreatedBy());
				preparedStatement.setDate(9,  new Date(vehicle.getCreatedTime().getTime()));
				int flag=0;
				String vehicleType =vehicle.getVehicleType().toString() ;
				if (vehicleType.equalsIgnoreCase("car"))
					flag=1;
				else if (vehicleType.equalsIgnoreCase("bike"))
					flag=2;
				else {
					System.out.println("invalid input");
					System.exit(1);
				}
				preparedStatement.setInt(10,flag );
				System.out.println(preparedStatement.execute());
				
			} catch (SQLException e) {
				System.out.println("sql exception occured");
				System.exit(1);
			}
			if(vehicle instanceof Car)
				addCar((Car)vehicle ,connectionObject);
			
			else if(vehicle instanceof Bike)
				addBike((Bike)vehicle ,connectionObject);	
			else 
			{
				System.out.println("illegal argument exception");
				System.exit(1);
			}
		}
	}
	/* Ending of addVehicle function */
	
	/* Starting of addCar function */ 
	private static void addCar(Car car ,Connection connection)
	{
		String query = "INSERT INTO car( has_ac, has_power_steering, has_accessory_kit  ) VALUES(?,?,?)";
		int flag=0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			String input =car.getHasAC().toString();
			if(input.equalsIgnoreCase("yes"))
				flag=1;
			preparedStatement.setInt(1, flag);
			flag=0;
			input = car.getHaspowerSteering().toString();
			if(input.equalsIgnoreCase("yes"))
				flag=1;
			preparedStatement.setInt(2, flag);
			flag=0;
			input = car.getHasaccessoryKit().toString();
			if(input.equalsIgnoreCase("yes"))
				flag=1;
			preparedStatement.setInt(3, flag);
			preparedStatement.execute();
		} 
		catch (SQLException e) {
			System.out.println("Error Occured sql");
		}
		
	}
	/* Ending of addCar function */
	
	/* Starting of addBike function */
	private static void addBike(Bike bike ,Connection connection)
	{
		String query = "INSERT INTO bike (is_self_start, helmet_price ) VALUES (?, ? )";
		int flag=0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			String input= bike.getIsSelfStart().toString();
			if(input.equalsIgnoreCase("yes"))
				flag=1;
			preparedStatement.setInt(1, flag);
			preparedStatement.setDouble(2, bike.getHelmetPrice());
			preparedStatement.execute();
		} 
		catch (SQLException e) {
			System.out.println("Error Occured sql");
		}
	}
	/* Ending of addBike function */

}
/* Ending of VehicleHelper Class */
