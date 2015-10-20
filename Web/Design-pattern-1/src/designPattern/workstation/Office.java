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
public class Office implements IWorkstation {
	//class defining the operation on Developer
	public static ArrayList<IEngineer> engineers=new ArrayList<IEngineer>();

	public ArrayList<IEngineer> getEngineers() {
		//provide list of Developer
		return engineers;
	}

	public void addEngineers(IEngineer engineer) {
		//add details of Developer
		engineers.add(engineer);
	}

	public void printList() {
		//printing list of Developer
		for(int i = 0; i < engineers.size(); i++) {   
		    System.out.println(engineers.get(i).getName()+"\t\t"+engineers.get(i).getRole());
		}  
	}
}
