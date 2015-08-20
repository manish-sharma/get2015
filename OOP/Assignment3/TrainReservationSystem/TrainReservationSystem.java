/****************************************************************************************
Name            : TrainReservationSystem
Revision Log    : 2015-08-18: Babalu patidar : created.
                : 
Use             : This class is used implement train reservation system.
                :
****************************************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;


public class TrainReservationSystem {
	//Start of main method
	//@param trainType :specify type of train
	//@param train no. :specify Number of train
	//@param from :specify source station
	//@param to :specify destination station
	public static void main(String arg[]){
		
		String trainType="";
		String trainno = null;
		int amount =999;
		String from;
		int flag=1;
		String to;
		String passcsvFile ="C:/Users/Babalu/workspace/OOP3/src/passangerInput.txt";
		String goodscsvFile="C:/Users/Babalu/workspace/OOP3/src/goodsInput.txt";
		String csvFile="";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		int count=0;
		Scanner scan=new Scanner(System.in);
		HashMap<String, String[]> hash = new HashMap<String, String[]>();
		String hashKey="";
		HashMap<String, String[]> hashtrain=new HashMap<String, String[]>();
		String hashtrainKey="";
		while(flag==1)
		{ 
			flag=0;
			count=0;
			System.out.println("Enter Train Type For Passanger 'P' and For Goods 'G':");
			trainType=scan.next();
			//Condition of Enter value is p or g
			if(trainType.equalsIgnoreCase("p")||trainType.equalsIgnoreCase("g")){
				csvFile=trainType.equalsIgnoreCase("p") ? passcsvFile :goodscsvFile;
				try {
					br = new BufferedReader(new FileReader(csvFile));
					//While loop read file.
					while ((line = br.readLine()) != null) {
						String[] trainsInfo = line.split(cvsSplitBy);
						if(count==0||Integer.parseInt(trainsInfo[4])>0){
							count++;
							System.out.println(" "+ trainsInfo[0]+ "\t" + trainsInfo[1] + " \t"+trainsInfo[2] + " \t"+trainsInfo[3]+" \t" +trainsInfo[4]+" \t" +trainsInfo[5]+" \t" +trainsInfo[6]);
							hashKey=trainsInfo[2].trim()+ "-"+trainsInfo[3].trim();
							hash.put(hashKey,trainsInfo);
							hashtrainKey=trainsInfo[1].trim();
							hashtrain.put(hashtrainKey,trainsInfo);
						}
					}
					System.out.print("Enter From : ");
					from=scan.next(); 
					System.out.print("Enter To : ");
					to=scan.next();
					
					hashKey=from.trim()+"-"+to.trim();
					if(hash.containsKey(hashKey)==true)
					{
						String out[]=hash.get(hashKey);
						System.out.println(" \t" + out[1] + " \t"+out[2] + " \t"+out[3]+" \t" +out[4]+" \t" +out[5]+" \t" +out[6]);
						System.out.print("Enter Train Number : ");
						try{
							trainno=scan.next(); 
							System.out.print("Enter Seat/Weight Required : ");
							amount=scan.nextInt();
						}
						catch(Exception e){
							System.out.println("Please Enter Integer value");
						}
						
						hashtrainKey=trainno.trim();
						//while loop find train that has train number as given
						if(hashtrain.containsKey(hashtrainKey)){
					
							
							String trains[] = hashtrain.get(hashtrainKey);
							if(Integer.parseInt(trains[4].trim())>=amount){
								new PaymentMode().makePaymentAndPrintTicket(trains[1], amount,trainType,Integer.parseInt(trains[6].trim()),scan);
								new UpdateTrainList().updateTrainList(trains, amount, csvFile,Integer.parseInt(trains[0].trim()));
							}
							else{
								System.out.println("Seat/Weight is not avialable");
							}
								
						}
						else {
							System.out.println("You have enterd wrong Train number");
						}
					}
					else{
						System.out.println("No train available ");
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else{
				System.out.println("Please Enter P / G");
			}
			System.out.println("\n\nAre You Want TO Book Ticket Again Press 1");
			try{
				if(Integer.parseInt(scan.next().trim())==1){
					flag=1;
				}
				else{
					System.out.println("Thanks for booking");
				}
			}
			catch(Exception e)
			{
				System.out.println("Thanks for booking");
			}
		}
		//End of while loop
		scan.close();
			
	}
	//End of main method
}
//End of TrainReservationSystem class
