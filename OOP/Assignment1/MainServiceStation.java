
public class MainServiceStation {

	//main method
	public static void main(String[] args) {
		
		ServiceStation obj1 = new ServiceStation();				//creating object for service station class
		obj1.readMechanics();					//reading mechanic details
		obj1.readCars();						//reading car details
		obj1.assignCars();						//assigning cars to mechanics
		System.out.println("the total income for the day is : " + obj1.getIncome() + "\n");			//showing total income
		System.out.println("the number of cars serviced today are : \n" + obj1.getCarsServiced());			//showing number of cars serviced for each type
	}

}