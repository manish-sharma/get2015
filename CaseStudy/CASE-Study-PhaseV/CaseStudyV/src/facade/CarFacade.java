/*
 * @name CarFacade which interact with database
 * @author Banwari Kevat
 */
package facade;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Helper;
import model.Car;
import model.User;

public class CarFacade {
			/*
			 * @name getUserByUserId
			 * @param userId is the id of user
			 * @param connection is the object of Connection class 
			 * @return User class object
			 */
			public User getUserByUserId(String userId, Connection connection) 
			{
				
					User user = new User();
					try 
					{
					     String sql = "SELECT * FROM admin WHERE user_id = ?";
					     PreparedStatement preparedStatement = connection.prepareStatement(sql);
					     preparedStatement.setString(1, userId);
					     Helper helper = new Helper();
				     	 ResultSet rs = helper.executeQuery(preparedStatement, connection);
					
						 if(rs.next())
						 {
							user.setUserId(rs.getString(1));
							user.setPassword(rs.getString(2));
						 }
					
					}
				      catch (SQLException e)
					{
					e.printStackTrace();
					
				  }
					return user;
			}
			
			/*
			 * @name insertCar
			 * @param car is the object of car which will be insert into database
			 * @param connection is the object of Connection class 
			 * @return message about operation is successful or not
			 */
			public String insertCar(Car car, Connection connection) {
						
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
			     int result =-1;
			     try {
					     Helper helper = new Helper();
					 
					     String sql = "SELECT * FROM mycar WHERE model = ?";
					     PreparedStatement preparedStatement = connection.prepareStatement(sql);
					     preparedStatement.setString(1,model);
					     ResultSet rs = helper.executeQuery(preparedStatement,connection);
					   
							if(rs.next())
							 {
								 return "Car Of This Specification is already exist";
							 }
						
					     sql = "INSERT INTO mycar values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					     preparedStatement = connection.prepareStatement(sql);
					    
					     preparedStatement.setString(1, createdBy);
					     preparedStatement.setString(2, createdTime);
					     preparedStatement.setString(3, make);
					     preparedStatement.setString(4, model);
					     preparedStatement.setString(5, enginInCC);
					     preparedStatement.setString(6, fuelCapacity);
					     preparedStatement.setString(7, milage);
					     preparedStatement.setString(8, price);
					     preparedStatement.setString(9, roadTax);
					     preparedStatement.setString(10, ac);
					     preparedStatement.setString(11, powerSteering);
					     preparedStatement.setString(12, accessoryKit);
					     
					     result = helper.executeUpdate(preparedStatement,connection);
			        } 
			      catch (SQLException e) 
			       {
						System.err.println("SQL Exception Occured in insert");
						e.printStackTrace();
					}
					     if(result == 1) {
					    	 return "Car Created Succesfully";
					     }
					     else
					     {return "Car Not Created";}
			     
		 }
			
			/*
			 * @name editCar
			 * @param car is the object of car which will be edit in database
			 * @param connection is the object of Connection class 
			 * @return message
			 */
			public String editCar(Car car , Connection connection) {
				
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
			     int result=-1;
			     
                try {
				     Helper helper = new Helper();
				     String sql ="UPDATE mycar SET created_by =?,created_time=?,engine_cc=?,fuel_capacity=?,milage=?,price=?,road_tax=?,ac=?,power_steering=?,accessory_kit=? WHERE model=?";
				     PreparedStatement preparedStatement = connection.prepareStatement(sql);
				     preparedStatement.setString(1,createdBy);
				     preparedStatement.setString(2,createdTime);
				     preparedStatement.setString(3,enginInCC);
				     preparedStatement.setString(4,fuelCapacity);
				     preparedStatement.setString(5,milage);
				     preparedStatement.setString(6,price);
				     preparedStatement.setString(7,roadTax);
				     preparedStatement.setString(8,ac);
				     preparedStatement.setString(9,powerSteering);
				     preparedStatement.setString(10,accessoryKit);
				     preparedStatement.setString(11,model);
				 
				      result = helper.executeUpdate(preparedStatement,connection);
			     
                } 
  		        catch (SQLException e) 
  		       {
  					System.err.println("SQL Exception Occured in insert");
  					e.printStackTrace();
  			  }
			    if(result == 1) {
			    	 return "Car Edited Succesfully";
			     }
			     else
			     {return "Car Not Edited";}
			     
		}
			/*
			 * @name distinctMake
			 * @return list of array of distinct model name
			 * @param connection is the object of Connection class 
			 */
			public List<String> distinctMake(Connection connection) 
			{   
				Helper helper = new Helper();
				String sql = "SELECT DISTINCT make FROM mycar";
				List<String> make = new ArrayList<String>();
				try {
					 PreparedStatement preparedStatement = connection.prepareStatement(sql);
					 ResultSet rs = helper.executeQuery(preparedStatement,connection);
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
				
			/*
			 * @name getModelList
			 * @param make
			 * @param connection is the object of Connection class
			 * @return list of model of specified make
			 */
			public List<String> getModelList(String make , Connection connection) 
			{   
				Helper helper = new Helper();
				String sql = "SELECT * FROM mycar WHERE make= ? ";
				List<String> modelList = new ArrayList<String>();
				try {
					 PreparedStatement preparedStatement = connection.prepareStatement(sql);
					 preparedStatement.setString(1,make);
					 ResultSet rs = helper.executeQuery(preparedStatement,connection);
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
			
			/*
			 * @name getInfoByModel
			 * @param model
			 * @param connection is the object of Connection class
			 * @return all info related to model in form of string array 
			 */
			public String[] getInfoByModel(String model , Connection connection) 
			{   
				Helper helper = new Helper();
				String sql = "SELECT * FROM mycar WHERE model= ? ";
				 String[] infoList = new String[12];
				 try {
						 PreparedStatement preparedStatement = connection.prepareStatement(sql);
						 preparedStatement.setString(1,model);
						 ResultSet rs = helper.executeQuery(preparedStatement,connection);
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
