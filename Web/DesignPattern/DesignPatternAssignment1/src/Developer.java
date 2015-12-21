
public class Developer implements IEmployee {

	private String name;
	private String role;

	protected Developer() {

	}

	@Override
	public void createEmployee(String name, String role) {
		// TODO Auto-generated method stub
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", role=" + role + "]";
	}

}
