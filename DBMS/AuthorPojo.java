package com.metacube.jdbc.example;

public class AuthorPojo {
	private int author_id ;
	private String author_lname ;
	private String author_fname ;
	private String address ;
	private String city;
	
	public int getAu_id() {
		return author_id;
	}
	/**
	 * this set the value of variable author id
	 * @param au_id it hold id of author that is unique for every author
	 */
	public void setAu_id(int au_id) {
		this.author_id = au_id;
	}
	public String getAu_lname() {
		return author_lname;
	}
	/**
	 * this set the value of variable author name
	 * @param au_lname it hold last name of author 
	 */
	public void setAu_lname(String au_lname) {
		this.author_lname = au_lname;
	}
	public String getAu_fname() {
		return author_fname;
	}
	/**
	 * this set the value of variable author name
	 * @param au_fname it hold first name of author 
	 */
	public void setAu_fname(String au_fname) {
		this.author_fname = au_fname;
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
