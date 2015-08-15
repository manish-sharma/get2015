package ServiceCar;

/**
 * @author Arushi -->handling all parameters of a mechanic type
 *         ->name,specialization of car,flag->for checking whether busy or not
 * 
 */
public class Person {

	String name;
	String carType;
	int Flag;

	public Person(String name, String carType, int flag) { // Constructor
															// calling
		super();
		this.name = name;
		this.carType = carType;
		Flag = flag;
	}

	public String getName() { // getting name of mechanic
		return name;
	}

	public void setName(String name) { // setting name of mechanic
		this.name = name;
	}

	public String getCarType() { // getting car specialization of mechanic
		return carType;
	}

	public void setCarType(String carType) { // setting car specialization of
												// mechanic
		this.carType = carType;
	}

	public int getFlag() { // getting flag of mechanic
		return Flag;
	}

	public void setFlag(int flag) { // setting flag of mechanic
		Flag = flag;
	}

}
