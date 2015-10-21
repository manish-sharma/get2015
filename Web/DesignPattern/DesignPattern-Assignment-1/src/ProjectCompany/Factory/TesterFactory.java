package ProjectCompany.Factory;

import ProjectCompany.Model.Engineer;
import ProjectCompany.Model.EngineerType;
import ProjectCompany.Model.Tester;

public class TesterFactory extends Tester implements EngineerFactory{


	public TesterFactory() {
	}
	
	private TesterFactory(String name , EngineerType type) {
		super(name , type);
	}

	@Override
	public Engineer createEngineer(String name, EngineerType type) {
		return new TesterFactory(name, type);
	}
	
}
