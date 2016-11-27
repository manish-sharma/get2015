public class HrManager implements IEmployee {
	String name;
	String role;

	protected HrManager() {
	}

	@Override
	public void createEmployee(String name, String role) {
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "HrManager [name=" + name + ", role=" + role + "]";
	}

}
