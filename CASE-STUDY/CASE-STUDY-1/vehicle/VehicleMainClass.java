package vehicle;

import java.util.Scanner;

public class VehicleMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleHelper vehicleHelper = new VehicleHelper();

		VehicleDetailPrinter vehicleDetailPrinter = new VehicleDetailPrinter();

		Scanner sc = new Scanner(System.in);

		vehicleDetailPrinter.display("Enter vehical type : ");
		String vehicleType = sc.next();

		vehicleDetailPrinter.display("Enter Maker : ");
		String maker = sc.next();

		vehicleDetailPrinter.display("Enter Model : ");
		String model = sc.next();

		vehicleDetailPrinter.display("Enter Engin in CC : ");
		int enginInCC = sc.nextInt();

		vehicleDetailPrinter.display("Enter Fuel Capacity : ");
		int fuelCapacity = sc.nextInt();

		vehicleDetailPrinter.display("Enter mailage : ");
		int milage = sc.nextInt();

		vehicleDetailPrinter.display("Enter Price : ");
		int price = sc.nextInt();

		vehicleDetailPrinter.display("Enter Road tax : ");
		int roadTax = sc.nextInt();

		Vehicle vehicle = vehicleHelper.createVehicle(vehicleType, maker,
				model, enginInCC, fuelCapacity, milage, price, roadTax);

		vehicleDetailPrinter.display("\nDetails of "+vehicleType+"\n"+vehicleDetailPrinter
				.printVehicleSpecification(vehicle));
		vehicleDetailPrinter.display("\n\nOn Road Price : "
				+ vehicle.calculateOnRoadPrice(vehicle));

		sc.close();
	}

}
