/*This class does the payment related actions*
 * @author Shishir Pareek 
 * Date 17th August 2015
 */
public class Payment {
double amount = 0;
	/*This function handles payment and its calculation and returns the total amount*/
	double makePayment(double weight, int price){
		amount = weight * (price);
		return amount;
	}
}
