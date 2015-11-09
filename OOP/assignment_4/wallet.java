package assignmentOOP_3;

public class wallet implements PaymentMethod{

	@Override
	public int makePayment(int no, int rate) {
		System.out.println("Proceeding to pay amount...");
 		int totalFare=no*rate;
 		
 		return totalFare;

	}

}
