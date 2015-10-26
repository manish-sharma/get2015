package ProjectCompany.MainClass ;
import java.util.List;

import ProjectCompany.Factory.DeveloperFactory;
import ProjectCompany.Factory.TesterFactory;
import ProjectCompany.Model.Engineer;
import ProjectCompany.Model.EngineerType;
import ProjectCompany.ModelCompany.Company;
import ProjectCompany.Utility.Utility;

public class MainCompany {

	public static void main(String[] args) {
		
		/* initialization */
		Engineer engineer = null;
		String name;
		int type;
		int choice;
		do {
			choice = Utility.getChoice("1. Create Engineer\n2. Show List\n3. Exit\nEnter Choice");
			switch(choice) {
				case 1:
					/* input name */
					name = Utility.readString("Enter Name");
					type = Utility.getIntegerValue("Enter 1 for Developer and 2 for Tester");
					
					/* creating object depend on choice */
					if (type == 1)
						engineer = new DeveloperFactory().createEngineer(name,EngineerType.DEVELOPER);
					else
						engineer = new TesterFactory().createEngineer(name,EngineerType.TESTER);
					
					/* Getting Company object */
					Company companyObj = Company.getInstance();
					/* Adding object to list */
					companyObj.addEngineer(engineer);
					break;
				case 2:
					/* Getting list */
					List<Engineer> EngineerList = Company.getListOfEngineers();
					/* SHowing List */
					for (Engineer engineer1 : EngineerList) {
						System.out.println(engineer1);
					}
					break;
				case 3: 
					System.exit(0);
					break;
				default :
					System.out.println("Enter Correct Choice...!!");
			}
		}while(true);
	}
}
