package designPattern.Factory;

import designPattern.enumDef.Workstation;
import designPattern.workstation.IWorkstation;

/**
 * @author Suman
 *
 */
public abstract class AbstractFactory {
	//abstract class for creating objects
	public abstract IWorkstation getWorkstation(Workstation workstation);
}
