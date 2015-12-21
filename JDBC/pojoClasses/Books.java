package pojoClasses;

public class Books {
	private int accessionNo;
	private String titleId;
	private String purchageDate;
	private double price;
	private String status;
	
	public int getAccessionNo() {
		return accessionNo;
	}
	
	public void setAccessionNo(int accessionNo) {
		this.accessionNo = accessionNo;
	}
	
	public String getTitleId() {
		return titleId;
	}
	
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}
	
	public String getPurchageDate() {
		return purchageDate;
	}
	
	public void setPurchageDate(String purchageDate) {
		this.purchageDate = purchageDate;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
