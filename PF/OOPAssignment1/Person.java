/**
 * @author Sumitra
 * this program is to set whole record for  person class
 */
public class Person 
{
	private int uid;
	private String name;
	/**
	 * 
	 * @param uid user id is set in parameterized constructor
	 * @param name name is set in parameterized constructor
	 */
	public Person(int uid, String name)
	{
		this.uid = uid;
		this.name = name;
	}
	/**
	 * 
	 * @return will return the usedId of person
	 */
	public int getUid()
	{
		return uid;
	}
	/**
	 * 
	 * @param uid will set user id for person
	 */
	public void setUid(int uid)
	{
		this.uid = uid;
	}
	/**
	 * 
	 * @return will return the name of person
	 */
	public String getName() 
	{
		return name;
	}
	/**
	 * 
	 * @param name will set the name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * will return the whole data of person
	 */
	public String toString()
	{
		return "Name:"+name+", uid:"+uid;
	}
}
