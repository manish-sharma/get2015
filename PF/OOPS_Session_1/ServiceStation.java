
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
class Mechanics
{
	private String mechanicName,specializeCar;
	private int rate;
	public Mechanics(String mechanicName,String specializeCar,int rate)//Mechanics class constructor 
	{
		this.mechanicName=mechanicName;
		this.specializeCar=specializeCar;
		this.rate=rate;
	}
	public String getMName()//get method is used to return the value
	{
		return mechanicName;
	}
	public void set_M_Name(String mechanicName)//set method is used to store the value
	{
		this.mechanicName=mechanicName;
	}
	public void setSCar(String specializeCar)
	{
		this.specializeCar=specializeCar;
	}
	public String getSCar()
	{
		return specializeCar;
	}
	public void setServiceRate(int rate)
	{
		this.rate=rate;
	}
	public int getServiceRate()
	{
		return rate;
	}
	public String toString()//to return complete information of Mechanics
	{
		return " "+mechanicName+" "+specializeCar+" "+rate;
	}
}
class Car_Type
{
	private String carName,carNumber;
	public Car_Type(String carNumber,String carName)
	{
		this.carName=carName;
		this.carNumber=carNumber;
	}
	public String getCarName()
	{
		return carName;
	}
	public void setCarName(String carName)
	{
		this.carName=carName;
	}
	public String getCarNum()
	{
		return carNumber;
	}
	public void setCarNum(String carName)
	{
		this.carNumber=carName;
	}
	public String toString()//to return complete information of Car
	{
		return " "+carNumber+" "+carName;
	}
}
public class ServiceStation 
{
	public static void main(String args[])throws FileNotFoundException
	{
		Scanner fin_Mechanic=new Scanner(new FileReader("Mechanics.txt"));//to read information of Mechanics from given file
		String mechanicName,specializeCar;
		int num_of_mechanics=0;
		int rate;
		int countSuv=0,countSedan=0,countHatchbak=0;
		int m_countSuv=0,m_countSedan=0,m_countHatchbak=0;
		
		Scanner fin_Car=new Scanner(new FileReader("Car.txt"));
		String carName,carNumber;
		int num_of_car;
		num_of_car=fin_Car.nextInt();//get the first line of file(total number of cars)
		String temp;
		Car_Type car[]=new Car_Type[num_of_car];
		for(int i=0;i<num_of_car;i++)//to store complete information of car for all object
		{
			carNumber=fin_Car.next();
			carName=fin_Car.next();
			car[i]=new Car_Type(carNumber,carName);
		}
		
		num_of_mechanics=fin_Mechanic.nextInt();//get the first line of file(total number of mechanics)
		Mechanics mechanic[]=new Mechanics[num_of_mechanics];
		for(int i=0;i<num_of_mechanics;i++)//to store complete information of car for all object
		{
			mechanicName=fin_Mechanic.next();
			specializeCar=fin_Mechanic.next();
			rate=fin_Mechanic.nextInt();
			mechanic[i]=new Mechanics(mechanicName,specializeCar,rate);
		}
		System.out.println("Mechanics information is:");//to print all the information about mechanics
		for(int i=0;i<num_of_mechanics;i++)
		{
			System.out.println(mechanic[i].toString());
		}
		System.out.println("Car information is:");
		for(int i=0;i<num_of_car;i++)//to print all the information about car
		{
			System.out.println(car[i].toString());
		}
		
		for(int i=0;i<num_of_mechanics;i++)//count number of cars for which mechanics are available 
		{
			temp=mechanic[i].getSCar();
			if(temp.equalsIgnoreCase("SUV"))
				m_countSuv++;
			else if(temp.equalsIgnoreCase("Sedan"))
				m_countSedan++;
			else if(temp.equalsIgnoreCase("Hatchbak"))
				m_countHatchbak++;
			else
				temp="";
		}
		for(int i=0;i<num_of_car;i++)//count number of cars arrived at service center
		{
			temp=car[i].getCarName();
			if(temp.equalsIgnoreCase("SUV"))
				countSuv++;
			else if(temp.equalsIgnoreCase("Sedan"))
				countSedan++;
			else if(temp.equalsIgnoreCase("Hatchbak"))
				countHatchbak++;
			else
				temp="";
		}
		
		System.out.println("Total number of cars arrived at service center\nSUV:"+countSuv+"\nSedan:"+countSedan+"\nHatchbak:"+countHatchbak);
		System.out.println("Total number of Mechanics at service center\nSUV:"+m_countSuv+"\nSedan:"+m_countSedan+"\nHatchbak:"+m_countHatchbak);
		
		if(m_countHatchbak<countHatchbak)
		     countHatchbak=m_countHatchbak;
		if(m_countSedan<countSedan)
			countSedan=m_countSedan;
		if(m_countSuv<countSuv)
			countSuv=m_countSuv;
		
		int totalEarning=countHatchbak*2000+countSedan*3000+countSuv*5000;//to calculate total earning
		System.out.println("Total earning is:"+totalEarning);
		fin_Car.close();
		fin_Mechanic.close();
	}
}

