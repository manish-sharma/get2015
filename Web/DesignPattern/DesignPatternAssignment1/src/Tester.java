
public class Tester implements IEmployee {
	String name;
	String role;

	protected Tester() {
	}

	@Override
	public void createEmployee(String name, String role) {
		this.name = name;
		this.role = role;

	}

	@Override
	public String toString() {
		return "Tester [name=" + name + ", role=" + role + "]";
	}

}
