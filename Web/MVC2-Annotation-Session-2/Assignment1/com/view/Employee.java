package com.view;

import com.model.RequestForEnhancement;


/*
 * This class inherits the annotation in its functions
 * @author Banwari kevat
 */
public class Employee {
	/*
	 * @param id int variable taken by annotation
	 * @param synopsis string variable taken by annotation
	 * @param engineer string variable taken by annotation default value
	 * @param date string variable taken by annotation default value
	 */
	@RequestForEnhancement(id = 1, synopsis = "Banwari")
	public static void employeeDetail(int id, String synopsis, String engineer,String date)
	{
		System.out.println("Hello " + id + " " + synopsis + " " + engineer+ " " + date);
	}

	/*
	 * @param id int variable taken by annotation
	 * @param synopsis string variable taken by annotation
	 * @param engineer string variable taken by annotation
	 * @param date string variable taken by annotation
	 */
	@RequestForEnhancement(id = 2, synopsis = "Banwari", engineer = "mechnical", date = "13/10/2015")
	public static void employeeDetails(int id, String synopsis,
			String engineer, String date) 
	{
		System.out.println("Hello" +" "+ id + " " + synopsis + " " + engineer+ " " + date);
	}

    // Function not using annotation
	public static void employeeDetail() 
	{
		System.out.println("Annotation not present in this method");
	}

}