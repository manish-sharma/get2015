/**class for calculating the total amount for a booking
 * 
 * @author Riddhi
 *
 */
public class Payment {
	double amount = 0;

	double makePayment(double toBook, int price){		//toBook holds the number of seats/weight to be booked by the user
		amount = toBook * (price);
		return amount;
	}
}
