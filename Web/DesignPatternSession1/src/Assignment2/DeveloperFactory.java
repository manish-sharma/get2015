/**
 * 
 */
package Assignment2;

/**
 * @author Chetna
 * application to create a Company and its employees(Developers) without exposing their public constructors.
 * Implement Classes(Factory Pattern) 
 * Factory class to create object.
 */
public class DeveloperFactory extends Developer{
	
	static Developer developer = null;
	
	/**
	 * @return : Instance of Developer
	 */
	public static Developer getDeveloper(){
		developer = new Developer();
		return developer;
	 }
}
