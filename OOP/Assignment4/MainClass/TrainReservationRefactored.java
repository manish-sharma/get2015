// Program to make train reservation system

package MainClass;

import java.util.*;
import menu.MenuItemNew;

public class TrainReservationRefactored 
{	
	public static void main(String[] args)
	{
		Scanner sc = null;
		
		ArrayList<Train> trainList = null;
		ArrayList<Train> trainListFinal = null;
		List<String> listTrainTickets = null;
		
		Processing processingObj = null;
		Passenger passengerObj = null;
		MenuItemNew menuItemNewObj = null;
		
		try
		{
			sc = new Scanner(System.in);
			
			trainList = new ArrayList<Train>();
			trainListFinal = new ArrayList<Train>();
			listTrainTickets = new ArrayList<String>();
			
			processingObj = new Processing();
			passengerObj = new Passenger();
			
			// loads trainList from file		
			trainList = processingObj.loadTrainListFromFile ( trainList );
	
    			// bubble sort for sorting train list according to duration
    			processingObj.sortTrainListByDuration (trainList);
			
			while(true)
			{	
				menuItemNewObj = new MenuItemNew ();
				menuItemNewObj.addItemsToMenuList();
				
				System.out.println("\nEnter your choice : ");
				int choice = sc.nextInt();
		    		switch(choice)
		    		{
		    			case 1: //takes all details from user			    		
				    		System.out.println("\n\nEnter your name");
				    		passengerObj.setPassengerName(sc.next());
				    		
				    		System.out.println("\n\nEnter Train Type  -  Passenger/Goods");
				    		String trainType = sc.next();
				    		
				    		System.out.println("\n\nThe available trains : \nTrain Name\tTrain Fare\tTrain Duration\tTrain Seat/Weight\tTrain fron-to\tTrain Type");
				    		
				    		trainListFinal = processingObj.createNewListByTrainType ( trainType, trainList, trainListFinal );
				    		for ( Train availableTrain : trainListFinal )
				    			System.out.println ( availableTrain.trainName+"\t\t"+availableTrain.trainCost+"\t\t"+availableTrain.trainDuration+"\t\t"+availableTrain.trainSeatsOrWeight+"\t\t"+availableTrain.trainFromTo+"\t\t"+availableTrain.trainType );
				    		
				    		System.out.println("\n\nPlease enter from-to Station");
				    		String fromToStation = sc.next();
				    			
				    		System.out.println("\n\nThe available trains : \nTrain Name\tTrain Fare\tTrain Duration\tTrain Seat/Weight");
				    		trainListFinal = processingObj.createNewListByFromToStation ( fromToStation, trainList, trainListFinal );
				    		for ( Train availableTrain : trainListFinal )
				    			System.out.println ( availableTrain.trainName+"\t\t"+availableTrain.trainCost+"\t\t"+availableTrain.trainDuration+"\t\t"+availableTrain.trainSeatsOrWeight );
				    		
				    		System.out.println("\n\nPlease enter Train name");
				    		String trainName = sc.next();
				    		System.out.println("\n\nEnter Seat (if Passenger)/Weight (if Goods)");
				    		int seatOrWeight = sc.nextInt();
				    		
				    		System.out.println("\n\nThe available train : \nTrain Name\tTrain Fare\tTrain Duration\tTrain Seat/Weight");
				    		passengerObj.setSeatsOrWeightBooked(seatOrWeight);
				    		trainListFinal = processingObj.createNewListBySeatOrWeight ( trainName, seatOrWeight, trainList, trainListFinal );
				    		for ( Train availableTrain : trainListFinal )
				    			System.out.println ( availableTrain.trainName+"\t\t"+availableTrain.trainCost+"\t\t"+availableTrain.trainDuration+"\t\t"+availableTrain.trainSeatsOrWeight );
				    	
				    	
				    		// does payment
				    		String ccNumber = "", cvv = "", bank = "", username = "", password = "", cashAmount = "";
				    		Payment paymentObj = new Payment ( ccNumber, cvv, bank, username, password, cashAmount );
				    		String paymentMethod [] = {"Credit_Card", "Wallet", "Net_Banking"};
				
				    		System.out.println("\n\nPlease enter payment method [ Credit_Card / Wallet / Net_Banking] ");
				    		String paymentType = sc.next();
				    		if ( paymentType.equals(paymentMethod[0]))         // for credit card
				    		{
				    			System.out.println ("\n\nEnter your ccNumber");
				    			ccNumber = sc.next();
				    			System.out.println ("\n\nEnter your ccNumber");
				    			cvv = sc.next();
				    		}
				    		else if ( paymentType.equals(paymentMethod[2]))    //  for net banking
				    		{
				    			System.out.println ("\n\nEnter your Bank");
				    			bank = sc.next();
				    			System.out.println ("\n\nEnter your username");
				    			username = sc.next();
				    			System.out.println ("\n\nEnter your password");
				    			password = sc.next();
				    		}
				    		else
				    		{	
				    			System.out.println ("\n\nEnter the cash amount");    // for wallet
				    			cashAmount = sc.next();
				    		}
				    		paymentObj = new Payment ( ccNumber, cvv, bank, username, password, cashAmount ) ;
				    		
			    			break;
			    			
		    			case 2: // generates train ticket
				    		System.out.println ("\n\nYour train ticket : \nUsername\tTrain Name\tNo. of seats/weight booked\tPaid amt");  
				    		listTrainTickets = processingObj.generateTrainTicket ( trainList, trainListFinal, passengerObj );
				    		for ( String ticket : listTrainTickets )
				    			System.out.println (ticket);
				    		
				    		break;

		    			case 3: // generates updated train chart
		    				System.out.println ("\n\nUpdated train chart : \nTrain Name\tTrain Fare\tTrain Duration\tTrain Seat/Weight");
		    				processingObj.sortTrainListByDuration (trainList);
				    		for ( Train trainObj : trainList )
				    			System.out.println ( trainObj.trainName+"\t\t"+trainObj.trainCost+"\t\t"+trainObj.trainDuration+"\t\t"+trainObj.trainSeatsOrWeight ) ;
		    				
				    		break;  
		   		   			
		    			case 4: System.out.println("Thank you, for using our service.");
		    				System.exit(0);
		    		   		break;
		    		   		
		    			default : System.out.println("Please enter correct choice");
		    				  break;
		    		}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if ( sc != null )
				sc = null;
			if ( listTrainTickets != null )
				listTrainTickets = null;
			if ( passengerObj!=null )
				passengerObj = null;
			if ( trainList != null )
				trainList = null;
			if ( trainListFinal != null )
				trainListFinal = null;
			if ( processingObj != null )
				processingObj = null;
			if ( menuItemNewObj != null )
				menuItemNewObj = null;
		}
	}
}
