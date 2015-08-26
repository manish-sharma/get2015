/*Reservation Application

 *which will show the Available trains
 * then if required train with required weight or seats is 
 * available then book the ticket and show ticket for the user
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
interface Payment
{
	public void pay(String paymentMode,long paidAmount);
	//public void paymentDeatils();
}

/*this class will read trains details 
 * from text files
 */
class Trains
{

	 FileReader trainsFile;
	 BufferedReader trainsBufferReader;
	 
	 /*this method will get goods trains details from file
	  * 
	  */
	public String[] goodsTrain() throws IOException
   {
		String[] goodsTrainsList;
	{
		int count=0;
		trainsFile=new FileReader("C:/Users/Pooja/OOPs-File/Goods_Trains_Info.txt");
		trainsBufferReader=new BufferedReader(trainsFile);
         goodsTrainsList=new String[15];
		 while(count!=15) {
			 String line = trainsBufferReader.readLine();
			 goodsTrainsList[count]=line;
			 count++;
		 }
	}
	return goodsTrainsList;
   }	
	
	 /*this method will get passengers trains details from file
	  * 
	  */
	public String[] passengerTrain() throws IOException
	   {
		    String[] passengerTrainsList;
		{
			int count=0;
			trainsFile=new FileReader("C:/Users/Pooja/OOPs-File/Passengers_Trains_Info.txt");
			trainsBufferReader=new BufferedReader(trainsFile);
			 passengerTrainsList=new String[15];
			 while(count!=15) {
				 	String line = trainsBufferReader.readLine();
			        passengerTrainsList[count]=line;
				    count++;
			 }
		}
		return passengerTrainsList;
	   }	
	}

/*this class will set the user and user's payement details
 * 
 */
class User implements Payment
{

	String trainType,trainId,name,paymentMode;
	long bookedSeatsOrWeight;
	long paidAmount;
	@Override
	public void pay(String paymentMode,long paidAmount ) {
		this.paymentMode=paymentMode;
	    this.paidAmount=paidAmount;
	}
	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}
	public void setBookedSeatsOrWeight(long bookedSeatsOrWeight) {
		this.bookedSeatsOrWeight = bookedSeatsOrWeight;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public void setName(String name) {
		this.name = name;
	}
}

/*This is Main class which will get the required  information for ticket booking from user and then 
 * if required train with required seats or weight  is  available then calculate ticket price and print ticket 
 */
public class Reservation_System
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int flag10=0;
		int flag12=0;
		  String[] passengerTrainsList=new String[15];
		  String[] goodsTrainsList=new String[15];
		  String trainId = null;
		while(flag10==0)
		{
		      System.out.println("Enter User/Passenger Name");
		        String name=scan.nextLine();
		          System.out.println("Which Train You Have Required?\nEnter 1 for Goods Train Or Enter 2 for Passenger Train");
		          Trains trains=new Trains();
		          int flag=0;
		          long weight=0,seats=0; 
		          long costPerKg=0,costPerPerson=0;
		          long paidAmount;
		          String from_to="";
		          String trainType=new String();
		          String flag8="0";
		          ArrayList<String> availableTrainsList=new ArrayList<String>();
		          User user=new User();
		       		    	   while(flag==0)
		          {
			            trainType=scan.nextLine();
		                if(trainType.equalsIgnoreCase("1"))
		                {
		    	             flag=1;
		    	             goodsTrainsList=trains.goodsTrain();
		                }
		                else if(trainType.equalsIgnoreCase("2"))
		                {
		    	             flag=1;
		    	             passengerTrainsList=trains.passengerTrain();
		                }
		                else
		                {
		    	              System.out.println("Please Enter 1 for Goods Train Or Enter 2 for Passenger Train");
		                }
		           } 
		 while(flag8.equalsIgnoreCase("0")) 
		     {
		     		  String flag1="0";
                  while(flag1.equalsIgnoreCase("0"))
		          {
		                   if(trainType.equalsIgnoreCase("1"))
	                       {
	    	                    for(int i=0;i<goodsTrainsList.length;i++)
	    	                    System.out.println(goodsTrainsList[i]);
	                       }
		
		                   else if(trainType.equalsIgnoreCase("2"))
	                       {
	    	                     for(int i=0;i<passengerTrainsList.length;i++)
	    	                     System.out.println(passengerTrainsList[i]);
	                       }
		
		                   System.out.println("\nEnter from_station To to_Station" );
		                   from_to=scan.nextLine();
		                   if(trainType.equalsIgnoreCase("1"))
	                       {
			                     int i,p;
			                     for( i=1;i<15;i=i+5)
			                      {  
				                        p=i;
				                        if(from_to.equalsIgnoreCase(goodsTrainsList[i]))
				                        {
					                         flag1="1";
					                         System.out.println(goodsTrainsList[p-1]);
					                         System.out.println(goodsTrainsList[i]);
					                         availableTrainsList.add(goodsTrainsList[p-1]);
				                         }
			                       }
			                       if(flag1.equalsIgnoreCase("0"))
			                       {
				                            System.out.println("\n"+from_to+" train is not available");
				                            System.out.println("\nAvailable Trains Are : \n");
				                  }
	                        }
		                   else if(trainType.equalsIgnoreCase("2"))
	                       {
			                     int i,p;
			                     for( i=1;i<15;i=i+5)
			                     {
				                      p=i;
				                      if(from_to.equalsIgnoreCase(passengerTrainsList[i]))
				                      {
					                         flag1="1";
					                         System.out.println(passengerTrainsList[p-1]);
					                         System.out.println(passengerTrainsList[i]);
					                         availableTrainsList.add(passengerTrainsList[p-1]);
				                      }
			                      }
			                      if(flag1.equalsIgnoreCase("0"))
			                      {
				                      System.out.println("\n"+from_to+" train is not available");
				                      System.out.println("\nAvailable Trains Are : \n");
					              }
	                        }
		               } //while flag1 end
		                   int trainIdPos=0;
		                   int   existenceWeight=0,existenceWeight1=0;
		                   String existenceId=new String();
		                   String existenceId1=new String();
		                   String existenceId2=new String();
		                   StringTokenizer stringTokenizer, stringTokenizer1, stringTokenizer2;
		                   int existenceSeats=0;
		                   int flag3=0;
		                   int flag6=0;
		                   if(flag1.equalsIgnoreCase("1"))
		                   {
			                    if(trainType.equalsIgnoreCase("1"))
			                      {              
			                    	while(flag3==0)
				                      {
				                                System.out.println("Which train you will prefer,Enter Train Id  " );
					                            trainId=scan.nextLine();
					                            System.out.println("How Much weight you want to carry");
					                            weight=Integer.parseInt(scan.nextLine());
					                            int p,q;
					                            for(int i=0;i<15;i=i+5)
					                            {
						                              p=i;
						                              int h=i;
						                              if(goodsTrainsList[h+1].equalsIgnoreCase(from_to))
						                              {
							                               stringTokenizer=new StringTokenizer(goodsTrainsList[i],"Train-");
							                               while(stringTokenizer.hasMoreTokens())
							                               {
								                                existenceId=stringTokenizer.nextToken();
							                               }
							                               if(existenceId.equalsIgnoreCase(trainId))
							                               {
									                             flag3=1;
									                             trainIdPos=i;;
								                                 p=p+2;
									                             stringTokenizer=new StringTokenizer(goodsTrainsList[p],"Weight-Kg");
									                             while(stringTokenizer.hasMoreTokens())
									                             {
										                                String availableWeight=stringTokenizer.nextToken();
									                                    existenceWeight=Integer.parseInt(availableWeight);
									                             }
									                             if(weight<=existenceWeight)
									                             {
										                               System.out.println("To confirm booking,pay amount:\nSelect PAYMENT MODE:Credit Card/Wallet/Net Banking");
										                               while(flag6==0)
										                               {
										                            	   String  paymentMode=scan.nextLine();
											                                 if(paymentMode.equalsIgnoreCase("Credit Card")||paymentMode.equalsIgnoreCase("Wallet")
													                                           ||paymentMode.equalsIgnoreCase("Net Banking"))
											                                 {
												                                        flag6=1;
												                                        stringTokenizer=new StringTokenizer(goodsTrainsList[trainIdPos+3],"Cost-/-");
												                                        while(stringTokenizer.hasMoreTokens())
												                                        {
														                                       costPerKg=Integer.parseInt(stringTokenizer.nextToken());
												                                        }
												                                        paidAmount=costPerKg*weight;
												                                        user.pay(paymentMode,paidAmount);
												                                        user.setName(name);
												                                        user.setTrainId(trainId);
												                                        user.setTrainType(trainType);
												                                        user.setBookedSeatsOrWeight(weight);
											                                  }	
											                                  else
										                                                System.out.println("Payment Modes are only Credit Card/Wallet/Net Banking");
										                                }
								                                  }
									                              else
									                              {
										                                   flag3=0;
										                                   System.out.println(weight+" Kg is not available in train-"+trainId);
										                                   System.out.println("SUITABLE TRAINS ARE :");
										                                   for(i=0;i<availableTrainsList.size();i++)
										                                   {
											                                     stringTokenizer1=new StringTokenizer(availableTrainsList.get(i),"Train-");
											                                     while(stringTokenizer1.hasMoreTokens())
											                                     {
													                                   existenceId1=stringTokenizer1.nextToken();
											                                     }
											                                     for(int j=0;j<15;j=i+5)
											                                     {
													                                      q=j;
													                                      stringTokenizer2=new StringTokenizer(goodsTrainsList[j],"Train-");
													                                      while(stringTokenizer2.hasMoreTokens())
													                                      {
														                                      existenceId2=stringTokenizer2.nextToken();
													                                      }
													                                      if(existenceId1.equalsIgnoreCase(existenceId2))
													                                      {
														                                         q=q+2;
														                                         stringTokenizer=new StringTokenizer(goodsTrainsList[q],"Weight-Kg");
														                                         while(stringTokenizer.hasMoreTokens())
														                                         {
															                                           String availableWeight1=stringTokenizer.nextToken();
															                                           existenceWeight1=Integer.parseInt(availableWeight1);
														                                         }
														                                         if(weight<=existenceWeight1 && !availableTrainsList.get(i).equalsIgnoreCase(goodsTrainsList[trainIdPos]))
														                                         {
															                                                flag12=1;
															                                                System.out.println(availableTrainsList.get(i));
														                                         }
													                                        } 
											                                        }
										                                      } 
										                                      if(flag12==0)
										                                      {
											                                            flag3=1;
											                                            System.out.println(" Train for "+weight+"Kg is not available");
										                                       }
										                                       else
										                                                 System.out.println("Enter Train id From Suitable Train List ");
										    	                  }
							                                 }
							                                 else
							                                 {
							                                	    System.out.println(trainId+" is not available for "+from_to+ " Enter other train id\n");
							                                	    flag3=2;
							                                 }	    
						                              } 
					                            } 
				                            }  
			                            } 
		                                  
			                          else if(trainType.equalsIgnoreCase("2"))
		                              {              
				
				                        while(flag3==0)
			                            {
			                                System.out.println("Which train you will prefer,Enter Train Id  " );
				                            trainId=scan.nextLine();
				                            System.out.println("How Many Seats Are Required");
				                            seats=Integer.parseInt(scan.nextLine());
				                            int p,q;
				                            for(int i=0;i<15;i=i+5)
				                            {
					                              p=i;
					                              int h=i;
					                              if(passengerTrainsList[h+1].equalsIgnoreCase(from_to))
					                              {
						                               stringTokenizer=new StringTokenizer(passengerTrainsList[i],"Train-");
						                               while(stringTokenizer.hasMoreTokens())
						                               {
							                                existenceId=stringTokenizer.nextToken();
						                               }
						                               if(existenceId.equalsIgnoreCase(trainId))
						                               {
								                             flag3=1;
								                             trainIdPos=i;;
							                                 p=p+2;
								                             stringTokenizer=new StringTokenizer(passengerTrainsList[p],"SeatsAvailable-");
								                             while(stringTokenizer.hasMoreTokens())
								                             {
									                                String availableSeats=stringTokenizer.nextToken();
								                                    existenceSeats=Integer.parseInt(availableSeats);
								                             }
								                             if(seats<=existenceSeats)
								                             {
									                               System.out.println("To confirm booking,pay amount:\nSelect PAYMENT MODE:Credit Card/Wallet/Net Banking");
									                               while(flag6==0)
									                               {
									                            	   String paymentMode=scan.nextLine();
										                                 if(paymentMode.equalsIgnoreCase("Credit Card")||paymentMode.equalsIgnoreCase("Wallet")
												                                           ||paymentMode.equalsIgnoreCase("Net Banking"))
										                                 {
											                                        flag6=1;
											                                        stringTokenizer=new StringTokenizer(passengerTrainsList[trainIdPos+3],"Cost-/-");
											                                        while(stringTokenizer.hasMoreTokens())
											                                        {
													                                       costPerPerson=Integer.parseInt(stringTokenizer.nextToken());
											                                        }
											                                        paidAmount=costPerPerson*seats;
											                                        user.pay(paymentMode,paidAmount);
											                                        user.setName(name);
											                                        user.setTrainId(trainId);
											                                        user.setTrainType(trainType);
											                                        user.setBookedSeatsOrWeight(seats);
										                                  }	
										                                  else
									                                                System.out.println("Payment Modes are only Credit Card/Wallet/Net Banking");
									                                }
							                                  }
								                              else
								                              {
									                                   flag3=0;
									                                   System.out.println(seats+" are not available in train-"+trainId);
									                                   System.out.println("SUITABLE TRAINS ARE :");
									                                   for(i=0;i<availableTrainsList.size();i++)
									                                   {
										                                     stringTokenizer1=new StringTokenizer(availableTrainsList.get(i),"Train-");
										                                     while(stringTokenizer1.hasMoreTokens())
										                                     {
												                                   existenceId1=stringTokenizer1.nextToken();
										                                     }
										                                     for(int j=0;j<15;j=i+5)
										                                     {
												                                      q=j;
												                                      stringTokenizer2=new StringTokenizer(passengerTrainsList[j],"Train-");
												                                      while(stringTokenizer2.hasMoreTokens())
												                                      {
													                                      existenceId2=stringTokenizer2.nextToken();
												                                      }
												                                      if(existenceId1.equalsIgnoreCase(existenceId2))
												                                      {
													                                         q=q+2;
													                                         stringTokenizer=new StringTokenizer(passengerTrainsList[q],"SeatsAvailable-");
													                                         while(stringTokenizer.hasMoreTokens())
													                                         {
														                                           String availableSeats1=stringTokenizer.nextToken();
														                                           existenceWeight1=Integer.parseInt(availableSeats1);
													                                         }
													                                         if(seats<=existenceWeight1 && !availableTrainsList.get(i).equalsIgnoreCase(passengerTrainsList[trainIdPos]))
													                                         {
														                                                flag12=1;
														                                                System.out.println(availableTrainsList.get(i));
													                                         }
												                                        } 
										                                        }
									                                      } 
									                                      if(flag12==0)
									                                      {
										                                            flag3=1;
										                                            System.out.println(seats+" are not available in any Train");
									                                       }
									                                       else
									                                                 System.out.println("Enter Train id From Suitable Train List ");
									    	                  }
						                                 }
						                                 else
						                                 {
						                                	    System.out.println(trainId+" is not available for "+from_to+ " Enter other train id\n");
						                                	    flag3=2;
						                                 }	    
					                              } 
				                            } 
			                            }  
		                            } 
	                            }      
		
  	    
                            if(flag3==2)
	                        {
					             System.out.println("Available Trains Are :\n ");
		                    } 
		                }  
		if(flag12==1)
		{
		 	System.out.println("OUTPUT Ticket REPORT : ");
		 	System.out.println("Name : "+user.name);
		 	System.out.println("TrainType : "+user.trainType);
		 	System.out.println("TrainId : "+user.trainId);
		 	System.out.println("No.Of Booked Seats : "+user.bookedSeatsOrWeight);
		 	System.out.println("Payment Mode : "+user.paymentMode);
		 	System.out.println("Payed Amount : "+user.paidAmount);
		 }
		
		/*print ticket for goods trains
		 * 
		 */
		if(trainType.equalsIgnoreCase("1"))
		{
			for(int i=0;i<15;i=i+5)
			{
				int p=i;
				long W=0;
				String reducedWeight;
				String Id="";
				StringTokenizer stringTokenizer=new StringTokenizer(goodsTrainsList[i],"Train-");
				while(stringTokenizer.hasMoreTokens())
				{
					Id=stringTokenizer.nextToken();
				}
				if(Id.equalsIgnoreCase(trainId))
				{
					p=p+2;
					StringTokenizer stringTokenizer1=new StringTokenizer(goodsTrainsList[p],"Weight-");
					while(stringTokenizer1.hasMoreElements())
					{
						W=Integer.parseInt(stringTokenizer.nextToken());
					}
					W=W-weight;
					reducedWeight=String.valueOf(W);
					goodsTrainsList[i]="Weight-"+reducedWeight+"Kg";
				}
			}
		}
		
		/*print ticket for passengers trains
		 * 
		 */
		else if(trainType.equalsIgnoreCase("2"))
		{
			for(int i=0;i<15;i=i+5)
			{
				int p=i;
				long S=0;
				String reducedSeats;
				String Id="";
				StringTokenizer stringTokenizer=new StringTokenizer(passengerTrainsList[i],"Train-");
				while(stringTokenizer.hasMoreTokens())
				{
					Id=stringTokenizer.nextToken();
				}
				if(Id.equalsIgnoreCase(trainId))
				{
					p=p+2;
					StringTokenizer stringTokenizer1=new StringTokenizer(passengerTrainsList[p],"SeatsAvailable-");
					while(stringTokenizer1.hasMoreElements())
					{
						S=Integer.parseInt(stringTokenizer.nextToken());
					}
					S=S-weight;
					reducedSeats=String.valueOf(S);
					passengerTrainsList[i]="SeatsAvailable-"+reducedSeats;
				}
		    }
		}
		System.out.println("\nIf More Users or Passengers  are there than press 0 \n Exit from Application  if no more participants are there -Press Any key");
		     if ((Integer.parseInt(scan.next())!=0)) 
		     {
					System.out.println("\nAre You Really Want to Exit From Application ? yes/no");
					if (scan.next().equalsIgnoreCase("no"))
					{
						flag10 = 0;;
					}
					else
					{
						flag10 = 1;
					}
		        
		     } 
		}
		   }
	}



