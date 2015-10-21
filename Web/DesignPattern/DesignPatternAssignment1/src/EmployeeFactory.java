public class EmployeeFactory {
	public IEmployee getEmployee(EmployeeType empType) {

		if (empType.equals(EmployeeType.devloper)) {
			return new Developer();
		} else if (empType.equals(EmployeeType.tester)) {
			return new Tester();
		} else if (empType.equals(EmployeeType.hrManager)) {
			return new HrManager();
		} else
			return null;
	}

}
