package ProjectCompany.ModelCompany;
import java.util.ArrayList;
import java.util.List;

import ProjectCompany.Model.Engineer;
/** Singleton class Company */
/**
 * @author Khemanshu
 */
public class Company {

	/* private reference variable of the class Company */
	private static Company company;
	
	/** listOfEnginners is the list of Engineers */
	private static List<Engineer> listOfEnginners = new ArrayList<Engineer>();

	/** MEthod to get single instance of Company class
	 * 
	 * @return object of company class
	 */
	public static Company getInstance() {
		if (company == null) {
			synchronized (Company.class) {
				if (company == null)
					company = new Company();
			}
		}
		return company;
	}

	/** MEthod to add engineer to the list
	 * 
	 * @param engineer
	 */
	public void addEngineer(Engineer engineer) {
		listOfEnginners.add(engineer);
	}

	/** Method to return list of engineers
	 * 
	 * @return listOfEngineers
	 */
	public static List<Engineer> getListOfEngineers() {
		return listOfEnginners;
	}

}
