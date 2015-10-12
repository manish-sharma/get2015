package Com.Question1;
/**
 * @Discription this AuthorPoJo class store data get as a result of given query
 * @author Sumitra
 *
 */
public class AuthorPoJo {
	private int au_id ;
	private String au_lname ;
	private String au_fname ;
	private String address ;
	private String city;
	
	public int getAu_id() {
		return au_id;
	}
	/**
	 * this set the value of variable author id
	 * @param au_id it hold id of author that is unique for every author
	 */
	public void setAu_id(int au_id) {
		this.au_id = au_id;
	}
	public String getAu_lname() {
		return au_lname;
	}
	/**
	 * this set the value of variable author name
	 * @param au_lname it hold last name of author 
	 */
	public void setAu_lname(String au_lname) {
		this.au_lname = au_lname;
	}
	public String getAu_fname() {
		return au_fname;
	}
	/**
	 * this set the value of variable author name
	 * @param au_fname it hold first name of author 
	 */
	public void setAu_fname(String au_fname) {
		this.au_fname = au_fname;
	}
	public String getAddress() {
		return address;
	}
	/**
	 * this set the value of variable author address
	 * @param address it hold address of author 
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	/**
	 * this set the value of variable author city
	 * @param city it hold city name of author 
	 */
	public void setCity(String city) {
		this.city = city;
	}
}
