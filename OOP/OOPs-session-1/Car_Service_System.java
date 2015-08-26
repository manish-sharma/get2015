
/**Car Service System
*/

	import java.text.DateFormat;

	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Iterator;
	import java.util.Scanner;

	/*This Class defines the  car service system where 
	 * the manager will check the availability of mechanic for 
	 * particular car,find the total earning of each mechanic for 
	 * a day
	 */
	public class Car_Service_System {
		
	public static ArrayList<Mechanic> mech = new ArrayList<Mechanic>();
	public static ArrayList<Car> car = new ArrayList<Car>();

	
	/*this fn will show the allocation of
	 * mechanic for a particular car
	 */
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

	public static void main(String args[]) {

	mech.add(new Mechanic("Ravi", "Sedan", 3000, 0));
	mech.add(new Mechanic("Sonu", "SUV", 5000, 0));
	mech.add(new Mechanic("Sunil", "HatchBack", 2000, 0));
	mech.add(new Mechanic("Ram", "Sedan", 3000, 0));
	mech.add(new Mechanic("Shayam", "SUV", 5000, 0));
	mech.add(new Mechanic("Mohan", "HatchBack", 2000, 0));
	mech.add(new Mechanic("John", "SUV", 5000, 0));
	mech.add(new Mechanic("James", "Sedan", 3000, 0));
	mech.add(new Mechanic("Lee", "HatchBack", 2000, 0));
	String flag ="0";
	Scanner sc = new Scanner(System.in);
	int p = 0;

	while (flag.equals("0")) {
	        System.out.println("****CAR SERVICE CENTER****\n"); 
	        
	System.out.println("Enter car details..! \n");

	System.out.println("Enter your Car type..");
	String ctype = sc.next();
	System.out.println("Enter your Car no. OR Owner name..");
	String cId = sc.next();
	String Mname = "NOT ALLOCATED";
	cId =cId+"-"+(++p);

	Iterator<Mechanic> iterator = ((ArrayList<Mechanic>) mech).iterator();
	do{
	Mechanic mobject = iterator.next();
	//System.out.println(mobject.Mcar);
	if (mobject.Mcar.equalsIgnoreCase(ctype)&& (mobject.avail == 0) ) {

	Mname = mobject.Mname;
	mobject.avail = 1;
	         break;
	}

	}while(iterator.hasNext());

	car.add(new Car(ctype, cId, Mname));

	System.out.println("\nIf you want to continue Application then Press 0 \nfor exit from Application Press Any key");
	//flag = sc.next();
	        if(!(sc.next().equals("0"))){
	            System.out.println("\nAre You Really Want to Exit From Application ? y/n");
	            if(sc.next().equalsIgnoreCase("n")){
	                flag="0";
	                
	            }
	            else{
	                flag="1";
	            }
	            
	        }

	}
	new Car_Service_System().showAllocation();
	         int sedan=0;
	        int suv=0;
	        int hatchback=0;
	        int totalEarning=0;
	        Iterator<Mechanic> iterator1 = ((ArrayList<Mechanic>) mech).iterator();
	         do{
	Mechanic mobject = iterator1.next();
	//System.out.println(mobject.Mcar);
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
	        System.out.println("\n\nTotal No. of Sedan Serviced - "+sedan+"\n\n"+"Total No. of SUV Serviced - "+suv+"\n\n"+"Total No. of HatchBack Serviced - "+hatchback);
	        System.out.println("\nTotal Earning of the Day was -- "+totalEarning+" Rs");
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	        Calendar cal = Calendar.getInstance();
	        System.out.println("\n    Sign-Out Detail "+dateFormat.format(cal.getTime())); 
	     
	        
	        

	}

	}

	/*this class will provide the 
	 * information of car and mechanic 
	 * allocated to that car
	 */
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

	/*this class will provide the information about 
	 * mechanism,his availibility ,cost for servicing 
	 * a particular car ,type of car that he services
	 */
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

