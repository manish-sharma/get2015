import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServiceStation {

	List<customer> personList;
	List<Car> carsList;
	List<ServicingCars> servicingList;
	List<Services> servicesList;
	private static Scanner scanner;

	public static void main(String[] args) {
		ServiceStation serviceStation = new ServiceStation();
		serviceStation.personList = new ArrayList<customer>();
		serviceStation.carsList = new ArrayList<Car>();
		serviceStation.servicingList = new ArrayList<ServicingCars>();
		serviceStation.servicesList = new ArrayList<Services>();
		scanner = new Scanner(System.in);

		// for Mechanic
		File file = new File(
				"C:/Users/Deepali/workspace/Session5/src/ServiceCarSystem/Storage.txt");
		try {
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Enter no. of entry");
			int n = scanner.nextInt();
			for (int i = 0; i < n; i++) {

				System.out.println("Enter entry");
				bw.write(scanner.next());
				bw.write(",");
			}

			String name = "";
			String carType = "";
			String price = "";

			bw.close();
			int count = 0;

			FileInputStream fr = new FileInputStream(
					"C:/Users/Deepali/workspace/Session5/src/ServiceCarSystem/Storage.txt");

			char c;
			while (((InputStream) fr).available() > 0) {
				c = (char) fr.read();

				if (c != ',') {

					if (count == 0) {
						name = name + c;

					}
					if (count == 1) {
						carType = carType + c;

					}
					if (count == 2) {
						price = price + c;

					}
				} else {
					count++;
					if (count == 3) {
						count = 0;

						customer person = new customer(name, carType, 0);
						serviceStation.personList.add(person);
						Car cars = new Car(carType, Double.parseDouble(price));
						serviceStation.carsList.add(cars);

						name = "";
						carType = "";
						price = "";

					}

				}
			}
			fr.close();
			carType = "";
			name = "";
			// for car
			File file1 = new File(
					"C:/Users/Deepali/workspace/Session5/src/ServiceCarSystem/Cars.txt");

			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw1 = new FileWriter(file1.getAbsoluteFile());
			BufferedWriter bw1 = new BufferedWriter(fw1);

			System.out.println("Enter no. of entry");
			int n1 = scanner.nextInt();
			for (int i1 = 0; i1 < n1; i1++) {

				System.out.println("Enter entry");
				bw1.write(scanner.next());
				bw1.write(",");
			}

			bw1.close();

			FileInputStream fr1 = new FileInputStream(
					"C:/Users/Deepali/workspace/Session5/src/ServiceCarSystem/Cars.txt");

			char c1;
			while (((InputStream) fr1).available() > 0) {
				c1 = (char) fr1.read();

				if (c1 != ',') {

					if (count == 0) {
						name = name + c1;

					}
					if (count == 1) {
						carType = carType + c1;

					}
				} else {
					count++;
					if (count == 2) {
						count = 0;
						System.out.println("Done" + carType);
						System.out.println("Done" + name);
						ServicingCars servicingCars1 = new ServicingCars(
								carType, Integer.parseInt(name));
						serviceStation.servicingList.add(servicingCars1);

						carType = "";
						name = "";

					}
				}
			}

			fr1.close();
			Iterator<customer> itr = serviceStation.personList.iterator();// getting
																			// Iterator
																			// from
																			// arraylist
																			// to
																			// traverse
																			// elements
			while (itr.hasNext()) {
				customer object1 = itr.next();

				Iterator<Car> itr1 = serviceStation.carsList.iterator();// getting
																			// Iterator
																			// from
																			// arraylist
																			// to
																			// traverse
																			// elements
				while (itr1.hasNext()) {
					Car object2 = itr1.next();
					if (object2.getType().equals(object1.carType)) {

						Iterator<ServicingCars> itr3 = serviceStation.servicingList
								.iterator();// getting Iterator from arraylist
											// to traverse elements
						while (itr3.hasNext()) {
							ServicingCars object3 = itr3.next();
							if (object3.getCarType().equals(object2.getType())
									&& (object1.getFlag() == 0)) {
								object1.setFlag(1);
								Services services = new Services(
										object1.getName(),
										object1.getCarType(),
										object2.getServiceRate(),
										object3.getCarNumber());
								serviceStation.servicesList.add(services);
							}
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		int count1 = 0;
		double Amount = 0.0;
		// How many cars are serviced by each type
		System.out.println("How many cars are serviced by each type ");
		Iterator<Car> itr1 = serviceStation.carsList.iterator();// getting
																	// Iterator
																	// from
																	// arraylist
																	// to
																	// traverse
																	// elements
		while (itr1.hasNext()) {
			Car object2 = itr1.next();
			Iterator<Services> itr = serviceStation.servicesList.iterator();// getting
																			// Iterator
																			// from
																			// arraylist
																			// to
																			// traverse
																			// elements
			while (itr.hasNext()) {
				Services object1 = itr.next();
				if (object2.getType().equals(object1.getCarType())) {
					count1++;
					Amount = Amount + object2.getServiceRate();
				}

			}
			System.out.println(object2.getType() + ":  " + count1);
			count1 = 0;
		}

		// 2. What was the total earning
		System.out.println("What was the total earning" + Amount);

	}

}
