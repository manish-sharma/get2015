package ServiceCarSystem;

/**
 * @author Sumitra
 * this class conation getter and setter method.
 */
public class Person {
	String name;// Name of Person
	String carType;// Specification of Person
	int Flag;// To check whether person is busy or not

	

	public Person(String name, String carType, int flag) {
		super();
		this.name = name;
		this.carType = carType;
		Flag = flag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getFlag() {
		return Flag;
	}

	public void setFlag(int flag) {
		Flag = flag;
	}

}
