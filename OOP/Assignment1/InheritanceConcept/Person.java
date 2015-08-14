/****************************************************************************************
Name            : Person
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to create base class. 
                :
****************************************************************************************/

public class Person{
		
		private int uid;
		private String name;
		//Constructor of base class
		public Person(int uid,String name )	
		{
			this.uid=uid;
			this.name=name;
		}
		//setId method set Uniqe id
		public void setUid(int uid)
		{
			this.uid=uid;
		}
		//setname method set Name
		public void setname(String name)
		{
			this.name=name;
		}
		//getUid retuen Uid
		public int getUid()
		{
			return uid;
		}
		//getName method return name
		public String getName()
		{
			return name;
		}
		
		public String toString()
		{
			return "Name:"+name+"\nUID:"+uid+"\n";
		}
	
}//End of Person class

	