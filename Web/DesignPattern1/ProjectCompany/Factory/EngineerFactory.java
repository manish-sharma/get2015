package ProjectCompany.Factory;

import ProjectCompany.Model.Engineer;
import ProjectCompany.Model.EngineerType;
/**
 * 
 * @author Khemanshu
 *
 */
public interface EngineerFactory {
	
	public Engineer createEngineer(String name ,EngineerType type);
	
}
