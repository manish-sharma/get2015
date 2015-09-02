/**
 * @author : Pooja khandelwal
 * @created Date : 02/09/2015
 * @Name : MainCalss
 * @Description : this is main class which create collection for custom class(Employee) objects and sorts collection based on name of employee 
 */
package com.naturalOrderSorting.collection.employee;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainCalss {
	public static void main(String args[]) {
		List<Employee> employee = new ArrayList<Employee>(); // ArrayList class object
		int totalEmployees;
		String totalEmployees1;
		String regex = "[0-9]+";
		Scanner scan = new Scanner(System.in);
		System.out
				.println("*--Program for natural order sorting of custom class objects--*\n");
		do {
			System.out.println("How many employees are there ??");
			totalEmployees1 = scan.nextLine();
		} while (!totalEmployees1.matches(regex));
		totalEmployees = Integer.parseInt(totalEmployees1);
		String name;
		String address;
		int id;
		String id1;
		for (int i = 0; i < totalEmployees; i++) {
			System.out.println("Enter data for employee " + i + "\n");
			System.out.println("enter  employee name");
			name = scan.nextLine();
			System.out.println("enter employee address");
			address = scan.nextLine();
			do {
				System.out.println("enter employee ID");
				id1 = scan.nextLine();
			} while (!id1.matches(regex));
			id = Integer.parseInt(id1);
			employee.add(new Employee(name, id, address));
		}
		System.out.println("**--Without sorting--**\n");
		System.out.println("*----List----*\n");
		System.out.println(employee);
		Collections.sort(employee); // call sort() function of java Collections class
		System.out.println("**--Natural order sorting--**\n");
		System.out.println("*----List----*\n");
		System.out.println(employee);

	}

}
