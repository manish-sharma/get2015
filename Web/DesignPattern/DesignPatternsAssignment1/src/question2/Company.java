package question2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class extends developer and it is a singleton class whose instance can be created only once
 * @author Riddhi
 *
 */
public class Company extends Developer {

	private static final Company INSTANCE=new Company();
	private static List<Developer> developersList = new ArrayList<Developer>();
	
	//private constructor
	private Company(){
	}

	//method that returns instance of this class
	public static Company getInstance(){
		return INSTANCE;
	}

	//method adds developers object to developers list
	public void addDevelopers(String name,String role) {
		Developer objODeveloper=new Developer();
		objODeveloper.setName(name);
		objODeveloper.setRole(role);
		developersList.add(objODeveloper);
	}

	//method that displays developers list
	public void showList(){
		for(Developer objDeveloper:developersList){
			System.out.println(objDeveloper);
		}
	}
}
