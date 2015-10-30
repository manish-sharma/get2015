package com.metacube.Question1;
/**
 * @author Riddhi 
 */

/* This class inherits the annotation in its functions */
public class Employee {
	/**
	 * @param id
	 *            --- int variable taken by annotation
	 * @param synopsis
	 *            ---string variable taken by annotation
	 * @param engineer
	 *            ---string variable taken by annotation default value
	 * @param date
	 *            ---string variable taken by annotation default value
	 */
	@RequestForEnhancement(id = 1, synopsis = "Riddhi")
	public static void employeeDetail(int id, String synopsis, String engineer,
			String date) {
		System.out.println("Hii " + id + "->" + synopsis + "->" + engineer
				+ "->" + date);
	}

	/**
	 * @param id
	 *            --- int variable taken by annotation
	 * @param synopsis
	 *            ---string variable taken by annotation
	 * @param engineer
	 *            ---string variable taken by annotation
	 * @param date
	 *            ---string variable taken by annotation
	 */
	@RequestForEnhancement(id = 1, synopsis = "Riddhi", engineer = "software", date = "10/14/2015")
	public static void employeeDetails(int id, String synopsis,
			String engineer, String date) {
		System.out.println("Hii" +" "+ id + "->" + synopsis + "->" + engineer
				+ "->" + date);
	}

	/**
	 * Function not using annotation
	 */
	public static void employeeDetail() {
		System.out.println("Not Annotation");
	}

}
