import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Sumitra
 *this is the main class which will do all the functionality.
 */
public class UserInput {
	public static void main(String arg[]) {
		FetchTrainFromFile.fetch();
		Scanner scanner = new Scanner(System.in);

		char contiunebook;
		do {
			System.out.println("enter name");
			String name = scanner.next();
			System.out.println("enter the type you want \npassanger \ngoods");
			String type = scanner.next();
			int flag = 0;
			int i = 0;
			if (type.equals("passanger")){
				//to print all available train for passengers
				Iterator<PassangerTrain> itrb = FetchTrainFromFile.passangerList
						.iterator();
				while (itrb.hasNext()) {
					PassangerTrain passanger = itrb.next();
					if (i == 0) {
						System.out
								.println("SOURCE 		DESTINATION		TRAIN NO		SEATS		PRICE");
						i++;
					}
					System.out.println(passanger.getFrom() + "		 "
							+ passanger.getTo() + "		 "
							+ passanger.getTrainNumber() + " 		"
							+ passanger.getAvailableSeat() + " 		"
							+ passanger.getPrice());
				
				
				}
			}
			else{
				//to print all train for passenger.
				Iterator<GoodsTrain> itrb = FetchTrainFromFile.goodsList
						.iterator();
				while (itrb.hasNext())
				{
					GoodsTrain goods = itrb.next();
					if (i == 0) {
						System.out
								.println("SOURCE 		DESTINATION		TRAIN NO		SEATS		PRICE");
						i++;
					}
					System.out.println(goods.getFrom() + "		 "
							+ goods.getTo() + "		 "
							+ goods.getTrainNumber() + " 		"
							+ goods.getAvailableWeight() + " 		"
							+ goods.getPrice());
				
				}
			}
			System.out.println("enter the source place");
			String source = scanner.next();
			System.out.println("enter destination place");
			String destination = scanner.next();
			int wantedSeat = 0;
			
			UserInformation user = new UserInformation(source, destination,
					type, wantedSeat, name);
			if (type.equals("passanger")) {
				Iterator<PassangerTrain> itr = FetchTrainFromFile.passangerList
						.iterator();
				while (itr.hasNext()) {

					PassangerTrain passanger = itr.next();
					if (user.getFrom().equals(passanger.getFrom())
							&& user.getTo().equals(passanger.getTo())) {
						//to print all the trains available from source to destination.

						if (i == 0) {
							System.out
									.println("SOURCE 		DESTINATION		TRAIN NO		SEATS		PRICE");
							i++;
						}
						System.out.println(passanger.getFrom() + "		 "
								+ passanger.getTo() + "		 "
								+ passanger.getTrainNumber() + " 		"
								+ passanger.getAvailableSeat() + " 		"
								+ passanger.getPrice());
						flag = 1;
					}
				}
				if(flag==1)
				{
				Iterator<PassangerTrain> itrt = FetchTrainFromFile.passangerList
						.iterator();

				System.out
						.println("enter the Train number in which you want to travel");
				int trainNum = scanner.nextInt();
				while (itrt.hasNext()) {

					PassangerTrain passanger = itrt.next();

					if (user.getFrom().equals(passanger.getFrom())
							&& user.getTo().equals(passanger.getTo())
							&& trainNum == passanger.getTrainNumber()) {

						System.out
								.println("no of seat/weight you want to send");
						wantedSeat = scanner.nextInt();
						user.setWantedSeat(wantedSeat);
						if (0 <= passanger.getAvailableSeat()
								- user.getWantedSeat()) {
							passanger.setAvailableSeat(passanger
									.getAvailableSeat() - user.getWantedSeat());
							flag = 1;
							System.out
									.println("know you can proceed for payment you seats are available");
							System.out.println("enter the mode of payment");
							System.out.println("1 for credit card");
							System.out.println("2 for wallet");
							System.out.println("3 for net banking");
							System.out.println("enter your choice");
							int choice = scanner.nextInt();
							Payment pay = new Payment();
							if (choice == 1) {
								pay.creditCard(user.getWantedSeat()
										* passanger.getPrice());
							} else if (choice == 2) {
								pay.wallet(user.getWantedSeat()
										* passanger.getPrice());
							} else if (choice == 3) {
								pay.netBanking(user.getWantedSeat()
										* passanger.getPrice());
							} else {
								System.out.println("you enterd a wrong choice");
							}
							System.out.println("----DETAILS--------");
							System.out.println("NAME---			" + user.getName());
							System.out.println("TYPE---			" + user.getType());
							System.out.println("SOURCE---		" + user.getTo());
							System.out.println("DESTINATION---		"
									+ user.getFrom());
							System.out.println("SEATS--- 		"
									+ user.getWantedSeat());
							System.out.println("AMOUNT--- 		"
									+ user.getWantedSeat()
									* passanger.getPrice());
						} else {
							System.out.println("seats are not available");
						}
					}
				}
				}
					else if (flag == 0) {
							System.out.println("no trains are avilable");
						}
					
						
					
			} else {
				Iterator<GoodsTrain> itr = FetchTrainFromFile.goodsList
						.iterator();
				while (itr.hasNext()) {

					GoodsTrain goods = itr.next();
					if (user.getFrom().equals(goods.getFrom())
							&& user.getTo().equals(goods.getTo())) {
						//to print all train available from source to destination

						if (i == 0) {
							System.out
									.println("SOURCE 		DESTINATION		TRAIN NO		SEATS		PRICE");
							i++;
						}
						System.out.println(goods.getFrom() + "		 "
								+ goods.getTo() + "		 "
								+ goods.getTrainNumber() + " 		"
								+ goods.getAvailableWeight() + " 		"
								+ goods.getPrice());
						flag = 1;
					}
				}
				if(flag==1){
				Iterator<GoodsTrain> itrt = FetchTrainFromFile.goodsList
						.iterator();

				System.out
						.println("enter the Train number in which you want to travel");
				int trainNum = scanner.nextInt();
				while (itrt.hasNext()) {

					GoodsTrain goods = itrt.next();

					if (user.getFrom().equals(goods.getFrom())
							&& user.getTo().equals(goods.getTo())
							&& trainNum == goods.getTrainNumber()) {

						System.out
								.println("no of seat/weight you want to send");
						wantedSeat = scanner.nextInt();
						user.setWantedSeat(wantedSeat);
						if (0 <= goods.getAvailableWeight()
								- user.getWantedSeat()) {
							goods.setAvailableWeight(goods.getAvailableWeight()
									- user.getWantedSeat());
							flag = 1;
							System.out
									.println("know you can proceed for payment you seats are available");
							System.out.println("enter the mode of payment");
							System.out.println("1 for credit card");
							System.out.println("2 for wallet");
							System.out.println("3 for net banking");
							System.out.println("enter your choice");
							int choice = scanner.nextInt();
							Payment pay = new Payment();
							if (choice == 1) {
								pay.creditCard(user.getWantedSeat()
										* goods.getPrice());
							} else if (choice == 2) {
								pay.wallet(user.getWantedSeat()
										* goods.getPrice());
							} else if (choice == 3) {
								pay.netBanking(user.getWantedSeat()
										* goods.getPrice());
							} else {
								System.out.println("you enterd a wrong choice");
							}
							System.out.println("----DETAILS--------");
							System.out.println("NAME---			" + user.getName());
							System.out.println("TYPE---			" + user.getType());
							System.out.println("SOURCE---		" + user.getTo());
							System.out.println("DESTINATION---		"
									+ user.getFrom());
							System.out.println("SEATS--- 		"
									+ user.getWantedSeat());
							System.out.println("AMOUNT--- 		"
									+ user.getWantedSeat() * goods.getPrice());
						} else {
							System.out.println("seats are not available");
						}
					}
				}
				}else

						if (flag == 0) {
							System.out.println("no trains are avilable");
						}
					
			}
			System.out.println("Do you want to book again ");
			System.out.println("enter Y for yes");
			System.out.println("enter N for No");
			contiunebook = scanner.next().charAt(0);
		} while (contiunebook == 'Y');

		scanner.close();
	}

}
