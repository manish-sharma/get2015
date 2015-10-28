package vehicles;
 /**
  * to save the info of connection
  * @author Ravika
  * @since 9/22/2015
  */
public class ConnectionItems {
	  private String url; 
	  private String driver;
	  private String username;
	  private String password;
	 
	  public String geturl() {
	    return url;
	  }
	  
	  public void setUrl(String url) {
	    this.url = url;
	  }
	  public String getDriver() {
	    return driver;
	  }
	  public void setDriver(String driver) {
	    this.driver =driver;
	  }
	  public String getUsername() {
	    return username;
	  }
	  public void setUsername(String username) {
	    this.username= username;
	  }
	  public String getPassword() {
	    return password;
	  }
	  public void setPassword(String password) {
	    this.password= password;
	  }
	   @Override
	  public String toString() {
	    return  "[url=" + url+ ", driver="
	        + driver + ", username=" + username + ", password=" +password + "]";
	  }
} 