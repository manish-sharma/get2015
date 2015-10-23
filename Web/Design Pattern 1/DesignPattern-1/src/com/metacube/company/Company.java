package com.metacube.company;
import java.util.ArrayList;
import java.util.List;

/**
 * Company class to create company
 * implements IworkStation
 * @author Sanjay
 * @since 10/21/2015
 */
public class Company  implements IWorkStation {
	
	private List<IEngineer> listOfEngineers;
	private static IWorkStation instance;
	
	/**
	 * private constructor
	 * to not expose the constructor
	 */
	private Company() {
		super();
		this.listOfEngineers = new ArrayList<IEngineer>();
	}

	/**
	 * to set the list of engineers
	 * @param listOfEngineers
	 */
	public void setListOfEngineers(List<IEngineer> listOfEngineers) {
		this.listOfEngineers = listOfEngineers;
	}

	/**
	 * to get the list of Engineers
	 */
	public List<IEngineer> getListOfEngineers() {
		return listOfEngineers;
	}
	
	/**
	 * to make the singleton object of company
	 * @return instance of the company
	 */
	public static IWorkStation getCompany() {
		if(instance == null ) {
			synchronized (Company.class) {
				if(instance == null ) {
					instance = new Company();
				}
			}
		}
		return (IWorkStation) instance;
	}
}
