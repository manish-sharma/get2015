package Assignment2;
/**
 *  Modal Class of Developer
 * @author Ankur
 * Since: 21 October,2015
 **/
public class Developer 
{
	// To store name
	String name;
	// To store role
	String role;

	// Gets the Name
	public String getName()
	{
		return name;
	}
	// Sets The Name
	public void setName(String name) 
	{
		this.name = name;
	}
	// Gets the role
	public String getRole()
	{
		return role;
	}
	// Protected Constructor
	protected Developer() 
	{

	}
	// Sets The role
	public void setRole(String role)
	{
		this.role = role;
	}
	// Overrides the To string method
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "Name -> " + name + "\nRole -> " + role + "\n";
	}

}
