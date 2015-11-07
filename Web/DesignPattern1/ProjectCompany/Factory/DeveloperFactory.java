package ProjectCompany.Factory;

import ProjectCompany.Model.Developer;
import ProjectCompany.Model.Engineer;
import ProjectCompany.Model.EngineerType;

/** Class to create objects of Developer class */
/**
 * @author Khemanshu
 */
public class DeveloperFactory extends Developer implements EngineerFactory{

	/** No argument Constructor */
	public DeveloperFactory() {
	}
	
	/** Parameterized Constructor that will call its
	 * super class constructor 
	 * @param name
	 * @param type
	 */
	private DeveloperFactory(String name , EngineerType type) {
		super(name , type);
	}
	
	@Override
	public Engineer createEngineer(String name, EngineerType type) {
		return new DeveloperFactory(name, type);
	}
}
