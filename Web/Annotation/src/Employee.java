/**
 * class to call annotation
 * @author Ankur
 *
 */

public class Employee{
	@RequestForEnhancement(id = 1, synopsis = "Ankur")
	public static void employeeDetail(int id,String synopsis,String engineer,String date){
		System.out.println("Hii"+id+"->"+synopsis+"->"+engineer+"->"+date);
	}
	@RequestForEnhancement(id = 1, synopsis = "Ankur", engineer="software", date="10/14/2015")
	public static void employeeDetails(int id,String synopsis,String engineer,String date){
		System.out.println("Hii"+id+"->"+synopsis+"->"+engineer+"->"+date);
	}

	public static void employeeDetail(){
		System.out.println("Not Annotation");
	}




}

