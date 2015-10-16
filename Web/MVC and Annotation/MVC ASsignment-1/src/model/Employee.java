package model;
/**Model class for employee
 * 
 * @author Shishir
 *Date 15th October 2015
 */
public class Employee {
	private String name;
	private String emailID;
	private int employeeID;
	private int age;
	private String dateOfRegistration;
    
	/**getter for date of registration
	 * 
	 * @return dateOfRegistraion
	 */
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
    /**setter for date of registration
     * 
     * @param dateOfRegistration
     */
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
     /**Constructor
      * 
      * @param employeeID
      * @param name
      * @param emailID
      * @param age
      * @param dateOfRegistration
      */
	public Employee(int employeeID, String name, String emailID, int age,String dateOfRegistration) {
		this.employeeID=employeeID;
		this.name=name;
		this.emailID=emailID;
		this.age=age;
		this.dateOfRegistration=dateOfRegistration;
	}
     /**Overidden to string method
      * 
      */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emailID=" + emailID
				+ ", employeeID=" + employeeID + ", age=" + age + "]";
	}
    /**getter got for the name
     * 
     * @return
     */
	public String getName() {
		return name;
	} 
     /**setter for the name
      * 
      * @param name
      */
	public void setName(String name) {
		this.name = name;
	}
    /**getter for the email id 
     * 
     * @return emailId
     */
	public String getEmailID() {
		return emailID;
	}
    /**Setter for emailid
     * 
     * @param emailID
     */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
    /**getter for emailID
     * @return emailID
     */
	public int getEmployeeID() {
		return employeeID;
	}
    /**setter for the employeeid 
     * 
     * @param i
     */
	public void setEmployeeID(int i) {
		this.employeeID = i;
	}
    /**getter for age
     * 
     * @return age
     */
	public int getAge() {
		return age;
	}
    /**setter for age 
     * 
     * @param age
     */
	public void setAge(int age) {
		this.age = age;
	}

}
