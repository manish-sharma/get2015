package Assignment_2;

import java.util.List;
/**Main class showing list of developers
 * 
 * @author Shishir
 *Date 21st October 2015
 */
public class Main {
	public static void main(String args[]) {
		Company company = Company.getCompanyInstance();//getting company instance 
		company.setDeveloper();//setting developer
		List<Developer> developers = company.getDevelopers();//getting the list of developers
	    for (Developer developer : developers) {
			System.out.println(developer);//printing developers details
		}
	
	}
}
