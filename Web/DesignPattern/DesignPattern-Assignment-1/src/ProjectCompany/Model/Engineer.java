package ProjectCompany.Model ;
public abstract class Engineer {

	private String name;
	private EngineerType role;

	protected Engineer(String name, EngineerType role) {
		this.name = name;
		this.role = role;
	}

	public  Engineer() {
	}

	public String getName() {
		return name;
	}

	public EngineerType getRole() {
		return role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(EngineerType role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Name : " + name + ", " + "Role: " + role;
	}
}
