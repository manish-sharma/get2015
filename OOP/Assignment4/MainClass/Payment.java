package MainClass;

public class Payment
{
	String ccNumber;
	String cvv;
	String bank;
	String userName;
	String password;
	String cashAmount;
	
	// works in case of credit card , wallet &  net banking
	public Payment ( String ccNumber, String cvv, String bank, String userName, String password, String cashAmount )
	{
		this.ccNumber = ccNumber;
		this.cvv = cvv;
		this.bank = bank;
		this.userName = userName;
		this.password = password;
		this.cashAmount = cashAmount;
	}
}