package CarServiceAppointmentSystem;

import java.util.*;

public class Main 

{
	static int toatalEarning(int Sedan,int SUV,int Hatchbak)
	{
		return (Sedan*3000+SUV*5000+Hatchbak*2000);
	}

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Mechanic> mch=new ArrayList<Mechanic>();  //Defining array list of mechanic type which is fix in a service center
		
		mch.add(new Mechanic("Ravi","Sedan",3000,0));
		mch.add(new Mechanic("Raju","Sedan",3000,0));
		mch.add(new Mechanic("Jack","Sedan",3000,0));
		mch.add(new Mechanic("Manish","Suv",5000,0));
		mch.add(new Mechanic("Sonu","Suv",5000,0));
		mch.add(new Mechanic("Alex","Suv",5000,0));
		mch.add(new Mechanic("Ali","Hatchbak",2000,0));
		mch.add(new Mechanic("Veer","Hatchbak",2000,0));
		mch.add(new Mechanic("Naveen","Hatchbak",2000,0));
		mch.add(new Mechanic("Prem","Sedan",3000,0));
		
		
		ArrayList<Car>  cr=new ArrayList<Car>();
		
		int flag=1,sed=0,su=0,hat=0;                  //variables used to count no of cars
		String CarNumber,CarType;
		
		java.util.Iterator<Mechanic> itr=mch.iterator();
		
		System.out.println("Enter car Detail for Servicing: ");
		try
		{
		while(flag==1 && itr.hasNext())                  //loop for next user input of car servicing
		{
			System.out.println("Car Number: ");
			CarNumber=sc.next();
			
			System.out.println("Car Type(Sedan/ SUV/ Hatchbak): ");
			CarType=sc.next();
			
			
			 while(itr.hasNext())                       //loop to check weather mechanic available or not
			  {
				Mechanic mc=itr.next();
				
				if(mc.ServiceType.equalsIgnoreCase(CarType) && mc.avai==0)    //  base condition of car type and service type by each mechanic
				{
				Car  ref=new Car(CarNumber, CarType, mc.Name);
				cr.add(ref);
				mc.avai=1;
				
				if(mc.ServiceType.equalsIgnoreCase("Sedan"))    //counting number of car by type
				   {
					sed++;
				//	System.out.println("sed"+sed);
				   }
				else if(mc.ServiceType.equalsIgnoreCase("SUV"))   //counting number of car by type
				   {
					su++;
				//	System.out.println("su"+su);
				   }
				else if(mc.ServiceType.equalsIgnoreCase("Hatchbak"))  //counting number of car by type
				    {
					hat++;
				//	System.out.println("hat"+hat);
				    }
				else 
				    {
					System.out.println("We not provide service to other type of cars");
				    }
				 break;
			     }
				
			  }
				
		    System.out.println("Enter 1 if you want to continue otherwise 0: ");
		    flag=sc.nextInt();
		 }
		 
		int earn=toatalEarning(sed,su,hat);    //calculating total earning
		
	
		System.out.println("Cars serviced of Each type\nSedan : "+sed+"\nSUV : "+su+"\nHatchbak : "+hat);
		
		System.out.println("Total Earning : "+earn);
		
		}
		catch(Exception e)
		{
		   System.out.print(e);
		}
     sc.close();
	}

}
