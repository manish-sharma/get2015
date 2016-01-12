/**
 *@class CompanyMain
 *@author Banwari Kevat
 */
package controller;

import java.util.Iterator;
import java.util.Scanner;

import company.EngineerFactoryMaker;

import model.Engineer;
import model.EngineerType;
import WorkStation.Office;


public class CompanyMain {
	public static void main(String [] arg) 
	{   
		Scanner sc = new Scanner(System.in);
		Office office = Office.getInstance();
        System.out.println("\t\t\tWelcome to Company");
        
          do {
			        System.out.println("Enter Choice:\n\n\t1. 1 for Add Engineer\n\t2. 2 for Show Engineers\n\t3. Other key for Exit");
			        String choice = sc.next();
			        if(choice.equals("1"))
			        {
			        	 System.out.println("\tEnter Type of Engineer:\n\n\t\t\t1. 1 for Developer\n\t\t\t2. 2 for Mechanic\n\t\t\t3. Other key for Exit\n");
			        	 String type = sc.next();
			             if(type.equals("1"))
			             {
			             	System.out.print("\t\t\t\tEnter Name: ");
			             	String name = sc.next();
			                Engineer engineer = EngineerFactoryMaker.getEngineerFactoryMaker(EngineerType.developer);  
			                engineer.setName(name);
			                office.addEngineer(engineer);
			             }
			             else if(type.equals("2"))
			             {
			            	 System.out.print("\t\t\t\tEnter Name: ");
			               	 String name = sc.next();
			                 Engineer engineer = EngineerFactoryMaker.getEngineerFactoryMaker(EngineerType.mechanic);  
			                 engineer.setName(name);
			                 office.addEngineer(engineer);
			             }
			             else
			             {
			             	System.exit(0);
			             }
			        }
			        else if(choice.equals("2"))
			        {
			        	Iterator iterator = office.getEnginnerList().iterator();
			        	while(iterator.hasNext())
			        	{
			        		Engineer engineer = (Engineer) iterator.next();
			        		System.out.println(engineer);
			        	}
			        }
			        else
			        {
			        	System.exit(0);
			        }
          } while(true); 
	}    
}
