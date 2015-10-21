package mvcSession2.assignment1;

/**
 * Name:Employee
 * @author Gaurav Saini
 * Since: 16-10-2015
 * Description: class to store employee information
 **/

public class Employee {
	
	/**
	 * Name:Employee Details
	 * @param id
	 * @param synopsis
	 * @param engineer
	 * @param date
	 * Description: Info About Employee
	 **/
	
	@RequestForEnhancement(id = 1, synopsis = "Gaurav")
	public static void employeeDetail(int id, String synopsis, String engineer,String date) {
		System.out.println("Hello!" + "\nid: " + id + "\nSynopsis: " + synopsis + "\nField: " + engineer
				+ "\nDate: " + date);
	}

	/**
	 * Name:Employee Details
	 * @param id
	 * @param synopsis
	 * @param engineer
	 * @param date
	 * Description: Info About Employee
	 **/
	
	@RequestForEnhancement(id = 1, synopsis = "Gaurav", engineer = "software", date = "10-14-2015")
	public static void employeeDetails(int id, String synopsis,
			String engineer, String date) {
		System.out.println("Hello!" + "\nid: " + id + "\nSynopsis: " + synopsis + "\nField: " + engineer
				+ "\nDate: " + date);
	}

	public static void employeeDetail() {
		System.out.println("this is not annotation");
	}

}