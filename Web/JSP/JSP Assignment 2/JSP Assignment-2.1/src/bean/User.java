package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**This class act as bean class for the user and conatins the getter and setter for user details 
 * 
 * @author Shishir
 *Date 14th October 2015
 */
public class User {
	private String fname;
	private String lname;
	private String uname;
	private String upass;
	private String uemail;
    /**getter for user name
     * 
     * @return username
     */
	public String getUname() {
		return uname;
	}
    /**Setter for user name
     * 
     * @param uname
     */
	public void setUname(String uname) {
		this.uname = uname;
	}
    /**getter for password 
     * 
     * @return pass
     */
	public String getUpass() {
		return upass;
	}
    /**Setter for password
     * 
     * @param upass
     */
	public void setUpass(String upass) {
		this.upass = upass;
	}
    /**getter for email
     * 
     * @return user email id 
     */
	public String getUemail() {
		return uemail;
	}
     /**setter for user email
      * 
      * @param uemail
      */
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
    /**getter for last name 
     * 
     * @return lname
     */
	public String getLname() {
		return lname;
	}
    /**setter for last name 
     * 
     * @param lname
     */
	public void setLname(String lname) {
		this.lname = lname;
	}
     /**getter for first name 
      * 
      * @return fname
      */
	public String getFname() {
		return fname;
	}
    /**setter for first name
     * 
     * @param fname
     */
	public void setFname(String fname) {
		this.fname = fname;
	}
}