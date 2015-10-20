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
public class Factory implements IWorkstation{
	//class defining the operation on mechanical engineers
	public static ArrayList<IEngineer> engineers=new ArrayList<IEngineer>();
	
	public ArrayList<IEngineer> getEngineers() {
		//provide list of mechanical engineer
		return engineers;
	}

	public void addEngineers(IEngineer engineer) {
		//add details of mechanical engineer
		engineers.add(engineer);
	}

	public void printList() {
		//printing list of mechanical engineer
		for(int i = 0; i < engineers.size(); i++) {   
		    System.out.println(engineers.get(i).getName()+"\t\t"+engineers.get(i).getRole());
		}  
	}	
}
