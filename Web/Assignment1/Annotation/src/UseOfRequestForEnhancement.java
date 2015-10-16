/**
 * it Uses the RequestForEnhancement
 * @author Ravika
  * @since 10/16/2015
 */
public class UseOfRequestForEnhancement{
	@RequestForEnhancement(id = 1, synopsis = "Ravika")
	public static void detail(int id,String synopsis,String engineer,String date){
		System.out.println("Hii"+id+"->"+synopsis+"->"+engineer+"->"+date);
	}
	@RequestForEnhancement(id = 1, synopsis = "Ravika", engineer="software", date="10/14/2015")
	public static void details(int id,String synopsis,String engineer,String date){
		System.out.println("Hii"+id+"->"+synopsis+"->"+engineer+"->"+date);
	}
	public static void detail(){
		System.out.println("Not Annotation");
	}
	
}

