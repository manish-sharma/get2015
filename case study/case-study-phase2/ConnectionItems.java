package Com.Xml;

/**
 * @author Ankur
 * @description this is the class which set the values of connection attributes' thar are read from xml and have getter setter methods for connection attributes
 */


public class ConnectionItems {
	private String url;
	private String driver;
	private String username;
	private String password;

	/**
	 * @name geturl()
	 * @description this method return the value of url
	 * @param
	 * @return url
	 */
	public String geturl() {
		return url;
	}

	/**
	 * @name setUrl()
	 * @description this method set the value of url
	 * @param url
	 * @return
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @name getDriver()
	 * @description this method return the value of driver;
	 * @param
	 * @return driver;
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @name setDriver()
	 * @description this method set the value of driver;
	 * @param driver
	 *            ;
	 * @return
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * @name getUsername()
	 * @description this method return the value of username
	 * @param
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @name setUsername()
	 * @description this method set the value of username
	 * @param username
	 * @return
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @name getPassword()
	 * @description this method return the value of password
	 * @param
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @name setPassword()
	 * @description this method set the value of password
	 * @param password
	 * @return
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @name toString()
	 * @description this method return the string format of all connection
	 *              attributes' values
	 * @param
	 * @return string
	 */
	@Override
	public String toString() {
		return "[url=" + url + ", driver=" + driver + ", username=" + username
				+ ", password=" + password + "]";
	}
}
