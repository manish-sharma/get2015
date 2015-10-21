package Assignment_1;
/**Main class 
 * 
 * @author Shishir
 *Date 21st October 2015
 */
public class MainClass {
	public static void main(String args[]){
		Singleton singletonObject = Singleton.getInstance();//getting instance of singleton class
		singletonObject.getSomeThing();
	}
}
