package oop1;

public class person {
	private int uId;
	private String name;
	public person(int uId, String name){
		this.uId=uId;
		this.name=name;
	}
	/** used to get uid of student
	 * @return uid of students
	 */
	public int getUid() {return this.uId;}
	/** used to set the id of person
	 * @param uid is the id that user want to set.
	 */
	public void setUid(int uid) {this.uId = uid;}
	/** used to get the name of person.
	 * @return the name of person.
	 */
	public String getName() {return this.name;}
	/** used to set the name of person.
	 * @param name is name of person.
	 */
	public void setName(String name) {this.name = name;}	
	/**return all the detail of person.
	 */
	public String toString(){
		return "Name:"+name+", uid:"+uId;		
	}
	

}
