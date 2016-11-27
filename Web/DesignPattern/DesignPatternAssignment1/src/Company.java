import java.util.ArrayList;
import java.util.List;

public class Company {

	public static Company instant;

	private Company() {

	}

	public static Company getInstant() {
		if (instant == null) {
			return new Company();
		} else {
			return instant;
		}

	}

	public static List<IEmployee> employeeList = new ArrayList<IEmployee>();

	public void addEngineer(IEmployee employee) {

		employeeList.add(employee);
	}

	public List<IEmployee> listOfEngineer() {

		return employeeList;
	}

}
