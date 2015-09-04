package oopAssignment5;
import java.util.*;
/**
 * Class in which all the booking related methods are called.
 * @author Riddhi
 *
 */

public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainDetails.readTrainDetails();
		Scanner sc=new Scanner(System.in);

		List<PassengerTrain> updatedList=new ArrayList<PassengerTrain>();  //used to store updated list of passenger train
		List<GoodsTrain> updatedList1=new ArrayList<GoodsTrain>();         //used to store updated list of goods train

		Processing objOfProcessing=new Processing();

		int type,y = 0;
		try
		{
			do
			{
				MenuList.userDetails();                      //method invoked to get user details
				do
				{
					type=MenuList.displayMenu();            //method invoked to get the type of train required by user
					if(!(type == 1 || type == 2))
						ErrorPrint.print();
				}while(!(type == 1 || type == 2));

				Collections.sort(TrainDetails.passengerTrainInfo,new TravelTimeComparator());  //method invoked for sorting passenger train according to travle time
				Collections.sort(TrainDetails.goodsTrainInfo,new TravelTimeComparator());      //method invoked for sorting goods train according to travle time

				if(type == 1)
					objOfProcessing.displayAllPassengerTrains(TrainDetails.passengerTrainInfo);  //method invoked to display train according to type of train entered
				else if(type == 2)
					objOfProcessing.displayAllGoodsTrains(TrainDetails.goodsTrainInfo);

				boolean ans = false;
				do
				{
					ans=MenuList.travelPath();           //method invoked to enter the path to travel
					if(ans == true && type == 1)
					{
						updatedList=objOfProcessing.passengerTrainBtwStations();   //method invoked to check the availability of train between station
						objOfProcessing.displayAllPassengerTrains(updatedList);    //displays the list of train available
					}
					else if(ans == true && type == 2)
					{
						updatedList1=objOfProcessing.goodsTrainBtwStations();     //method invoked to check the availability of train between station
						objOfProcessing.displayAllGoodsTrains(updatedList1);      //displays the list of train available
					}
					else
					{
						ErrorPrint.print();
					}
				}while(ans==false);

				double totalAmount = 0.0;
				do
				{
					totalAmount=MenuList.trainInfo();             //method invoked to make the user select the train id and number of seats to be booked
					if(totalAmount == 0.0)
					{
						ErrorPrint.print();                      //invokes function of ErrorPrint class to display message
					}
				}while(totalAmount == 0.0);

				do
				{
					type=MenuList.modeOfPayment();                        //method invoked to select the mode of payement option
				}while(!(type == 1 || type == 2 || type == 3));
				System.out.println("\n\nUpdated Chart");
				System.out.println("-----Passenger Train----");
				objOfProcessing.displayAllPassengerTrains(TrainDetails.passengerTrainInfo);   //method to display updated chart of trains
				System.out.println("-----Goods Train----");
				objOfProcessing.displayAllGoodsTrains(TrainDetails.goodsTrainInfo);           //method to display updated chart of trains
				System.out.println("Press 0 to continue and 1 to exit");
				y=sc.nextInt();
			}
			while(y == 0);
		}catch(InputMismatchException e)
		{
			ErrorPrint.print();     //invokes function of ErrorPrint class to display message

		}catch(Exception e)
		{
			ErrorPrint.print();    //invokes function of ErrorPrint class to display message
		}
		finally
		{
			sc.close();
		}

	}

}
