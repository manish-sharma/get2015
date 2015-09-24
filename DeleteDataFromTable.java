package com.vehicle.controller;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.BusinessClasses.ConnectionHelper;

public class DeleteDataFromTable {

	static Scanner scan = new Scanner(System.in);
	public int deleteData() {
		System.out.println("Enter 1 to delete data by brand name\n Enter 2 to delete data by model name \n Enter 3 to delete by model and brand name");
		int choice;
		while(!scan.hasNextInt()){
			System.out.println("Enter integer value only");
			scan.next();
		}
		choice = scan.nextInt();
		int result = 0;
		switch (choice) {
		case 1:
			System.out.println("Enter brand name");
			String make =scan.next();
			result = deleteByMake(make);
			break;
		case 2:
			System.out.println("Enter Model name");
			String model =scan.next();
			result =deleteByModel(model);
			break;
		case 3:
			System.out.println("Enter brand name");
			String make1 =scan.next();
			System.out.println("Enter Model name");
			String model1 =scan.next();
			result = deleteByMakeModel(make1, model1);
			break;

		default:
			break;
		}
		return result;
	}
	static ConnectionHelper connectionHelper = new ConnectionHelper();
	public static int deleteByMake(String make) {
		String query = "DELETE FROM vehicle where make = '"+make+"'";
		
		Connection con = connectionHelper.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	public static int deleteByModel(String model) {
		String query = "DELETE FROM vehicle where model = '"+model+"'";
		Connection con =connectionHelper.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	public static int deleteByMakeModel(String make, String model) {
		String query = "DELETE FROM vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
		Connection con = connectionHelper.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	
}
