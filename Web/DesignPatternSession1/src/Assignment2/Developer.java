/**
 * 
 */
package Assignment2;

/**
 * @author Chetna
 * application to create a Company and its employees(Developers) without exposing their public constructors.
 * Implement Classes(Factory Pattern) 
 */
public class Developer  {
	private String name;
	private String role;

	protected Developer() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

}
