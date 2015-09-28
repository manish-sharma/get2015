package com.metacube.jdbc.example;

public class TitlePojo {

	private int title_id ;
	String title ;
	private String title_type ;
	private int price;
	private int sub_id ;
	private int pub_id;
	public int getTitle_id() {
		return title_id;
	}
	/**
	 * this set the value of variable title_id
	 * @param title_id it hold title id of each title that is unique 
	 */
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}
	public String getTitle() {
		return title;
	}
	/**
	 * this set the value of variable title name
	 * @param title it hold title name of title 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle_type() {
		return title_type;
	}
	/**
	 * this set the value of variable title type
	 * @param title_type it hold title type of title 
	 */
	public void setTitle_type(String title_type) {
		this.title_type = title_type;
	}
	public int getPrice() {
		return price;
	}
	/**
	 * this set the value of variable title price 
	 * @param price  it hold title price of title 
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSub_id() {
		return sub_id;
	}
	/**
	 * this set the value of variable sub id
	 * @param sub_id it hold sub id 
	 */
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public int getPub_id() {
		return pub_id;
	}
	/**
	 * this set the value of variable pub_id
	 * @param pub_id hold publisher id 
	 */
	public void setPub_id(int pub_id) {
		this.pub_id = pub_id;
	}
}
