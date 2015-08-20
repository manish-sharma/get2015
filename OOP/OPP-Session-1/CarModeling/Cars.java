/*
 * This a car class which contains car information 
 * author Banwari
 */
public class Cars {
	String model;
	String registrationNumber;
	int rate;
	/*
	 * Parameterized Constructor
	 * @param model is car model
	 * @param registrationNumber is the registration number of car
	 * @param rate is the service rate of car 
	 */
	Cars(String model,String registrationNumber,int rate) {
		this.model=model;
		this.registrationNumber=registrationNumber;
		this.rate=rate;
	}
}
