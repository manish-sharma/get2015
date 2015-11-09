package com.metacampus.vehiclemanagement;

/*
 * @author neha
 * Date: 29 september 2015
 * Description: created for XML file parsing purpose
 */

import java.util.List;

import com.metacampus.vehiclemanagement.model.Vehicle;



public class XMLRead {
  public static void main(String args[])
  {
	  XMLHelper read = new XMLHelper();
 
    List<Vehicle> readConfig2 = read.readConfig("configBike.xml");
    
    for (Vehicle item : readConfig2) 
    {
      System.out.println(item);
      JDBCHelper.insertData(item);
    }
    
    
    List<Vehicle> readConfig1 = read.readConfig("configCar.xml");
    for (Vehicle item : readConfig1) 
    {
      System.out.println(item);
      JDBCHelper.insertData(item);
    }
    
  }
} 

