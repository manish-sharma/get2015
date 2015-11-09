

/*
 *This program is to write daily working of Service Station which involve the no of car serviced by service station with their type as well
 *as total earning of the service station.
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-08-19
 */
package Question4;
import java.io.*;
public class ServiceStation 
{
	FileInputStream fisMechanic;
	BufferedReader brMechanic = null;
	BufferedReader brCar = null;
	BufferedReader brMechanic1 = null;
	BufferedReader brCar1 = null;
	int noOfMechanic=0,noOfCar=0;
	String line = "";
	int i=0,Sedan=0,SUV=0,Hatchback=0;
	Mechanic mechanicArray [];
	Car carArray [];
	
	/*
	 *Below function is to count the total no of mechanics as well as create an array of objects of Mechanic class.
	 */
	 
	public void readMechanic()
	{
		try
		{   // counts the no of available mechanics
			brMechanic1 = new BufferedReader(new FileReader("D:\\Mechanic.txt"));
			while ((line = brMechanic1.readLine()) != null) 
				if(!line.equals(""))
				noOfMechanic++;
			
			//create an array of objects of Mechanic class
			mechanicArray=new Mechanic[noOfMechanic];
			for(i=0;i<noOfMechanic;i++)
				mechanicArray[i]=new Mechanic();
				
			i=0;
			
			//create a bufferReader to read data in Mechanic.txt
			brMechanic = new BufferedReader(new FileReader("D:\\Mechanic.txt"));
			while ((line = brMechanic.readLine()) != null&&(!line.equals(""))) 
			{
		        // use comma as separator
			     String[] lineArray = line.split(",");
			     //set all values read from text files to class level variables
			     mechanicArray[i].setName(lineArray[0]);  //set name of Mechanic
			     mechanicArray[i].setType(lineArray[1].trim());  //set type of car serviced by mechanic
			     int price=Integer.parseInt(lineArray[2].trim());
			     mechanicArray[i].setPrice(price);
			     mechanicArray[i++].setAvailable(true);  //initially set all availability to true
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	public int getNoOfMechanic()
	{
		return noOfMechanic;
	}
	
	/*
	 *Below function is to count the total no of mechanics as well as create an array of objects of Mechanic class.
	 */
	public void readCars()
	{
		try
		{
	
			brCar1 = new BufferedReader(new FileReader("D:\\Car.txt"));
			while ((line = brCar1.readLine()) != null) 
				if(!line.equals(""))
					noOfCar++;
					
			carArray=new Car[noOfCar];
			for(i=0;i<noOfCar;i++)
				carArray[i]=new Car();		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public int getNoOfCar()
	{
		return noOfCar;
	}
	/*
	 *Below function is to do allotement of available mechanic to arrived car at service station
	 */
	public void doAllotement()
	{
		try
		{
			
			brCar = new BufferedReader(new FileReader("D:\\Car.txt"));
			i=0;
			while ((line = brCar.readLine()) != null&&(!line.equals(""))) 
			{
				 String[] lineArray = line.split(",");
				 int number=Integer.parseInt(lineArray[0].trim());
				 carArray[i].setCarNumber(number);
				 carArray[i].setCarType(lineArray[1].trim());
				 boolean temp=false;
				 //below code is to check tha availability of mechanic of that type that can service arrived car
				 for(int j=0;j<mechanicArray.length;j++)
				 {
					 boolean av=mechanicArray[j].isAvailable;
					 String typeOfMechanic=mechanicArray[j].getType();
					 String typeOfCar=carArray[i].getCarType();
					 
					 if(typeOfMechanic.equalsIgnoreCase(typeOfCar)&&av) //if type of car match with type of mechanic and this mechanic is
					                                                    //available
					 {
						 if(typeOfMechanic.equalsIgnoreCase("Sedan"))
							 Sedan++;
					     if(typeOfMechanic.equalsIgnoreCase("SUV"))
						     SUV++;
					     if(typeOfMechanic.equalsIgnoreCase("Hatchback"))
					     	 Hatchback++;
					 mechanicArray[j].setAvailable(false);             // put the availability to false
					 temp=true;
					 if(temp)
						 break;
					 }
					 
				 }
				 i++;
		    }
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	/**
	 * @return the sedan
	 */
	public int getSedan() {
		return Sedan;
	}
	/**
	 * @return the sUV
	 */
	public int getSUV() {
		return SUV;
	}
	/**
	 * @return the hatchback
	 */
	public int getHatchback() {
		return Hatchback;
	}
	public static void main(String args[]) 
	{
		
		try
		{
			ServiceStation serviceStation=new ServiceStation();
			serviceStation.readMechanic();
			serviceStation.readCars();
			serviceStation.doAllotement();
			int s=0,h=0,v=0;
			s=serviceStation.getSedan();
			h=serviceStation.getHatchback();
			v=serviceStation.getSUV();
			
			
			System.out.println("Total car serviced by Service Center");
			System.out.println("Sedan        "+s);
			System.out.println("Hatchback    "+h);
			System.out.println("SUV          "+v);
			System.out.println();
			System.out.println();
			int totalEarning=s*3000+h*5000+v*6000;
			System.out.println("Total Earning");
			System.out.println(totalEarning);
			
		}
		catch(NumberFormatException t)
		{
			t.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			
		}
		
		
	}

}
