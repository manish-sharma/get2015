package com.metacampus.vehiclemanagement.xml;

/**This class holds the items which are used whiclw making the connection.
 * @author Khemanshu
 *
 */
public class ConnectionItems {
	  private String url; 
	  private String driver;
	  private String username;
	  private String password;
	 
	  /** Method to get url
	   * 
	   * @return url
	   */
	  public String geturl() {
	    return url;
	  }
	  
	  /** Method to set url
	   * 
	   * @param url
	   */
	  public void setUrl(String url) {
	    this.url = url;
	  }
	  
	  /** Method to get driver
	   * 
	   * @return driver
	   */
	  public String getDriver() {
	    return driver;
	  }
	  
	  /** Method to set driver
	   * 
	   * @param driver
	   */
	  public void setDriver(String driver) {
	    this.driver =driver;
	  }
	  
	  /** Method to get username
	   * 
	   * @return username
	   */
	  public String getUsername() {
	    return username;
	  }
	  
	  /** Method to set username
	   * 
	   * @param username
	   */
	  public void setUsername(String username) {
	    this.username= username;
	  }
	  
	  /** Method to get password
	   * 
	   * @return password
	   */
	  public String getPassword() {
	    return password;
	  }
	  
	  /** Method to set password
	   * 
	   * @param password
	   */
	  public void setPassword(String password) {
	    this.password= password;
	  }
	  
	  /** Method to return Data in String representation */
	   @Override
	  public String toString() {
	    return  "[url=" + url+ ", driver="
	        + driver + ", username=" + username + ", password=" +password + "]";
	  }
	} 

