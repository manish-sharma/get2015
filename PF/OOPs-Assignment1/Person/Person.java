package Person;

public class Person 
{
	private int uid;
	
	private String name;
	
	public Person(int uid, String name)
	{
		this.uid = uid;
		this.name = name;
    }
	
	public int getUid()    //Function for getting User id
	{
		return uid;
	}
	
	public void setUid(int uid)  //Function for setting User id
	{
	this.uid = uid;
	}
	
	public String getName()    //Function for getting name
	{
		return name;
	}
	
	public void setName(String name) //Function for setting name
	{
		this.name = name;
	}	
	public String toString()    //Function for person data
	{
		return uid+"\t"+name;		
	}

}
