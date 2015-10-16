
/**
 * this is employee class as a view class to print message what annotation found
 * @author Sumitra
 *
 */
public class Employee{
	@RequestForEnhancement(id = 1, synopsis = "Sumitra")
	public static void employeeDetail(int id,String synopsis,String engineer,String date){
		System.out.println("Hii -Annotations " +id+"->"+synopsis+"->"+engineer+"->"+date);
	}
	@RequestForEnhancement(id = 1, synopsis = "Sumitra", engineer="software", date="10/14/2015")
	public static void employeeDetails(int id,String synopsis,String engineer,String date){
		System.out.println("Hii -Annotations"+id+"->"+synopsis+"->"+engineer+"->"+date);
	}
	public static void employeeDetail(){
		System.out.println("Not Annotation");
	}
	
	
	

}

