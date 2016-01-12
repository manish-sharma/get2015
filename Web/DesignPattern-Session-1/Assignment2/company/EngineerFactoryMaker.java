/*
 * This class for creating engineer as per requirement
 * This class like factory of engineers and return engineer as product
 * @author Banwari kevat
 */
package company;

import model.Developer;
import model.Engineer;
import model.EngineerType;
import model.Mechanic;

public class EngineerFactoryMaker {
    private static Engineer engineer = null;
   
   /*
    * This method return the instance of engineer
    * @param role is define the type of engineer
    */
   public static Engineer getEngineerFactoryMaker (EngineerType role)
   {   
	    if(role.equals(EngineerType.developer))
	    {
	    	engineer = Developer.getInstance();
	    }
	    else 
	    {
	    	engineer = Mechanic.getInstance();
	    }
	    
	    return engineer;
   }

}
