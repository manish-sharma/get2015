package Helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.Helper;
import model.Car;

public class CarDbHelper {

	public static String insertCar(Car car) {
		
		     String createdBy =  car.getCreatedBy();
		     String createdTime =  car.getCreatedTime();
		     String make = car.getMake();
			 String model = car.getModel();
			 String enginInCC = car.getEnginInCC();
			 String fuelCapacity = car.getFuelCapacity();
			 String milage = car.getMilage() ;
			 String price = car.getPrice();
			 String roadTax = car.getRoadTax();
		     String ac = car.getAc();
	     	 String powerSteering =car.getPowerSteering();
		     String accessoryKit = car.getAccessoryKit();
		     

		     Helper helper = new Helper();
		     String sql = "SELECT * FROM mycar WHERE model = '"+model+"'";
		     ResultSet rs = helper.executeQuery(sql);
		     try {
				if(rs.next())
				 {
					 return "Car Of This Specification is already exist";
				 }
			} catch (SQLException e) {
				System.err.println("SQL Exception Occured in insert");
				e.printStackTrace();
			}
		     sql = " INSERT INTO mycar values ( '"+createdBy+"','"+createdTime+"','"+make+"','"+model+"','"+enginInCC+"','"+fuelCapacity+"','"+milage+"','"+price+"','"+roadTax+"','"+ac+"','"+powerSteering+"','"+accessoryKit+"') ";
		     
		     int result = helper.executeUpdate(sql);
		     if(result == 1) {
		    	 return "Car Created Succesfully";
		     }
		     else
		     {return "Car Not Created";}
		     
	}
	
	public static String editCar(Car car) {
		
	     String createdBy =  car.getCreatedBy();
	     String createdTime =  car.getCreatedTime();
	     String make = car.getMake();
		 String model = car.getModel();
		 String enginInCC = car.getEnginInCC();
		 String fuelCapacity = car.getFuelCapacity();
		 String milage = car.getMilage() ;
		 String price = car.getPrice();
		 String roadTax = car.getRoadTax();
	     String ac = car.getAc();
    	 String powerSteering =car.getPowerSteering();
	     String accessoryKit = car.getAccessoryKit();
	     

	     Helper helper = new Helper();
	     String sql = "UPDATE mycar SET created_by='"+createdBy+"', created_time='"+createdTime+"',engine_cc='"+enginInCC+"',fuel_capacity='"+fuelCapacity+"',"
	     		+ "milage='"+milage+"',price='"+price+"',road_tax='"+roadTax+"',ac='"+ac+"',power_steering='"+powerSteering+"',accessory_kit='"+accessoryKit+"' WHERE model='"+model+"' ";
	     
	     int result = helper.executeUpdate(sql);
	     if(result == 1) {
	    	 return "Car Edited Succesfully";
	     }
	     else
	     {return "Car Not Edited";}
	     
}
	
	public List<String> distinctMake() 
	{   
		Helper helper = new Helper();
		String sql = "SELECT DISTINCT make FROM mycar";
		ResultSet rs = helper.executeQuery(sql);
		List<String> make = new ArrayList<String>();
		try {
			while(rs.next())
			{   System.out.println(rs.getString("make"));
				make.add( rs.getString("make") );
			}
		} catch (SQLException e) {
			System.err.println("SQL Exception Occured in distict make");
			e.printStackTrace();
		}
		return make;
	}
	
	
	public List<String> getModelList(String make) 
	{   
		Helper helper = new Helper();
		String sql = "SELECT * FROM mycar WHERE make= '"+make+"' ";
		ResultSet rs = helper.executeQuery(sql);
		List<String> modelList = new ArrayList<String>();
		try {
			while(rs.next())
			{  
				modelList.add( rs.getString("model") );
			}
		} catch (SQLException e) {
			System.err.println("SQL Exception Occured in getModelList");
			e.printStackTrace();
		}
		return modelList;
	}
	
	public String[] getInfoByModel(String model) 
	{   
		Helper helper = new Helper();
		String sql = "SELECT * FROM mycar WHERE model= '"+model+"' ";
		ResultSet rs = helper.executeQuery(sql);
		String[] infoList = new String[12];
		try {
			while(rs.next())
			{  
				infoList[0] =  rs.getString(1);
				infoList[1] =  rs.getString(2);
				infoList[2] =  rs.getString(3);
				infoList[3] =  rs.getString(4);
				infoList[4] =  rs.getString(5);
				infoList[5] =  rs.getString(6);
				infoList[6] =  rs.getString(7);
				infoList[7] =  rs.getString(8);
				infoList[8] =  rs.getString(9);
				infoList[9] =  rs.getString(10);
				infoList[10] =  rs.getString(11);
				infoList[11] =  rs.getString(12);
				
			}
		} catch (SQLException e) {
			System.err.println("SQL Exception Occured in getInfoByModel");
			e.printStackTrace();
		}
		return infoList;
	}
	
	
	
}
