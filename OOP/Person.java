package oops_asignment_1;

/**This class for the person kind
 * @author ankur gupta
 * Since: 14 August,2015
 */
public class Person {
	private int uid;
	private String name;
	
	/*constructor*/
	public Person(int uid, String name){
		this.uid = uid;
		this.name = name;
    }
	
	/*getter for getting uid*/
	public int getUid() 
	{
		return uid;
	}
	
	/*setter for setting uid*/
	public void setUid(int uid) 
	{
		this.uid = uid;
	}
	
	/*getter for getting name*/
	public String getName() 
	{
		return name;
	}
	
	/*setter function for name*/
	public void setName(String name) 
	{
		this.name = name;
	}	
	
	public String toString(){
		return "Name:"+name+", uid:"+uid;		
	}
}
