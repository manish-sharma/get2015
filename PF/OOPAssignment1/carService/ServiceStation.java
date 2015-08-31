package ServiceCarSystem;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Sumitra
 * 
 */
public class ServiceStation {

	List<Person> personList;
	List<Cars> carsList;
	List<ServicingCars> servicingList;
	List<Services> servicesList;

	public ServiceStation() {
		super();

		personList = new ArrayList<Person>();
		carsList = new ArrayList<Cars>();
		servicingList = new ArrayList<ServicingCars>();
		servicesList = new ArrayList<Services>();
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public List<Cars> getCarsList() {
		return carsList;
	}

	public void setCarsList(List<Cars> carsList) {
		this.carsList = carsList;
	}

	public List<ServicingCars> getServicingList() {
		return servicingList;
	}

	public void setServicingList(List<ServicingCars> servicingList) {
		this.servicingList = servicingList;
	}

	public List<Services> getServicesList() {
		return servicesList;
	}

	public void setServicesList(List<Services> servicesList) {
		this.servicesList = servicesList;
	}

}
