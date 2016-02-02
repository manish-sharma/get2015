package com.metacube;

public class MainClass {
	
	public static void main(String args[])  {
		
		String employeeType = "";
			try {
				check(employeeType);
			} catch (InvalidDataException e) {
				System.out.println("invalid data at employee type");
			}
		
		
	
		
	}
	
	private static void check(String employeeType) throws InvalidDataException  {
		
			try {
				EmployeeType.valueOf(employeeType);
			} catch (Exception e) {
				throw new InvalidDataException(e.getMessage()+MainClass.class.getName(),e);
				
			}
		

		
	}
	
	
	
	
	
	

}
