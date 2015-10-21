package InheritanceImplementation;
public class Person {
	
	private int uid;
	private String name;
	
	public Person(int uid, String name)
        {
		this.uid = uid;
		this.name = name;
         }
	/**
	 * getUid is a function which is return the uid of person
	 */
	public int getUid() 
        {
            return uid;
        }
	/**
	 * SetUid is a function which is set the uid of person
	 */
	public void setUid(int uid) {
            this.uid = uid;
        }
	/**
	 * getName is a function which is return the function of person
	 */
	public String getName()
        {
            return name;
        }
	
	public void setName(String name) 
        {
            this.name = name;
        }
	/**
	 * toString is a function which is return the name and uid of person
	 */
        @Override
	public String toString(){
		return "Name:"+name+", uid:"+uid;		
	}
}
