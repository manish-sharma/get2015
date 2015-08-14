//base class to get and set user details
public class Person 
{
	private int uid;
	private String name;
	public Person(int uid, String name)      //constructor created to assign values
	{
		this.uid=uid;
		this.name=name;
	}
	public int getUid()                     //function to get user id
	{
		return uid;
	}
	public void setUid(int uid)             //function to set user id
	{
		this.uid = uid;
	}
	public String getName()                //function to get user name
	{
		return name;
	}
	public void setName(String name)       //function to set user name
	{
		this.name = name;
	}	
	public String toString()               //function to return details
	{
		return "Name:"+name+", uid:"+uid;	
	}
}
