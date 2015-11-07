package ProjectCompany.Model;

/**
 * @author Khemanshu
 */
public abstract class Engineer {

	/* Data Members */
	private String name;
	private EngineerType role;

	/* Parameterized Constructor */
	protected Engineer(String name, EngineerType role) {
		this.name = name;
		this.role = role;
	}

	/* Default Constructor */
	public  Engineer() {
	}

	/** Method to get name of Engineer
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/** Method to get role of Engineer
	 * 
	 * @return role
	 */
	public EngineerType getRole() {
		return role;
	}

	/** Method to set Name of Engineer
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Method to set role of Engineer
	 * 
	 * @param role
	 */
	public void setRole(EngineerType role) {
		this.role = role;
	}

	/** toString method overridden */
	@Override
	public String toString() {
		return "Name : " + name + ", " + "Role: " + role;
	}
}
