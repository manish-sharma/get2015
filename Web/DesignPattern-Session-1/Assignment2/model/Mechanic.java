/**
 * This class for mechanic engineer
 * Constructor of this class is hidden for outside
 * @author Banwari  Kevat 
 */
package model;


public class Mechanic implements Engineer{
	  String name;
	  EngineerType role = EngineerType.mechanic;
	  private Mechanic()
	  {
		  
	  }
	  
	  public static Mechanic getInstance()
	  { return new Mechanic();}
	  
	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String toString() {
		return " [name=" + name + ", role=" + role + "]";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public EngineerType getRole() {
		return role;
	}
	  
  
}
