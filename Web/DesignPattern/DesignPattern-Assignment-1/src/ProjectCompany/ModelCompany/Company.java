package ProjectCompany.ModelCompany;
import java.util.ArrayList;
import java.util.List;

import ProjectCompany.Model.Engineer;

public class Company {

	private static Company company;
	private static List<Engineer> listOfEnginners = new ArrayList<Engineer>();

	public static Company getInstance() {
		if (company == null) {
			synchronized (Company.class) {
				if (company == null)
					company = new Company();
			}
		}
		return company;
	}

	public void addEngineer(Engineer engineer) {
		listOfEnginners.add(engineer);
	}

	public static List<Engineer> getListOfEngineers() {
		return listOfEnginners;
	}

}
