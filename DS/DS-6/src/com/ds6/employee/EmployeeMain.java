package com.ds6.employee;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/**This class implements the main functionality of the class 
 * It implements the menu for putting employee details and viewing it accordingly to employee id 
 * or employee name
 * @author Shishir
 *Date 2nd September 2015
 */
public class EmployeeMain {
    /** 
     * Main function starts 
     * @param args
     */
	public static void main(String args[]){
		List <Employee> employeeList = new ArrayList <Employee> ();
		String empID,name,address;
		int ch;
		boolean flag = false;
		System.out.println("***********Employee Details**************");
		System.out.println("Choose from the following options");
		try{//try block start to handle exceptions
		while(true)//infinite loop to show 
		{
			System.out.println("1.Enter new employee details");
			System.out.println("2.View details according to name"
					+ "");
			System.out.println("3.View details according to employee id");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			ch = Integer.parseInt(bufferedReader.readLine());
			switch(ch)//switch case to perform according to user input
			{
			
			case 1:System.out.println("Enter employee name");
			name = bufferedReader.readLine();
			System.out.println("Enter employee id");
			empID = bufferedReader.readLine();
			System.out.println("Enter employee address");
			address = bufferedReader.readLine();
			Employee e1=new Employee(empID, name, address);
			for(Employee e:employeeList){
				flag = e.equals(e1);  
				}
			if(flag == true)//if true than employee id is similar
			{
				System.out.println("Employee either exists or employee Id is same!!!! Please check details of employee");
			}
			else
				employeeList.add(e1);//else add the employee in list
			break;
			
			case 2:Collections.sort(employeeList);//viewing the data according to name
			for(Employee e:employeeList){
				System.out.println("Employee ID  " + e.getEmpID() + "  Name  " + e.getName() + "  Address  " + e.getAddress());
			}
			break;
			case 3:Collections.sort(employeeList,new NameComparator()); //viewing data according to employee id 
			for(Employee e:employeeList){
				System.out.println("Employee ID " + e.getEmpID() + "Name " + e.getName() + "Address " + e.getAddress());
			}
			break;
			case 4:System.exit(0);//exiting from the program
			break;
			default:System.out.println("Enter correct choice");
			break;
			}
		}
	}
		catch(Exception e)//if some exception occurs its will be caught here 
		{
			System.out.println("Please enter correct input");
		}
   }
}

