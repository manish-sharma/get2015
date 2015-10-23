package com.metacube.company;
import java.util.ArrayList;
import java.util.List;

/**
 * CompanyFactory Class to get the factory for the company
 * @author Sanjay
 * @since 10/21/2015
 */
public class CompanyFactory {
	IWorkStation company = Company.getCompany();

		public boolean addEngineer(String name, String role) {
			if(role == null){
				return false;
			} else if(role.equals("Developer")) {
				IEngineer engineer = Developer.createDeveloper(name, role);
				
				return (company.getListOfEngineers()).add(engineer);
			} else if(role.equals("SalesPerson")) {
				IEngineer engineer = SalesPerson.createSalesPerson(name, role);
				
				return (company.getListOfEngineers()).add(engineer);
			}
			return false;
		}
		
		public List<IEngineer> getListOfEngineers(String specificEngineerRole) {
			List<IEngineer>listOfEngineer = company.getListOfEngineers();
			List<IEngineer> listOfSpecificEngineer = new ArrayList<IEngineer>();
			for(IEngineer engineer : listOfEngineer) {
				if(engineer.getRole().equalsIgnoreCase(specificEngineerRole)) {
					listOfSpecificEngineer.add(engineer);
				}
			}
			return listOfSpecificEngineer;
		}
		
		public List<IEngineer> getListOfEngineers() {
			return company.getListOfEngineers();
		}
}
