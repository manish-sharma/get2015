package assignmentJDBC_1;

import java.sql.Date;

public class Books 
{
	private int accession_no;
	private int title_id;
	private Date purchase_dt;
	private int price;
	private String status;
	/**
	 * @return the accession_no
	 */
	public int getAccession_no() {
		return accession_no;
	}
	/**
	 * @param accession_no the accession_no to set
	 */
	public void setAccession_no(int accession_no) {
		this.accession_no = accession_no;
	}
	/**
	 * @return the title_id
	 */
	public int getTitle_id() {
		return title_id;
	}
	/**
	 * @param title_id the title_id to set
	 */
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}
	/**
	 * @return the purchase_dt
	 */
	public Date getPurchase_dt() {
		return purchase_dt;
	}
	/**
	 * @param purchase_dt the purchase_dt to set
	 */
	public void setPurchase_dt(Date purchase_dt) {
		this.purchase_dt = purchase_dt;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
