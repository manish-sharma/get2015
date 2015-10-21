package ProjectCompany.Factory;

import ProjectCompany.Model.Developer;
import ProjectCompany.Model.Engineer;
import ProjectCompany.Model.EngineerType;

public class DeveloperFactory extends Developer implements EngineerFactory{

	public DeveloperFactory() {
	}
	
	private DeveloperFactory(String name , EngineerType type) {
		super(name , type);
	}

	@Override
	public Engineer createEngineer(String name, EngineerType type) {
		return new DeveloperFactory(name, type);
	}
	

}
