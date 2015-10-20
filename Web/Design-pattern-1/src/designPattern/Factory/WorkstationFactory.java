package designPattern.Factory;

import designPattern.enumDef.Workstation;
import designPattern.workstation.Factory;
import designPattern.workstation.IWorkstation;
import designPattern.workstation.Office;

/**
 * @author Suman
 *
 */
public class WorkstationFactory extends AbstractFactory {
	//class defining/creating object of different workstation
	public IWorkstation getWorkstation(Workstation workstation){  
	      if(workstation == null){  
	         return null;  
	      }  
	      if(workstation.equals(Workstation.Office)){
	    	 //returning office object
	         return new Office();  
	      } else if(workstation.equals(Workstation.Factory)){  
	    	 //returning factory object
	         return new Factory();  
	      }
	      return null;  
	   }  
}
