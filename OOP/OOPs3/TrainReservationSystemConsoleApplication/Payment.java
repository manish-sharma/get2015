package TrainReservationSystemConsoleApplication;

public class Payment
{
    int ccv=125;
    int CCNumber=12345678;
    int wallet=0;
    String UserName="nikhil";
    String Password="tinkar";
    String Bank="hdfc";
    
   public void display()
      {   
	System.out.println("there is 3 option for payment please select one option");
	System.out.println("press 1 to DebitCard");
	System.out.println("press 2 to wallet");
	System.out.println("press 3 to Netbanking");
	 }
   /**
	 *NetBannking is function which is used to check the netbanking detail 
	 *  
	 */
   public boolean NetBannking(String userName,String password,String bank )
   {
	if(userName.equalsIgnoreCase(UserName) && password.equals(password) && bank.equalsIgnoreCase(Bank))
		return true;
	   
	   return false;
	   
   }
   /**
	 *NetBannking is function which is used to check the Wallet detail 
	 *  
	 */
   public boolean Wallet(int walletBalance)
   {
	if(walletBalance<=wallet)
	{      wallet-=walletBalance;
			return true;
	}  
	   return false;
	   
   }
   /**
	 *NetBannking is function which is used to check the DebitCard detail 
	 *  
	 */
   public boolean DebitCard(int Ccv,int CcNumber )
   {   if(Ccv==ccv && CCNumber==CcNumber)
    		return true;
	   	   return false;
	   
   }
   
   
}