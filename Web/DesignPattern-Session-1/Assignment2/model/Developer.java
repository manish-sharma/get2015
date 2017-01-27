/**
 * This class for developer engineer
 * Constructor of this class is hidden for outside
 * @author Banwari  Kevat 
 */
package model;
public class Developer implements Engineer{
  String name;
  EngineerType role = EngineerType.developer;
  private Developer()
  {  }
  
  public static Developer getInstance()
  { return new Developer();}
  
  public String getName()
  {
	return name;
  }


public void setName(String name) 
{
	this.name = name;
}

public EngineerType getRole()
{
	return role;
}


@Override
public String toString() 
{
	return "[name=" + name + ", role=" + role + "]";
}

}
