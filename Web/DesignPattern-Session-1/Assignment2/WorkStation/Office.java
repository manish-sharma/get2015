/**
 * This is office class which is singleton class implements workstation interface
 * @author Banwari Kevat
 */
package WorkStation;
import java.util.*;

import model.Engineer;

public class Office implements WorkStation{
    
	private static Office office = new Office();
	private Office() {};
	public static Office getInstance()
	{ return office;}
	
	@Override
	public void addEngineer(Engineer engineer)
	{
		engineerList.add(engineer);
	}

	@Override
	public List<Engineer> getEnginnerList()
	{
		return engineerList;
	}
  
}
