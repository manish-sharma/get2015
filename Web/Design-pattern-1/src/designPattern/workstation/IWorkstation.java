/**
 * 
 */
package designPattern.workstation;

import java.util.ArrayList;

import designPattern.engineer.IEngineer;

/**
 * @author Suman
 *
 */
public interface IWorkstation {
	//interface defining workstations
	public ArrayList<IEngineer> getEngineers();

	public void addEngineers(IEngineer engineer);
	public void printList();
}
