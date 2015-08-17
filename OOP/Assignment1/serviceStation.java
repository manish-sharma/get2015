// program to implement Car Service Appointment System

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class mechanic 
{
	String carType = new String();
	
	public mechanic(String carType)    // constructor
	{
		this.carType = carType ;
	}	
		
	/* returns number of mechanic appointed for any car type */
	int numOfMechanicOfCarType()
	{
		int numOfMechanic = 0;
		File file = null;
		Scanner sc = null;
		
		try
		{	
			// give location of file 
			file = new File("C://javaprg/eclipse/Assignment5/src/serviceCars.txt");   // loads mechanic's file
	        sc = new Scanner(file);
	        while (sc.hasNextLine())               // checks line by line in file to find out total number of mechanics whose car type that is passed in constructor.
	        {
	           if(sc.nextLine().indexOf(carType)!= -1)            
	        	   numOfMechanic = numOfMechanic + 1;
	        }
		}
		catch( Exception ex )
		{
			System.out.println(ex);
		}
		finally
		{
			if(file!=null)
				file = null;
			if(sc!=null)
				sc = null;
		}
		return numOfMechanic;		
	}
	
	
	/* returns total cost of any particular type of cars serviced */
	int costOfCarServiced( int carCount)
	{
		int totalCost = 0;
		InputStream in = null;
		BufferedReader reader = null;
		try
		{
			in = new FileInputStream ( new File("C://javaprg/eclipse/Assignment5/src/mechanic.txt") );  // loads car to be serviced from file
			reader = new BufferedReader (new InputStreamReader(in));
			String line;
			while((line = reader.readLine())!= null)
			{
				if(line.indexOf(carType)!=-1)  // checks line by line in file to find out cost of car type that is passed in constructor.
				{
					int index = line.lastIndexOf(',');
					String cost = line.substring(index+2); // index + 1 has space
					totalCost = Integer.parseInt(cost)* carCount ;
					break;
				}
			}
			in.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(in!=null)
				in = null;
			if(reader!=null)
				reader = null;
		}
		
		return totalCost;
	}			
	
}


class car
{
	String carType = new String();
	
	public car (String carType)   // constructor
	{
		this.carType = carType;
	}
	
	
	// checks line by line in file to find out total number of cars to be serviced of any particular type . Car type that is passed in constructor.
	int numOfCarType()
	{
		int numOfCar = 0;
		File file = null;
		Scanner sc = null;
		
		try
		{
			file = new File("C://javaprg/eclipse/Assignment5/src/serviceCars.txt");  // loads file
	        sc = new Scanner(file);
	        while (sc.hasNextLine())
	        {
	           if( sc.nextLine().indexOf(carType) != -1 )
	        	   numOfCar = numOfCar + 1;
	        }
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if( file != null )
				file = null;
			if( sc != null )
				sc = null;
		}
		return numOfCar;
	}
}


public class serviceStation 
{
	
	int numOfCarServiced( int countCarType, int countMechanicType)
	{	
		if(countCarType == 0)
		return 0;
		else if ( countCarType < countMechanicType )
			return countCarType;
		else
			return countMechanicType;
	}
	

	public static void main(String[] args) 
	{
		int numOfCars, index = 0;
		Scanner sc = null;
		OutputStream out = null;
		BufferedWriter writer = null;
		serviceStation objServiceStation = null; 
		car objCarSedan = null;
		mechanic objMechanicSedan = null;
		car objCarHatchback = null;
		mechanic objMechanicHatchback = null;
		car objCarSUV = null;
		mechanic objMechanicSUV = null;
		
		try
		{	
			
			sc = new Scanner (System.in);
			
			System.out.println("Enter the num of cars to service : ");
			numOfCars = sc.nextInt();
			
			System.out.println("Enter the name of cars to service : ");			
			out = new FileOutputStream ( new File("C://javaprg/eclipse/Assignment5/src/serviceCars.txt") );
			writer = new BufferedWriter (new OutputStreamWriter(out)); 
			while( index <= numOfCars )
			{
				String line = sc.nextLine()+"\n";  // ????
				writer.write(line);
				index++;
			}	
			out.close();
		
			objServiceStation = new serviceStation();
			
			/* **********************************   for sedan   ************************************ */
			objCarSedan = new car("Sedan");
			int countCarSedan = objCarSedan.numOfCarType();
			
			objMechanicSedan = new mechanic("Sedan");
			int countMechanicSedan = objMechanicSedan.numOfMechanicOfCarType();
			
			int numOfSedanServiced = objServiceStation.numOfCarServiced(countCarSedan, countMechanicSedan);
			System.out.println("Sedan : "+numOfSedanServiced);			
			int earningBySedan = objMechanicSedan.costOfCarServiced(countMechanicSedan);
			
			/* **********************************   for Hatchback   ************************************ */
			objCarHatchback = new car("Hatchback");
			int countCarHatchback = objCarHatchback.numOfCarType();
			
			objMechanicHatchback = new mechanic("Hatchback");
			int countMechanicHatchback = objMechanicHatchback.numOfMechanicOfCarType();
			
			int numOfHatchbackServiced = objServiceStation.numOfCarServiced(countCarHatchback, countMechanicHatchback);
			System.out.println("HatchBack : "+numOfHatchbackServiced);
			int earningByHatchback = objMechanicHatchback.costOfCarServiced(countMechanicHatchback);

			/* **********************************   for SUV  ************************************ */
			objCarSUV = new car("SUV");
			int countCarSUV = objCarSUV.numOfCarType();
			
			objMechanicSUV = new mechanic("SUV");
			int countMechanicSUV = objMechanicSUV.numOfMechanicOfCarType();
			
			int numOfSUVServiced = objServiceStation.numOfCarServiced(countCarSUV, countMechanicSUV);
			System.out.println("SUV : "+numOfSUVServiced);
			int earningBySUV = objMechanicSUV.costOfCarServiced(countMechanicSUV);
			
			/* **********************************   Total earning   ************************************ */
			System.out.println("Total earning : "+( earningBySedan + earningByHatchback + earningBySUV ));
				
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(out!=null)
				out = null;
			if(writer!=null)
				writer = null;
			if(objServiceStation!=null)
				objServiceStation = null;
			if(objCarSedan!=null)
				objCarSedan = null;
			if(objMechanicSedan!=null)
				objMechanicSedan = null;
			if(objCarHatchback!=null)
				objCarHatchback = null;
			if(objMechanicHatchback!=null)
				objMechanicHatchback = null;
			if(objCarSUV!=null)
				objCarSUV = null;
			if(objMechanicSUV!=null)
				objMechanicSUV = null;
		}
	}

}
