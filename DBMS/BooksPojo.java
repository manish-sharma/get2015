package com.metacube.jdbc.example;

public class BooksPojo {

	private int accession_no ;
	private int title_Id ;
	private String purchase_dt ;
	private int price ;
	private String status ;
	public int getAccession_no() {
		return accession_no;
	}
	public void setAccession_no(int accession_no) {
		this.accession_no = accession_no;
	}
	public int getTitle_Id() {
		return title_Id;
	}
	public void setTitle_Id(int title_Id) {
		this.title_Id = title_Id;
	}
	public String getPurchase_dt() {
		return purchase_dt;
	}
	public void setPurchase_dt(String purchase_dt) {
		this.purchase_dt = purchase_dt;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
