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

	List<Person> personList;
	List<Cars> carsList;
	List<ServicingCars> servicingList;
	List<Services> servicesList;

	public static void main(String[] args) {
		ServiceStation serviceStation = new ServiceStation();
		// creating list of person type object
		serviceStation.personList = new ArrayList<Person>();
		// creating list of cars type object
		serviceStation.carsList = new ArrayList<Cars>();
		// creating list of "car to be served"servicing list type object
		serviceStation.servicingList = new ArrayList<ServicingCars>();
		// creating list of"cars which will be served"services list type object
		serviceStation.servicesList = new ArrayList<Services>();
		Scanner scanner = new Scanner(System.in);
		// for Mechanic
		File file = new File("../src/ServiceCar/Storage.txt");
		try {
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			// writing in file about mechanic
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Enter  total no. of  mechanic  ");
			int n = scanner.nextInt();
			System.out
					.println("Enter entry for each mechanic in form:::-Mechanic_Name,Car specialization,Cost of mechanic for service");
			System.out.println("Each value is seperated by comma-");
			System.out.println("Eg:-Mechanic1,SUV,5000");
			for (int i = 0; i < n; i++) {

				bw.write(scanner.next());
				bw.write(",");
			}

			String name = "";
			String carType = "";
			String price = "";
			bw.close();
			int count = 0;

			FileInputStream fr = new FileInputStream(
					"../src/ServiceCar/Storage.txt");
			// Storing data in "Storage.txt"file

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

						Person person = new Person(name, carType, 0);
						// storing data in person list
						serviceStation.personList.add(person);
						int flag = 0;
						Iterator<Cars> itr4 = serviceStation.carsList
								.iterator();
						while (itr4.hasNext()) {

							Cars objectCheck = itr4.next();
							if (carType.equalsIgnoreCase(objectCheck.type)) {
								flag = 1;

							}
						}

						if (flag == 0) {
							Cars cars = new Cars(carType,
									Double.parseDouble(price));
							// storing data in car list

							serviceStation.carsList.add(cars);
						}
						name = "";
						carType = "";
						price = "";

					}

				}
			}

			fr.close();
			carType = "";
			name = "";
			// fetching data from user about the cars which are coming for
			// service and storing them in a file
			File file1 = new File("../src/ServiceCar/Cars.txt");

			// if file doesn't exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw1 = new FileWriter(file1.getAbsoluteFile());
			BufferedWriter bw1 = new BufferedWriter(fw1);

			System.out
					.println("Enter total no of cars which come for service today");
			int n1 = scanner.nextInt();
			System.out
					.println("Enter entry of each car in format::car id,car type");
			System.out.println("Eg::-12,SUV");
			for (int i1 = 0; i1 < n1; i1++) {

				bw1.write(scanner.next());
				bw1.write(",");
			}

			bw1.close();

			FileInputStream fr1 = new FileInputStream(
					"../src/ServiceCar/Cars.txt");
			// Storing data in file
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

						ServicingCars servicingCars1 = new ServicingCars(
								carType, Integer.parseInt(name));
						serviceStation.servicingList.add(servicingCars1); // adding
																			// data
																			// in
																			// list

						carType = "";
						name = "";

					}
				}
			}

			fr1.close();
			// getting Iterator from arraylist servicing list to traverse car to
			// be served
			Iterator<ServicingCars> itr = serviceStation.servicingList
					.iterator();
			while (itr.hasNext()) {
				ServicingCars object1 = itr.next();
				// getting Iterator from arraylist cars to traverse cars for
				// matching

				Iterator<Cars> itr1 = serviceStation.carsList.iterator();
				while (itr1.hasNext()) {
					Cars object2 = itr1.next();
					if (object2.getType().equals(object1.carType)) {

						Iterator<Person> itr3 = serviceStation.personList
								.iterator();
						// getting Iterator from arraylist mechanic to
						// traverse cars which can be served today
						while (itr3.hasNext()) {
							Person object3 = itr3.next();
							if (object3.getCarType().equals(object2.getType())
									&& (object3.getFlag() == 0)) {
								object3.setFlag(1);
								Services services = new Services(
										object3.getName(),
										object3.getCarType(),
										object2.getServiceRate(),
										object1.getCarNumber());
								serviceStation.servicesList.add(services);
								// storing data in list
								break;
							}
						}
					}
				}
			}
			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		int count1 = 0;
		double Amount = 0.0;
		// How many cars are serviced by each type
		System.out.println("How many cars are serviced by each type ");
		Iterator<Cars> itr1 = serviceStation.carsList.iterator();
		// getting Iterator from arraylist to traverse elements
		while (itr1.hasNext()) {
			Cars object2 = itr1.next();
			Iterator<Services> itr = serviceStation.servicesList.iterator();
			// getting Iterator from arraylist to traverse elements
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
