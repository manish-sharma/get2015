import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
//this class is used to print chart of all the trains
class TrainChart
{
	ArrayList<String> trainInfo=new ArrayList<String>();
	//Iterator<String> itTrainInfo=trainInfo.iterator();
	String trainType,trainNumber;
	private int numberOfSeats;
	public TrainChart(String trainType,ArrayList<String> trainInfo)
	{
		this.trainType=trainType;
		this.trainInfo=trainInfo;
	}
	public void chart()//To show all the trains of either of goods or passangers
	{
		System.out.println("TrainId	From	To	S/W	Ticket	Duration");
		for(int i=0;i<trainInfo.size();i++)
		System.out.println(trainInfo.get(i));
	}
	//this method is used for show the chart of trains after booking
	public void updatedChart(int numberOfSeats,String trainNumber) 
	{
		int i,j;
		if(trainType.equalsIgnoreCase("goods"))
		{
			
			String temp1[]=new String[6];
			StringBuffer sb=new StringBuffer();
			this.numberOfSeats=numberOfSeats;
			this.trainNumber=trainNumber;
			for(i=0;i<trainInfo.size();i++)//Loop for subtracting the number of booked seats
			{
				
				temp1=trainInfo.get(i).split(",");
				if(temp1[0].equalsIgnoreCase(trainNumber)) 
				{
					int hold=Integer.parseInt(temp1[3])-numberOfSeats;
					temp1[3]=Integer.toString(hold);
					break;
				}
			}
			
			try
			{
				FileWriter fw=new FileWriter("Goods.txt");
				for(int k=0;k<trainInfo.size();k++)
				{
					String temp2=trainInfo.get(k);
					if(k==i)
					{
						for(j=0;j<6;j++)
						{
							fw.write(temp1[j]+",");
						}
						fw.write("\n");
					}
					else
						fw.write(temp2+"\n");
				}
				fw.close();
				String line;
				FileReader fr=new FileReader("Goods.txt");
				BufferedReader bf=new BufferedReader(fr);
				while((line=bf.readLine())!=null)
				{
					System.out.println(line);
				}
			}catch(Exception obException){}
			
		}
		else if(trainType.equalsIgnoreCase("Passanger"))
		{
			String temp1[]=new String[6];
			StringBuffer sb=new StringBuffer();
			this.numberOfSeats=numberOfSeats;
			this.trainNumber=trainNumber;
			for(i=0;i<trainInfo.size();i++)
			{
				
				temp1=trainInfo.get(i).split(",");
				if(temp1[0].equalsIgnoreCase(trainNumber)) 
				{
					int hold=Integer.parseInt(temp1[3])-numberOfSeats;
					temp1[3]=Integer.toString(hold);
					break;
				}
			}
			try	
			{
				FileWriter fw=new FileWriter("Passanger.txt");
				for(int k=0;k<trainInfo.size();k++)
				{
					String temp2=trainInfo.get(k);
					if(k==i)
					{
						for(j=0;j<6;j++)
						fw.write(temp1[j]+",");
						fw.write("\n");
					}
					else
						fw.write(temp2+"\n");
				}
				fw.close();
				String line;
				FileReader fr=new FileReader("Passanger.txt");
				BufferedReader bf=new BufferedReader(fr);
				while((line=bf.readLine())!=null)
					System.out.println(line);
				} catch(Exception e) {}
			}
		
	}
}
//this class is used for checking the availability of required seats 
class CheckAvailability
{
	Scanner sc;
	String from,to;
	ArrayList<String> trainInfo=new ArrayList<String>();
	Iterator<String> itTrainInfo=trainInfo.iterator();
	public CheckAvailability(ArrayList<String> trainInfo,String from,String to) 
	{
		this.trainInfo=trainInfo;	
		this.from=from;
		this.to=to;
	}
	public void checkSeatWeight(String from,String to)//to check required trains are available or not 
	{
		int flag=0;
		for(int i=0;i<trainInfo.size();i++)
		{
			String temp[]=trainInfo.get(i).split(",");
			if(temp[1].equalsIgnoreCase(from) && temp[2].equalsIgnoreCase(to))
			{
				System.out.println(trainInfo.get(i));
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Sorry no available train:");
		}	
	}
}
//this class is used for ticket payment
class Payment
{
	Scanner sc=new Scanner(System.in);
	String temp[];
	//ArrayList<String> trainInfo=new ArrayList<String>();
	Payment(String[] temp)
	{
		this.temp=temp;
	}
	public ArrayList<String> paymentType()
	{
		int i=0;
		ArrayList<String> bookingInformation=new ArrayList<String>();
		System.out.println("\n1:CC\n2:Wallet\n3:Net Banking");
		int hold=sc.nextInt();
		switch(hold)
		{
		case 1:System.out.println("\n Enter  CC number");
		String cc=sc.next();
		bookingInformation.add(cc);
		System.out.println("\n Enter cvv number");
		String cvv=sc.next();
		bookingInformation.add(cvv);
		System.out.println("Successful Booking");
		break;
		case 2:System.out.println("Enter amount:");
		int amount=sc.nextInt();
		bookingInformation.add(Integer.toString(amount));
		System.out.println("Successfull Booking");
		break;
		case 3:System.out.println("Enter Bank Name");
		String bankName=sc.next();
		bookingInformation.add(bankName);
		System.out.println("Enter user name:");
		String userName=sc.next();
		bookingInformation.add(userName);
		System.out.println("Enter password:");
		String password=sc.next();
		bookingInformation.add(password);
		System.out.println("Successfull Booking");
		}
		return bookingInformation;
	}
}
//this class is used to hold personal information of user 
class PersonalInformation
{
	private String name;
	public PersonalInformation(String name)
	{
		this.name=name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
class TrainBooking
{
	Scanner sc;
	int flag=0;
	ArrayList<String> paymentInformation;
	String trainNumber,from,to,trainType,name;
	int numberOfSeats;
	ArrayList<String> trainInfo;
	TrainBooking(String trainNumber,int numberOfSeats,ArrayList<String> trainInfo,String from,String to,String trainType,String name)
	{
		this.trainNumber=trainNumber;
		this.numberOfSeats=numberOfSeats;
		this.trainInfo=trainInfo;
		this.from=from;
		this.to=to;
		this.trainType=trainType;
		this.name=name;
	}
	//this method is used for printing the booking information
	public void booking()
	{
		try
		{
			for(int i=0;i<trainInfo.size();i++)
			{
				String temp[]=trainInfo.get(i).split(",");
				if(temp[0].equalsIgnoreCase(trainNumber) && Integer.parseInt(temp[3])>=numberOfSeats)
				{
					PersonalInformation pInformation=new PersonalInformation(name);
					System.out.print("Payment Detail");
					Payment payment=new Payment(temp);
					paymentInformation=payment.paymentType();
					System.out.println("Deatail:"+name+paymentInformation);
					flag++;
					TrainChart trainChart=new TrainChart(trainType, trainInfo);
					trainChart.updatedChart(numberOfSeats,trainNumber);
				}
			}
		}catch(Exception e){}
		if(flag==0)
		{
			System.out.println("sorry no seats available");
		}
		//return paymentInformation;
	}
}
//main class for train reservation
public class TrainReservation  
{
	public static void main(String args[])throws FileNotFoundException,NullPointerException,IOException
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader bfTrain;
		String line;
		String name,trainType,from,to;
		
		while(true)
		{
			System.out.println("1:login\n2:exit");
			int hold=sc.nextInt();
			switch(hold)
			{
			case 1:	ArrayList<String> trainInfo=new ArrayList<String>();
				    FileReader finGoodsTrain=new FileReader("Goods.txt");
				    FileReader finPasangerTrain=new FileReader("Passanger.txt");
				    System.out.println("Enter Name");
					name=sc.next();
					TrainChart trainchart;
					System.out.println("Enter Train Type Passanger/Goods");
					trainType=sc.next();
					if(trainType.equalsIgnoreCase("passanger"))//to check either the train is passenger type or goods type
					{
						bfTrain=new BufferedReader(finPasangerTrain);
						while((line=bfTrain.readLine())!=null)
						{
							trainInfo.add(line);
						}
					}
					else if(trainType.equalsIgnoreCase("goods"))
					{
						bfTrain=new BufferedReader(finGoodsTrain);
						while((line=bfTrain.readLine())!=null)
						{
							trainInfo.add(line);
						}
					}
					TrainChart trainChart=new TrainChart(trainType,trainInfo);
					trainChart.chart();//to call chart function of TrainChart class
					System.out.println("Enter source station");
					from=sc.next();
					System.out.println("Enter destination station");
					to=sc.next();
					CheckAvailability check=new CheckAvailability(trainInfo,from,to);
					check.checkSeatWeight(from, to);
			
					System.out.println("Enter train id");
					String trainId=sc.next();
					System.out.print("Enter Number of seats");
					int numberOfSeats=sc.nextInt();
					TrainBooking trainBooking=new TrainBooking(trainId,numberOfSeats,trainInfo,from,to,trainType,name);
					PersonalInformation personalInformation=new PersonalInformation(name);
					trainBooking.booking();
					break;
				case 2:System.exit(0);//case for exit from system
				}
		}
		
	}
}
	
