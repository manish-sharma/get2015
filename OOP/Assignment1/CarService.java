/****************************************************************************************
Name            : CarService
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to implement Car Station Service.
                :
****************************************************************************************/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CarService {
	
	public static ArrayList<Mechanic> mech = new ArrayList<Mechanic>();
	public static ArrayList<Car> car = new ArrayList<Car>();
	
	//ShowAllocation Method is used to show which car is assigned to whom and which is not alloted.
	//Iterator is used to access all car list
	public void showAllocation() {
		Iterator<Car> iterator = ((ArrayList<Car>) car).iterator();
		do {
			Car cobject = iterator.next();
			String cId = cobject.carId;
			String mName = cobject.Mname;
			String cType=cobject.type;
			System.out.println("Car Id--> " + cId + " ( "+cType +" ) "+" is allocated to Mechanic - " + mName);

		}while (iterator.hasNext());

	}
	//End of showAllocation method
	
	
	//Start of main method
	//@param String flag:flag is used for checking new car
	//@param Integer sedan: Specify number of sedan
	//@param Integer suv: Specify number of suv
	//@param Integer hatchback: Specify number of hatchback
	//@param Integer totalEarning: Specify total earning of all cars
	public static void main(String args[]) {
		
		String flag ="0";
		int sedan=0;
        int suv=0;
        int hatchback=0;
        int totalEarning=0;
		Scanner sc = new Scanner(System.in);
		//Add all available mechanics in list mechanic
		mech.add(new Mechanic("Ravi", "Sedan", 3000, 0));
		mech.add(new Mechanic("Sonu", "SUV", 5000, 0));
		mech.add(new Mechanic("Sunil", "HatchBack", 2000, 0));
		mech.add(new Mechanic("Ram", "Sedan", 3000, 0));
		mech.add(new Mechanic("Shayam", "SUV", 5000, 0));
		mech.add(new Mechanic("Mohan", "HatchBack", 2000, 0));
		mech.add(new Mechanic("John", "SUV", 5000, 0));
		mech.add(new Mechanic("James", "Sedan", 3000, 0));
		mech.add(new Mechanic("Lee", "HatchBack", 2000, 0));
		
		//While loop takes input from user and store value in car list
		while (flag.equals("0")) {
	        System.out.println("****CAR SERVICE CENTER****\n"); 
	        System.out.println("Enter car details..! \n");
	        System.out.println("Enter your Car type..");
	        String ctype = sc.next();
	        System.out.println("Enter your Car no..");
	        String cId = sc.next();
	        String Mname = "NOT ALLOCATED";
	        Iterator<Mechanic> iterator = ((ArrayList<Mechanic>) mech).iterator();
	        
	        //Do while loop used for Allocate mechnic to car 
        	do{
        		Mechanic mobject = iterator.next();
        		if (mobject.Mcar.equalsIgnoreCase(ctype)&& (mobject.avail == 0) ) {
        			Mname = mobject.Mname;
        			mobject.avail = 1;
        			break;
        		}
        		
        	}while(iterator.hasNext());
        	
        	//ADD car details in car list.
	        car.add(new Car(ctype, cId, Mname));
	        
	        System.out.println("\nIf you want to continue Application then Press 0 \nfor exit from Application Press Any key");
	        if(!(sc.next().equals("0"))){
	        	flag="0";
	        }
	        else{
	                flag="1";
	        }
		}
		//End of While loop
		
		//Calling of showAllocation Method
		new CarService().showAllocation();
		Iterator<Mechanic> iterator1 = ((ArrayList<Mechanic>) mech).iterator();
		
        //Do while loop calcualate total earning and total car serviced.
		do{
        	Mechanic mobject = iterator1.next();
        	if (mobject.avail == 1)  {
              totalEarning+=mobject.rate;
              if(mobject.Mcar.equals("Sedan")){
            	  sedan++;
              }
              if(mobject.Mcar.equals("SUV")){
            	  suv++;
              }
              if(mobject.Mcar.equals("HatchBack")){
            	  hatchback++;
              }
         
        	}

        }while(iterator1.hasNext());
        //End of do while
		System.out.println("\n\nTotal No. of Sedan Serviced - "+sedan+"\n\n"+"Total No. of SUV Serviced - "+suv+"\n\n"+"Total No. of HatchBack Serviced - "+hatchback);
		System.out.println("\nTotal Earning of the Day was -- "+totalEarning+" Rs");
    }
	//End of Main Method 
	

}
//End of CarService class
	//
	class Car {
	
		public String type;
		public String carId;
		public String Mname;
	
		public Car(String type, String carId, String Mname) {
		this.type = type;
		this.carId = carId;
		this.Mname = Mname;
		}
	
	}
	//End of car class
	
	class Mechanic {
	
		public String Mname;
		public String Mcar;
		public int rate;
		public int avail;
	
		public Mechanic(String Mname, String Mcar, int rate, int avail) {
		this.Mcar = Mcar;
		this.Mname = Mname;
		this.rate = rate;
		this.avail = avail;
		}
	}
	//End of Mechanic class